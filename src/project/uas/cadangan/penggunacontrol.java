package project.uas.cadangan;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author str5
 */
public class penggunacontrol {
    Connection con =null;
    Statement st=null;
    ResultSet rs= null;
    String sql=null;
    
    public penggunacontrol(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectuascadangan","root","");
            st=con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Koneksi database gagal, terjadi kesalahan pada"+ e);
        }
    }
    public List carilogin(String nim,String password){
        List logLogin = new ArrayList();
        sql = "select nim, pass from menumahasantri where nim='"+nim+"' and pass='"+password+"'";
        try {
            rs=st.executeQuery(sql);
            while (rs.next()) {                
                 menumahasantri ep=new menumahasantri();
                 ep.setnim1(rs.getString("nim"));
                 ep.setpass1(rs.getString("pass"));
                 ep.setnama1(rs.getString("nama"));
                 logLogin.add(ep);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan login pada \n"+e);
            
        }
        return logLogin;
    }
}
