package Day15;
import java.util.Scanner;
public class TernaryOperator {
  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  
  /* hari ke 15 ini saya akan mencoba kembali
  menampilkan Ternary Operator atau operator kondisi.
  menggunakan scanner. 
  saya akan mencoba membuat data nilai tuntas dan tidak tuntas.  
  formatnya->(type data) variabel = kondisi?"Terpenuhi":"Tidak Terpenuhi"; */
  System.out.print("Masukkan Nilai Anda : ");
  int nilai = input.nextInt();
  int KKM = 70;
  String hasil = nilai >= KKM?"Tuntas":"Tidak Tuntas";
  System.out.println("Nilai Anda : "+nilai);
  System.out.println("Batas KKM :"+KKM);
  System.out.println("Anda Dinyatakan "+hasil);
  
  /* jadi itulah tadi hasil latihan saya
  pada hari ini, mohon dikoreksi jika ada yang
  salah pada codingan saya hari ini.
  TERIMA KASIH :) */
  }
}
