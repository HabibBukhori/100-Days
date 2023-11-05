package Day28;
import java.util.Scanner;
public class DiskonBeras {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
  long hg, t=0;
  double d = 0;
  
  System.out.println("=====>Toko Beras<=====");
  System.out.println(" ");
  System.out.println("Harga Rp.500000/Karung");
  hg = 500000;
  System.out.print("Jumlah Karung Beras : ");
  int b = input.nextInt();
  System.out.println(" ");
  
  if(b>=150 && b<300){
    System.out.println("Anda Mendapatkan Diskon 3%");
    d = (hg * b)*0.03;
    long d1 = (long)d;
    t = (hg * b)-d1;
    System.out.println("Totalnya : "+t);
    
  }else if(b>=300){
    System.out.println("Anda Mendapatkan Diskon 7%");
    d = (hg * b)*0.07;
    long d1 = (long)d;
    t = (hg * b)-d1;
    System.out.println("Totalnya : "+t);
    
  }else{
    System.out.println("Anda Tidak Mendapatkan Diskon");
    t = hg * b;
    System.out.println("Totalnya : "+t);    
  }
  System.out.println(" ");
  System.out.println("Terima Kasih Sudah beli di Toko Kami");
  }
}
