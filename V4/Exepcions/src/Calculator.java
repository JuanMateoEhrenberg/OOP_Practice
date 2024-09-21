import Excepcions.CalculatorExeption;

public class Calculator {

    public int dividir(int dividendo, int divisor) throws CalculatorExeption{

        if(divisor == 0) throw new CalculatorExeption("/ by 0 not ok :()");

        return dividendo/ divisor;
    
    }

}
