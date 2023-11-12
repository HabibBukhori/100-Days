package Task12Nov;
import java.util.Scanner;
public class PenjumlahanGanjil {

  public static void main(String[] args) {
  
   Scanner input = new Scanner(System.in);
   int angka1, hasil= 0, split;
   
   System.out.println(">> Penjumlahan Bilangan Ganjil <<");
   System.out.println("");
   System.out.print("Angka akhir : ");
   angka1 = input.nextInt();
   System.out.println("");
   
   split = 1;
  
   for(int a = 1; a<=angka1; a +=2){
      hasil += a;
    
    if( a < angka1 - 1){
      System.out.print(a+" + ");
        if(split == 5){
          System.out.println("");
          split = 0;
        }
        split++;
    }else{
      System.out.print(a+" = ");
    }
  }
    System.out.println(hasil);
  }
}
