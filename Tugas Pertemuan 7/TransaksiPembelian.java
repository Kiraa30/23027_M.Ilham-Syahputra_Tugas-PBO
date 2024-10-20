/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan7;

/**
 *
 * @author iilha
 */
class TransaksiPembelian {
    ItemBarang item;
    int jumlahBeli;

    public TransaksiPembelian(ItemBarang item, int jumlahBeli) {
        this.item = item;
        this.jumlahBeli = jumlahBeli;
    }

    public int hitungTotal() {
        return item.harga * jumlahBeli;
    }
}