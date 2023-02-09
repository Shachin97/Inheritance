import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkerTest

{
    Worker w1, w2, w3;

    @BeforeEach
    void setUp()
    {
        w1 = new Worker("00000A", "Bob", "Tester1", "Mr", 1955, 20);
        w2 = new Worker("00000B", "Sally", "Tester2", "Mr", 1955, 12);
        w3 = new Worker("00000C", "Bob", "Tester1", "Mr", 1955, 19);

    }


    @Test
    void getHourlyPayRate()
    {
        assertEquals(20, w1.hourlyPayRate);
    }

    @Test
    void getIDNum() {
        assertEquals("00000A", w1.getIDNum());
    }
    @Test
    void getFirstName() {
        assertEquals("Bob", w1.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Tester1", w1.getLastName());
    }

    @Test
    void getYOB() {
        assertEquals(1955, w1.getYOB());
    }

    /** now we go through all the setters and change P1 to P2 oo we can test the equals with P1 and P2 */
    @Test
    void setIDNum() {
        w1.setIDNum("00000B");
        assertEquals("00000B", w1.getIDNum());
    }

    @Test
    void setFirstName() {
        w1.setFirstName("Sally");
        assertEquals("Sally", w1.getFirstName());
    }

    @Test
    void setLastName() {
        w1.setLastName("Tester2");
        assertEquals("Tester2", w1.getLastName());
    }

    @Test
    void setYOB() {
        w1.setYOB(1975);
        assertEquals(1975, w1.getYOB());
    }

    @Test
    void equals() {
        w1.setIDNum("00000B");
        w1.setFirstName("Sally");
        w1.setLastName("Tester2");
        w1.setYOB(1975);
        w1.setHourlyPayRate(20);
        assertEquals(false, w1.equals(w2));
    }


}