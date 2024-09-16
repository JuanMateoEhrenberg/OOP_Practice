public class Dolphin extends MarineCreatures implements Interfaces.Comunicable, Interfaces.Alimentable {

public Dolphin(String name){
    super(name);
}

    @Override
    void swim() {
        System.out.println(name +" swims faslty with its tail and jumps out of the water");
    }

    @Override
    public void comunicarse() {
        System.out.println(name + " Makes sounds and clicks to communicate");
    }

    @Override
    public void alimentar() {
        System.out.println(name + " ate something for sure, figuring it out");
    }

}
