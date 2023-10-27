package Day19;
import java.util.Scanner;
public class Kalkulator {
  public static void main(String[] args) {
  /* Hari ke 19 ini saya letihan membuat kalkulator
  menggunakan percabangan if else */
  Scanner input = new Scanner(System.in);
  
  float bil1, bil2, hasil;
  char operator;
  System.out.print("Bilangan 1 = ");
  bil1 = input.nextFloat();
  System.out.print("Operator = ");
  operator = input.next().charAt(0);
  System.out.print("Bilangan 2 = ");
  bil2 = input.nextFloat();
  
  System.out.println("Input User = "+bil1+" "+operator+" "+bil2);
  
  if (operator == '+'){
    hasil = bil1 + bil2;
    System.out.println("Hasilnya = "+hasil); 
    
  }else if (operator == '-'){
    hasil = bil1 - bil2;
    System.out.println("Hasilnya = "+hasil);
    
  }else if (operator == '*'){
    hasil = bil1 * bil2;
    System.out.println("Hasilnya = "+hasil);
    
  }else if (operator == '/'){
    hasil = bil1 / bil2;
    System.out.println("Hasilnya = "+hasil);
    // ket : jika bilangan ke 2 bernilai nol(0)
    // maka hasilnya akan infinity / tak hingga
    
  }else{
    System.out.println("Operator tidak ada");
    
    /* mohon untuk dapat dikoreksi jika ada 
    kesalahan pada kodingan saya :) */    
  }
  }
}
