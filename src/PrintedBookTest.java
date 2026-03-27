import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintedBookTest {
    PrintedBook pb;
    @BeforeEach
    void setUp() {
        pb = new PrintedBook("testbook","SKØN",10,20);

    }

    @Test
    void calculatePoints() {

        double actual = pb.calculatePoints();

        assertEquals(340, actual);

        assertNotEquals(50, actual);


    }


}