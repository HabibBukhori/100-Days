package Day13;
import java.util.Scanner;
public class Day13 {
  public static void main(String[] args) {
  /* hari ke 13 ini saya akan menampilkan
  kembali tentang percabangan yaitu if else */
  
  Scanner impor = new Scanner(System.in);
  System.out.print("Harga Barang = ");
  double total =impor.nextDouble();
  System.out.println("Harganya = Rp."+total);
  
  if(total>=300000){
    System.out.println("Dapat diskon 15%");
    double diskon = total*0.15;
    total -= diskon;
    // jika harga barangnya lebih 300k maka
    // dia akan mendapatkan diskon 15%
    
  }else if(total>=200000){
  System.out.println("Dapat Diskon 10%");
  double diskon = total*0.1;
  total -= diskon;  
    // jika harga barangnya lebih 200k dan kurang
    // dari 300k dia akan mendapatkan diskon 10%
    
  }else if(total>=150000){
    System.out.println("Dapat Diskon 5%");
    double diskon = total*0.5;
    total -= diskon;
    /* jika harga barangnya lebih 150k dan kurang
    dari 200k dia akan mendapatkan diskon 5% dan
    jika harga barangnya kurang dari 150k dia tidak
    akan mendapatkan diskon */    
    
  }else{
    System.out.println("Tidak Dapat Diskon");
  }
  System.out.println("Totalnya = Rp."+total);
  /* Mohon maaf jika saya mengulang materi percabangan
    karena saya merasa belum cukup mengerti dengan
    materi percabangan ini, jadi saya ingin mempermantap
    lagi materi percabangan ini. jika ada kesalahan
    pada codingan hari ini mohon untuk dapat mengoreksi
    codingan saya. Terima Kasih:) */
  }
}
