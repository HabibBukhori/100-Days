package Day25;
import java.util.Scanner;
public class GanjilGenapTernary {
  public static void main(String[] args) {
  /* Hari ke 25 ini saya latihan membuat
  codingan tentang cara mencetak angka tersebut
  genap atau ganjil dengan menggunakan operator
  ternary */
  Scanner input = new Scanner(System.in);
  
  System.out.print("Masukkan Angka : ");
  int angka = input.nextInt();
  int hasil = angka % 2;
  
  String kondisi = hasil == 0?"Genap":"Ganjil";
  
  System.out.println("Angka Tersebut : "+kondisi);
  
  /* cukup sampai sini saja codingan saya hari ini
  mohon maaf jika ada kekurangan dan kesalahan pada
  codingan saya hari ini. Terima Kasih :) */

  }
}
