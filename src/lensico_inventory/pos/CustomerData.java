/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lensico_inventory.pos;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Airi
 */
public class CustomerData {
    public static DefaultTableModel tableModel = new DefaultTableModel(
        new Object[]{"ID", "Name", "Contact Number", "Email", "Address"}, 0
    );

}
