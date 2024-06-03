package clasroom;

public class PlatWithForLoops {
    public static void main(String[] args) {

        // Print number from 1 to 10

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }

        //Print all even numbers from 2 to 20

        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }

        //Calculate the sum of numbers from 1 to 10

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of numbers " + sum);

        //Print elements from an Array
        int[] numbers = {2, 20, 30, 40, 50, 55, 100};
        for (int number : numbers) {
            System.out.println(number);

            //Print numbers in reverse order from 10 to 1

            for (int i = 10; i >= 1; i--) {
                System.out.println(i);

                //Print multiplication table (5)
                int value = 5;
                for (int a = 1; a <= 10; a++) {
                    int result = value * a;
                    System.out.println(String.format("%d * %d", number, a, result));
                }

            }
        }
    }
}

