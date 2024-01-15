public class CalculatorPrime {

        public static void main(String[] args) {
            // Заданные 9 разных чисел
            int num1 = 123;
            int num2 = 67890;
            int num3 = 0;
            int num4 = 98765;
            int num5 = 54321;
            int num6 = 24680;
            int num7 = 13579;
            int num8 = 99999;
            int num9 = 88888;

            // Вызов метода processInput с заданными числами
            int result = processInput(num1, num2, num3, num4, num5, num6, num7, num8, num9);

            // Вывод результата
            System.out.println("Результат: " + result);
        }

        // Метод для обработки входных чисел
        public static int processInput(int... numbers) {
            int sum = 0;

            // Обработка каждого числа
            for (int num : numbers) {
                // Разбиение числа на цифры и нахождение суммы простых цифр
                char[] digits = String.valueOf(num).toCharArray();
                for (char digit : digits) {
                    int singleDigit = Character.getNumericValue(digit);
                    if (isPrime(singleDigit)) {
                        sum += singleDigit;
                    }
                }
            }

            // Повторение процедуры, пока не получится единичное целое число
            while (sum >= 10) {
                sum = getDigitSum(sum);
            }

            // Возвращение результата
            return sum;
        }

        // Метод для проверки, является ли число простым
        private static boolean isPrime(int num) {
            if (num < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
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
