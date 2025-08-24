import java.util.Scanner;
public class CreditCard {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);


System.out.println("Enter your credit card number");
String cardNumber = input.nextLine();




if(cardNumber.length() < 13 || cardNumber.length() > 16) {


System.out.print("Invalid credit card number!");

return;


}

int[] cardDigits = new int[cardNumber.length()];

for(int count = 0; count < cardNumber.length(); count++) {


cardDigits[count] = Character.getNumericValue(cardNumber.charAt(count));

}




if (cardDigits[0] == 4) {
System.out.println("\n<<<< credit card type: VISA CARD");
} else if (cardDigits[0] == 5) {
System.out.println("\n<<<< credit card type: MASTERCARD");
} else if (cardDigits[0] == 3 && cardDigits[1] == 7) {
System.out.println("\n<<<< credit type : AMERICAN EXPRESS CARD");
} else if (cardDigits[0] == 6) {
System.out.println("\n<<<< credit card type: DISCOVER CARD");
} else {
System.out.println("CARD NOT RECOGNIZED!");
}

System.out.println("<<<< credit card Number: " + cardNumber);
System.out.println("<<<< credit card Digit: " + cardNumber.length());






















} // class


} // main