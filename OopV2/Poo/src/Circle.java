public class Circle extends Figure{

    double radio;
    
    public Circle(double radio){
        this.radio = radio;
    }

    @Override
    double calculateArea(){
    return Math.PI * radio *radio;
    }

}
