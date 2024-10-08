/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSPRAKTIKUMPBO;
import java.util.Scanner;
/**
 *
 * @author iilha
 */

class Admin extends User {
    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void menu(Hotel hotel) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Cek Ketersediaan Kamar");
            System.out.println("2. Lihat Detail Pesanan");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (choice) {
                case 1:
                    hotel.cekKetersediaan();
                    break;
                case 2:
                    hotel.lihatPemesanans();
                    break;
                case 3:
                    System.out.println("Keluar dari menu admin.");
                    return;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        }
    }
}