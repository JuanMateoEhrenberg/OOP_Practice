public class App {
    public static void main(String[] args) throws Exception {
        
        
        Person person1 = new Person("Rene", "Calle13", 45);
        person1.setNombre("Richard");
        
        String greeted = "Alejandro";

        System.out.println(person1.giveFullNameString() + " tiene " + person1.getEdad() + " años.");    
        System.out.println(person1.sayHiString(greeted));
    
        System.out.println();


    }
}
