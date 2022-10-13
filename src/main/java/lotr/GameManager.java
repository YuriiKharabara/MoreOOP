package lotr;

public class GameManager {
    void fight(Character c1, Character c2) {
        while (c1.isAlive()&&c2.isAlive()){
            if(c1 instanceof Hobbit && c2 instanceof Hobbit){
                System.out.println("Nobody lose.");
                break;
            }
            c1.kick(c2);
            System.out.println(c2.toString());
            c2.kick(c1);
            System.out.println(c1.toString());
        }
        //to provide fight between to characters and explain via command line what happens during fight, till both of the characters are alive
    }
}
