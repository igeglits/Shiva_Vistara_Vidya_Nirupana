public class CalculatePriePlus3 {

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 67890;
        int num3 = 11111;
        int num4 = 98765;
        int num5 = 54321;
        int num6 = 24680;
        int num7 = 13579;
        int num8 = 99999;
        int num9 = 88888;

        // Вызов метода processInput для получения суммы единичных чисел
        int sumOfSingleDigits = processInput(num1, num2, num3, num4, num5, num6, num7, num8, num9);

        // Вызов метода addThreeAndReturn для добавления 3 к сумме единичных чисел
        int finalResult = addThreeAndReturn(sumOfSingleDigits);

        // Вывод результата
        System.out.println("Результат: " + finalResult);
    }

    // Метод для обработки входных чисел и получения суммы единичных чисел
    public static int processInput(int... numbers) {
        int sum = 0;

        // Обработка каждого числа
        for (int num : numbers) {
            // Разбиение числа на цифры и нахождение суммы цифр
            char[] digits = String.valueOf(num).toCharArray();
            for (char digit : digits) {
                sum += Character.getNumericValue(digit);
            }
        }

        // Повторение процедуры, пока сумма не станет однозначным числом
        while (sum >= 10) {
            sum = getDigitSum(sum);
        }

        // Возвращение суммы единичных чисел
        return sum;
    }

    // Метод для добавления 3 к числу и возвращения результата
    public static int addThreeAndReturn(int num) {
        return num + 3;
    }

    // Метод для получения суммы цифр числа
    private static int getDigitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
