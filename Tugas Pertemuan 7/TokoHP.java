/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPertemuan7;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author iilha
 */
public class TokoHP {
    static ArrayList<ItemBarang> daftarBarang = new ArrayList<>();

    public static void inisialisasiBarang() {
        daftarBarang.add(new ItemBarang("a001", "Iphone", 29900000));
        daftarBarang.add(new ItemBarang("a002", "Samsung", 18600000));
        daftarBarang.add(new ItemBarang("a003", "Xiaomi", 12999999));
    }

    public static ItemBarang cariBarang(String kode) {
        for (ItemBarang item : daftarBarang) {
            if (item.kode.equalsIgnoreCase(kode)) {
                return item;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TransaksiPembelian> transaksiList = new ArrayList<>();

        inisialisasiBarang();

        System.out.print("Masukkan Item Barang: ");
        int jumlahItem = scanner.nextInt();
        scanner.nextLine();  // Konsumsi newline

        for (int i = 1; i <= jumlahItem; i++) {
            System.out.println("Data ke " + i);
            System.out.print("Masukkan Kode: ");
            String kode = scanner.nextLine();

            ItemBarang item = cariBarang(kode);
            if (item == null) {
                System.out.println("Kode barang tidak ditemukan.");
                i--; // Ulangi input jika kode tidak valid
                continue;
            }

            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();
            scanner.nextLine();  // Konsumsi newline

            transaksiList.add(new TransaksiPembelian(item, jumlahBeli));
        }

        // Tampilkan hasil transaksi
        System.out.println("\nTOKO HP");
        System.out.println("*******************************");
        System.out.printf("%-3s %-10s %-12s %-8s %-12s %-12s\n",
                "No", "Kode", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");

        int totalBayar = 0;
        for (int i = 0; i < transaksiList.size(); i++) {
            TransaksiPembelian transaksi = transaksiList.get(i);
            int jumlahBayar = transaksi.hitungTotal();
            totalBayar += jumlahBayar;

            System.out.printf("%-3d %-10s %-12s %-8d %-12d %-12d\n",
                    i + 1, transaksi.item.kode, transaksi.item.nama,
                    transaksi.item.harga, transaksi.jumlahBeli, jumlahBayar);
        }

        System.out.println("=================================");
        System.out.printf("Total Bayar: %d\n", totalBayar);

        scanner.close();
    }
}