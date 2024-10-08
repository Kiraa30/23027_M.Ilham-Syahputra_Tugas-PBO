/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSPRAKTIKUMPBO;

class Kamar {
    private int nomorKamar;
    private boolean Tersedia;

    public Kamar(int nomorKamar) {
        this.nomorKamar = nomorKamar;
        this.Tersedia = true;
    }

    public int pilihNomorKamar() {
        return nomorKamar;
    }

    public boolean Tersedia() {
        return Tersedia;
    }

    public void pesanKamar() {
        Tersedia = false;
    }

    public void sediaKamar() {
        Tersedia = true;
    }
}
