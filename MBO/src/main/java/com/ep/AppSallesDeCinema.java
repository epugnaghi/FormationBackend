
public class SallesDeCinema {
	
	final static String[] MOVIES = {"Coco","Star Wars", "L'experience interdite","Wonder","Le crime de l'Orient Express"};
	final static int[][] ACTIVITY = {{1,2,200},{2,3,150},{3,-1,250},{4,0,100},{5,-1,150},{6,1,350},{7,-1,400},{8,4,500}};
	final static double[] MOVIES_PRICES = {9.5,13.2,10.5,10.5,12};
	final static int ERROR_CODE = -1;
	final static int MIN_ID_MOVIES = 0;
	final static int MIN_NUMBER_OF_PLACES = 0;

	public static void main(String[] args) 
	{
		showMovies(MOVIES, ACTIVITY);
		
		
	}
	
	public static void showMovies(String[] movies, int[][] activities)
	{
		int NO_THEATER = ERROR_CODE;
		
	}
	
	public static double calculationPrice(int numberOfPlace, double moviePrice)
	{
		return numberOfPlace * moviePrice;
	}
	
	public static int remainingPlaces(int numberOfPlaceRemaining, int orderPlaces, int idMovie)
	{
		if (numberOfPlaceRemaining - orderPlaces < 0)
		{
			return -1;
		}
		else if (numberOfPlaceRemaining - orderPlaces == 0)
		{
			return 0;
		}
		else
		{
			return numberOfPlaceRemaining - orderPlaces;
		}		
	}
	

}
