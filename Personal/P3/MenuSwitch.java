package P3;

import java.util.Scanner;

public class P3_5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("--Menu--");
        System.out.println("1. Bakso Rp.12.000");
        System.out.println("2. Mie Rp 10.000");
        System.out.println("3. Soto Rp 14.000");

        System.out.print("Tulis menu yang dipilih (no): ");
        int m = sc.nextInt();
        System.out.print("Berapa porsi? ");
        int b = sc.nextInt();

        switch (m) {
            case 1:
                System.out.println("Total harga = Rp " + (12000) * b);
                break;
            case 2:
                System.out.println("Total harga = Rp " + (10000) * b);
                break;
            case 3:
                System.out.println("Total harga = Rp " + (14000) * b);
                break;
            default:
                System.out.println("Angka harus 1-3");
                break;
        }
    }
}
