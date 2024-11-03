package TugasPertemuan10;

public class MataKuliah{
    private String namaMatkul;
    private PerhitunganNilai nilai;
    
    public MataKuliah(String namaMatkul, PerhitunganNilai nilai){
        this.namaMatkul = namaMatkul;
        this.nilai = nilai;
    }
    
    public double tambahNilaiAkhir(){
        return nilai.nilaiAkhir();
    }
    
    public String namaMatkul(){
        return namaMatkul;
    }
}
