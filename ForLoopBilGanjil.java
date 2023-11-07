package Day30;
import java.util.Scanner;
public class ForLoopGanjil {
  public static void main(String[] args) {
  /* Hari ke 30 ini saya melanjutkan latihan 
  saya yaitu mencari angka ganjilmenggunakan
  looping for */
  Scanner input = new Scanner(System.in);
  
  int ang1, ang2;
  System.out.println("=> Angka Ganjil");
  System.out.print("Angka Awal  : ");
  ang1 = input.nextInt();
  System.out.print("Angka Akhir : ");
  ang2 = input.nextInt();
    
  for (int a = ang1; a <= ang2; a++){
    int hasil = a % 2;
    if(hasil == 1){
      System.out.print(a+" ");
    }
    /* Mungkin sampai sini saja latihan saya
    hari ini, jika ada kekurangan atau kesalahan 
    pada kodingan saya mohon dikoreksi.
    Terima Kasih :) */
  }   
  }
                       }
