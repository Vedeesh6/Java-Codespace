public class IB_bishop {
    public int solve(int row, int column) {
        // Count top left squares
        int topLeft = Math.min(row, column) - 1;
 
        // Count bottom right squares
        int bottomRight = 8 - Math.max(row, column);
 
        // Count top right squares
        int topRight = Math.min(row, 9 - column) - 1;
 
        // Count bottom left squares
        int bottomLeft = 8 - Math.max(row, 9 - column);
 
        // Return total count
        return (topLeft + topRight + bottomRight + bottomLeft);
    }
}
