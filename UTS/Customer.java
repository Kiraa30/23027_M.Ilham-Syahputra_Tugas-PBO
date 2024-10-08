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
class Customer extends User {
    public Customer(String username, String password) {
        super(username, password);
    }

    @Override
    public void menu(Hotel hotel) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Pesan Kamar");
            System.out.println("2. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String namaCustomer = scanner.nextLine();
                    hotel.pesanKamar(namaCustomer);
                    break;
                case 2:
                    System.out.println("Keluar dari menu customer.");
                    return;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        }
    }
}