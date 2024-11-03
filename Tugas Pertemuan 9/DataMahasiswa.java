package TugasPertemuan10;

public class DataMahasiswa {
    private String npm;
    private String nama;
    private String alamat;
    private String mataKuliah;
    private double nilaiAkhir;

    public DataMahasiswa(String npm, String nama, String alamat, String mataKuliah, double nilaiAkhir) {
        this.npm = npm;
        this.nama = nama;
        this.alamat = alamat;
        this.mataKuliah = mataKuliah;
        this.nilaiAkhir = nilaiAkhir;
    }

    public String tambahnpm() { return npm; }
    public String tambahnama() { return nama; }
    public String tambahalamat() { return alamat; }
    public String tambahMataKuliah() { return mataKuliah; }
    public double tambahNilaiAkhir() { return nilaiAkhir; }
}
