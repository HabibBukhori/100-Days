package Day20;
import java.util.Scanner;
public class DecimalToBiner {
  public static void main(String[] args) {

  /* Hari ini saya akan latihan mengkonversi
  bilangan decimal ke bilangan biner */
 
  Scanner input = new Scanner(System.in);
  int decimal;
  String binary;
  
  System.out.println("Decimal to Binary");
  System.out.print("Decimal : ");
  decimal = input.nextInt();
  
  System.out.println("===============");
  
  binary = Integer.toBinaryString(decimal);
  System.out.println("Binary : "+binary);
  
  /* cukup sampai sini saja hasil latihan
  saya hari ini, mohon maaf jika ada kesalahan
  pada kodingan saya hari ini, dan mohon dikoreksi
  jika ada yang salah. Terima Kasih ;)*/
  
  }
}
