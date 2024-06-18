package clasroom;

public class FirstHomeWork {
    public static void main(String[] args) {


        //Write a Java program that checks if a given number is positive. If it is, print "Positive number."

        int number = 8;
        if (number > 0) {
            System.out.println("This number is positive");
        }

        //Odd or even: Create a Java program that determines if a given integer is even. If it is, print "Even number."

        int value = 10;
        if (value % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }


        //Age group classifier: Write a Java program that classifies a person into different age groups based on their age.
        // If the age is less than 18, print "Teenager," otherwise print "Adult."

        int age = 45;
        if (age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }


        //Leap year checker: Create a Java program that checks if a given year is a leap year.
        //If it is, print "Leap year."

        int year = 1952;
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap year");
        } else if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
            System.out.println("Not a Leap year");
        }

        //Multiple conditions: Write a Java program that checks if a given number is positive, even, and less than 100.
        // If all conditions are true, print "Valid number."

        int number1 = 72;
        if (number1 > 0 && number1 % 2 == 0 && number1 < 100) {
            System.out.println("Valid number");
        } else {
            System.out.println("Invalid number");
        }

        //Nested conditions: Create a Java program that checks if a number is positive, and if so, check if it's even.
        //If both conditions are true, print "Positive and Even."

        int number2 = 36;
        if (number2 > 0) {
            if (number2 % 2 == 0) {
                System.out.println("Positive and Even");
            } else {
                System.out.println("Not positive");
            }
        }

        //Character type identifier: Write a Java program that determines if a given character is a vowel.
        //If it is, print "Vowel." (Use variable with data type: char. When checking character use == and ||)


        char letter = 'U';
        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println("Vowel");
        }

        //BMI calculator: Create a Java program that calculates BMI (Body Mass Index) and categorizes it into different ranges.
        // Print the category based on the BMI. Formula: bmi = weight / (height * height);


        double weight = 70.5;
        double height = 1.69;
        double bmiIndex = weight / (height * height);
        {
            System.out.println(bmiIndex);
        }

        if (bmiIndex < 18.5) {
            System.out.println("Underweight");
        } else if (bmiIndex < 25) {
            System.out.println("Healthy Weight");
        } else if (bmiIndex < 30) {
            System.out.println("Overweight");
        } else if (bmiIndex > 30) {
            System.out.println("Obesity");
        }


        //File extension checker: Write a Java program that takes a filename as input and checks
        //if it has a valid file extension. Assume valid extensions are ".txt", ".doc", and ".pdf".


        String[] validExtensions = {".txt", ".doc", ".pdf"};
        String fileName = "myProject.pdf";

        boolean isValid = false;
        for (String extension : validExtensions) {
            if (fileName.endsWith(extension)) {
                isValid = true;
            }
        }

        if (isValid) {
            System.out.println("Valid file extension.");
        } else {
            System.out.println("Invalid file extension.");
        }

        //Write a Java program that calculates the final grade for a student based on their scores in three subjects:
        //Math, Science, and English. The program should take input scores for each subject and calculate the average.

        int math = 30;
        int science = 70;
        int english = 90;
        int averageScore = (math + science + english) / 3;


        if (averageScore >= 90) {
            System.out.print("A");
        } else if (averageScore >= 80 && averageScore <= 89) {
            System.out.print("B");
        } else if (averageScore >= 70 && averageScore <= 79) {
            System.out.print("C");
        } else if (averageScore >= 60 && averageScore <= 69) {
            System.out.print("D");
        } else if (averageScore < 60) {
            System.out.println("F");
        }

    }
}











