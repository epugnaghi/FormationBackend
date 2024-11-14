package com.ep;

import java.util.Random;
import java.util.Scanner;

public class AppCube
{

    public static void main(String[] args)
    {
        int[][][] newTab = createTab();

        //fillTab(newTab);

        fillTabWithRandomValues(newTab);

        displayTab(newTab);

    }

    public static int[][][] createTab()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez le nombre de lignes (X)");
        int x = sc.nextInt();

        System.out.println("Entrez le nombre de colonnes (Y)");
        int y = sc.nextInt();

        System.out.println("Entrez le nombre de couches (Z)");
        int z = sc.nextInt();

        int[][][] tab = new int[x][y][z];

        return tab;
    }

    public static void fillTab(int[][][] table)
    {

        Scanner sc = new Scanner(System.in);

        int rows = table.length;
        int columns = table[0].length;
        int deep = table[0][0].length;

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                for (int k = 0; k < deep; k++)
                {
                    System.out.println("Entrez la valeur pour [" + i + "][" + j + "][" + k + "] :");

                    table[i][j][k] = sc.nextInt();
                }
            }
        }
    }

    public static void fillTabWithRandomValues(int[][][] table)
    {
        Random rand = new Random();

        int rows = table.length;
        int columns = table[0].length;
        int deep = table[0][0].length;

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                for (int k = 0; k < deep; k++)
                {
                    table[i][j][k] = rand.nextInt(26);
                }
            }
        }
    }

    public static void displayTab(int[][][] table)
    {
        int rows = table.length;
        int columns = table[0].length;
        int deep = table[0][0].length;

        for (int i = 0; i < rows; i++)
        {
            System.out.println("Ligne " + i + " :");
            for (int j = 0; j < columns; j++)
            {
                System.out.print("Colonne " + j + " : ");
                for (int k = 0; k < deep; k++)
                {
                    System.out.print(table[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }


}
