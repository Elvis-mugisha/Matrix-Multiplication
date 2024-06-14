import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("enter number of rows of matrix 1");
      int row1 =scanner.nextInt();

      System.out.println("enter the number of columns of matrix 1");
      int col1= scanner.nextInt();

      int [][] matrix1= new int[row1][col1];

      System.out.println("enter number of rows of matrix 2");
      int row2 =scanner.nextInt();

      System.out.println("enter number of columns of matrix 2");
      int col2 =scanner.nextInt();
      
      if (col1 != row2) {
        System.out.println("Matrix multiplication is not possible with these dimensions.");
        scanner.close();
        return;
    }

      System.out.println("enter the elements of matrix 1");
      int [][] matrix2 = new int[row2][col2];
      int [][] matrix3 = new int[row1][col2];

       for(int i=0;i<row1;i++){
        for(int j=0;j<col1;j++){
          matrix1[i][j]=scanner.nextInt();
        }
       }

       System.out.println("enter the elements of matrix 2");
       for(int i=0;i<row2;i++){
        for(int j=0;j<col2;j++){
          matrix2[i][j]=scanner.nextInt();
        }
       }
       for(int i=0;i<row1;i++){
        for(int j=0;j<col2;j++){
          for (int k=0;k<col1;k++){
             matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
          }
        }
       }
       System.out.println("the product of 2 matrix:");
       for(int i=0;i<row1;i++){
        System.out.print("|");
        for(int j=0;j<col2;j++){
          System.out.print(" "+matrix3[i][j] + " ");
        }
        System.out.println("|");
       }
      
    }
    }




