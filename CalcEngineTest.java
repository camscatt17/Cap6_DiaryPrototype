

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste CalcEngineTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class CalcEngineTest
{
    private CalcEngine calcEngi1;

    /**
     * Construtor default para a classe de teste CalcEngineTest
     */
    public CalcEngineTest()
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
        calcEngi1 = new CalcEngine();
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
    public void testPlus()
    {
        CalcEngine calcEngi1 = new CalcEngine();
        calcEngi1.clear();
        calcEngi1.numberPressed(3);
        calcEngi1.plus();
        calcEngi1.numberPressed(4);
        calcEngi1.equals();
        assertEquals(7, calcEngi1.getDisplayValue());
        calcEngi1.clear();
    }

    @Test
    public void minusTest()
    {
        calcEngi1.clear();
        calcEngi1.numberPressed(4);
        calcEngi1.minus();
        calcEngi1.numberPressed(3);
        calcEngi1.equals();
        assertEquals(1, calcEngi1.getDisplayValue());
        calcEngi1.clear();
    }

    @Test
    public void testAllOperations()
    {
        calcEngi1.clear();
        calcEngi1.numberPressed(4);
        calcEngi1.plus();
        calcEngi1.numberPressed(3);
        calcEngi1.minus();
        calcEngi1.numberPressed(1);
        calcEngi1.equals();
        assertEquals(6, calcEngi1.getDisplayValue());
        calcEngi1.clear();
    }

    @Test
    public void testSequenceOfOperations()
    {
        calcEngi1.clear();
        calcEngi1.numberPressed(3);
        calcEngi1.plus();
        calcEngi1.numberPressed(4);
        calcEngi1.equals();
        assertEquals(7, calcEngi1.getDisplayValue());
        calcEngi1.clear();
        calcEngi1.numberPressed(4);
        calcEngi1.minus();
        calcEngi1.numberPressed(3);
        calcEngi1.equals();
        assertEquals(1, calcEngi1.getDisplayValue());
        calcEngi1.clear();
    }
}




