package Day31;
import java.util.Scanner;
public class WhileLoop {
  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  
  int angka1, angka2;
  System.out.println("=> Angka Besar Ke Kecil <=");
  
  System.out.println("");
  
  System.out.print("Angka Awal  : ");
  angka1 = input.nextInt();
  
  System.out.print("Angka Akhir : ");
  angka2 = input.nextInt();
  
  System.out.println("");
  
  if (angka1 < angka2){
    System.out.println("Inputan Angka Salah");
    
  }else{
    int a = angka1;
      while (a >= angka2){
        System.out.print(a+" ");
        a--;
  }
   System.out.println("");
   System.out.println("");
   System.out.println("=> Program Selesai <=");
  }

  }

  }
