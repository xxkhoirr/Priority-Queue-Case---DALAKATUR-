
public class HeapDate {
    private String[][] Mahasiswa;
    private int heapSize;
    
    public HeapDate (String[][] mahasiswa) {
        heapSize = 0;
        Mahasiswa = new String[mahasiswa.length][3];
    }
    
    public boolean isEmpty( ) {
        return heapSize == 0;
    }
 
    public boolean isFull( ) {
        return heapSize == Mahasiswa.length;
    }
 
    public void makeEmpty( ) {
        heapSize = 0;
    }
 
    private int parent(int i) {
        return (i - 1)/2;
    }
 
    private int kthChild(int i, int k) {
        return 2*i + k;
    }
    
    public void inserDataMahasiswa(String name, String tgl_lulus, String fakultas) {
        
    }
    
    private void heapifyUp(int childInd) {
        
    }
    
    public String[][] getDataIjazahMahasiswa() {
        return Mahasiswa;
    }   
}
