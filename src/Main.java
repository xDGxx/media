import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w, x, y, z, media;

        System.out.print("Digite o primeiro número:");
        w = sc.nextDouble();

        System.out.print("Digite o segundo número:");
        x = sc.nextDouble();

        System.out.print("Digite o terceiro número:");
        y = sc.nextDouble();

        System.out.print("Digite o quarto número:");
        z = sc.nextDouble();

        media = (w + x + y + z) / 2;

        System.out.println("A sua média é " + media);
        sc.close();
    }
}