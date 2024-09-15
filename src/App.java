public class App {
    public static void main(String[] args) throws Exception {
        
        /*
        Person person1 = new Person("Rene", "Calle13", 45);
        person1.setName("Richard");
        person1.setLastName("ALFONSO");
        
        String greeted = "Alejandro";

        System.out.println(person1.giveFullNameString() + " tiene " + person1.getAge() + " años.");    
        System.out.println(person1.sayHiString(greeted));
    
        System.out.println();
        */

        Animal animal = new Animal("Bestia", 200);
        Gato gato = new Gato("Gardfield", 15);
        Dog dog = new Dog("Firulais", 3);

        System.out.println("Animal llamado "+ animal.name + ", hace:");
        System.out.println(animal.makeSound());
        System.out.println("El gato llamado "+ gato.name + ", hace:");
        System.out.println(gato.makeSound());
        System.out.println("El perro llamado "+ dog.name + ", hace:");
        System.out.println(dog.makeSound());
        
        System .err.println("El total de animales creados es: " + Animal.getAnimalsCuant());







    }
}
