public class Task9 {
    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        // Заполняем массив согласно условию задачи
        for (int i = 0; i < 10; i++) {
            result[i] = new int[i + 1]; // Создаем массивы переменной длины
            for (int j = 0; j <= i; j++) {
                result[i][j] = i + j; // Каждый элемент - сумма индексов
            }
        }

        // Выводим массив
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " "); // Печатаем элементы строки
            }
            System.out.println(); // Переход на новую строку после вывода каждого ряда
        }
    }
}
