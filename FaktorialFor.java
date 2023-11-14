package Day37;
import java.util.Scanner;
public class Faktorial {
  public static void main(String[] args) {
  
  int angka;
  Scanner input = new Scanner(System.in);
  
  System.out.println(">>Faktorial Angka<<");
  System.out.println("");
  
  System.out.print("Masukkan Angka : ");
  angka = input.nextInt();
  long hasil = angka;
  
  System.out.print(angka+"! = ");
  
  for(double a = (double)angka; a > 0; a--){
    System.out.print(a);
    if(a > 1){
      System.out.print(" × ");
    }
    if(angka != a){
      hasil *= a;
    }
  }
   System.out.println("");
   System.out.println("Hasil = "+hasil);
   
  }
    }
