/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlinemanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author priyanshu24
 */
public class FligthtInfo extends JFrame{
    
    public FligthtInfo()
    {
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JTable table = new JTable();
        
        try{
            
            Conn conn =new Conn();
            
            ResultSet rs= conn.s.executeQuery("select * from flight");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        table.setBounds(0,0,800,500);
        add(table);
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 0, 800, 500);
        add(jsp);
        
        setSize(800,500);
        setLocation(400,200);
        setVisible(true);
        
    }
    
    public static void main(String[] args)
    {
        new FligthtInfo();
    }
    
}
