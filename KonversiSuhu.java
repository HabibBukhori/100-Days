package Day27;
import java.util.Scanner;
public class KonversiSuhu {
  public static void main(String[] args) {
  /* Hari ini saya akan mengerjakan tugas
  dari mentor yaitu konversi suhu */
  Scanner input = new Scanner(System.in);
  double ce, fa, ke, re;
  int a, b;
  System.out.println("=> Konversi Suhu <=");
  System.out.println("=> Jenis Suhu <=");
  System.out.println("1. Celcius ");
  System.out.println("2. Fahrenheit ");
  System.out.println("3. Kelvi ");
  System.out.println("4. Reamur ");
  System.out.println(" ");
  System.out.print("Pilihan 1 : ");
  a = input.nextInt();
  System.out.print("Pilihan 2 : ");
  b = input.nextInt();
  System.out.println("==================");
  if (a >= 1 && a <=4 && b >= 1 && b <= 4){
    if (a == 1){
      System.out.print("Celcius    : ");
      ce = input.nextDouble();
      switch(b){
        case 2 :
        fa = (ce * 9/8)+ 32;
        System.out.println("Celcius to Fahrenheit");
        System.out.println("Fahrenheit : "+fa);
        break;
        case 3 :
        ke = ce + 273.15;
        System.out.println("Celcius to Kelvin");
        System.out.println("Kelvin     : "+ke);
        break;
        case 4 :
        re = (ce * 4) /5;
        System.out.println("Celcius to Reamur");
        System.out.println("Reamur     : "+re);
        break;        
      }
    }else if(a == 2){
      System.out.print("Fahrenheit : ");
      fa = input.nextDouble();
      switch(b){
        case 1 :
        ce = (fa - 32)* 5/9;
        System.out.println("Fahrenheit to Celcius");
        System.out.println("Celcius    : "+ce);
        break;
        case 3 :
        ke = (fa + 459.67)* 5/9;
        System.out.println("Fahrenheit to Kelvin");
        System.out.println("Kelvin     : "+ke);
        break;
        case 4 :
        re = 4/9*(fa - 32);
        System.out.println("Fahrenheit to Reamur");
        System.out.println("Reamur     : "+re);
        break;        
      }
    }else if(a == 3){
      System.out.print("Kelvin     : ");
      ke = input.nextDouble();
      switch(b){
        case 1 :
        ce = ke - 273.15;
        System.out.println("Kelvin to Celcius");
        System.out.println("Celcius    : "+ce);
        break;
        case 2 :
        fa = (ke * 9/5) - 459.67;
        System.out.println("Kelvin to Fahrenheit");
        System.out.println("Fahrenheit : "+fa);
        break;
        case 4 :
        re = (ke - 273.15) * 0.8;
        System.out.println("Kelvin to Reamur");
        System.out.println("Reamur     : "+re);
        break;        
      }
    }else if(a == 4){
      System.out.print("Reamur     : ");
      re = input.nextDouble();
      switch(b){
        case 1 :
        ce = re * 1.25;
        System.out.println("Reamur to Celcius");
        System.out.println("Celcius    : "+ce);
        break;
        case 2 :
        fa = (re * 2.25) +32;
        System.out.println("Reamur to Fahrenheit");
        System.out.println("Fahrenheit : "+fa);
        break;
        case 3 :
        ke = (re / 0.8) +273.15;
        System.out.println("Reamur to Kelvin");
        System.out.println("Kelvin     : "+ke);
        break;        
      }
    }else{
      System.out.println("Masukkan Angka (1 - 4)");
    }
    System.out.println("=> Program Selesai <=");
  }
  /* jika ada kekurangan atau kesalahan pada kodingan
  saya hari ini mohon untuk dapat di koreksi. 
  Terima Kasih */
  }

}
