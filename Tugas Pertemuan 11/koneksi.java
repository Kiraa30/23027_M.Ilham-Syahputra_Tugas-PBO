/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan11;

/**
 *
 * @author iilha
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    
    private static Connection konek;

    
    public static Connection konek() throws SQLException, ClassNotFoundException {
        if (konek == null || konek.isClosed()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadatabase", "root", ""); 
                System.out.println("Koneksi berhasil!");
            } catch (SQLException e) {
                System.err.println("ERROR: KONEKSI TIDAK BERHASIL " + e.getMessage());
                throw e;
            }
        }
        return konek;
    }
    
    
    public static void closeConnection() {
        if (konek != null) {
            try {
                konek.close();
                System.out.println("Koneksi ditutup.");
            } catch (SQLException e) {
                System.err.println("ERROR: Gagal menutup koneksi " + e.getMessage());
            }
        }
    }
}
