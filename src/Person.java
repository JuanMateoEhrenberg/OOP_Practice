public class Person {

    //Attributes (objects characteristics)
    String name;
    String lastName;
    int age;
    Major major;
    
    //Constructor
    public Person(String name, String lastName, int age, String majorName, int duration, boolean isStudying){
        major = new Major(majorName, duration, isStudying);
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    //Methods (Behaviour of an object)
    public String giveFullNameString(){
        return lastName + ", " + name;
    }

    public String sayHiString(String greeted){
        if (age > 40) return "Estimado " + greeted + ", se encuentra optimo usted?";
        return "Hiya " + greeted + "! how are you?";
    }
}

