import java.util.*;
import java.lang.*;
import java.io.*;

class CC_Gift_Rift
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        
        int[][] matrix = new int[R][C];
        int[] minInRow = new int[R];
        int[] maxInCol = new int[C];
        
        // Reading the matrix and initializing min/max arrays
        for (int i = 0; i < R; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.nextInt();
                min = Math.min(min, matrix[i][j]);
            }
            minInRow[i] = min;
        }
        
        for (int j = 0; j < C; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < R; i++) {
                max = Math.max(max, matrix[i][j]);
            }
            maxInCol[j] = max;
        }
        
        // Checking each cell
        boolean found = false;
        outerLoop: 
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (matrix[i][j] == minInRow[i] && matrix[i][j] == maxInCol[j]) {
                    System.out.println(matrix[i][j]);
                    found = true;
                    break outerLoop;
                }
            }
        }
        
        if (!found) {
            System.out.println("GUESS");
        }
        
        sc.close();
	}
}
