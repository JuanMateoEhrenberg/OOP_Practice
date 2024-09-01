public class App {
    public static void main(String[] args) throws Exception {
        
        
        Person person1 = new Person();
        person1.name = "Matthew";
        person1.lastName = "Ehrenberg";
        person1.age = 45;

        Major major1 = new Major();
        major1.name = "IT ingenieereng";
        major1.duration = 5;
        major1.IsStudying = false;

        person1.major = major1;

        Major major2 = new Major();
        major2.name = "Law";
        major2.duration = 3;
        major2.IsStudying = true;

        Person person2 = new Person();
        person2.name = "Coti";
        person2.lastName = "Lopez";
        person2.age = 23;
        
        person2.major = major2;


        String greeted = "Alejandro";

        System.out.println(person1.giveFullNameString() + " tiene " + person1.age + " años. y esta recibio de " + person1.major.name);
        System.out.println(person2.giveFullNameString() + " tiene " + person2.age + " años.");
        System.out.println(person1.sayHiString(greeted));
        System.out.println(person2.sayHiString("Luke Skywalker"));

        System.out.println();


    }
}
