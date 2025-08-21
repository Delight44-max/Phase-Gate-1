import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class TestGloceryAppTwo {

    @Test
    public void testAddItemToList() {
        ArrayList<String> testList = new ArrayList<>();
        testList.add("Milk");
        assertEquals(1, testList.size());
        assertEquals("Milk", testList.get(0));
}

    @Test
    public void testRemoveItemFromList() {
        ArrayList<String> testList = new ArrayList<>();
        testList.add("Bread");
        testList.add("Eggs");
        String removedItem = testList.remove(0);
        assertEquals("Bread", removedItem);
        assertEquals(1, testList.size());
        assertEquals("Eggs", testList.get(0));
}
}