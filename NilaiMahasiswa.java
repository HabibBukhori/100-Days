package Day21;
import java.util.Scanner;
public class Nilai {
  public static void main(String[] args) {
  /* Hari ke 21 ini saya membuat program 
  data nilai mahasiswa */
  Scanner input = new Scanner(System.in);
  String nama, nim, matkul;
  double absen, tugas, UAS, rata2;
  System.out.println("=Mahasiswa=");
  System.out.println(" ");
  
  System.out.print("Nama   : ");
  nama = input.nextLine();
  
  System.out.print("Nim    : ");
  nim = input.nextLine();
  
  System.out.print("Matkul : ");
  matkul = input.nextLine();
  System.out.println(" ");
  
  System.out.println("=Nilai Mahasiswa=");
  System.out.println(" ");
  
  System.out.print("Nilai Presensi : ");
  absen = input.nextDouble();
  
  System.out.print("Nilai Tugas    : ");
  tugas = input.nextDouble();
  
  System.out.print("Nilai UAS      : ");
  UAS = input.nextDouble();
  
  rata2 = 0.3*absen+0.3*tugas+0.4*UAS;
  System.out.println("Nilai Rata-rata : "+rata2);
  
  /* mohon untuk dapat di koreksi jika ada
  kesalahan pada kodingan saya hari ini.
  TERIMA KASIH ;) */

  }
                   }
