import java.util.Scanner;

public class MbtTest {

public static void allQuestions() {
Scanner input = new Scanner(System.in);

System.out.println("FREE PERSONALITY TEST\n");
System.out.println("Please select (A) or (B)\n");

        // ---------- Question 1 ----------
        System.out.println("1. You regularly make new friends.");
        System.out.println("(A) AGREE");
        System.out.println("(B) DISAGREE");
        String answerOne = input.nextLine().toUpperCase();

        if (!answerOne.equals("A") && !answerOne.equals("B")) {
            System.out.println("Invalid choice! Please enter A or B.");
            return;
}

        // ---------- Question 2 ----------
        System.out.println("\n2. You can easily connect with people you have just met.");
        System.out.println("(A) AGREE");
        System.out.println("(B) DISAGREE");
        String answerTwo = input.nextLine().toUpperCase();
        if (!answerTwo.equals("A") && !answerTwo.equals("B")) {
            System.out.println("Invalid choice! Please enter A or B.");
            return;
}

        // ---------- Question 3 ----------
        System.out.println("\n3. If your plans are interrupted, your top priority is to get back on track as soon as possible.");
        System.out.println("(A) AGREE");
        System.out.println("(B) DISAGREE");
        String answerThree = input.nextLine().toUpperCase();
        if (!answerThree.equals("A") && !answerThree.equals("B")) {
            System.out.println("Invalid choice! Please enter A or B.");
            return;
        }

        // ---------- Question 4 ----------
        System.out.println("\n4. You are still bothered by mistakes that you made a long time ago.");
        System.out.println("(A) AGREE");
        System.out.println("(B) DISAGREE");
        String answerFour = input.nextLine().toUpperCase();
        if (!answerFour.equals("A") && !answerFour.equals("B")) {
            System.out.println("Invalid choice! Please enter A or B.");
            return;
}

        // ---------- Question 5 ----------
        System.out.println("\n5. Your emotions control you more than you control them.");
        System.out.println("(A) AGREE");
        System.out.println("(B) DISAGREE");
        String answerFive = input.nextLine().toUpperCase();
        if (!answerFive.equals("A") && !answerFive.equals("B")) {
            System.out.println("Invalid choice! Please enter A or B.");
            return;
}

       

        // ---------- Results ----------
        System.out.println("\nThe options you selected are:\n");
        System.out.println("1. " + answerOne);
        System.out.println("2. " + answerTwo);
        System.out.println("3. " + answerThree);
        System.out.println("4. " + answerFour);
        System.out.println("5. " + answerFive);

        // Personality result (simple check)
        if (answerOne.equals("A") || answerTwo.equals("A")) {
            System.out.println("\nBased on your answers you are an Extrovert");
        } else {
            System.out.println("\nBased on your answers you are an Introvert");
        }

       
}

    public static void main(String[] args) {
        allQuestions();
}
}