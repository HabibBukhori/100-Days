package Day34;
import java.util.Scanner;
public class DoWhile {

  public static void main(String[] args) {
    
  String nama, alamat, loop;
  System.out.println("=> Nama dan Alamat <=");
  
  System.out.println("");
  
  do {
  Scanner input = new Scanner(System.in);
  
  System.out.print("Nama   : ");
  nama = input.nextLine();
  
  System.out.print("Alamat : ");
  alamat = input.nextLine();
  
  System.out.println("===================");
  System.out.println(nama+" tinggal di "+alamat);
  System.out.println("");
  
  System.out.print("Ulang (Y / N) : ");
  loop = input.next();
  
  }while (loop.equalsIgnoreCase("Y"));
    System.out.println("Program Selesai");  
  }
    }
