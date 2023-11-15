package Day38;
import java.util.Scanner;
public class BilanganBerpangkat {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int bil, pan, hasil;
  
  System.out.println(">> Bilangan Berpangkat <<");
  System.out.println("");
  
  System.out.print("Bilangan : ");
  bil = input.nextInt();
  System.out.print("Pangkat  : ");
  pan = input.nextInt();
  
  System.out.println("=================");
  System.out.print("Hasil    : ");
  hasil = bil;
  
  for(int a = 1; a < pan ; a++ ){
    hasil *= bil;
  }
  System.out.println(hasil);
  }
  }
