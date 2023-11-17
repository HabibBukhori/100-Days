package Day40;
public class ArrayPrimitif {
  public static void main(String[] args) {
  // Array tipe data int
  int[] arrayInt;
  
  arrayInt = new int[3];
  arrayInt[0] = 5;
  arrayInt[1] = 10;
  arrayInt[2] = 20;
  
  for(int a = 0; a < arrayInt.length; a++){
    System.out.println("Nilai Array Ke-"+ a +" = "+ arrayInt[a]);
    }System.out.println("======================");
    
  // Array tipe data double
  double[] arrayDouble;
  
  arrayDouble = new double[3];
  arrayDouble[0] = 10;
  arrayDouble[1] = 20;
  arrayDouble[2] = 35;
  
  for(int b = 0; b < arrayDouble.length; b++){
    System.out.println("Nilai Array Ke-"+ b +" = "+ arrayInt[b]);
    
  }
  }
  }
