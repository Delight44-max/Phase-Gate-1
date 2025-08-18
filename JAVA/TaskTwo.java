import java.util.Scanner;

public class TaskTwo {

public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.println("enter first interger");
int firstuserInput = input.nextInt();


System.out.println("enter second interger");
int seconduserInput = input.nextInt();

System.out.println("enter third interger");
int thirduserInput = input.nextInt();

int Sum = firstuserInput + seconduserInput + thirduserInput;

int largest = 0;
int smallest = 0;

if(firstuserInput >  largest){
largest = firstuserInput;
} else {

smallest = firstuserInput;
}

System.out.println(" the largest is " + largest);

System.out.println(" the smallest is " + smallest);

int average = Sum/3;

int product = firstuserInput * seconduserInput * thirduserInput;

System.out.println("the total average is " + average); 
System.out.println("the sums of all your numbers are " + Sum);
System.out.println("the total product is " + product);

}
}