import Animals.Amphibious.Amphibious;
import Animals.Birds.Flying.Flying;
import Animals.Birds.NonFlying.NonFlying;
import Animals.Mammals.Herbivorous.Herbivorous;
import Animals.Mammals.Predator.Predator;


public class Main {
    public static void main(String[] args) {

        Amphibious frog = new Amphibious("Frog", 1, "Swamp");
        Amphibious adder = new Amphibious("Adder", 1, "Meadow");
        Amphibious[] amphibious = new Amphibious[]{frog, adder};
        System.out.println(Amphibious.checkForUnique(amphibious));
        frog.toString();
        adder.toString();


        Herbivorous giraffe = new Herbivorous("Giraffe", 1, "Savannah", 10,
                "leaves");
        Herbivorous gazelle = new Herbivorous("Gazelle", 1, "Savannah", 20,
                "grass");
        Herbivorous horse = new Herbivorous("Horse", 5, "Field", 35, "grass");
        Herbivorous[] herbivorous = new Herbivorous[]{giraffe, gazelle, horse};
        System.out.println(Herbivorous.checkForUnique(herbivorous));


        gazelle.toString();
        horse.toString();

        Predator hyena = new Predator("Hyena", 2, "Svannah", 25);
        Predator tiger = new Predator("Tiger", 2, "Jungle", 30);
        Predator bear = new Predator("Bear", 3, "Forest", 40);
        Predator[] predators = new Predator[]{hyena, tiger, bear};
        System.out.println(Predator.checkForUnique(predators));

        hyena.toString();
        tiger.toString();
        bear.toString();

        NonFlying peacock = new NonFlying("Peacock", 5, "Meadow", "Walk");
        NonFlying penguin = new NonFlying("Penguin", 2, "South Pole", "Swim");
        NonFlying dodoBird = new NonFlying("DodoBird", 4, "Mauritius Island", "Run");
        NonFlying[] nonFlyings = new NonFlying[]{peacock, penguin, dodoBird};
        System.out.println(NonFlying.checkForUnique(nonFlyings));

        peacock.toString();
        penguin.toString();
        dodoBird.toString();

        Flying gull = new Flying("Gull", 1, "Street", "fly");
        Flying albatros = new Flying("Albatros", 2, "Islands", "fly");
        Flying falcon = new Flying("Falcon", 2, "Mountains", "fly");
        Flying[] flyings = new Flying[]{gull, albatros, falcon};
        System.out.println(Flying.checkForUnique(flyings));
    }
}
