import java.util.LinkedHashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to our vegetables Shop! :) ");

        Map<String, Double > inventory = new LinkedHashMap<>();
        //HashMap does not respect order.
        //TreeMap Ordered Alphabetically
        //LinkedHAshMap Keeps order of putting.

        inventory.put("Banana", 0.89);
        inventory.put("Tomate", 0.75);
        inventory.put("Palta", 0.95);
        inventory.put("Frutilla", 0.65);
        inventory.put("Pimiento", 0.77);
        
        System.out.println("This is our inventory of fruits and vegetables: ");

        //KeySet give me an array with the keys.
        for (String fruta : inventory.keySet()){
                                                //which I can later use to get the corresponding value
            System.out.println(fruta + ": $" + inventory.get(fruta));
        }

        String frutaBuscada = "Frutilla";
        System.out.println("A client comes and asks for the next fruit: " + frutaBuscada );

        if(inventory.containsKey(frutaBuscada)){
            System.out.println(frutaBuscada + " esta en el inventario, gusto venderle");
        } else {
            System.err.println("Sorry, we are do not have a sigle  " + frutaBuscada );
        }


        String sinStock = "Frutilla";
        inventory.remove(sinStock);
        System.out.println("We are now out of: " + sinStock);

        System.out.println("inventary updated: ");
        for(String string : inventory.keySet()) {
            System.out.println(string + ": $" + inventory.get(string));
        }

        System.out.println("the new quantity of stock is: " + inventory.size());


    }   
}
