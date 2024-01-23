package de.neuefische;

public class Currywurst {
    public static void main(String[] args) {
        System.out.println(add(1.5, 1));
        System.out.println(makePositive(5));
        int n1 = 20;
        int n2 = 19;
        if (n1 > n2) {
            System.out.println(subtract(n1, n2));
        } else {
            System.out.println(add(n1, n2));
        }
        String testString = "Madam";
        boolean result = isPalindrome(testString);
        System.out.println("Is '" + testString + "' a palindrome? " + result);
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    public static int subtract(int number1, int number2) {
        return number1 - number2;
    }

    public static int makePositive(int number) {
        if (number < 0) {
            return number * (-1);
        } else {
            return number;
        }
    }

    public static int checkIfNumberIsEven(int num) {
        if (num % 2 == 0) {
            return num;
        } else {
            return num * 2;
        }
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.length() <= 1) {
            return true;
        }

        str = str.toLowerCase();
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        return isPalindrome(str.substring(1, str.length() - 1));
    }


}