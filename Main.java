import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan alas: ");
        double alas = sc.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = sc.nextDouble();

        double luas = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga: " + luas);
    }
}