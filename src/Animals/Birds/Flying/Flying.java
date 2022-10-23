package Animals.Birds.Flying;

import Animals.Amphibious.Amphibious;
import Animals.Birds.Bird;
import Animals.ValidationUtils;

import java.util.Objects;

public class Flying extends Bird {

    private String moveType;

    public Flying(String title, int age, String livingEnvironment, String moveType) {
        super(title, age, livingEnvironment);

    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        this.moveType = ValidationUtils.validOrDefault(moveType, "Default");
    }

    public void fly() {
        System.out.println("Летаю");
    }

    @Override
    public String toString() {
        return "Flying{" +
                "moveType='" + moveType + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", title='" + title + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flying flying = (Flying) o;
        return Objects.equals(title, flying.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moveType, title, age, livingEnvironment);
    }

    public static boolean checkForUnique(Flying[] flyings) {
        boolean areUnique = true;
        for (int i = 0; i < flyings.length - 1; i++) {
            for (int j = i + 1; j < flyings.length; j++) {
                if (!flyings[i].equals(flyings[j])) {
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
