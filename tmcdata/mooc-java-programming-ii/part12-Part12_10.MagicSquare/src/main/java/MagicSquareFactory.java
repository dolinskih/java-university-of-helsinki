
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int x = size / 2;
        int y = 0;
        int totalNumbers = size * size;

        for (int i = 1; i <= totalNumbers; i++) {
            square.placeValue(x, y, i);

            int nextX = x + 1;
            int nextY = y - 1;

            if (nextX >= size) {
                nextX = 0;
            }

            if (nextY < 0) {
                nextY = size - 1;
            }

            if (square.readValue(nextX, nextY) != 0) {
                nextX = x;
                nextY = y + 1;
            }

            x = nextX;
            y = nextY;
        }
        
        return square;
    }

}
