package TugasPertemuan10;
import java.util.ArrayList;

public class InputDataMahasiswa {
    private ArrayList<DataMahasiswa> listMahasiswa;

    public InputDataMahasiswa() {
        listMahasiswa = new ArrayList<>();
    }

    public void insertData(String npm, String nama, String alamat, String mataKuliah, double nilaiAkhir) {
        DataMahasiswa mhs = new DataMahasiswa(npm, nama, alamat, mataKuliah, nilaiAkhir);
        listMahasiswa.add(mhs);
    }

    public ArrayList<DataMahasiswa> tambahALL() {
        return listMahasiswa;
    }

    public void deleteData(int index) {
        listMahasiswa.remove(index);
    }
}
