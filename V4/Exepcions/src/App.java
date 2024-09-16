public class App {
    public static void main(String[] args) throws Exception {
       
        //Exepiones: Eventos que interrumpen flujo de aplicacion
        //unchecked
        int numero1 = 5;
        int numero2 = 2;
        double resultado;

        try{
            resultado = numero1/numero2;
            System.out.println(resultado);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("After error message still showed");
 
        }
        
        //checked
    }
}
