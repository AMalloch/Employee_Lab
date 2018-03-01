import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Jim", "JB897654J", 30000.00, "Tesco");
    }

    @Test
    public void hasName() {
        assertEquals("Jim", manager.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("JB897654J", manager.getNInumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Tesco", manager.getDeptName());
    }

    @Test
    public void raiseSalary(){
        assertEquals(31000.00, manager.raiseSalary(1000), 0.01);
    }

    @Test
    public void getBonus(){
        assertEquals(300.00, manager.payBonus(), 0.01);
    }
}
