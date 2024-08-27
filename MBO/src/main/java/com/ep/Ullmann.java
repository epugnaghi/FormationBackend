public class Ullmann {
	
	public static int SIZE_MAX_TABLE = 5;

	public static void main(String[] args) {
		
		generateSpiral();
	}
	
	public static void generateSpiral() {
        int size = SIZE_MAX_TABLE;
        int[][] table = new int[size][size];

        int x = 0; // Position de départ (haut-gauche)
        int y = 0;

        int direction = 0; // Direction initiale (droite)
        int[] dx = { 1, 0, -1, 0 }; // Déplacement en x
        int[] dy = { 0, 1, 0, -1 }; // Déplacement en y

        for (int i = 1; i <= size * size; i++) {
            table[y][x] = i;

            int nextX = x + dx[direction];
            int nextY = y + dy[direction];

            if (nextX >= 0 && nextX < size && nextY >= 0 && nextY < size && table[nextY][nextX] == 0) {
                x = nextX;
                y = nextY;
            } else {
                direction = (direction + 1) % 4;
                x += dx[direction];
                y += dy[direction];
            }
        }

        // Affichage de la table
        for (int[] row : table) {
            for (int value : row) {
                System.out.printf("%3d ", value);
            }
            System.out.println();
        }
    }

}
