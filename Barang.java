public class Barang {
    protected String kodeBarang;
    protected String namaBarang;
    protected double hargaBarang;
    protected int jumlahBeli;

    public Barang(String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli){
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBeli = jumlahBeli;
    }

    public void tampilkanInfo(){
        System.out.println("Nomor Faktur: "+ kodeBarang);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: " + hargaBarang);
        System.out.println("Jumlah Beli: " + jumlahBeli);
    }       
}
