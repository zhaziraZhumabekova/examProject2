public class Volf extends Animal implements Huntable{
    public Volf(String name, int age, String eatName) {
        super(name, age, eatName);
    }

    @Override
    public void hunt() {
        System.out.println("Volf is easting " + getEatName());


    }
}