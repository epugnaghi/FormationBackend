package com.ep;

public class AppUllmannCenter
{

    final static int HIGHT_LIMIT = 30;
    final static int LOW_LIMIT = 30;

    public static void main(String[] args)
    {

        int[][] startTable = initTable();
        String[][] displayTable = createDisplayTable(startTable);
        printTables(displayTable);

    }

    public static int[][] initTable()
    {

        int[][] startTable = new int[HIGHT_LIMIT][LOW_LIMIT];

        // Initialiser le tableau avec -1 pour représenter les cases non remplies
        for (int i = 0; i < HIGHT_LIMIT; i++)
        {
            for (int j = 0; j < LOW_LIMIT; j++)
            {
                startTable[i][j] = -1;
            }
        }

        // Commencer à remplir la spirale à partir du centre
        int centerX = HIGHT_LIMIT / 2;
        int centerY = LOW_LIMIT / 2;
        startTable[centerX][centerY] = 0;

        // Variables pour gérer les directions de la spirale
        int[] dx = {0, 1, 0, -1}; // Déplacements en x (droite, bas, gauche, haut)
        int[] dy = {1, 0, -1, 0}; // Déplacements en y (droite, bas, gauche, haut)

        int x = centerX;
        int y = centerY;
        int num = 1; // Valeur à placer dans le tableau
        int steps = 1; // Nombre de pas à faire dans chaque direction
        int direction = 0; // Direction actuelle

        while (num < HIGHT_LIMIT * LOW_LIMIT)
        {
            for (int i = 0; i < steps; i++)
            {
                if (num >= HIGHT_LIMIT * LOW_LIMIT)
                    break;

                x += dx[direction];
                y += dy[direction];

                // Vérifier les limites du tableau
                if (x >= 0 && x < HIGHT_LIMIT && y >= 0 && y < LOW_LIMIT)
                {
                    startTable[x][y] = num++;
                }
            }

            direction = (direction + 1) % 4; // Changer de direction

            // Après chaque deux directions, augmenter le nombre de pas
            if (direction % 2 == 0)
            {
                steps++;
            }
        }

        // Afficher le tableau rempli avec alignement
        for (int i = 0; i < HIGHT_LIMIT; i++)
        {
            for (int j = 0; j < LOW_LIMIT; j++)
            {
                if (startTable[i][j] == -1)
                {
                    System.out.printf("%3s ", "."); // Afficher un tiret pour les cases vides
                }
                else
                {
                    System.out.printf("%3d ", startTable[i][j]); // Afficher les nombres avec un format aligné
                }
            }
            System.out.println();
        }
        return startTable;
    }

    public static String[][] createDisplayTable(int[][] numbers)
    {

        String[][] displayTable = new String[HIGHT_LIMIT][LOW_LIMIT];

        for (int i = 0; i < HIGHT_LIMIT; i++)
        {
            for (int j = 0; j < LOW_LIMIT; j++)
            {
                if (isPrime(numbers[i][j]))
                {
                    displayTable[i][j] = " "; // Nombre premier = espace
                }
                else
                {
                    displayTable[i][j] = "."; // Autres nombres = tiret
                }
            }
        }

        return displayTable;
    }

    public static void printTables(String[][] display)
    {

        System.out.println("\nTableau d'Affichage:");
        for (int i = 0; i < HIGHT_LIMIT; i++)
        {
            for (int j = 0; j < LOW_LIMIT; j++)
            {
                System.out.printf("%1s ", display[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int num)
    {

        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void initTableOld()
    {
        int[][] startTable = new int[HIGHT_LIMIT][LOW_LIMIT];

        for (int i = 0; i < HIGHT_LIMIT; i++)
        {
            for (int j = 0; j < LOW_LIMIT; j++)
            {
                if (i == HIGHT_LIMIT / 2 && j == LOW_LIMIT / 2)
                {
                    startTable[i][j] = 0;

                }
                else
                {
                    startTable[i][j] = 1;
                }
                System.out.print(startTable[i][j] + " ");
            }
            System.out.println();
        }
    }

}
