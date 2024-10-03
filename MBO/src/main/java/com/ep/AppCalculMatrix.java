package com.ep;

import java.util.Random;

public class AppCalculMatrix
{
	
	final static int rows = 3;
	final static int columns = 3;
	final static int maxNumber = 10;

	public static void main(String[] args) 
	{
		int [][] matrixA = generateRandomMatrix(rows, columns);
		int [][] matrixB = generateRandomMatrix(rows, columns);
		
		int[][] sumResult = sumMatrix(matrixA, matrixB);
		
		System.out.println("Matrix A : ");
		showMatrix(matrixA);
		
		System.out.println("Matrix B : ");
		showMatrix(matrixB);
		
		System.out.println("Matrix A + Matrix B : ");
		showMatrix(sumResult);
		

	}
	
	public static int[][] generateRandomMatrix(int rows, int columns)
	{
		Random random = new Random();
		
		int [][] matrix = new int [rows][columns];
		
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < columns; j++)
			{
				matrix [i][j] = random.nextInt(maxNumber);
			}
		}
		return matrix;
	}
	
	public static int[][] sumMatrix(int[][] matrixA, int[][] matrixB) {
        
		int lignes = matrixA.length;
        int colonnes = matrixA[0].length;
        int[][] result = new int[lignes][colonnes];

        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }
	
	public static void showMatrix(int[][] matrix) 
	{
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}
