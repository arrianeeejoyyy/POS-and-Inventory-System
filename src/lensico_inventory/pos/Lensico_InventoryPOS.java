package lensico_inventory.pos;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.Icon;
import javax.swing.JPanel;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.*;
import jxl.write.Number;

public class Lensico_InventoryPOS {
    
       
    
    public static ArrayList <String> defaultusername = new ArrayList<String>();
    public static ArrayList <String> defaultpassword = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
       
      SwingUtilities.invokeLater(() -> {
       LOADING_SCREEN lc = new LOADING_SCREEN();
       LOG_IN li = new LOG_IN();
       lc.setVisible(true);
       
       new Thread(() -> { 
       for (int i = 1; i<=100; ++i){
         
           try {
                Thread.sleep(80);
                        final int progress = i; // Create a final copy for use in lambda

                        SwingUtilities.invokeLater(() -> {
                    lc.progressBar.setValue(progress);
                    lc.pleaseWait.setText("Please Wait...");
                    });

               
               if(i==100) {
                     SwingUtilities.invokeLater(() -> {
                    lc.setVisible(false);
                    li.setVisible(true);
                    });
                 }
           } catch (InterruptedException ex) {
               Logger.getLogger(Lensico_InventoryPOS.class.getName()).log(Level.SEVERE, null, ex);
           }
              
           
       
       }
        }).start();
         
        });
    }

  
    
    
    private static File File(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
 
    } 