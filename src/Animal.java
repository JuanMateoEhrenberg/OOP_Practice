public class Animal {

    //Attributes
    String name;
    int age;
    static int animalCounter = 0;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        animalCounter++;
    }

    public String makeSound() {
        return "Grrr generic sound" /*To be replaced with ACTUAL sound. */;
    }

    public static int getAnimalsCuant(){
        return animalCounter;
    }

}   


