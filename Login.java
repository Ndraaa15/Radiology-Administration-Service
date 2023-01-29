package RadiologiFinal;

import java.util.Scanner;

public class Login {
        static void Login(){
        Scanner sc = new Scanner(System.in);

        final String USERNAME = "admin";
        final String PASSWORD = "1234";

        System.out.println("------------------|" + " LOGIN " + "|--------------------");
        System.out.println("Silahkan masukkan Username dan Password!");
        for (int i = 0; i < 3; i++) {
            System.out.print("Username : ");
            String user = sc.nextLine();
            System.out.print("Password : ");
            String pass = sc.nextLine();

            if (user.compareTo(USERNAME) == 0 && pass.compareTo(PASSWORD) == 0){
                System.out.println("Selamat anda berhasil login!");
                System.out.println("-----------------------------------------------");
                System.out.println();
                System.out.println();

                break;
            } else if (user.compareTo(USERNAME) == 0 && pass.compareTo(PASSWORD) != 0) {
                System.out.println("Maaf, password yang anda masukkan salah!");
                System.out.println("Silahkan coba lagi!");
                System.out.println();

            } else if (user.compareTo(USERNAME) != 0 && pass.compareTo(PASSWORD) == 0) {
                System.out.println("Maaf, username yang anda masukkan salah!");
                System.out.println("Silahkan coba lagi!");
                System.out.println();
            } else if (user.compareTo(USERNAME) != 0 && pass.compareTo(PASSWORD) != 0){
                System.out.println("Maaf, username dan password yang anda masukkan salah!");
                System.out.println("Silahkan coba lagi!");

            }
            if(i == 2){
                System.out.println("Maaf anda sudah mencapai batas maksimal login");
                System.exit(0);
            }
        }
    }
}
