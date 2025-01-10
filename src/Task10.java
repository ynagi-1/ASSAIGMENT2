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

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print("[]");
            }
            System.out.println();
        }
    }
}
