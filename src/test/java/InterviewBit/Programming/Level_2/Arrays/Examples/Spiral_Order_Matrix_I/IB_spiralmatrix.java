public class IB_spiralmatrix {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] spiralOrder(final int[][] A) {
        List<Integer> arr = new ArrayList<>();
 
        int dir = 0;
        int row = 0;
        int col = -1;
        int index  = 0;
        int start_row = 0;
        int start_col = 0;
        int end_row = A.length - 1;
        int end_col = A[0].length - 1;

        while(index < (A.length * A[0].length)) {
            if(dir == 0) {
                arr.add(A[row][++col]);
                if(col == end_col) {
                   start_row++;
                   dir++;
                }
            } else if(dir == 1) {
                 arr.add(A[++row][col]);
                 if(row == end_row) {
                    end_col--;
                    dir++;
                 }
            } else if(dir == 2) {
                 arr.add(A[row][--col]);
                 if(col == start_col) {
                     end_row--;
                     dir++;
                 }
            } else {
                 arr.add(A[--row][col]);
                 if(row == start_row) {
                     start_col++;
                     dir = 0;
                 }
            }
            index++;
        }
        int[] arr1 = arr.stream().mapToInt(i -> i).toArray();
        return arr1;
    }
}
