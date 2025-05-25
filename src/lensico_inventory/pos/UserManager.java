package lensico_inventory.pos;

import java.io.*;
import java.util.*;

public class UserManager {
    private static final String FILE_NAME = "C:\\Users\\Airi\\Documents\\usercashier.txt";
    public static List<UserAccount> users = new ArrayList<>();

    static {
        loadUsers();
    }

    public static void loadUsers() {
        users.clear();
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                UserAccount user = UserAccount.fromString(line);
                if (user != null) users.add(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveUsers() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (UserAccount user : users) {
                writer.write(user.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
