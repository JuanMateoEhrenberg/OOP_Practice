//Gato Is Inheretance from Animal
public class Gato extends Animal {

    
    public Gato(String name, int age){
        //Super word is assigning data to heredada.
        super(name, age);
    }

    //Decorator OVerride overwrites a method.
    @Override
    public String makeSound() {
        return "MIau" /*To be replaced with ACTUAL sound. */;
    }

}
