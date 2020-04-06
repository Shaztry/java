package java1;

import java.util.Scanner;
/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/
class PatternRhombus{
  public static void rhombus(final int size) {
    for (int i = 1; i <= size - 1; i++) {
      for (int j = 1; j <= size - i; j++) {
        System.out.print("  ");
      }
      for (int k = 1; k <= i * 2 - 1; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= i - 1; j++) {
        System.out.print("  ");
      }
      for (int k = size * 2 - i; k >= i; k--) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void main(final String args[]) {
    final Scanner in = new Scanner(System.in);
    final int size = in.nextInt();
    rhombus(size);
    in.close();
  }
}
