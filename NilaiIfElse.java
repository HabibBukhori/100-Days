package Day23;
import java.util.Scanner;
public class Nilai {

  public static void main(String[] args) {
  /* Hari ke 23 ini saya latihan membuat nilai
  menggunakan if else */
  Scanner input = new Scanner(System.in);
  
  System.out.print("Masukkan Nilai : ");
  int nilai = input.nextInt();
  
  if (nilai >= 90 && nilai <= 100){
    System.out.println("A");
    
  }else if (nilai >= 80 && nilai <90){
    System.out.println("B");
    
  }else if (nilai >= 70 && nilai <80){
    System.out.println("C");
    
  }else if (nilai >= 60 && nilai <70){
    System.out.println("D");
    
  }else{
    System.out.println("E");
  }
  /* itulah tadi hasil latihan saya pada
  hari ini, jika ada kekurangan dan kesalahan
  pada kodingan saya, mohon untuk dapat
  dikoreksi. Terima Kasih :} */
  }
      }
