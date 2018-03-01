import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseadmin;

    @Before
    public void before(){
        databaseadmin = new DatabaseAdmin("Mark", "JB99999J", 27000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Mark", databaseadmin.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("JB99999J", databaseadmin.getNInumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(27000.00, databaseadmin.getSalary(), 0.01);
    }

    @Test
    public void raiseSalary(){
        assertEquals(28000.00, databaseadmin.raiseSalary(1000), 0.01);
    }

    @Test
    public void getBonus(){
        assertEquals(270.00, databaseadmin.payBonus(), 0.01);
    }
}
