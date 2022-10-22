package Animals.Birds;
import Animals.Animals;
import Animals.ValidationUtils;

public class Bird extends Animals {

    protected String livingEnvironment;

    protected Bird(String title, int age, String livingEnvironment) {
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
        System.out.println("Ем семена, насекомых, мелких пресноводных");
    }

    @Override
    public void go() {
        System.out.println("Бегаю или летаю");
    }
}
