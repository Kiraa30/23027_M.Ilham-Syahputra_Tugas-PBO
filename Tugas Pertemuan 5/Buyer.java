/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan5;

/**
 *
 * @author iilha
 */
public class Buyer {
    private double totalbelanja;
    private double diskon;
    
    // Constructor
    public Buyer(double totalPembelian) {
        this.totalbelanja = totalPembelian;
        hitungdiskon();
    }
    
    private void hitungdiskon() {
        if (totalbelanja < 50000) {
            diskon = totalbelanja * 0.05; 
        } else {
            diskon = totalbelanja * 0.20;
        }
    }

    public double dapatdiskon() {
        return diskon;
    }
    
    public double nominaltotalbelanja() {
        return totalbelanja - diskon;
    }
    
    public void tampilkanHasil() {
        System.out.println("Total pembelian Rp. = " + totalbelanja);
        System.out.println("Besarnya potongan Rp. = " + diskon);
        System.out.println("Jumlah yang harus dibayarkan Rp. = " + nominaltotalbelanja());
    }
}