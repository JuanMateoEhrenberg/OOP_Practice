import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Bienvenidos a la fiesta de los superheroes");

        List<String> superHeroes = new LinkedList<>();
        superHeroes.add("Batman");
        superHeroes.add("Spiderman");
        superHeroes.add("Superman");
        superHeroes.add("Nightwing");
        superHeroes.add("WonderWoman");
        superHeroes.add("BlackCanary");
        superHeroes.add("Robin");
        superHeroes.add("Hulk");
    
        if (superHeroes.contains("Spiderman")){
            System.out.println("Spiderman is in the party");
        } 

        System.out.println("A superhero is having the time of his life, the hero is: " + superHeroes.get(6));

        superHeroes.set(5,"Dinah Lance");
        System.err.println("Black canary takes her mask of, revealing her identity as: " + superHeroes.get(5));

        superHeroes.remove(7);
        if(!superHeroes.contains("Hulk")){
            System.out.println("Hulk has left the party, he was drunk.");
        }

        if(superHeroes.isEmpty()){
            System.out.println("Party ended, everyone left");
        } else {
            System.out.println("Party is still goin on, there are still " + superHeroes.size() + " superheroes.");
        }
        
        System.out.println("Who is still in the party?");
        for (String superHero : superHeroes) {
            System.out.println(superHero);
            //Not the same order as added. = HashSet
            //Alfabetic order. = TreeSet
            //Orderd the way they were added. = LinkedHashSet

            //Orderd the way they were added + duplicates = ArrayList
            //Use of INDEXES to get/remove/Update etc items. Very efficient ofr get/set
            //LinkedList makes it easier for iteration.
            //Vector the same, but for multithread. (Research on my own when better knowledge myself.)
        }

    }
}
