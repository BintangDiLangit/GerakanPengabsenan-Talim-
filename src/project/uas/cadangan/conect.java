/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.uas.cadangan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author str5
 */
public class conect {
private static Connection mysqlkonek;
    public static void main(String[] args)throws SQLException {
        // TODO code application logic here
        konekdb();
    }
    public static Connection konekdb() throws SQLException {
        if (mysqlkonek==null) {
            try{
                String DB="jdbc:mysql://localhost:3306/projectuascadangan";
                String user="root";
                String pass="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlkonek=(Connection) DriverManager.getConnection(DB,user,pass);
                
                
                
            }catch(SQLException e){
                System.out.println(e);
                System.out.println("GAGAL!!!");
            }
        }
        return mysqlkonek;
    }
    
}
