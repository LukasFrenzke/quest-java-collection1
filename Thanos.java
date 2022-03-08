import java.util.*;

public class Thanos {

    public static void main(String[] args) {
        // TODO 1: Hero instances and ArrayList
        Hero blackWidow = new Hero ("Black Widow", 34);
        Hero captainAmerica = new Hero ("Captain America", 100);
        Hero vision = new Hero ("Vision", 3);
        Hero ironMan = new Hero ("Iron Man", 48);
        Hero scarletWitch = new Hero ("Scarlet Witch", 29);
        Hero thor = new Hero ("Thor", 1500);
        Hero hulk = new Hero ("Hulk", 49);
        Hero doctorStrange = new Hero ("Doktor Strange", 42);

        ArrayList<Hero> heroes = new ArrayList<>();
        //TODO 2: Add Hero to heroes list
        heroes.add(blackWidow);
        heroes.add(captainAmerica);
        heroes.add(vision);
        heroes.add(ironMan);
        heroes.add(scarletWitch);
        heroes.add(thor);
        heroes.add(hulk);
        heroes.add(doctorStrange);
        // TODO 3: Thors birthday
        thor.setAge(1501);
        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list
       List<Hero> heroesHalf = heroes.subList(0, 4);
        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (int i = 0; i < heroesHalf.size(); i++){
            Hero heroesRemaining = heroesHalf.get(i);
            System.out.println(heroesRemaining.getName());
        }
    }
}
