package Day14;
public class TernaryOperator {
  public static void main(String[] args) {
  
  /* hari ke 14 ini saya akan menampilkan
  Ternary Operator atau operator kondisi.
  formatnya->(type data) variabel = kondisi?"Terpenuhi":"Tidak Terpenuhi";
  jika kondisinya terpenuhi, dia akan menampilkan terpenuhi,
  dan jika kondisinya tidak terpenuhi, dia akan menampilkan tidak terpenuhi.
  titik 2 sebagai pembatas */
  
  int a, b, c, d;
  a = 15;
  b = 18;
  c = 20;
  d = 12;
  int x = a - b;
  int y = c - d;
  String hasil = x >= 0?"positif":"negatif";
  System.out.println("15 - 18 = "+x);
  System.out.println(hasil);
  // yang akan tampil di variabel hasil adalah
  // negatif. karena 15-18=-3
  System.out.println("================");
  
  String hasil2 = y >= 0?"positif":"negatif";
  System.out.println("20 - 12 = "+y);
  System.out.println(hasil2);
  // yang akan tampil di variabel hasil2 adalah
  // positif. karena 20-12= 8
  
  /* jadi itulah tadi hasil latihan saya
  pada hari ini, mohon dikoreksi jika ada yang
  salah pada codingan saya hari ini.
  TERIMA KASIH :) */
  }
  }
