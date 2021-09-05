/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BelajarKoneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Namikaze Yanz
 */
public class Koneksi {
        Connection con;
    
    public Connection getConnection(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/tiket","root","");
            JOptionPane.showMessageDialog(null,"Koneksi Ke database berhasil");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Koneksi ke database gagal");
        }
        return con;
    }
    }


    


    