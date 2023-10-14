package Day6;

public class DaySix {

  public static void main(String[] args) {
   
   // hari ke 6 ini saya akan menampilkan
   // konversi tipe data integer ke tipe long
   // dan tipe data long ke byte
   // tipe data yang ingin dikonversi(int)
   System.out.println("Tipe data yang ingin dikonversi");
   int nilaiInt = 500;
   System.out.println("nilai int = "+nilaiInt);
   System.out.println("----------------");
   
   // konversi tipe data yang lebih besar(long)
   System.out.println("Konversi Integer ke Long");
   long nilaiLong = nilaiInt;
   System.out.println("nilai Long = "+nilaiInt);
   System.out.println("----------------");
   
   // konversi tipe data yang lebih kecil(byte)
   System.out.println("Konversi Long ke Byte");
   byte nilaiByte = (byte) nilaiLong; 
   // kita casting agar tidak eror
   System.out.println("Nilai Byte = "+nilaiByte);
   
   // itulah tadi hasil dari pelajaran 
   // saya untuk hari ke 6 ini
   // mohon maaf jika ada kesalahan dari saya
   // terima kasih
  }
}
