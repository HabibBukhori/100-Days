package Belajar;

import java.util.Scanner;

public class Belajar {

  public static void main(String[] args) {
  int a, t = 0;
  Scanner input = new Scanner(System.in);
  
  System.out.print("Masukkan Harga : ");
  a = input.nextInt();
  
  if(a >= 50000){
    System.out.print("Totalnya = ");
    System.out.println(a-(a*0.2));
    System.out.println("Anda Mendapatkan Diskon 20%");
    
  }else{
    System.out.println("Anda Tidak Mendapatkan Diskon");
  }
  }

      }
