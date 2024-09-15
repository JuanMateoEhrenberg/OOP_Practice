public class Rectanlge extends Figure{

    double side1;
    double side2;

    public Rectanlge(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    double calculateArea(){
       return side1 * side2;
    }
}
