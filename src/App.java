public class App {
    public static void main(String[] args) throws Exception {
        
        
        Person person1 = new Person("René", "Calle13", 45, "Music", 20, false);


        String greeted = "Alejandro";

        System.out.println(person1.giveFullNameString() + " tiene " + person1.age + " años. y esta recibio de " + person1.major.name);    
        System.out.println(person1.sayHiString(greeted));
    
        System.out.println();


    }
}
