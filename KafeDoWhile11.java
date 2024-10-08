import java.util.Scanner;

public class KafeDoWhile11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaPelanggan;
        int kopi,teh,roti, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do {
            System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")){
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.println("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.println("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.println("Jumlah roti: ");
            roti = sc.nextInt();
            int totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga yang harus di bayar: Rp " + totalHarga);
            sc.nextLine();

        } while (true);
        System.out.println("Semua transaksi selesai.");

    }
}