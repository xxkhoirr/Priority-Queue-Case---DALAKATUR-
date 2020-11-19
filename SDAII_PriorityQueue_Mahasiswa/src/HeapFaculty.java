
import java.util.ArrayList;

public class HeapFaculty {
    private ArrayList<Mahasiswa> dataIjazahMahasiswaFMIPA;
    private ArrayList<Mahasiswa> dataIjazahMahasiswaFISIP;
    private ArrayList<Mahasiswa> dataIjazahMahasiswaFEB;
    private ArrayList<Mahasiswa> dataIjazahMahasiswaFKIP;
    
    public HeapFaculty () { 
        
    }
    
    public void addDataMahasiswaFMIPA (String name, String tgl_lulus, String fakultas) {
        dataIjazahMahasiswaFMIPA.add(new Mahasiswa(name, tgl_lulus, fakultas));
    }
    
    public void addDataMahasiswaFISIP (String name, String tgl_lulus, String fakultas) {
        dataIjazahMahasiswaFISIP.add(new Mahasiswa(name, tgl_lulus, fakultas));
    }
    
    public void addDataMahasiswaFEB (String name, String tgl_lulus, String fakultas) {
        dataIjazahMahasiswaFEB.add(new Mahasiswa(name, tgl_lulus, fakultas));
    }
    
    public void addDataMahasiswaFKIP (String name, String tgl_lulus, String fakultas) {
        dataIjazahMahasiswaFKIP.add(new Mahasiswa(name, tgl_lulus, fakultas));
    }
    
    public void showDataMahasiswa () {
        
    }
}
