import java.util.Scanner;

public class PengelolaBioskop11 {
    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        int hargaTiket = 50000, totalTiketTerjual = 0,jumlahTiket = 0;
        double totalPendapatan = 0;

        while (true) {
            System.out.println("Masukkan jumlah tiket yang ingin di beli (ketik '0' untuk selesai): ");
            jumlahTiket = sc11.nextInt();
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid, masukkan jumlah tiket yang benar");
                continue;
            }
            if (jumlahTiket == 0) {
                System.out.println("Transaksi jumlah tiket selesai");
                break;
            }
            double totalHarga = jumlahTiket * hargaTiket;
            if (jumlahTiket > 4) {
                totalHarga *= 0.90;
            }
            if (jumlahTiket > 10) {
                totalHarga *= 0.85;
            }
            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalHarga;

            System.out.println("Total harga untuk pembelian ini: Rp " + totalHarga);
        }
        System.out.println("Total tiket terjual hari ini: " + totalTiketTerjual);
        System.out.println("Total Pendapatan hari ini: Rp " + totalPendapatan);
    }
}