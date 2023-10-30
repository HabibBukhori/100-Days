package Day22;
import java.util.Scanner;
public class MenuMakanan {
  public static void main(String[] args) {
  /* Hari ke 22 saya latihan membuat menu makanan
  dengan menggunakan switch case */
  
  Scanner input = new Scanner(System.in);
  
  int pil, porsi, harga = 0;
  System.out.println("< Menu Makanan >");
  System.out.println("1. Nasi goreng  (Rp.14k)");
  System.out.println("2. Bakso        (Rp.10k)");
  System.out.println("3. Pangsit      (Rp.12k)");
  System.out.println("4. Nasi Ayam    (Rp.12k)");
  System.out.println("<======================>");
  
  System.out.print("Pilih : ");
  pil = input.nextInt();
  
  switch (pil){
    case 1 :
      System.out.print("Porsi : ");
      porsi = input.nextInt();
      System.out.println("<======================>");
      System.out.println("Nasi Goreng (14k/Porsi)");
      harga = 14000 * porsi;
      break;
      
    case 2 :
      System.out.print("Porsi : ");
      porsi = input.nextInt();
      System.out.println("<======================>");
      System.out.println("Bakso (10k/Porsi)");
      harga = 10000 * porsi;
      break;
      
    case 3 :
      System.out.print("Porsi : ");
      porsi = input.nextInt();
      System.out.println("<======================>");
      System.out.println("Pangsit (12k/porsi)");
      harga = 12000 * porsi;
      break;
      
    case 4 :
      System.out.print("Porsi : ");
      porsi = input.nextInt();
      System.out.println("<======================>");
      System.out.println("Nasi Ayam (12k/porsi)");
      harga = 12000 * porsi;
      break;
      
    default :
      System.out.println("Pilihan Tidak Ada");
      break;
  }
    System.out.println("Total : Rp."+harga);
    /* cukup sampai sini saja hasil latihan saya
    pada hari ini jika ada kekurangan dan kesalahan
    pada kodingan saya mohon untuk dikoreksi. 
    Terima Kasih :) */
  }

                     }
