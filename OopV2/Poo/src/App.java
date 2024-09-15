public class App {
    public static void main(String[] args) throws Exception {
        
        
        Circle circulo = new Circle(10);
        Rectanlge rectangulo = new Rectanlge(8,6);


        circulo.printInfo();
        System.out.println("El area de circulo es: " + circulo.calculateArea());
        rectangulo.printInfo();
        System.out.println("El area de rectangulo es: " + rectangulo.calculateArea());
    }
}
