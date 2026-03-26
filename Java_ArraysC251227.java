
package java_arrays.c251227;

public class Java_ArraysC251227 {

    public static void main(String[] args) {
      int[][] Num = { {1,2,3}, {4,5,6}};
    System.out.println("Number of Rows: " +Num.length);             
    System.out.println("Column in row 0: " +Num[0].length); 
    System.out.println("Column in row 1: " +Num[1].length);
  
    for (int row = 0; row < Num.length; row++) {
    for (int col = 0; col < Num[row].length; col++) {
    System.out.println("The Numbers [" + row + "][" + col + "] = " + Num[row][col]);
      }
    }
    }
    
}
