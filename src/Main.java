public class Main {
    public static void main(String[] args) {
        double[] numbers = {8.0, 2.0, -4.1, 2.0, 3.0, 6.0, -7.0, 1.1, -2.2, 3.3, -4.4, 5.5, -6.6, 7.7, -8.8};

        boolean firstNegativeFound = false;
        double sum = 0;
        int count = 0;

        for (double num : numbers) {
            if (firstNegativeFound && num > 0) {
                sum += num;
                count++;
            } else if (num < 0 && !firstNegativeFound) {
                firstNegativeFound = true;
            }
        }

        double average = count > 0 ? sum / count : 0;

        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного числа: " + average);
    }
}
