package Second_Chapter_DataTypes;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter array length");
        int arrayLength = sc.nextInt();
        String[] array = new String[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(sc.nextInt());
        }

/** Найти самое короткое и самое длинное число. Вывести найденные числа
 и их длину.(если массив int)*/

//        int shorterInt = array[0];
//        int shorterLength = (int) (Math.log10(array[0]) + 1);
//        int longerInt = shorterInt;
//        int longerLength = shorterLength;
//        for (int i = 0; i < array.length; i++) {
//            int currentLength = (int) (Math.log10(array[i]) + 1);
//            if (shorterLength > currentLength) {
//                shorterInt = array[i];
//                shorterLength = currentLength;
//            } else {
//                longerInt = array[i];
//                longerLength = currentLength;
//            }
//        }
//        System.out.println("Shorter number - " + shorterInt + ". It has length " + shorterLength);
//        System.out.println("Longer number - " + longerInt + ". It has length " + longerLength);


        /**Упорядочить и вывести числа в порядке возрастания (убывания) значений
         их длины.*/
//        System.out.println("incensing:"+ Arrays.stream(array).sorted(Comparator.comparingInt(String::length)).collect(Collectors.joining(", ")));
//        Arrays.sort(array, Comparator.reverseOrder());
//        System.out.println("descending:"+ Arrays.stream(array).sorted((a, b) -> b.length() - a.length()).collect(Collectors.joining(", ")));


        /**TODO Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.*/
//        int average = Math.


        /**Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.*/
//        for (String number : array) {
//            boolean is_number_founded = false;
//            int compareValue = Integer.parseInt(String.valueOf(number.charAt(0)));
//            for (int j = 0; j < number.length(); j++) {
//                int currentValue = Integer.parseInt(String.valueOf(number.charAt(j)));
//                if (compareValue == currentValue && j == number.length() - 1) {
//                    System.out.println(number);
//                    is_number_founded = true;
//                } else if (compareValue == currentValue) {
//                    compareValue = compareValue + 1;
//                } else {
//                    break;
//                }
//            }
//            if (is_number_founded) break;
//        }

        /** Найти число, состоящее только из различных цифр. Если таких чисел не- сколько, найти первое из них.*/

//        for (String s : array) {
//            char[] chars = s.toCharArray();
//            boolean is_number_founded = false;
//            HashSet<Character> set = new HashSet<>();
//            for (int j = 0; j < chars.length; j++) {
//                boolean is_unique = set.add(chars[j]);
//                if (!is_unique) break;
//                if (j == chars.length - 1) {
//                    System.out.println(s);
//                    is_number_founded = true;
//                }
//            }
//            if (is_number_founded) break;
//        }

        /** Среди чисел найти число-палиндром. Если таких чисел больше одного, найти второе. */
        int palindromesCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (palindromesCount < 2) {
                StringBuilder str = new StringBuilder(array[i]);
                String string = String.valueOf(str.reverse());

                if (string.equals(array[i])) {
                    palindromesCount++;
                    System.out.println(array[i]);
                }
            }
        }


    }
}
