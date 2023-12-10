import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        try {
            // Tanggal dan Waktu
            Date tanggalSekarang = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd/MM/yyyy");
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss z");

            // Input Data Pelanggan
            Scanner scanner = new Scanner(System.in);
            System.out.println("NAMA SUPERMARKET/MINI MARKET");
            System.out.println("Tanggal : " + dateFormat.format(tanggalSekarang));
            System.out.println("Waktu   : " + timeFormat.format(tanggalSekarang));
            System.out.println("========================");

            // Data Pelanggan
            System.out.println("DATA PELANGGAN");
            System.out.println("---------------------");
            System.out.print("Nama Pelanggan : ");
            String namaPelanggan = scanner.nextLine();
            System.out.print("No. HP         : ");
            String noHP = scanner.nextLine();
            System.out.print("Alamat         : ");
            String alamat = scanner.nextLine();
            System.out.println("++++++++++++++++++++++++");

            // Data Pembelian Barang
            System.out.println("DATA PEMBELIAN BARANG");
            System.out.println("-----------------------------");
            System.out.print("Kode Barang    : ");
            String kodeBarang = scanner.nextLine();
            System.out.print("Nama Barang    : ");
            String namaBarang = scanner.nextLine();
            System.out.print("Harga Barang   : ");
            double hargaBarang = scanner.nextDouble();
            System.out.print("Jumlah Beli    : ");
            int jumlahBeli = scanner.nextInt();
            double totalBayar = hargaBarang * jumlahBeli;
            System.out.println("TOTAL BAYAR    : " + totalBayar);
            System.out.println("++++++++++++++++++++++++");

            // Data Kasir
            scanner.nextLine(); // Membersihkan buffer
            System.out.print("Kasir          : ");
            String kasir = scanner.nextLine();

            // Menampilkan semua data
            System.out.println("\n========================");
            System.out.println("NAMA SUPERMARKET/MINI MARKET");
            System.out.println("Tanggal : " + dateFormat.format(tanggalSekarang));
            System.out.println("Waktu   : " + timeFormat.format(tanggalSekarang));
            System.out.println("========================");
            System.out.println("DATA PELANGGAN");
            System.out.println("---------------------");
            System.out.println("Nama Pelanggan : " + namaPelanggan);
            System.out.println("No. HP         : " + noHP);
            System.out.println("Alamat         : " + alamat);
            System.out.println("++++++++++++++++++++++++");
            System.out.println("DATA PEMBELIAN BARANG");
            System.out.println("-----------------------------");
            System.out.println("Kode Barang    : " + kodeBarang);
            System.out.println("Nama Barang    : " + namaBarang);
            System.out.println("Harga Barang   : " + hargaBarang);
            System.out.println("Jumlah Beli    : " + jumlahBeli);
            System.out.println("TOTAL BAYAR    : " + totalBayar);
            System.out.println("++++++++++++++++++++++++");
            System.out.println("Kasir          : " + kasir);

            
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Pastikan input sesuai dengan yang diharapkan.");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan. Silakan coba lagi.");
        }
       
    }
}
