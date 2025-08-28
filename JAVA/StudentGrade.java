import java.util.Scanner;

public class StudentGrade {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter number of students: ");
int studentCount = input.nextInt();

System.out.print("Enter number of subjects: ");
int subjectCount = input.nextInt();

String topStudent = "";
double topScore = -1;

int studentIndex = 1;
while (studentIndex <= studentCount) {
System.out.println("\nStudent " + studentIndex);
double total = 0;

int subjectIndex = 1;
while (subjectIndex <= subjectCount) {
System.out.print("Enter score for Subject " + subjectIndex + ": ");
double score = input.nextDouble();
total += score;
subjectIndex++;
}

double average = total / subjectCount;
System.out.println("Total: " + total + " Average: " + String.format("%.2f", average));

if (total > topScore) {
topScore = total;
topStudent = "Student " + studentIndex;
}

studentIndex++;
}

        System.out.println("\nTop Performer: " + topStudent + " with total score of " + topScore);
        input.close();
    }
}
