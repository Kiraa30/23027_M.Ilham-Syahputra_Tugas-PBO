/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTSPRAKTIKUMPBO;
import java.util.Scanner;
/**
 *
 * @author iilha
 */

public class SistemReservasiHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel(10); // Misalnya hotel memiliki 10 kamar

        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        User user;
        if (username.equals("admin") && password.equals("admin123")) {
            user = new Admin(username, password);
        } else {
            user = new Customer(username, password);
        }

        user.menu(hotel);
    }
}