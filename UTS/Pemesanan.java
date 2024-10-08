/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSPRAKTIKUMPBO;

/**
 *
 * @author iilha
 */
class Pemesanan {
    private Kamar kamar;
    private String namaCustomer;

    public Pemesanan(Kamar kamar, String namaCustomer) {
        this.kamar = kamar;
        this.namaCustomer = namaCustomer;
        kamar.pesanKamar();
    }

    public Kamar pesanKamar() {
        return kamar;
    }

    public String namaCustomer() {
        return namaCustomer;
    }
}