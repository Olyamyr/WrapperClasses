//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1: Определение типов данных \n" +
                "Для каждого из приведенных ниже выражений определите, к какому типу данных оно относится " +
                "(примитивному или ссылочному):\n" +
                "int x = 10 (int — это примитивный тип данных)\n" +
                "String str = \"Hello\" (String — это ссылочный тип данных, так как он является классом в Java)\n" +
                "boolean isTrue = true (boolean — это примитивный тип данных)\n" +
                "double d = 3.14 (boolean — это примитивный тип данных)\n" +
                "Integer i = new Integer(20) (Integer — это ссылочный тип данных, так как это оболочка для int)\n" +
                "ArrayList<Integer> list = new ArrayList<>() (ArrayList<Integer> — это ссылочный тип данных, " +
                "так как это класс коллекций)\n" +
                "char c = 'a' (char — это примитивный тип данных)\n" +
                "float f = 2.718f (float — это примитивный тип данных)\n");

        System.out.println("Задание 2: Преобразования типов" +
                "\nНапишите код, который выполняет следующие преобразования:");

        System.out.println("1. Преобразуйте целое число int в строку String.");
        int referenceInt = 10;
        String numberToString = String.valueOf(referenceInt);
        System.out.println("Int в String: " + numberToString);

        System.out.println("2. Преобразуйте строку String, содержащую числовое значение, в целочисленный тип int.");
        String string = "10";
        int stringToIntConverted = Integer.parseInt(string);
        System.out.println("String в Int: " + stringToIntConverted);

        System.out.println("3. Преобразуйте вещественное число double в целое число int с потерей дробной части.");
        double doubleToInt = (double)5.5F;
        int doubleToIntConverted = (int)doubleToInt;
        System.out.println("Double: " + doubleToInt);
        System.out.println("Double в Int: " + doubleToIntConverted);
        Double d = (double)5.5F;
        int i = d.intValue();
        System.out.println("Double: " + d);
        System.out.println("Double в Int: " + i);

        System.out.println("4. Преобразуйте массив целых чисел int[] в список ArrayList<Integer> " +
                "с использованием автоупаковки.");
        int[] array = new int[]{5, 5, 5, 5, 5};
        ArrayList<Integer> list = new ArrayList();
        for(int number : array) {
            list.add(number);
        }

        System.out.println("Список ArrayList<Integer>: " + String.valueOf(list));

        System.out.println("\nЗадание 3: Работа с классами-обёртками" +
                "\nСоздайте программу, которая демонстрирует работу с классами-обёртками. " +
                "Программа должна выполнять следующее:");

        System.out.println("1. Создать объект класса Integer с помощью конструктора и методом valueOf().");
        int primitiveValue = 10;
        Integer objectFromConstructor = new Integer(primitiveValue);
        System.out.println("Integer 1: " + objectFromConstructor);
        int anotherPrimitiveValue = 15;
        Integer objectFromValueOf = anotherPrimitiveValue;
        System.out.println("Integer 2: " + objectFromValueOf);

        System.out.println("2. Использовать метод equals() для сравнения двух объектов Integer.");
        if (objectFromConstructor.equals(objectFromValueOf)) {
            System.out.println("Объекты Integer равны по значению.");
        } else {
            System.out.println("Объекты Integer не равны.");
        }

        System.out.println("3. Применить метод parseInt() для преобразования строки в целое число.");
        String str = "10";
        int number = Integer.parseInt(str);
        System.out.println("String в Int: " + number);
    }
}