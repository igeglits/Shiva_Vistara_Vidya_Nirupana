public class CalculatePrimePlus3 {

    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 9;
        int num3 = 9;
        int num4 = 9;
        int num5 = 9;
        int num6 = 9;
        int num7 = 9;
        int num8 = 9;
        int num9 = 9;

        // Вызов метода processInput для получения суммы единичных чисел
        int sumOfSingleDigits = processInput(num1, num2, num3, num4, num5, num6, num7, num8, num9);

        // Вызов метода addThreeAndReturn для добавления 3 к сумме единичных чисел
        System.out.print("Первое число = ");
        System.out.println(sumOfSingleDigits);
        int finalResult = addThreeAndReturn(sumOfSingleDigits);

        // Вывод результата
        System.out.println("Второе число = " + finalResult);
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
        while (sum > 81) {
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
