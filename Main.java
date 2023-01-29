package RadiologiFinal;

public class Main extends Pelayanan {
    public static void main(String[] args) {

    System.out.println("\t\t" + "   Rumah Sakit Sukamiskin   " + "\t\t" );
    System.out.println("\t\t" + "----------------------------");
    System.out.println("\t\t" + "Jalan Turi, No.4, Sukamiskin" + "\t\t\n");
    System.out.println("\t" + "   Layanan Administrasi Radiologi  \n");
    
    Login.Login();

    do{
        Pelayanan.Administrasi();
        Pelayanan.layanan();
        Pelayanan.show();
    }while (all);

    System.exit(0);

    }
}





 
    



