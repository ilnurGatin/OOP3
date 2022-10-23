package Animals.Birds.NonFlying;

import Animals.Birds.Bird;
import Animals.Birds.Flying.Flying;
import Animals.ValidationUtils;

import java.util.Objects;

public class NonFlying extends Bird {
    private String moveType;

    public NonFlying(String title, int age, String livingEnvironment, String moveType) {
        super(title, age, livingEnvironment);
        setMoveType(moveType);
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        this.moveType = ValidationUtils.validOrDefault(moveType, "Default");
    }

    public void walk() {
        System.out.println("Хожу, бегаю");
    }

    @Override
    public String toString() {
        return "NonFlying{" +
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
        NonFlying nonFlying = (NonFlying) o;
        return Objects.equals(title, nonFlying.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moveType, livingEnvironment, title, age);
    }

    public static boolean checkForUnique(NonFlying[] nonFlyings) {
        boolean areUnique = true;
        for (int i = 0; i < nonFlyings.length - 1; i++) {
            for (int j = i + 1; j < nonFlyings.length; j++) {
                if (!nonFlyings[i].equals(nonFlyings[j])) {
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
