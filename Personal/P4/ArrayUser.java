package P4;

import java.util.Scanner;

public class ArrayUser {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen dalam larik: ");
        int n = sc.nextInt();

        // Inisialisasi array kosong
        int[] larik1 = new int[n];

        for (int i = 0; i < n; i++) {
            // Meminta input dari user berupa elemen dalam indeks ke-n untuk dimasukkan ke
            // dalam array
            System.out.print("Masukkan elemen indeks ke-" + i + ": ");
            int e = sc.nextInt();

            // Memasukkan elemen yang di input oleh user ke dalam larik
            larik1[i] = e;

            // Jika sudah menambah elemen di indeks (n-1) maka print seluruh elemen
            if (i == (n - 1)) {
                System.out.print("Semua elemen dalam larik adalah: ");
                for (int bebas : larik1) {
                    System.out.print(bebas + " ");
                }
            }
        }
    }
}
