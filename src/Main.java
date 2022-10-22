import Animals.Amphibious.Amphibious;
import Animals.Animals;
import Animals.Birds.NonFlying.NonFlying;
import Animals.Mammals.Herbivorous.Herbivorous;
import Animals.Mammals.Predator.Predator;

public class Main {
    public static void main(String[] args) {

        Amphibious frog = new Amphibious("Frog", 1, "Swamp");
        Amphibious adder = new Amphibious("Adder", 1, "Meadow");

        frog.toString();
        adder.toString();

        Herbivorous giraffe = new Herbivorous("Giraffe", 2, "Savannah", 10,
                "Leaves");
        Herbivorous gazelle = new Herbivorous("Gazelle", 1, "Savannah", 20,
                "grass");
        Herbivorous horse = new Herbivorous("Horse", 5, "Field", 35, "grass");

        giraffe.toString();
        gazelle.toString();
        horse.toString();

        Predator hyena = new Predator("Hyena", 2, "Svannah", 25);
        Predator tiger = new Predator("Tiger", 2, "Jungle", 30);
        Predator bear = new Predator("Bear", 3, "Forest", 40);

        hyena.toString();
        gazelle.toString();
        bear.toString();

        NonFlying peacock = new NonFlying("Peacock", 5, "Meadow", "Walk");
        NonFlying penguin = new NonFlying("Penguin", 2, "South Pole", "Swim");
        NonFlying dodoBird = new NonFlying("DodoBird", 4, "Mauritius Island", "Run");

        peacock.toString();
        penguin.toString();
        dodoBird.toString();






    }
}