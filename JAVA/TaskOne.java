import java.util.Scanner;

public class TaskOne {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("enter first interger");
int firstuserInput = input.nextInt();

System.out.println("enter second interger");
int seconduserInput = input.nextInt();

int squareInputOne = firstuserInput * 2;
int squareInputtwo = seconduserInput * 2;

int SumOfsquares = squareInputOne + squareInputtwo;
int DifferenceOfsquares = squareInputOne - squareInputtwo;

System.out.println("the square of first number is " + squareInputOne);
System.out.println("the square of second number is " + squareInputtwo );

System.out.println("the sum of squares is " + SumOfsquares);
System.out.println("the diffence of squares is " + DifferenceOfsquares);

}
}








 