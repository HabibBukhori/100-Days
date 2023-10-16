package Day8;
import java.util.Scanner;
public class Day8 {
  public static void main(String[] args) {
  // hari ke 8 ini saya akan menampilkan
  // operasi aritmatika Scanner
  Scanner input= new Scanner(System.in);
  
  int a,b,c;
  System.out.print("Nilai a = ");
  a = input.nextInt();
  System.out.print("Nilai b = ");
  b = input.nextInt();
  
  c = a + b; // aritmatika penjumlahan
  System.out.println(a+" + "+b+" = "+c);
  
  c = a - b; // aritmatika pengurangan
  System.out.println(a+" - "+b+" = "+c);
  
  c = a * b; // aritmatika perkalian
  System.out.println(a+" × "+b+" = "+c);
  
  c = a / b; // aritmatika pembagian
  System.out.println(a+" ÷ "+b+" = "+c);
  
  c = a % b; // aritmatika sisa bagi
  System.out.println(a+" % "+b+" = "+c);
  
  // mohon untuk di koreksi jika ada yang
  // salah di codingan saya hari ini
  // dan juga, mohon maaf atas keterlambatan
  // saya pada hari ke 7 kemarin
  // terima kasih ;)
  }
}
