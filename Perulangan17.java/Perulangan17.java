import java.util.Scanner;

public class Perulangan17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NIM Anda: ");
        long nim = scanner.nextLong();

        int n = (int) (nim % 100);

        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }

        System.out.println();
    }
}
