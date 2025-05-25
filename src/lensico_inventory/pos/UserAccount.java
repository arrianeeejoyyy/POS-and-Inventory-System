package lensico_inventory.pos;

import java.io.Serializable;

public class UserAccount implements Serializable {
    private String employeeId;
    private String username;
    private String password;
    private boolean status;

    public UserAccount(String employeeId, String username, String password, boolean status) {
        this.employeeId = employeeId;
        this.username = username;
        this.password = password;
        this.status = status;
    }

    public String getEmployeeId() { return employeeId; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public boolean isStatus() { return status; }

    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setStatus(boolean status) { this.status = status; }

    @Override
    public String toString() {
        return employeeId + "%%" + username + "%%" + password + "%%" + status;
    }

    public static UserAccount fromString(String line) {
        String[] parts = line.split("%%");
        if (parts.length != 4) return null;
        return new UserAccount(parts[0], parts[1], parts[2], Boolean.parseBoolean(parts[3]));
    }
}