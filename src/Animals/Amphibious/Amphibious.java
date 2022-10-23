package Animals.Amphibious;
import Animals.Mammals.Herbivorous.Herbivorous;
import Animals.ValidationUtils;

import Animals.Animals;

import java.util.Objects;

public class Amphibious extends Animals {

    protected String livingEnvironment;

    public Amphibious(String title, int age, String livingEnvironment) {
        super(title, age);
        setLivingEnvironment(livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = ValidationUtils.validOrDefault(livingEnvironment, "Default");
    }

    @Override
    public void eat() {
        System.out.println("Ем насекомых если лягушка, или мелких грызунов если уж");
    }

    @Override
    public void go() {
        System.out.println("Могу прыгать, плавать, ползать");
    }

    public void hunt() {
        System.out.println("Охочусь из засады");
    }

    @Override
    public String toString() {
        return "Amphibious{" +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", title='" + title + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibious that = (Amphibious) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment) && Objects.equals(title, that.title) &&
                Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment, title, age);
    }

    public static boolean checkForUnique(Amphibious[] amphibious) {
        boolean areUnique = true;
        for (int i = 0; i < amphibious.length - 1; i++) {
            for (int j = i + 1; j < amphibious.length; j++) {
                if (!amphibious[i].equals(amphibious[j])) {
                    continue;
                } else {
                    areUnique = false;
                    break;
                }
            }
            if (areUnique) {
                continue;
            } else {
                System.out.println();
            }
        }
        return areUnique;
    }
}
