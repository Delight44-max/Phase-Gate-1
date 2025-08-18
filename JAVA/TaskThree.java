import java.util.Scanner;

public class TaskThree {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("enter number interger");
int userInput = input.nextInt();

if(userInput % 3 == 0){

System.out.println("yes it is divisable by three");
} else {

System.out.println("not divisable by three");
}
}
}
