import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestTask1 {

@Test


public void testThatIsReallyCheckingfathersAge() {

int ageOne = 13 *2;
int fathersAgeYearsAgo = 50 - ageOne;

Task1 object = new Task1();

int result = object.ageChecker(ageOne, fathersAgeYearsAgo);

assertEquals(result, 24);


}
}

