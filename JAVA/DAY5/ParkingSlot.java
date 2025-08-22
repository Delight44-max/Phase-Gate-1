// create 20 spaces for the number car positions
// determine the length of the spaces
// compare the length of spaces with the postions, if the postion is 
// equal to the number of spaces, show a message "the position has been occupied"
// if its not equal then display " there is space left". 

import java.util.Scanner;
public class ParkingSlot{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("WELLCOME TO DELIGHT PARKING SPACE");
System.out.println("   ");

System.out.println("we have 20 spaces enter the positon to park "); 

int userinput = input.nextInt();

int[] space = new int[20];




for (int index = 0; index < space.length; index++) {
if(userinput == space[index]) {

}
}
System.out.println("there is no space at position " + userinput);

}
}




