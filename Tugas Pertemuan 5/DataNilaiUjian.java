/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan5;

/**
 *
 * @author iilha
 */
public class DataNilaiUjian {
    private String npm, nama, grade, keterangan;
    private double nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS, nilaiRataRata;

    public void masukkanNpm(String npm) {
        this.npm = npm;
    }

    public void masukkanNama(String nama) {
        this.nama = nama;
    }

    public void masukkanNilaiKehadiran(double nilaiKehadiran) {
        this.nilaiKehadiran = nilaiKehadiran;
    }

    public void masukkanNilaiTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public void masukkanNilaiUTS(double nilaiUTS) {
        this.nilaiUTS = nilaiUTS;
    }

    public void masukkanNilaiUAS(double nilaiUAS) {
        this.nilaiUAS = nilaiUAS;
    }

    public void menghitungNilaiRataRata() {
        this.nilaiRataRata = (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
        tentukanGradeDanKeterangan();
    }

    private void tentukanGradeDanKeterangan() {
        if (nilaiRataRata >= 76 && nilaiRataRata <= 100) {
            grade = "A";
            keterangan = "ISTIMEWA";
        } else if (nilaiRataRata >= 66 && nilaiRataRata <= 75) {
            grade = "B";
            keterangan = "BAIK";
        } else if (nilaiRataRata >= 56 && nilaiRataRata <= 65) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiRataRata >= 46 && nilaiRataRata <= 55) {
            grade = "D";
            keterangan = "KURANG";
        } else {
            grade = "E";
            keterangan = "KURANG SEKALI";
        }
    }

    public String tampilkanNpm() {
        return npm;
    }

    public String tampilkanNama() {
        return nama;
    }

    public double tampilkanNilaiRataRata() {
        return nilaiRataRata;
    }

    public String tampilkanGrade() {
        return grade;
    }

    public String tampilkanKeterangan() {
        return keterangan;
    }
}