/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSPRAKTIKUMPBO;
import java.util.ArrayList;

/**
 *
 * @author iilha
 */
class Hotel {
    private ArrayList<Kamar> kamars;
    private ArrayList<Pemesanan> pemesanan;

    public Hotel(int numberOfKamars) {
        kamars = new ArrayList<>();
        pemesanan = new ArrayList<>();
        for (int i = 1; i <= numberOfKamars; i++) {
            kamars.add(new Kamar(i));
        }
    }

    public void pesanKamar(String namaCustomer) {
        for (Kamar kamar : kamars) {
            if (kamar.Tersedia()) {
                pemesanan.add(new Pemesanan(kamar, namaCustomer));
                kamar.pesanKamar();
                System.out.println("Kamar " + kamar.pilihNomorKamar() + " berhasil dipesan oleh " + namaCustomer);
                return;
            }
        }
        System.out.println("Tidak ada kamar yang tersedia.");
    }

    public void cekKetersediaan() {
        for (Kamar kamar : kamars) {
            System.out.println("Kamar " + kamar.pilihNomorKamar() + " tersedia: " + kamar.Tersedia());
        }
    }

    public void lihatPemesanans() {
        for (Pemesanan pesan : pemesanan) {
            System.out.println("Kamar " + pesan.pesanKamar().pilihNomorKamar() + " dipesan oleh " + pesan.namaCustomer());
        }
    }
}