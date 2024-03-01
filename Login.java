import java.util.Scanner;

public class Login {

    static Scanner input = new Scanner(System.in);
    static String username, password, session;

    static final String[][] user = {
            {"admin", "12345"}, 
            {"kasir", "54321"}  
    };

    static void login() {
        System.out.println("====================================================");
        System.out.println();
        System.out.println("========");
        System.out.println("| LOGIN |");
        System.out.println("========");
        System.out.println();

        input.nextLine(); 

        System.out.print("Masukkan username anda: ");
        username = input.nextLine();
        System.out.print("Masukkan password anda: ");
        password = input.nextLine();

        boolean loginSuccessful = false;
        for (int i = 0; i < user.length; i++) {
            if (user[i][0].equals(username) && user[i][1].equals(password)) {
                loginSuccessful = true;
                session = user[i][0];
                break;
            }
        }

        if (loginSuccessful) {
            System.out.println("\nLogin Berhasil!");
            System.out.println("\nAnda login sebagai " + session);
           
        } else {
            System.out.println("\nLogin Gagal! Username atau Password Salah.");
        }
    }
}