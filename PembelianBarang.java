// Kelas turunan yang mengimplementasikan interface TotalBayar
public class PembelianBarang extends Barang implements TotalBayar {
  
    public PembelianBarang(String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli){
        super(kodeBarang, namaBarang, hargaBarang, jumlahBeli);
    }

    // Implementasi metode dari interface TotalBayar
    @Override
    public double hitungTotalBayar(){
        return hargaBarang * jumlahBeli; 
    }

    // Override metode tampilkanInfo untuk menampilkan total bayar
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Total Bayar: " + hitungTotalBayar());
    
    }
}
