public class Person {

    //Attributes (objects characteristics)
    private String name;
    private String lastName;
    private int age;
    
    //Constructor
    public Person(String name, String lastName, int age){
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

    public int getEdad(){
        return this.age;
    }

    public void setNombre(String name){
        this.name = name;
    }
}

