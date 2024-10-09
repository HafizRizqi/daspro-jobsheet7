import java.util.Scanner;

public class ProgramParkir11 {
    public static void main(String[] args) {
        Scanner sc11 = new Scanner(System.in);
        int jenis, durasi, total = 0;
        do { 
            System.out.println("Masukkan jenis kendaraan (ketik '1' untuk Mobil,'2' untuk Motor, '0' untuk Keluar)");
        jenis = sc11.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.println("Masukkan durasi parkir (Per Jam): ");
                durasi = sc11.nextInt();
                if (durasi > 5) {
                    total += 12500;
                }
                if (jenis == 1) {
                    total += durasi * 3000;
                }
                if (jenis == 2) {
                    total += durasi * 2000;
                }
            }
            } while (jenis != 0);
            System.out.println("Total pembayaran parkir: Rp" + total);
        } 
    }