package Animals.Mammals.Predator;

import Animals.Mammals.Mammals;
import Animals.ValidationUtils;

import java.util.Objects;

public class Predator extends Mammals {
    private String typeOfFood;

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = ValidationUtils.validOrDefault(typeOfFood, "Default");
    }

    public Predator(String title, int age, String livingEnvironment, int movingSpeed) {
        super(title, age, livingEnvironment, movingSpeed);
        setTypeOfFood(typeOfFood);
    }

    public void hunt() {
        System.out.println("Охочусь на других травоядных");
    }

    @Override
    public String toString() {
        return "Predator{" +
                "typeOfFood='" + getTypeOfFood() + '\'' +
                ", livingEnvironment='" + getLivingEnvironment() + '\'' +
                ", movingSpeed=" + getTypeOfFood() +
                ", title='" + getTitle() + '\'' +
                ", age=" + getAge() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predator predator = (Predator) o;
        return Objects.equals(typeOfFood, predator.typeOfFood) && Objects.equals(title, predator.title) &&
                Objects.equals(age, predator.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfFood);
    }

    public static boolean checkForUnique(Predator[] predators) {
        boolean areUnique = true;
        for (int i = 0; i < predators.length - 1; i++) {
            for (int j = i + 1; j < predators.length; j++) {
                if (!predators[i].equals(predators[j])) {
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
