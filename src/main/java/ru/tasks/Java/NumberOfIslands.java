package ru.tasks.Java;


public class NumberOfIslands {

    static char[][] arr1 = {
                    {'1','1','1','1','0'},
                    {'1','1','0','1','0'},
                    {'1','1','0','0','0'},
                    {'0','0','0','0','0'}
    };
    static char[][] arr2 = {
                    {'1','1','0','1','0','0'},
                    {'0','0','0','1','0','0'},
                    {'1','1','0','0','1','1'},
                    {'0','0','1','0','1','1'}
    };

    public static void main(String[] args) {
        System.out.println(numIslands(arr1));
        System.out.println(numIslands(arr2));
    }
    public static int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    mark(grid, i, j);
                }
            }
        }
        return count;
    }

    private static void mark(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0')
            return;

        grid[i][j] = '0';
        mark(grid, i + 1, j);
        mark(grid, i - 1, j);
        mark(grid, i, j + 1);
        mark(grid, i, j - 1);
    }
}
