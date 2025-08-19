import java.util.Scanner;

public class DifferenceTwo {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a four-digit encrypted integer to decrypt: ");
int number = scanner.nextInt();

        
int d1 = (number / 1000) % 10;
int d2 = (number / 100) % 10;
int d3 = (number / 10) % 10;
int d4 = number % 10;

        
int temp1 = d1;
d1 = d3;
d3 = temp1;

int temp2 = d2;
d2 = d4;
d4 = temp2;

        
d1 = (d1 + 3) % 10;
d2 = (d2 + 3) % 10;
d3 = (d3 + 3) % 10;
d4 = (d4 + 3) % 10;

        
System.out.printf("Decrypted number: %d%d%d%d%n", d1, d2, d3, d4);
}
}