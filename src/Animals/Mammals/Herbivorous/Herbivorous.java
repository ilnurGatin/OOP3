package Animals.Mammals.Herbivorous;

import Animals.ValidationUtils;
import Animals.Mammals.Mammals;

import java.util.Objects;

public class Herbivorous extends Mammals {

    private String typeOfFood;

    public Herbivorous(String title, int age, String livingEnvironment, int movingSpeed, String typeOfFood) {
        super(title, age, livingEnvironment, movingSpeed);
        setTypeOfFood(typeOfFood);
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = ValidationUtils.validOrDefault(typeOfFood, "Default");
    }

    public void graze () {
        System.out.println("Пасусь на лугу");
    }

    @Override
    public String toString() {
        return "Herbivorous{" +
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
        Herbivorous that = (Herbivorous) o;
        return Objects.equals(typeOfFood, that.typeOfFood) && Objects.equals(title, that.title) &&
                Objects.equals(age, that.age) && Objects.equals(movingSpeed, that.movingSpeed) &&
                Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfFood, title, age, movingSpeed, livingEnvironment);
    }
}
