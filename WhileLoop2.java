package Day32;
import java.util.Scanner;
public class WhileLoop {
  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  
  int angka1, angka2, split;
  System.out.println("=> Angka Genap <=");
  
  System.out.println("");
  
  System.out.print("Angka Awal  : ");
  angka1 = input.nextInt();
  
  System.out.print("Angka Akhir : ");
  angka2 = input.nextInt();
  
  System.out.println("");
      
  int a = angka1;
  split = 1;
  while (a <= angka2){
    int hasil = a % 2;
    if(hasil == 0){
    System.out.print(a+" ");
      if(split == 5){
        System.out.println("");
        split = 0;
      }
      split++;
    //split sebagai penghenti angka ke samping
    // dan dilanjut kebawah
    } 
    a++; 
  }
  }
}
