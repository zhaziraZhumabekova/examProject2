public class Bear extends Animal implements Huntable{

    public Bear(String name, int age, String eatName) {
        super(name, age, eatName);
    }

    @Override
    public void hunt() {
        System.out.println("Bear is easting " + getEatName());
    }
}
