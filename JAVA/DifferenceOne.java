import java.util.Scanner;

public class DifferenceOne {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a four-digit integer to encrypt: ");
int number = scanner.nextInt();

        
int d1 = (number / 1000) % 10;
int d2 = (number / 100) % 10;
int d3 = (number / 10) % 10;
int d4 = number % 10;

        
d1 = (d1 + 7) % 10;
d2 = (d2 + 7) % 10;
d3 = (d3 + 7) % 10;
d4 = (d4 + 7) % 10;

        
int temp1 = d1;
d1 = d3;
d3 = temp1;

int temp2 = d2;
d2 = d4;
d4 = temp2;

        
System.out.printf("Encrypted number: %d%d%d%d%n", d1, d2, d3, d4);
}
}