package Belajar;

import java.util.Scanner;

public class belajar2 {

  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Masukkan Angka : ");
  int a = input.nextInt();
  int hasil = a % 2;
  if(hasil == 0){
    System.out.println("genap");
  }else{
    System.out.println("ganjil");
  }

  }

}
