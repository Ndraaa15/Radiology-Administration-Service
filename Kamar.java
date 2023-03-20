package RadiologiFinal;

import java.util.ArrayList;
import java.util.Scanner;


class Kamar {
    private Integer noKamar;
    static Scanner sc = new Scanner(System.in);
    static int nomor;

    //constructor dengan parameter untuk menunjukan variabel noKamar
    public Kamar(Integer noKamar){

        this.noKamar = noKamar;
    }

    //method untuk mengambil nilai di dalam arraylist kamar
    public Integer getNoKamar() {

        return noKamar;
    }

    //array untuk menampung data nomor kamar  parameter constructor Kamar
    public static ArrayList<Kamar> kamar1 = new ArrayList<>();
    public static ArrayList<Kamar> kamar2 = new ArrayList<>();
    public static ArrayList<Kamar> kamar3 = new ArrayList<>();

    //method untuk memilih kamar dan menampilkan kamar kamar yang sudah terisi
    static void Kamar1(){
        System.out.println("\n\t\t     <<Kamar Pasien>>   \t\n");
        System.out.println("-----------------------------------");
        System.out.println("Kamar yang sudah terisi: ");
        if(kamar1.isEmpty()){
            System.out.println("Belum ada kamar yang terisi");
            System.out.println();
        } else if (kamar1.size() == 10){
            System.out.println("Maaf, Kamar Sudah Penuh");
            Pelayanan.kelasKamar();
        }

        //perulangan untuk menampilkan isi array
        for(Kamar list: kamar1){
            System.out.print("Kamar no: " + list.getNoKamar());
            System.out.println();
        }
        boolean x = true;
        while(x){
            System.out.print("Masukan nomor Kamar: ");
            nomor = sc.nextInt();
            System.out.println();

            //membuat objek nokmr untuk memasukan inputan nomor ke dalam array
            Kamar nokmr = new Kamar(nomor);
            if(kamar1.contains(nokmr)){
                System.out.println("Kamar sudah terisi, silahkan pilih kamar yang tersedia");
            }else {
                //memasukan nomor kamar yang telah diinput user ke dalam array
                kamar1.add(nokmr);
                x = false;
            }
            System.out.println("Kamar anda nomor: " + nomor);
        }
        System.out.println();
    }
    static void Kamar2(){
        System.out.println("\n\t\t     <<Kamar Pasien>>   \t\n");
        System.out.println("-----------------------------------");
        System.out.println("Kamar yang sudah terisi: ");
        if(kamar2.isEmpty()){
            System.out.println("Belum ada kamar yang terisi");
            System.out.println();
        }else if (kamar2.size() == 5){
            System.out.println("Maaf, Kamar Sudah Penuh");
            Pelayanan.kelasKamar();
        }

        for(Kamar list: kamar2){
            System.out.print("Kamar no: " + list.getNoKamar());
            System.out.println();
        }
        boolean x = true;
        while(x){
            System.out.print("Masukan nomor Kamar: ");
            nomor = sc.nextInt();
            System.out.println();


            Kamar nokmr = new Kamar(nomor);
            if(kamar2.contains(nokmr)){
                System.out.println("Kamar sudah terisi, silahkan pilih kamar yang tersedia");
            } else {

                kamar2.add(nokmr);
                x = false;
            }
            System.out.println("Kamar anda nomor: " + nomor);
        }
        System.out.println();
    }
    static void Kamar3(){
        System.out.println("\n\t\t     <<Kamar Pasien>>   \t\n");
        System.out.println("-----------------------------------");
        System.out.println("Kamar yang sudah terisi: ");
        if(kamar3.isEmpty()){
            System.out.println("Belum ada kamar yang terisi");
            System.out.println();
        } else if (kamar3.size() == 3){
            System.out.println("Maaf, Kamar Sudah Penuh");
            Pelayanan.kelasKamar();
        }


        for(Kamar list: kamar3){
            System.out.print("Kamar no: " + list.getNoKamar());
            System.out.println();
        }
        boolean x = true;
        while(x){
            System.out.print("Masukan nomor Kamar: ");
            nomor = sc.nextInt();
            System.out.println();


            Kamar nokmr = new Kamar(nomor);
            if(kamar3.contains(nokmr)){
                System.out.println("Kamar sudah terisi, silahkan pilih kamar yang tersedia");
            } else {
                kamar3.add(nokmr);
                x = false;
            }
            System.out.println("Kamar anda nomor: " + nomor);
        }
        System.out.println();
    }
}



