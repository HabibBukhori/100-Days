package Day18;
import java.util.Scanner;
public class Segitiga {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  /* Hari ke 18 ini saya menampilkan kembali
   cara mencari rumus luas dan keliling segitiga
  sama sisi menggunakan scanner.
  Baiklah langsung saja  */
  
  double a, t, s, L, K;
  /* a = alas, t = tinggi, s = sisi, 
  L = luas, K = keliling;*/
  System.out.print("Masukkan Alas = ");
  a = input.nextDouble();
  System.out.print("Masukkan Tinggi = ");
  t = input.nextDouble();  
  s = a;
  L = 0.5*(a*t);
  K = 3 * s; // atau sisi + sisi + sisi
  System.out.println("================");
  System.out.println("< Menghitung Luas>");
  System.out.println("L = 1/2 × (a × t) ");
  System.out.println("L = 1/2 × ("+a+" × "+t+")");
  System.out.println("L = 1/2 × "+a*t);
  System.out.println("L = "+L);
  
  System.out.println("=================");
  System.out.println("<Menghitung Keliling>");
  System.out.println("K = 3 × s");
  System.out.println("K = 3 × "+s);
  System.out.println("K = "+K);
  
  /* mungkin cukup sampai disini saja latihan
  saya pada hari ini. mohon maaf jika saya
  mengulangi codingan saya. dan mohon untuk
  dapat mengoreksi codingan saya jika ada 
  yang salah. TERIMA KASIH */
  }
  }
