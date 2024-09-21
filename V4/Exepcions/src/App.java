import Excepcions.CalculatorExeption;

public class App {
    public static void main(String[] args) throws Exception {
       
        //Exepiones: Eventos que interrumpen flujo de aplicacion
        //unchecked
        int numero1 = 5;
        int numero2 = 0;
        double resultado;

        Calculator calculadora = new Calculator();

        try{
            resultado = calculadora.dividir(numero1, numero2);
            System.out.println(resultado);

        } catch (CalculatorExeption e) {
            e.printStackTrace();
            System.out.println("After error message still showed");
 
        } finally {
            System.out.println("Hemos finalizado el calculo, ya sea exitoso o no.");
        }
        
        //checked
    }
}
