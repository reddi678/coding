import java.util.Scanner;

class JaggedArrayDemo {
    public static void main(String args[]) {

        int[][] jaggedArray;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows for jagged array:");
        int numRows = sc.nextInt();

        jaggedArray = new int[numRows][];

        // Creating rows
        for (int i = 0; i < numRows; i++) {
            System.out.println("Enter number of columns for row " + i + ":");
            int numCol = sc.nextInt();
            jaggedArray[i] = new int[numCol];
        }

        // Reading elements
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {   // FIXED j++
                System.out.println("Enter element at [" + i + "][" + j + "]:");
                jaggedArray[i][j] = sc.nextInt();
            }
        }

        // Display jagged array
        System.out.println("\nJagged Array Output: ");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
