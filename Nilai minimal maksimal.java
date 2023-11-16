package Day39;
import java.util.Scanner;
public class AngkaBesarKecil {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int jml, angka, maks = 0, min = 100;
  System.out.print("Jumlah Angka : ");
  jml = input.nextInt();
  System.out.println(" ");
  for(int a = 1; a <= jml; a++){
    System.out.print("Angka Ke-"+a+"   : ");
    angka = input.nextInt();
    if(angka > maks){
      maks = angka;
    }
    if(angka < min){
      min = angka;
    }
  }
    System.out.println("");
    System.out.println("Nilai Min    : "+min);
    System.out.println("Nilai Maks   : "+maks);    
  }
      }

