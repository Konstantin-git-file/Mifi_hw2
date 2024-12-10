package main;

public class Main {
    public static void main(String[] args) {
        //2.10 Многократный вызов
        int result = lastNumSum(5, 11);
        result = lastNumSum(result, 123);
        result = lastNumSum(result, 14);
        result = lastNumSum(result, 1);
        System.out.println(result);
    }

    // 2.1. Дробная часть
    public static double fraction(double x) {
        return x - (int) x;
    }

    // 2.2. Сумма знаков
    public static int sumLastNums(int x) {
        int y = x % 10;
        int z = (x / 10) % 10;
        return y + z;
    }

    //2.3. Букву в число
    public static int charToNum(char x) {
        return x - '0';
    }

    //2.4. Есть ли позитив
    public static boolean isPositive(int x) {
        return x > 0;
    }

    //2.5. Двузначное
    public static boolean is2Digits(int x) {
        return x >= 10 && x <= 99 || x <= -10 && x >= -99;
    }

    //2.6 Большая буква
    public static boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    //2.7 Диапазон
    public static boolean isInRange(int a, int b, int num) {
        int lower = (a < b) ? a : b;
        int upper = (a > b) ? a : b;
        return num >= lower && num <= upper;
    }

    // 2.8 Делитель
    public static boolean isDivisor(int a, int b) {
        return (a != 0 && b % a == 0) || (b != 0 && a % b == 0);
    }

    //2.9 Равенство
    public static boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    //2.10 Многократный вызов
    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }

    //3.1 Модуль числа.
    public static int abs(int x) {
        if (x >= 0) {
            return x;
        } else {
            return -x;
        }
    }

    //3.2 Безопасное деление.
    public static int safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return x / y;
    }

    //3.3 Максимум
    public static int max(int x, int y) {
        return (x > y) ? x : y;
    }

    //3.4 Строка сравнения
    public static String makeDecision(int x, int y) {
        if (x > y) {
            return x + " > " + y;
        } else if (x < y) {
            return x + " < " + y;
        } else {
            return x + " == " + y;
        }
    }

    //3.5 Тройной максимум.
    public static int max3(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }

    //3.6 Тройная сумма.
    public static boolean sum3(int x, int y, int z) {
        if (x + y == z) {
            return true;
        }
        if (x + z == y) {
            return true;
        }
        if (y + z == x) {
            return true;
        }
        return false;
    }

    // 3.7 Двойная сумма.
    public static int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }

    // 3.8 Тридцать пять.
    public static boolean is35(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return false;
        }
        return (x % 3 == 0 || x % 5 == 0);
    }

    //3.9 Волшебная шестерка.
    public static boolean magic6(int x, int y) {
        if (x == 6 || y == 6) {
            return true;
        }
        if (x + y == 6) {
            return true;
        } else if (x - y == 6 || y - x == 6) {
            return true;
        }
        return false;
    }

    //3.10 Возраст.
    public static String age(int x) {
        if (x % 100 >= 11 && x % 100 <= 14) {
            return x + " лет";
        }
        if (x % 10 == 1) {
            return x + " год";
        }
        if (x % 10 >= 2 && x % 10 <= 4) {
            return x + " года";
        }
        return x + " лет";
    }

    //3.11 День недели
    public static String day(int x) {
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }

    //3.12 Вывод дней недели
    public static void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

    // 4.1 Числа подряд
    public static String listNums(int x) {
        String result = "";
        for (int i = 0; i <= x; i++) {
            result += i;
            if (i < x) {
                result += " ";
            }
        }
        return result;
    }

    //4.2 Числа наоборот
    public static String reverseListNums(int x) {
        String result = "";
        for (int i = x; i >= 0; i--) {
            result += i;
            if (i > 0) {
                result += " ";
            }
        }
        return result;
    }

    //4.3 Четные числа
    public static String chet(int x) {
        String result = "";
        for (int i = 0; i <= x; i += 2) {
            result += i;
            if (i + 2 <= x) {
                result += " ";
            }
        }
        return result;
    }

    //4.4 Степень числа
    public static int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }


    // 4.5 Длина числа
    public static int numLen(long x) {
        int count = 0; //
        if (x < 0) {
            x = -x; //
        }
        if (x == 0) {
            return 1;
        }
        while (x > 0) {
            x /= 10;
            count++;
        }
        return count;
    }

    // 4.6 Одинаковость.
    public static boolean equalNum(int x) {
        if (x < 0) {
            x = -x;
        }
        int lastDigit = x % 10;
        while (x > 0) {
            int currentDigit = x % 10;
            if (currentDigit != lastDigit) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    //4.7 Квадрат
    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 4.8 Левый треугольник
    public static void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 4.9 Правый треугольник
    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //4.10 Угадайка
    public static void guessGame() {
        int randomNum = 3;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int attempts = 0;
        int x;
        System.out.println("What number am I thinking (0 to 9)? :");
        do {
            x = sc.nextInt();
            attempts++;
            if (x != randomNum) {
                System.out.println("No, try again");
            } else {
                System.out.println("Yes, it`s " + randomNum);
            }
        } while (x != randomNum);
        System.out.println("It took you " + attempts + " attempts to guess the number.");
    }
}

