

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste PaletTest.
 *
 * @author  (seu nome)
 * @version (um n�mero de vers�o ou data)
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
     * Chamado antes de cada m�todo de caso de teste.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado ap�s cada m�todo de teste de caso.
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

