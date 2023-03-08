//Java Program
public class Basics {
  public static void main(String[] args) {
    // Declare and initialize a constant of type int
    final int MAX = 100;
//revisit java

    // Declare and initialize a two-dimensional array of type int
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    // Print the elements of the arrays
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    // Call a method to compute the factorial of a number
    int fact = factorial(5);
    System.out.println("5! = " + fact);

    // Call a method that returns the maximum of two numbers
    int max = max(10, 20);
    System.out.println("Max(10, 20) = " + max);
  }

  // A method to compute the factorial of a number
  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }

  // A method that returns the maximum of two numbers
  public static int max(int x, int y) {
    if (x > y) {
      return x;
    } else {
      return y;
    }
  }
}
