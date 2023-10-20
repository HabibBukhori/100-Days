package Day12;
public class Day12 {
  public static void main(String[] args) {
  
  // hari ini saya akan menampilkan 
  // operator logika yaitu
  // AND(&&), OR(||), NOT(!)
  
  /* AND(&&), apabila salah satunya bernilai false maka hasilnya akan fales
  dan dia akan bernilai true jika kedua variabelnya bernilai true*/
  System.out.println("=====AND(&&)=====");
  boolean a = true;
  boolean b = false;
  boolean c = a&&b;
  System.out.println(a+" && "+b+" = "+c);
  // hasilnya adalah false karna salah satu dari mereka bernilai false
  boolean a2 = true;
  boolean b2 = true;
  boolean c2 = a2&&b2;
  System.out.println(a2+" && "+b2+" = "+c2);
  // hasilnya adalah true karna kedua variabelnya bernilai true
  
  /* OR(||), apabila salah satunya bernilai true maka hasilnya akan true 
  dan dia akan bernilai false jika kedua variabelnya bernilai false. 
  bisa juga dibilang kebalikan dari AND*/ 
  System.out.println("=====OR(||)=====");
  boolean a3 = false;
  boolean b3 = true;
  boolean c3 = a3||b3;
  System.out.println(a3+" || "+b3+" = "+c3);
  // hasilnya adalah true karna salah satunya bernilai true
  boolean a4 = false;
  boolean b4 = false;
  boolean c4 = a4||b4;
  System.out.println(a4+" || "+b4+" = "+c4);
  // hasilnya adalah false karna kedua veriabelnya bernilai false
  
  /* NOT(!), atau biasa kita sebut kebalikan
  jadi apa bila dia bernilai true maka
  hasilnya akan bernilai false begitupun sebaliknya */
  System.out.println("=====NOT(!)=====");
  boolean a5 = true;
  boolean b5 = !a5;
  System.out.println("NOT(!) "+a5+" = "+b5);
  boolean c5 = false;
  boolean d5 = !c5;
  System.out.println("NOT(!) "+c5+" = "+d5);
  /* mungkin cuman ini yang saya latihani hari
  ini, mohon maaf jika ada kesalahan dari saya
  dan mohon untuk mentor saya dapat mengoreksi
  codingan saya yang salah. TERIMAKASIH */
  }
  }
    
