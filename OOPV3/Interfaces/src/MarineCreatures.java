public abstract class MarineCreatures {

    //Normal Variable
    String name;

    //constructor
    MarineCreatures(String name){
        this.name = name;
    }

    //this forces override in classes in marine creatures.
    abstract void swim();
}
