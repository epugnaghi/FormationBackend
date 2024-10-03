package com.ep;

public class AppMultiplicationMatrix
{
//    final static int[][] MATRIX_A = {{1, 2, 3}, {4, 5, 6}, {1, 2, 3}};
//    final static int[][] MATRIX_B = {{7, 8}, {9, -1}, {-2, -3}};

    final static int[][] MATRIX_A = {{1, 2, 0}, {4, 3, -1}};
    final static int[][] MATRIX_B = {{5, 1}, {2, 3}, {3, 4}};

    public static void main(String[] args)
    {
        isPossible(MATRIX_A, MATRIX_B);
        isPossible(MATRIX_B, MATRIX_A);

        int[][] newResult = multiplicationMatrix(MATRIX_A, MATRIX_B);
        showNewMatrix(newResult);

        int[][] newResult2 = multiplicationMatrix(MATRIX_B, MATRIX_A);
        showNewMatrix(newResult2);
    }

    public static boolean isPossible(int[][] matriceA, int[][] matriceB)
    {
        if (matriceA[0].length != matriceB.length)
        {
            System.out.println("Calcul impossible");
            return false;
        }
        else
        {
            System.out.println("Calcul possible");
            return true;
        }
    }

    public static int[][] multiplicationMatrix(int[][] matriceA, int[][] matriceB)
    {
        int[][] result = new int[matriceA.length][matriceB[0].length];

        for (int i = 0; i < matriceA.length; i++)
        {
            for (int j = 0; j < matriceB[0].length; j++)
            {
                for (int k = 0; k < matriceA[0].length; k++)
                {
                    result[i][j] += matriceA[i][k] * matriceB[k][j];
                }
            }
        }
        return result;
    }

    public static void showNewMatrix(int[][] newMatrix)
    {
        for (int i = 0; i < newMatrix.length; i++)
        {
            for (int j = 0; j < newMatrix[0].length; j++)
            {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
