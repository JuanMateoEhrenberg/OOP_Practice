//Dog Is Inheretance from Animal
public class Dog extends Animal {

    
    public Dog(String name, int age){
        //Super word is assigning data to heredada.
        super(name, age);
    }

    //Decorator OVerride overwrites a method.
    @Override
    public String makeSound() {
        return "Woof" /*To be replaced with ACTUAL sound. */;
    }

}
