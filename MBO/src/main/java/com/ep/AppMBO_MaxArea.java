package com.ep;

import java.util.Random;

public class AppMBO_MaxArea
{
    public static int lengthTab = 7;

    public static void main(String[] args)
    {
        int[] tab = generateRandomArray(lengthTab);
        printArray(tab);

        int maxSurface = maxArea(tab);
        System.out.println("\nSurface maximale : " + maxSurface);

    }

    public static int[] generateRandomArray(int length)
    {
        Random random = new Random();
        int[] array = new int[length];

        for (int i = 0; i < length; i++)
        {
            array[i] = random.nextInt(10) + 1;
        }

        return array;
    }

    public static void printArray(int[] array)
    {
        System.out.println("Tableau : ");

        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);
            System.out.print(' ');
        }
    }

    public static int maxArea(int[] area)
    {
        int maxArea = 0;
        int currentArea = 0;
        int maxAreaJ = 0;
        int maxAreaI = 0;

        System.out.println();
        for (int i = 0; i < area.length; i++)
        {
            for (int j = i + 1; j < area.length; j++)
            {
                currentArea = (j - i) * Math.min(area[i], area[j]);

                System.out.println("area (" + i + ", " + j + ") : " + currentArea);

                if (currentArea > maxArea)
                {
                    maxArea = currentArea;

                    maxAreaI = i;
                    maxAreaJ = j;
                }
            }
        }

        System.out.print("max area (" + maxAreaI + ", " + maxAreaJ + ") : " + maxArea);

        return maxArea;
    }
}
