import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Bob", "JB88899J", 998999.00);
    }

    @Test
    public void hasName() {
        assertEquals("Bob", developer.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("JB88899J", developer.getNInumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(998999.00, developer.getSalary(), 0.01);
    }

    @Test
    public void raiseSalary(){
        assertEquals(999999.00, developer.raiseSalary(1000), 0.01);
    }

    @Test
    public void getBonus(){
        assertEquals(9989.99, developer.payBonus(), 0.01);
    }
}
