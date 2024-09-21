package Excepcions;

public class CalculatorExeption extends Exception{

    String description;

    public CalculatorExeption(String description) {
        setDescription(description);
    }

    @Override 
    public String getMessage(){
        return getDescription();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   

    

}
