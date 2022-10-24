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

    public void eat() {
        System.out.println("Eat " + typeOfFood);
    }

    public void go() {
        System.out.println("Go to " + getLivingEnvironment());
    }

    public static boolean checkForUnique(Herbivorous[] herbivorous) {
        boolean areUnique = true;
        for (int i = 0; i < herbivorous.length - 1; i++) {
            for (int j = i + 1; j < herbivorous.length; j++) {
                if (!herbivorous[i].equals(herbivorous[j])) {
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
