public class Task1 {

public static void main(String[] args){

System.out.println("the fathers was " + ageChecker(13,50));


}


public static int ageChecker(int sonsAge, int fathersAge ){

int ageOne = sonsAge *2;

int fathersAgeYearsAgo = fathersAge - ageOne;

return fathersAgeYearsAgo;


}
}