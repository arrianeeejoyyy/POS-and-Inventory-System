package lensico_inventory.pos;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class ProductStatusPanelHelper {

    private JPanel containerPanel;       // This is jPanel1 in PRODUCTSTATUS
    private PRODUCTSTATUS mainWindow;    // Reference to main window for calling selectPanel

    public ProductStatusPanelHelper(PRODUCTSTATUS mainWindow, JPanel containerPanel) {
        this.mainWindow = mainWindow;
        this.containerPanel = containerPanel;
    }

    // Load all panels from file and add to container
    public void loadPanelsFromFile(String filePath) {
        containerPanel.removeAll();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("%%");
                if (parts.length >= 5) {
                    String iconPath = parts[0];
                    String modelText = parts[1];
                    String priceText = parts[2];
                    String quantityText = parts[3];
                    String productId = parts[4];

                    PRODUCTSTATUSPPP panel = new PRODUCTSTATUSPPP();
                    
                    // Load image icon if exists
                    File imgFile = new File(iconPath);
                    if (imgFile.exists()) {
                        ImageIcon icon = new ImageIcon(iconPath);
                        int fixedWidth = 155;
                        int fixedHeight = 95;
                        Image img = icon.getImage().getScaledInstance(fixedWidth, fixedHeight, Image.SCALE_SMOOTH);
                        panel.image.setIcon(new ImageIcon(img));
                    } else {
                        panel.image.setIcon(null);
                    }

                    panel.model.setText(modelText);
                    panel.price.setText(priceText);
                    panel.quantity.setText(quantityText);
                    panel.proID.setText(productId);

                    // Color code by quantity
                    int qty = Integer.parseInt(quantityText.trim());
                    if (qty >= 1 && qty <= 7) {
                        panel.setStockLevelColor(Color.RED);
                    } else if (qty >= 8 && qty <= 14) {
                        panel.setStockLevelColor(Color.YELLOW);
                    } else if (qty >= 15) {
                        panel.setStockLevelColor(Color.GREEN);
                    }

                    // Add mouse listener to select panel when clicked
                    panel.addMouseListener(new java.awt.event.MouseAdapter() {
                        @Override
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            mainWindow.selectPanel(panel);
                        }
                    });

                    containerPanel.add(panel);
                    containerPanel.add(Box.createVerticalStrut(10));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading product panels: " + e.getMessage());
        }

        containerPanel.revalidate();
        containerPanel.repaint();
    }

    // Update quantity and stock level color of a panel by productId
    public void updatePanelQuantity(String productId, int newQuantity) {
        for (Component comp : containerPanel.getComponents()) {
            if (comp instanceof PRODUCTSTATUSPPP) {
                PRODUCTSTATUSPPP panel = (PRODUCTSTATUSPPP) comp;
                if (panel.proID.getText().equals(productId)) {
                    panel.quantity.setText(String.valueOf(newQuantity));
                    if (newQuantity >= 15) {
                        panel.setStockLevelColor(Color.GREEN);
                    } else if (newQuantity >= 8) {
                        panel.setStockLevelColor(Color.YELLOW);
                    } else if (newQuantity >= 1) {
                        panel.setStockLevelColor(Color.RED);
                    } else {
                        panel.setStockLevelColor(null);
                    }
                    break;
                }
            }
        }
    }

    // Select (highlight) panel by productId
    public void selectPanelByProductId(String productId) {
        for (Component comp : containerPanel.getComponents()) {
            if (comp instanceof PRODUCTSTATUSPPP) {
                PRODUCTSTATUSPPP panel = (PRODUCTSTATUSPPP) comp;
                if (panel.proID.getText().equals(productId)) {
                    mainWindow.selectPanel(panel);
                    break;
                }
            }
        }
    }
}

