package TugasPertemuan10;

public class PerhitunganNilai {
    private double nilai1, nilai2, nilai3, nilai4, nilai5;
    
    public PerhitunganNilai(double nilai1, double nilai2, double nilai3, double nilai4, double nilai5){
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
        this.nilai5 = nilai5;
    }
    
    public double nilaiAkhir(){
        return (0.10 * nilai1)+(0.15 * nilai2)+(0.25 * nilai3)+(0.15 * nilai4)+(0.35 * nilai5);
    }
    
    public double tambahNilai1(){
        return nilai1;
    }
    public double tambahNilai2(){
        return nilai2;
    }
    public double tambahNilai3(){
        return nilai3;
    }
    public double tambahNilai4(){
        return nilai4;
    }
    public double tambahNilai5(){
        return nilai5;
    }
}
