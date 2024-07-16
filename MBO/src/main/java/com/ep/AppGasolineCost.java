package com.ep;

public class AppGasolineCost
{
    public static int[] GAS = {1, 5, 3, 3, 5, 3, 1, 3, 4, 5};
    public static int[] COST = {5, 2, 2, 8, 2, 4, 2, 5, 1, 2};
    public static int size = GAS.length;


    public static void main(String[] args)
    {
        int startIndex = findStartIndex();

    }

    public static int findStartIndex()
    {
//        GASO = {1, 5, 3, 3, 5, 3, 1, 3, 4, 5};
//        COST = {5, 2, 2, 8, 2, 4, 2, 5, 1, 2};

        int remainGas = 0;
        int currentStation = 0;

        for (int startStation = 0; startStation < size; startStation++)
        {
            remainGas = 0;

            for (int countStation = 0; countStation < size; countStation++)
            {
                currentStation = (startStation + countStation) % size;

                remainGas = remainGas + GAS[currentStation] - COST[currentStation];

                if (remainGas < 0)
                {
                    break;
                }

                if (countStation == size - 1 && remainGas >= 0)
                {
                    System.out.println("Point de départ valide trouvé : " + startStation);
                    return startStation;
                }
            }
        }
        
        return -1;
    }

}
