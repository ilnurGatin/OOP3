package Animals;

public abstract class Animals {
    protected String title;
    protected int age;

    protected Animals(String title, int age) {
        setTitle(title);
        setAge(age);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = ValidationUtils.validOrDefault(title, "Default");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age > 0 ? age : 1;
    }

    public abstract void eat();

    public void sleep() {
    }

    public abstract void go();
}
