package RadiologiFinal;

import java.util.Scanner;

public class Identitas {
    static String Nama, NIK,noBPJS, jenisKelamin, Alamat;
    static int Umur;
    
    static void  Bpjs(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t\t     <<Identitas Pasien>>   \t\n");
        System.out.println("Masukkan identitas pasien dengan teliti!\n");
        System.out.print("Nama                 : ");
        Nama = sc.nextLine();
        System.out.print("Alamat               : ");
        Alamat = sc.nextLine();
        System.out.print("Nomor NIK (16 digit) : ");
        NIK = sc.nextLine();
        System.out.print("Nomor BPJS (11 digit): ");
        noBPJS = sc.nextLine();
        System.out.print("Usia Pasien          : ");
        Umur = sc.nextInt();
        System.out.print("Jenis Kelamnin (L/P) : ");
        jenisKelamin = sc.next();
    }
        
    static void nonBpjs(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t\t     <<Identitas Pasien>>   \t\n");
        System.out.println("Masukkan identitas pasien dengan teliti!\n");
        System.out.print("Nama                 : ");
        Nama = sc.nextLine();
        System.out.print("Alamat               : ");
        Alamat = sc.nextLine();
        System.out.print("Nomor NIK (16 digit) : ");
        NIK = sc.nextLine();
        System.out.print("Usia Pasien          : ");
        Umur = sc.nextInt();
        System.out.print("Jenis Kelamnin (L/P) : ");
        jenisKelamin = sc.next();
    }
}


