import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("John", "JB11111J", 100000.00, "Tesco", 12000000.00);
    }

    @Test
    public void hasName(){
        assertEquals("John", director.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("JB11111J", director.getNInumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(100000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Tesco", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(12000000.00, director.getBudget(), 0.01);
    }

    @Test
    public void raiseSalary(){
        assertEquals(101000.00, director.raiseSalary(1000), 0.01);
    }

    @Test
    public void getBonus(){
        assertEquals(1000, director.payBonus(), 0.01);
    }
}
