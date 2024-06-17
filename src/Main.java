import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введіть число: ");
            int number = scanner.nextInt();

            System.out.print("Введіть відсоток: ");
            int percentage = scanner.nextInt();

            task2(number, percentage);
            scanner.nextLine();

            System.out.print("Введіть 3 числа через пробіли:");
            String numbersLine = scanner.nextLine();
            task3(numbersLine);

            do {
                System.out.print("Введіть шестизначне число:");
                number = scanner.nextInt();
                if (number < 100000 || number > 999999) {
                    System.out.println("Це не шестизначне число!");
                }
            } while (number < 100000 || number > 999999);

            task4(number);

            do {
                System.out.print("Введіть номер місяця:");
                number = scanner.nextInt();
                if (number < 1 || number > 12) {
                    System.out.println("Це не номер місяця!");
                }
            } while (number < 1 || number > 12);

            task5(number);

            System.out.print("Введіть кількість метрів: ");
            int meters = scanner.nextInt();
            List<String> units = new ArrayList<>();
            units.add("Милі");
            units.add("Дюйми");
            units.add("Ярди");
            for (int i = 0; i < units.size(); i++) {
                System.out.println((i + 1) + "-" + units.get(i));
            }
            do {
                System.out.print("Введіть в які одиниці хочете перевести: ");
                number = scanner.nextInt();
                if (number < 1 || number > 3) {
                    System.out.println("Неправильний номер!");
                }
            } while (number < 1 || number > 3);

            task6(number, meters);

            System.out.print("Введіть першу межу:");
            int firstLimit = scanner.nextInt();

            System.out.print("Введіть другу межу:");
            int secondLimit = scanner.nextInt();

            task7(firstLimit, secondLimit);

            System.out.print("\nВведіть першу межу:");
            firstLimit = scanner.nextInt();

            System.out.print("Введіть другу межу:");
            secondLimit = scanner.nextInt();

            task8(firstLimit, secondLimit);

            task910();

            System.out.print("Введіть довжину лінії:");
            int length = scanner.nextInt();

            List<String> direction = new ArrayList<>();
            direction.add("Вертикальний");
            direction.add("Горизонтальний");
            for (int i = 0; i < direction.size(); i++) {
                System.out.println((i + 1) + "-" + direction.get(i));
            }
            do {
                System.out.print("Введіть який напрямок: ");
                number = scanner.nextInt();
                if (number < 1 || number > 2) {
                    System.out.println("Неправильний номер!");
                }
            } while (number < 1 || number > 2);
            scanner.nextLine();
            System.out.print("\nВведіть символ для лінії: ");
            char symbol = scanner.nextLine().charAt(0);
            task11(length, number, symbol);
            System.out.println();
            List<String> sorting = new ArrayList<>();
            sorting.add("За спаданням");
            sorting.add("За зростанням");
            for (int i = 0; i < sorting.size(); i++) {
                System.out.println((i + 1) + "-" + sorting.get(i));
            }
            do {
                System.out.print("Введіть за чим сортувати: ");
                number = scanner.nextInt();
                if (number < 1 || number > 2) {
                    System.out.println("Неправильний номер!");
                }
            } while (number < 1 || number > 2);
            task12(number);
        }
    }

    public static void task1() {
        System.out.println("\"Your time is limited,");
        System.out.println("\tso don’t waste it");
        System.out.println("\t\tliving someone else’s life\"");
        System.out.println("\t\t\tSteve Jobs");
    }

    public static void task2(int number, int percentage) {
        double result = (double) (number * percentage) / 100;
        System.out.println("Результат: " + result);
    }

    public static void task3(String numbersLine) {
        String[] numbers = numbersLine.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str : numbers) {
            sb.append(str);
        }
        String resultString = sb.toString();
        int resultInt = Integer.parseInt(resultString);
        System.out.println("Отримане число: " + resultInt);
    }

    public static void task4(int number) {
        int digit1 = number / 100000 % 10;
        int digit2 = number / 10000 % 10;
        int digit3 = number / 1000 % 10;
        int digit4 = number / 100 % 10;
        int digit5 = number / 10 % 10;
        int digit6 = number % 10;

        int newNumber =
                digit6 * 100000 + digit5 * 10000 + digit3 * 1000 + digit4 * 100 + digit2 * 10
                        + digit1;
        System.out.println("Введене шестизначне число зі зміненими позиціями: " + newNumber);
    }

    public static void task5(int number) {
        Map<Integer, String> seasons = new HashMap<>();

        seasons.put(1, "Зима");
        seasons.put(2, "Зима");
        seasons.put(3, "Весна");
        seasons.put(4, "Весна");
        seasons.put(5, "Весна");
        seasons.put(6, "Літо");
        seasons.put(7, "Літо");
        seasons.put(8, "Літо");
        seasons.put(9, "Осінь");
        seasons.put(10, "Осінь");
        seasons.put(11, "Осінь");
        seasons.put(12, "Зима");
        String season = seasons.get(number);
        System.out.println("Місяць " + number + " - " + season);
    }

    public static void task6(int number, int meters) {
        switch (number) {
            case 1: {
                double result = meters * 0.00062137;
                System.out.println("Кількість миль: " + result);
                break;
            }

            case 2: {
                double result = meters * 39.370;
                System.out.println("Кількість дюймів: " + result);
                break;
            }

            case 3: {
                double result = meters * 1.0936;
                System.out.println("Кількість ярдів: " + result);
                break;
            }
            default:
                break;
        }
    }

    public static void task7(int firstLimit, int secondLimit) {
        if (firstLimit > secondLimit) {
            int temp = firstLimit;
            firstLimit = secondLimit;
            secondLimit = temp;
        }
        System.out.println(
                "Непарні числа в діапазоні від " + firstLimit + " до " + secondLimit + ":");
        for (int i = firstLimit; i <= secondLimit; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void task8(int firstLimit, int secondLimit) {
        if (firstLimit > secondLimit) {
            int temp = firstLimit;
            firstLimit = secondLimit;
            secondLimit = temp;
        }
        for (int i = firstLimit; i <= secondLimit; i++) {
            System.out.println("Таблиця множення для " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    public static void task910() {
        int size = 20;

        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(201) - 100;
        }

        System.out.print("Масив: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        int min = array[0];
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        int zeroCount = 0;

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        ArrayList<Integer> positiveNumbers = new ArrayList<>();

        for (int i : array) {
            if (i < 0) {
                negativeNumbers.add(i);
            } else if (i > 0) {
                positiveNumbers.add(i);
            } else {
                zeroCount++;
            }
            if (i % 2 == 0) {
                evenNumbers.add(i);
            } else {
                oddNumbers.add(i);
            }
        }

        System.out.println("Мінімальне значення: " + min);
        System.out.println("Максимальне значення: " + max);
        System.out.println("Кількість від'ємних значень: " + negativeNumbers.size());
        System.out.println("Кількість додатніх значень: " + positiveNumbers.size());
        System.out.println("Кількість нулів: " + zeroCount);

        System.out.println("Масив від'ємних чисел:");
        System.out.println(negativeNumbers);

        System.out.println("Масив додатніх чисел:");
        System.out.println(positiveNumbers);

        System.out.println("Масив парних чисел:");
        System.out.println(evenNumbers);

        System.out.println("Масив непарних чисел:");
        System.out.println(oddNumbers);
    }

    public static void task11(int length, int number, char symbol) {
        if (number == 1) {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        } else if (number == 2) {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
        }
    }

    public static void task12(int number) {
        int size = 20;

        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(201) - 100;
        }

        System.out.print("Масив: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        if (number == 1) {
            Integer[] integerArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
            Arrays.sort(integerArray, Collections.reverseOrder());
            for (int i = 0; i < size; i++) {
                array[i] = integerArray[i];
            }
        } else if (number == 2) {
            Arrays.sort(array);
        }
        System.out.print("Відсортований масив: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

}