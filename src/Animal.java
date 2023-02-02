public abstract class  Animal {
    private String name;
    private int age;
    private String eatName;

    public Animal(String name, int age, String eatName) {
        this.name = name;
        this.age = age;
        this.eatName = eatName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEatName() {
        return eatName;
    }

    public void setEatName(String eatName) {
        this.eatName = eatName;
    }
}
