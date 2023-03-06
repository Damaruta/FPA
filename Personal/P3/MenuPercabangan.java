package P3;

import java.util.Scanner;

public class MenuPercabangan {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("--Menu--");
        System.out.println("1. Bakso Rp.12.000");
        System.out.println("2. Mie Rp 10.000");
        System.out.println("3. Soto Rp 14.000");

        System.out.print("Tulis menu yang dipilih (no): ");
        int m = sc.nextInt();
        System.out.print("Berapa? ");
        int b = sc.nextInt();

        if ((m > 0) && (m < 4)) {
            if (m == 1) {
                System.out.println("Total harga = " + 12000 * b);
            } else if (m == 2) {
                System.out.println("Total harga = " + 10000 * b);
            } else {
                System.out.println("Total harga = " + 14000 * b);
            }
        } else {
            System.out.println("Angka harus 1-3");
        }
    }
}
