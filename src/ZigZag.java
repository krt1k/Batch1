import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();
        String word = sc.next();

        int rowLength = word.length() / (numRows - 1);
        if (word.length() % (numRows - 1) != 0) {
            rowLength++;
        }

        char[][] zigZag = new char[numRows][rowLength];
        int currentRow = 0;
        int currentCol = 0;
        boolean goingDown = true;

        for (int i = 0; i < word.length(); i++) {
            zigZag[currentRow][currentCol] = word.charAt(i);
            if (goingDown) {
                currentRow++;
                if (currentRow == numRows - 1) {
                    goingDown = false;
                }
            } else {
                currentRow--;
                currentCol++;
                if (currentRow == 0) {
                    goingDown = true;
                }
            }
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < rowLength; j++) {
                if (zigZag[i][j] != 0) {
                    System.out.print(zigZag[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}