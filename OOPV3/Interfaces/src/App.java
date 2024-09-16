public class App {
    public static void main(String[] args) throws Exception {
        Dolphin delfin = new Dolphin("adolfina");
        Octopus pulpo = new Octopus("Pulpo gonzales", 8);

        delfin.swim();
        delfin.comunicarse();
        delfin.alimentar();
        
        
        pulpo.swim();
        pulpo.comunicarse();
        pulpo.alimentar();
    
    }
}
