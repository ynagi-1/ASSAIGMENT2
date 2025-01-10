/*
Create a two-dimensional array
*/
import java.util.Scanner;

public class Task10 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        multiArray = new int[N][];
        for (int i = 0; i < N; i++) {
            int numElements = scanner.nextInt();
            multiArray[i] = new int[numElements];
        }

        // Выводим полученный массив
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print("[]"); // Выводим квадратные скобки для каждого элемента
            }
            System.out.println(); // Переход на новую строку
        }
    }
}
