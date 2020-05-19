/**
 * A parte principal da Calculadora feita do zero
 * 
 * @author  Camila Santos
 * @version 2020.05.19
 */
public class CalcEngine
{
    // o valor que vai aparecer no display
    private int displayValue;
    // O operador utilizado na operação solicitada (+ or -).
    private char previousOperator;
    // O operando da esquerda
    private int leftOperand;

    /**
     * Cria a calculadora com entradas nulas
     */
    public CalcEngine()
    {
        displayValue = 0;
        previousOperator = ' ';
        leftOperand = 0;
    }

    /**
     * @return O valor que deveria ser mostrado no display
     * da calculadora
     */
    public int getDisplayValue()
    {
        return displayValue;
    }

    /**
     * A number button was pressed.
     * Either start a new operand, or incorporate this number as
     * the least significant digit of an existing one.
     * @param number The number pressed on the calculator.
     */
    public void numberPressed(int number)
    {
        displayValue = displayValue * 10 + number;
    }

    /**
     * O botão de "soma" foi pressionado 
     */
    public void plus()
    {
        applyPreviousOperator();
        previousOperator = '+';
        displayValue = 0;
    }

    /**
     * O botão de menos foi pressionado
     */
    public void minus()
    {
        applyPreviousOperator();
        previousOperator = '-';
        displayValue = 0;
    }

    /**
     * O botão de igual foi pressionado
     */
    public void equals()
    {
        System.out.println("equals called");
        if(previousOperator == '+') {
            displayValue = leftOperand + displayValue;
        }
        else {
            displayValue = leftOperand - displayValue;
        }
        leftOperand = 0;
    }

    /**
     * O botão de limpar foi pressionado
     */
    public void clear()
    {
        displayValue=0;
        leftOperand = 0;
        previousOperator = ' ';
    }

    /**
     * @return O título da calculadora
     */
    public String getTitle()
    {
        return "Calculadora da Camis";
    }

    /**
     * @return o autor dessa calculadora
     * então deveria conter algo como "Written by H. Simpson".
     */
    public String getAuthor()
    {
        return "Camila Santos";
    }

    /**
     * @return A versão da calculadora 
     * então deveria conter algo como "Version 1.1".
     */
    public String getVersion()
    {
        return "versao 1";
    }
    /**
     * An operator button has been pressed.
     * Apply the immediately preceding operator to
     * calculate an intermediate result. This will
     * form the left operand of the new operator.
     */
    private void applyPreviousOperator()
    {
        System.out.println("applyPreviousOperator called");
        if(previousOperator == '+') {
            leftOperand += displayValue;
        }
        else if(previousOperator == '-') {
            leftOperand -= displayValue;
        }
        else {
            // There was no preceding operator.
            leftOperand = displayValue;
        }
    }
}
