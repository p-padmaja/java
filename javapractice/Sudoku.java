package javapractice;

public class Sudoku {
   static int N=9;
   static boolean Sudoku(int arr[][], int row,int col) {
     if(row==N-1&&col==N)
      return true;
     if (col==N) {
      row++;
      col=0;
    }
    if (arr[row][col]!= 0)
      return Sudoku(arr,row,col+1);
    for (int num=1;num<10;num++) {
      if (istrue(arr,row,col,num)) {
        arr[row][col]=num;
      if (Sudoku(arr,row,col+1))
        return true;
      }
    arr[row][col]=0;
    }
   return false;
   }
    static void print(int[][] arr)
  {
     for (int i=0;i<N;i++) {
       for(int j=0;j<N;j++)
       System.out.print(arr[i][j] + " ");
       System.out.println();

      }
   }
    static boolean istrue(int [][]arr, int row, int col, int num) {
      for (int x=0; x<=8; x++)
       if(arr[row][x]==num)
       return false;
     for (int x=0; x<=8; x++)
       if(arr[x][col]==num)
       return false;
       int startRow=row-row%3, startCol=col-col%3;
      for (int i=0; i<3; i++)
        for (int j=0; j<3; j++)
         if(arr[i + startRow] [j + startCol]==num)
          return false;
     return true;

    }

  public static void main(String[] args) {

     int arr[][] = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
                     {5, 2, 0, 0, 0, 0, 0, 0, 0},
                     {0, 8, 7, 0, 0, 0, 0, 3, 1},
                     {0, 0, 3, 0, 1, 0, 0, 8, 0},
                     {9, 0, 0, 8, 6, 3, 0, 0, 5},
                     {0, 5, 0, 0, 9, 0, 6, 0, 0},
                     {1, 3, 0, 0, 0, 0, 2, 5, 0},
                     {0, 0, 0, 0, 0, 0, 0, 7, 4},
                     {0, 0, 5, 2, 0, 6, 3, 0, 0} };
        if(Sudoku(arr, 0, 0)) {
         print(arr);
         System.out.println("It is a valid sudoku.");
        }
        else
          System.out.println("No Solution exists");
      }

}


