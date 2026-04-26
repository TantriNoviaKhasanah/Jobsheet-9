import java.util.Scanner;

public class SuratDemo25 {
    public static void main(String[] args) {
        StackSurat25 stack = new StackSurat25(5);
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = sc.nextInt();

                    Surat25 s = new Surat25(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    System.out.println("Surat berhasil ditambahkan");
                    break;

                case 2:
                    Surat25 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat dari " + proses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat25 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dari " + lihat.namaMahasiswa);
                    } else {
                        System.out.println("Tidak ada surat.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari = sc.nextLine();
                    boolean ketemu = stack.cariSurat(cari);

                    if (ketemu) {
                        System.out.println("Surat ditemukan.");
                    } else {
                        System.out.println("Surat tidak ditemukan.");
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 5);
    }
}
