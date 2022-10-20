import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrListTest {

    @Test
    void add() {
        ArrList<Integer> intArrList = new ArrList<> ();

        intArrList.add(2);
        intArrList.add(3);
        intArrList.add(5);

        assertEquals(3,intArrList.getByIndex(1));
    }

    @Test
    void capacity() {
        ArrList<Integer> intArrList = new ArrList<> ();

        intArrList.add(2);
        intArrList.add(3);
        intArrList.add(5);

        assertEquals(2,intArrList.capacity());
    }

    @Test
    void getByIndex() {
        ArrList<Integer> intArrList = new ArrList<> ();

        intArrList.add(2);
        intArrList.add(3);
        intArrList.add(5);

        assertEquals(5,intArrList.getByIndex(2));
    }

    @Test
    void remove() {
        ArrList<Integer> intArrList = new ArrList<> ();

        intArrList.add(2);
        intArrList.add(3);
        intArrList.add(5);

        intArrList.remove(0);
        assertEquals(3,intArrList.getByIndex(0));
    }
}