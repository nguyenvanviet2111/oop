// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
    private char[][] grid ;
    private int hang = grid.length;
    private int cot = grid[0].length;
    /**
     * Constructs a new CharGrid with the given grid.
     * Does not make a copy.
     * @param grid
     */
    public CharGrid(char[][] grid) {
        this.grid = grid;
    }

    /**
     * Returns the area for the given char in the grid. (see handout).
     * @param ch char to look for
     * @return area for given char
     */
    public int charArea(char ch) {
        int min1 = Integer.MAX_VALUE, max1 = 0, min2 = Integer.MAX_VALUE, max2 = 0;
        for(int i = 0; i < hang; i++){
            for(int j = 0; j < cot; j++){
                if(grid[i][j] == ch){
                    min1 = Math.min(min1, i);
                    min2 = Math.min(min2,j);
                    max1 = Math.max(max1, i);
                    max2 = Math.max(max2, j);
                }
            }
        }
        return (max1-min1+1)*(max2-min2+1);
    }

    /**
     * Returns the count of '+' figures in the grid (see handout).
     * @return number of + in grid
     */
    public int countPlus() {
        int count = 0;
        for (int i = 0; i < hang ; i++) {
            for (int j = 0; j < cot ; j++) {
                int a = i;
                int b = j;
                int dem1 = 1;
                while (i >= 1 && grid[i][j] == grid[i - 1][j]) {
                    dem1++;
                    i--;
                }
                i = a;
                j = b;
                int dem2 = 1;
                while (i < hang - 1 && grid[i][j] == grid[i + 1][j]) {
                    dem2++;
                    i++;
                }
                i = a;
                j = b;
                int dem3 = 1;
                while (j >= 1 && grid[i][j] == grid[i][j - 1]) {
                    dem3++;
                    j--;
                }
                i = a;
                j = b;
                int dem4 = 1;
                while (j < cot -1 && grid[i][j] == grid[i][j + 1]) {
                    dem4++;
                    j++;
                }
                i = a;
                j = b;
                if(dem1 == dem2 && dem2 == dem3 && dem3 == dem4) {
                    count ++;
                }

            }
        }
        return count;
    }


}