public class Koyon extends Animal implements Eatable{
    public Koyon(String name, int age, String eatName) {
        super(name, age, eatName);
    }

    @Override
    public void eat() {
        System.out.println("Koyon is easting " + getEatName());
    }
}
