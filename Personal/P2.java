//D
//22523164
package P2; //22523164
//22523164
import java.util.Scanner;//22523164
//A
//22523164
//22523164
public class P2_2 {
    public static void main(String[] args) throws Exception {
//22523164
//M
        Scanner sc = new Scanner(System.in);//22523164
//22523164
        //A
//R
        // Meminta user memasukkan nama panggilan
        System.out.print("Massukkan nama panggilan  : ");//22523164
        String np = sc.next();//22523164
//22523164
        // Meminta user memasukkan NIM
        System.out.print("Masukkan NIM              : ");//22523164
        int nim = sc.nextInt();//22523164
//22523164
        // Meminta user memasukkan tinggi badan (m)
        System.out.print("Masukkan tinggi badan (m) : ");//22523164
        float tb = sc.nextFloat();//22523164
//22523164
        sc.nextLine(); // mengambil baris kosong sehingga tidak terjadi masalah ketika ingin memasukkan
                       // input alamat setelahnya
//22523164
        // Meminta user memasukkan alamat
        System.out.print("Masukkan alamat           : ");//22523164
        String a = sc.nextLine();//22523164
//22523164
        // Menampilkan data yang telah dimasukkan
        System.out.println("--------------------------------------------------------------------------");//22523164
        System.out.println("| Nama panggilan : " + np + "                                                 |");//22523164
        System.out.println("| NIM            : " + nim + "                                              |");//22523164
        System.out.println("| Tinggi badan   : " + tb + " m" + "                                                |");//22523164
        System.out.println("| Alamat         : " + a + "        |");
        System.out.println("--------------------------------------------------------------------------");//22523164
    }//22523164
}//22523164
/*
 * Bahan input:
 * Damar
 * 22523164
 * 1,65
 * Bendo RT 103, Trimurti, Srandakan, Bantul, DIY
 */
