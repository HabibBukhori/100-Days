package Day29;
import java.util.Scanner;
public class ForLoopBilGenap {
  public static void main(String[] args) {
  /* Hari ke 29 saya latihan membuat bilangan
  Genap menggunakan looping for/perulangan */
  
  Scanner input = new Scanner(System.in);
  
  int bil1, bil2;
  System.out.println(" => Bilangan Genap <=");
  System.out.print("Angka Awal  : ");
  bil1 = input.nextInt();
  System.out.print("Angka Akhir : ");
  bil2 = input.nextInt();
  
  for(int a = bil1;a <= bil2; a++){
    int hasil = a % 2;
    if(hasil==0){
      System.out.print(a+" ");
      }
  }
  /* Mungkin itu saja latihan saya hari ini
  jika ada kekurangan dan kesalahan pada
  codingan saya mohon untuk dikoreksi.
  Terima Kasih :) */
  }
}
