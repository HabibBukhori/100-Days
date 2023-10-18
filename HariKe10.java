package Day10;
import java.util.Scanner;
public class Day10 {
  public static void main(String[] args) {
  // hari ini saya menampilkan percabangan
  // tentang pajak
  Scanner input = new Scanner(System.in);
  System.out.print("masukkan gaji = ");
  double gaji = input.nextDouble();
  
  System.out.println("gaji = "+ gaji);
  
  if(gaji >= 200000 && gaji < 600000){
    System.out.println("pajak = 5%");
    System.out.println(gaji-(gaji*0.05));
  }else if(gaji >= 600000){
  System.out.println("pajak = 10%");
  System.out.println(gaji-(gaji*0.1));
    }else{
    System.out.println("tidak kena pajak");
    // inilah hasil latihan saya hari ini
    // mohon maaf jika ada kesalahan dan
    // mohon dikoreksi jika ada yang kurang
    // atau salah. Terima Kasih :)
  }
  }

}
