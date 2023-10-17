package Day9;
import java.util.Scanner;
public class Day9 {

  public static void main(String[] args) {
  /* hari ke 9 ini saya akan menampilkan
  cara menghitung keliling lingkaran dan
  luas lingkaran menggunakan scanner */
  
  Scanner input = new Scanner(System.in);
  final double phi = 3.14;
  double L, K, r, d;
  
  System.out.print("Jari-jari = ");
  r = input.nextDouble();
  d = 2 * r;
  System.out.println("Diameter = "+d);
  L = phi * r * r;
  K = phi * d;
  
  System.out.println("L = πr²");
  System.out.println("L = "+phi+" × "+r+" × "+r);
  System.out.println("L = "+L);
  System.out.println("=================");
  System.out.println("K = 2πr / πd");
  System.out.println("K = "+phi+" × "+d);
  System.out.println("K = "+K);
  
  /* baiklah cukup sampai disini saja
  pengetahuan saya hari ini, mohon maaf
  jika ada kesalahan pada codingan saya
  dan tolong untuk koreksinya jika ada 
  yang salah. Terima Kasih:) */  
  }
                     }
