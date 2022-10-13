package lotr;

public class Hobbit extends Character {
//    int power = 0;
//    int hp = 3;
    public Hobbit(){
        super(0, 3);
    }
    public void toCry() {
        System.out.println("I'm crying.");
    }

    public void kick(Character c){
        toCry();
    }
}
