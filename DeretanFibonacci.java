package Day36;
import java.util.Scanner;
public class Fibonacci {

  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
  int f1 = 0;
  int f2 = 1;
  System.out.print("Jumlah Angka : ");
  int n = input.nextInt();
  
  int fn;
  System.out.println("<Deretan Fibonacci>");
  System.out.print(f1+", ");
  System.out.print(f2);
  
  for(int a = 1; a < n; a++){
     fn = f2 + f1;
     System.out.print(" , "+fn);
     f1 = f2;
     f2 = fn;
  }  
     System.out.println("");
  }

    }
