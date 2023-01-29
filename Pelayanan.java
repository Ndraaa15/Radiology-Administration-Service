package RadiologiFinal;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Pelayanan extends Identitas{
    static Scanner sc = new Scanner(System.in);
    static boolean all = true;
    static int pilihan, kelas, pilih, nobyr;
    static double hargaKamar, harga = 0;
    static String kelasKamar, pr, daftar = "";



    static double biaya(double harga, double hargaKamar){

        return harga + hargaKamar;
    }

    static void Administrasi(){
        System.out.println("------------|" + " ADMINISTRASI PASIEN " + "|------------");
        System.out.println("\n\t\t    <<Pelayanan Kesehatan>>\t\t\t\n");
        boolean y = true;
        while(y){
            System.out.println("Pelayanan yang tersedia : ");
            System.out.println("1. BPJS");
            System.out.println("2. UMUM");
            System.out.print("Pilihan Pasien : ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    daftar = "BPJS";
                    System.out.print("Pelayanan yang dipilih : " + daftar);
                    System.out.println();
                    Identitas.Bpjs();
                    y = false;
                    break;
                case 2:
                    daftar = "UMUM";
                    System.out.print("Pelayanan yang dipilih : " + daftar);
                    System.out.println();
                    Identitas.nonBpjs();
                    y = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("Maaf, pilihan tidak tersedia.");
                    System.out.println("Silahkan masukkan pilihan yang tersedia!");
                    System.out.println();
                    break;
            }
        }
        System.out.println();
    }
    static void layanan(){
        Random angkaRandom = new Random();
        System.out.println("\n\t\t\t <<Jenis Pemeriksaan>> \t\t\t\n");
        System.out.println("-------------------------------------------------");
        System.out.println("| No | Jenis Pemeriksaan     | Harga            |");
        System.out.println("-------------------------------------------------");
        System.out.println("| 1  | Foto Rontgen          | Rp. 200.000,00   |");
        System.out.println("| 2  | CT Scan               | Rp. 1.350.000,00 |");
        System.out.println("| 3  | Fluoroskopi           | Rp. 350.000,00   |");
        System.out.println("| 4  | Ultrasonografi        | Rp. 180.000,00   |");
        System.out.println("| 5  | Cek Nuklir            | Rp. 1.400.000,00 |");
        System.out.println("| 6  | MRI                   | Rp. 1.300.000,00 |");
        System.out.println("-------------------------------------------------");

        boolean a = true;
        while(a){
            System.out.print("Pilihan Pasien: ");
            pilihan = sc.nextInt();
            System.out.println();
            switch (pilihan) {
                case 1 :
                    pr = "Foto Rontgen";
                    harga = 200_000;
                    a = false;
                    nobyr = angkaRandom.nextInt(999999);
                    break;
                case 2:
                    pr = "CT Scan";
                    harga = 1_350_000;
                    a = false;
                    nobyr = angkaRandom.nextInt(999999);
                    break;
                case 3:
                    pr = "Fluoroskopi";
                    harga = 350_000;
                    System.out.println("Harus Rawat Inap");
                    kelasKamar();
                    a = false;
                    break;
                case 4:
                    pr = "Ultrasonografi";
                    harga = 180_000;
                    System.out.print("No Pembayaran: ");
                    System.out.println(angkaRandom.nextInt(999999));
                    a = false;
                    break;
                case 5:
                    pr = "Cek Nuklir";
                    harga = 1_400_000;
                    System.out.println("Harus Rawat Inap");
                    kelasKamar();
                    a = false;
                    break;
                case 6:
                    pr = "MRI";
                    harga = 1_300_000;
                    System.out.println("Harus Rawat Inap");
                    kelasKamar();
                    a = false;
                    break;
                default:
                    System.out.println("Maaf, tidak ada di pilihan!");
                    System.out.println("Silahkan coba untuk memasukkan pilihan yang tersedia!");
                    break;
            }
        }
        System.out.println();
    }

    static void kelasKamar(){
//        if(pilihan == 3 || pilihan == 5 || pilihan == 6){
            System.out.println();
            System.out.println("\n\t\t\t\t <<Kelas Kamar>>\t\t\t\n");
            System.out.println("--------------------------------------------------------------");
            System.out.println("| No |   Kelas Kamar  |      Harga     |       Fasilitas     |");
            System.out.println("--------------------------------------------------------------");
            System.out.println("|    |                |                | 1 Unit Televisi     |");
            System.out.println("|    |                |                | 1 Unit Bed Pasien   |");
            System.out.println("|    |                |                | 1 Unit AC           |");
            System.out.println("|    |                |                | 1 Unit Sofa         |");
            System.out.println("|    |                |                | 1 Unit Lemari       |");
            System.out.println("| 1  |    Kelas 1     | Rp. 700.000,00 | 1 Unit Lemari Es    |");
            System.out.println("|    |                |                | 1 Unit Dispenser    |");
            System.out.println("|    |                |                | 1 Unit Telepon      |");
            System.out.println("|    |                |                | 1 Unit Balkon luar  |");
            System.out.println("|    |                |                | 1 Unit Pantry set   |");
            System.out.println("--------------------------------------------------------------");
            System.out.println("|    |                |                | 1 Unit Televisi     |");
            System.out.println("|    |                |                | 1 Unit Bed Pasien   |");
            System.out.println("|    |                |                | 1 Unit AC           |");
            System.out.println("|    |                |                | 1 Unit Sofa         |");
            System.out.println("| 2  |    Kelas 2     | Rp. 550.000,00 | 1 Unit Lemari       |");
            System.out.println("|    |                |                | 1 Unit Lemari Es    |");
            System.out.println("|    |                |                | 1 Unit Dispenser    |");
            System.out.println("|    |                |                | 1 Unit Telepon      |");
            System.out.println("--------------------------------------------------------------");
            System.out.println("|    |                |                | 1 Unit Televisi     |");
            System.out.println("|    |                |                | 1 Unit Bed Pasien   |");
            System.out.println("| 3  |    Kelas 3     | Rp. 350.000,00 | 1 Unit AC           |");
            System.out.println("|    |                |                | 1 Unit Sofa         |");
            System.out.println("|    |                |                | 1 Unit Lemari       |");
            System.out.println("--------------------------------------------------------------");

            boolean b = true;
            while(b){
                System.out.print("Kelas Kamar Pasien : " );
                kelas = sc.nextInt();
                switch (kelas) {
                    case 1:
                        hargaKamar = 700_000;
                        kelasKamar = "Kelas 1";
                        Kamar.Kamar1();
                        b = false;
                        break;

                    case 2:
                        hargaKamar = 550_000;
                        kelasKamar = "Kelas 2";
                        Kamar.Kamar2();
                        b = false;
                        break;
                    case 3:
                        hargaKamar = 350_000;
                        kelasKamar = "Kelas 3";
                        Kamar.Kamar3();
                        b = false;
                        break;
                    default:
                        System.out.println("Maaf, tidak ada di pilihan!");
                        System.out.println("Silahkan coba untuk memasukkan pilihan yang tersedia!");
                        break;
                }
            }
            System.out.println();
        }
//    }

    static void  show (){
        if (pilih == 1){
            showBPJS();
        }else {
            showNonBPJS();
        }
    }


    static void showBPJS(){
        System.out.println();
        System.out.println("----------------|" + " DATA PASIEN " + "|----------------");
        if (pilihan == 1 || pilihan == 2 | pilihan == 4) {
            System.out.println("Nomor Pembayaran  : " + nobyr);
        }
        System.out.println();
        System.out.println("Nama              : " + Nama);
        System.out.println("Alamat            : " + Alamat);
        System.out.println("Pelayanan         : " + daftar);
        System.out.println("Jenis Pemeriksaan : " + pr);
        System.out.printf("Biaya Pemeriksaan : Rp. %,.3f", harga);
        System.out.println();
        if (pilihan == 3 || pilihan == 5 || pilihan == 6) {
            System.out.println("Tipe kamar        : " + kelasKamar);
            System.out.printf("Biaya kamar       : Rp. %,.3f",  hargaKamar);
            System.out.println();
        }
        System.out.printf("Total             : Rp. %,.3f", biaya(harga,hargaKamar));
        System.out.println("\nKeterangan        : Biaya ditanggung BPJS");
        System.out.println("----------------------------------------------");
        System.out.println();
        System.out.println("Apakah ada pasien baru? (Ya/Tidak)");
        String cariLagi = sc.next();
        System.out.println("");
        all = cariLagi.equals("Ya");
    }

    static void showNonBPJS(){
        System.out.println();
        System.out.println("----------------|" + " DATA PASIEN " + "|----------------");
        System.out.println();
        if (pilihan == 1 || pilihan == 2 | pilihan == 4) {
            System.out.println("Nomor Pembayaran   : " + nobyr);
        }
        System.out.println();
        System.out.println("Nama               : " + Nama);
        System.out.println("Alamat             : " + Alamat);
        System.out.println("Pelayanan          : " + daftar);
        System.out.println("Jenis Pemeriksaan  : " + pr);
        System.out.printf("Biaya Pemeriksaan  : Rp. %,.3f", harga);
        System.out.println();
        if (pilihan == 3 || pilihan == 5 | pilihan == 6) {
            System.out.println("Tipe kamar         : " + kelasKamar);
            System.out.printf("Biaya kamar       : Rp. %,.3f",  hargaKamar);
            System.out.println();
        }
        System.out.printf("Total              : Rp. %,.3f", biaya(harga,hargaKamar));
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();
        System.out.println("Apakah ada pasien baru? (Ya/Tidak)");
        String cariLagi = sc.next();
        System.out.println("");
        all = cariLagi.equals("Ya");
    }
}


