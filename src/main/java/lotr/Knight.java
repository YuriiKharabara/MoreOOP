package lotr;

import java.util.Random;

public class Knight extends Character {
    public Knight(){
        super(10, 10);
        Random random = new Random();
        int power_ = random.nextInt(2, 12);
        int hp_ = random.nextInt(2, 12);
        setHp(hp_);
        setPower(power_);

    }

    public void kick(Character c){
        Random random = new Random();
        int decrease = random.nextInt(power);
        c.setPower(c.getPower()-decrease);
        //decrease number of hp of the enemy by random number which will be in the range of his power
    }
}

