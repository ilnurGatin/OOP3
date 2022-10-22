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
                "typeOfFood='" + typeOfFood + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", movingSpeed=" + movingSpeed +
                ", title='" + title + '\'' +
                ", age=" + age +
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
}
