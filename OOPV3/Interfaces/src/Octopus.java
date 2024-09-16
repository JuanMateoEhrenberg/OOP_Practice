public class Octopus extends MarineCreatures implements Interfaces.Comunicable , Interfaces.Alimentable  {

    int cantTentacles;

    public Octopus(String name, int cantTentacles){
        super(name);
        this.cantTentacles = cantTentacles;
    }
    
        @Override
        void swim() {
            System.out.println(name +" is swimming with its" + cantTentacles + "tentacles.");
        }

        @Override
        public void comunicarse() {
            System.out.println(name +" waves with its " + cantTentacles + "to say hi! :) .");
          }

        @Override
        public void alimentar() {
            System.out.println(name +" eats fishes for the moment");
        }
    
}
