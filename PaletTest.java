

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste PaletTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class PaletTest
{
    /**
     * Construtor default para a classe de teste PaletTest
     */
    public PaletTest()
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
    public void testHeight()
    {
        Palet palet1 = new Palet(10, 5);
        assertEquals(65, palet1.getHeight(), 0.1);
    }
}

