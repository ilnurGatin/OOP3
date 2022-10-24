package Animals.Mammals;
import Animals.ValidationUtils;
import Animals.Animals;

public abstract class Mammals extends Animals {
    protected String livingEnvironment;
    protected int movingSpeed;

    protected Mammals(String title, int age, String livingEnvironment, int movingSpeed) {
        super(title, age);
        setLivingEnvironment(livingEnvironment);
        setMovingSpeed(movingSpeed);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = ValidationUtils.validOrDefault(livingEnvironment, "Default");
    }

    public int getMovingSpeed() {
        return movingSpeed;
    }

    public void setMovingSpeed(int movingSpeed) {
        this.movingSpeed = movingSpeed > 0 ? movingSpeed : 1;
    }

    @Override
    public void eat() {
        System.out.println("Ем мясо если хищник или траву если травоядное");
    }

    @Override
    public void go() {
        System.out.println("Могу ходить, бегать");
    }
}
