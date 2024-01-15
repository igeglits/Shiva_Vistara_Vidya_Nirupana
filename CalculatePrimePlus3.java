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
        int stack_of_numbers = processInput(num1, num2, num3, num4, num5, num6, num7, num8, num9);

        // Вызов метода addThreeAndReturn для добавления 3 к сумме единичных чисел
        System.out.print("Первое число = ");
        System.out.println(stack_of_numbers);
        int finalResult = addThreeAndReturn(stack_of_numbers);

        // Вывод результата
        System.out.println("Второе число = " + finalResult);
    }

    // Метод для обработки входных чисел и получения суммы единичных чисел
    public static int processInput(int... numbers) {
        int result_1 = 0;

        // Обработка каждого числа
        for (int num : numbers) {
            // Разбиение числа на цифры и нахождение суммы цифр
            char[] digits = String.valueOf(num).toCharArray();
            for (char digit : digits) {
                result_1 += Character.getNumericValue(digit);
            }
        }

        // Повторение процедуры, пока сумма не станет однозначным числом
        while (result_1 > 81) {
            result_1 = getDigitSum(result_1);
        }

        // Возвращение суммы единичных чисел
        return result_1;
    }

    // Метод для добавления 3 к числу и возвращения результата
    public static int addThreeAndReturn(int num) {
        return num + 3;
    }

    // Метод для получения суммы цифр числа. Отрезает каждое поледнюю цифру числа и скидывает его в сумму,
    // единичное число сбрасывает без отрезания.
    private static int getDigitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
/*
        Пошаговое объяснение:
        Инициализация переменной sum: Создается переменная sum и инициализируется значением 0.
        В этой переменной будет храниться сумма цифр числа.
        Цикл while (num != 0): Цикл будет выполняться, пока число num не станет равным 0.
        sum += num % 10: Операция num % 10 возвращает последнюю цифру числа num (остаток от деления на 10),
        и эта цифра добавляется к текущей сумме sum.
                num /= 10: Операция num /= 10 удаляет последнюю цифру числа num,
                таким образом, мы переходим к следующей цифре в числе.
        Повторение цикла: Цикл повторяется снова, и шаги 3-4 выполняются для следующей цифры в числе.
        Этот процесс продолжается до тех пор, пока все цифры числа не будут обработаны
        (пока num не станет равным 0).
        Возвращение суммы: После завершения цикла в переменной sum будет содержаться сумма всех цифр числа,
        и это значение возвращается из метода.
*/
    }
}
