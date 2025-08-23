// Step 1: Get user input

// Step 2: Convert inputs

// Step 3: Calculate next period

// Step 4: Calculate ovulation (14 days before next period)

// Step 5: Fertile window (5 days before ovulation to ovulation day)

// Step 6: Display results



import java.util.Scanner;
import java.time.LocalDate;

public class MenstrualAppCalculator {

static Scanner input = new Scanner(System.in);

public static LocalDate nextPeriodDetails() {

System.out.println("ENTER THE START DATE OF YOUR LAST PERIOD(yyyy-MM-dd): ");
String userinput = input.nextLine();

LocalDate startDate = LocalDate.parse(userinput);  

System.out.println("ENTER YOUR CYCLE LENGTH(e.g., 28): ");
int cycleLength = input.nextInt();
input.nextLine();


LocalDate nextPeriod = startDate.plusDays(cycleLength);


return nextPeriod;

} //method


public static void OvulationPeriod() {

final int beforeOvulation = 14;
final int spermLifeSpan = 5;

LocalDate nextPeriod = nextPeriodDetails();
LocalDate ovulationDate = nextPeriod.minusDays(beforeOvulation);
LocalDate fertileStart = ovulationDate.minusDays(spermLifeSpan);
LocalDate fertileEnd = ovulationDate;

System.out.println("Your ovulation day is: " + ovulationDate + " --- high posibility of pregnancy if you have sex");
System.out.println("Your fertile window starts on: " + fertileStart + " --- tendency of pregnancy is low ");
System.out.println("Your fertile window ends on: " + fertileEnd + " --- the chance of getting pregnant is very low, almost impossible");




} // method


 public static void main(String[] args) {
        OvulationPeriod();


} // main method






} //class