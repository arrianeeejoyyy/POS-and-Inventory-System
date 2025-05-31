package lensico_inventory.pos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CustomerCounterManager {
    private static final String COUNTER_FILE = "src/file_storage/customer_counter.txt";
    private static int customerCounter = 1;
    private static CustomerCounterManager instance = null;

    private CustomerCounterManager() {
        loadCounter();
    }

    public static CustomerCounterManager getInstance() {
        if (instance == null) {
            instance = new CustomerCounterManager();
        }
        return instance;
    }

    private void loadCounter() {
        File file = new File(COUNTER_FILE);
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line = br.readLine();
                if (line != null) {
                    customerCounter = Integer.parseInt(line.trim());
                }
            } catch (IOException | NumberFormatException ex) {
                customerCounter = 1;
            }
        } else {
            customerCounter = 1;
        }
    }

    public int getCounter() {
        return customerCounter;
    }

    public void incrementCounter() {
        customerCounter++;
        saveCounter();
    }

    private void saveCounter() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(COUNTER_FILE))) {
            bw.write(String.valueOf(customerCounter));
        } catch (IOException ex) {
            System.err.println("Failed to save customer counter.");
        }
    }
}
