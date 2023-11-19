package Belajar;

import java.util.Scanner;

public class yahh {

  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int a, b, c, d;
  System.out.print("Masukkan Angka  : ");
  a = input.nextInt();
  System.out.print("Masukkan Angka2 : ");
  b = input.nextInt();
  c = a + b;
  d = a - b;
  
  String e = c >= 0? "positif":"negatif";
  System.out.println("angka c adalah bilangan "+e);
  String f = d <= 0? "positif":"negatif";
  System.out.println("angka d adalah bilangan "+f);

  }

}
