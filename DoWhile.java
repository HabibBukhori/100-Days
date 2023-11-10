package Day33;
import java.util.Scanner;
public class DoWhile {

  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  
  int al, ar,;
  System.out.println("=> Output Angka <=");
  
  System.out.println("");
  
  System.out.print("Angka Awal  : ");
  al = input.nextInt();
  
  System.out.print("Angka Akhir : ");
  ar = input.nextInt();
  
  System.out.println("");
      
  int a = al;
  
  do{
    System.out.print(a+" ");
    a++;
  }while(a<=ar);
  System.out.println("");

  }

  }
