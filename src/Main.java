public class Main {
    public static void main(String[] args) {
        Bear bear = new Bear("nameBear", 11, "bal");
        Koyon koyon = new Koyon("nameKoyon", 11, "chop");
        Volf volf = new Volf("nameKoyon", 11, "aaa");
        volf.setEatName(koyon.getName());


        bear.hunt();
        koyon.eat();
        volf.hunt();



    }
}