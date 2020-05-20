

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste BrickTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class BrickTest
{
    private Brick brick1;

    /**
     * Construtor default para a classe de teste BrickTest
     */
    public BrickTest()
    {
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp()
    {
        brick1 = new Brick(10, 5, 2);
        brick1.getHeight();
        brick1.getSurfaceArea();
        brick1.getVolume();
        brick1.getWeight();
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testWeight()
    {
        assertEquals(0.2, brick1.getWeight(), 0.1);
    }

    @Test
    public void testVolume()
    {
        assertEquals(100, brick1.getVolume());
    }

    @Test
    public void testTotalSurface()
    {
        assertEquals(160, brick1.getSurfaceArea(), 0.1);
    }
}



