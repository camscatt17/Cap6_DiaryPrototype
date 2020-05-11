

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste AppointmentTest.
 *
 * @author  (seu nome)
 * @version (um n�mero de vers�o ou data)
 */
public class AppointmentTest
{
    /**
     * Construtor default para a classe de teste AppointmentTest
     */
    public AppointmentTest()
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
    public void testDescriptionAndDuration()
    {
        Appointment appointm1 = new Appointment("teste", 1);
        assertEquals("teste", appointm1.getDescription());
        assertEquals(1, appointm1.getDuration());
    }
}

