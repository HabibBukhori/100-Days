package Day26;
import java.util.Scanner;
public class ForLoop {
  public static void main(String[] args) {
  /* Hari ke 26 ini saya latihan membuat program
  yaitu looping For */
  Scanner input = new Scanner(System.in);
  
  int awal, akhir;
  
  System.out.println("=>Masukkan Angka<=");
  System.out.print("Angka Awal   : ");
  awal = input.nextInt();
  
  System.out.print("Angka Akhir  : ");
  akhir = input.nextInt();
  
  for(int a = awal;a <= akhir;a++){
   System.out.print(a+" ");
   System.out.println(" ");
  }
  System.out.println("Program Selesai");
  /* ini saja latihan saya hari ini
  jika ada kekurangan dan kesalahan pada
  codingan saya mohon untuk dikoreksi.
  Terima Kasih ;) */
  }
}
