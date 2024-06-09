package clasroom;

public class PlayWithMethods {
    public static void main(String[] args) {
        // Void method
        greeting("Irina");
        // Return method
        var x = add(10, 20);
        System.out.println(x);
        System.out.println(add(30, 40));

        //Check if number is even

        System.out.println(isEven(10));
        System.out.println(isEven(11));
        System.out.println(isEven(500));
        System.out.println(isEven(13));

        // Find Max number
        System.out.println(findMax(30, 40));
        System.out.println(findMax(20, 10));
        System.out.println(findMax(50, 100));
        System.out.println(findMax(80, 90));

    }

    public static void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int findMax(int numberOne, int numberTwo) {
        return Math.max(numberOne, numberTwo);
    }

    //Palindrome (слова, которые читаются с обоих сторон)

    public static boolean isPalindrome(String word) {
        StringBuilder reversedWord = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        }
        return word.contentEquals(reversedWord);
    }
}

