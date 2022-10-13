package lotr;

public abstract class Character {
    int power;
    int hp;

    public Character(int power_, int hp_){
        power = power_;
        hp = hp_;
    }
    public abstract void kick(Character c);
    boolean isAlive(){
        return hp>0;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Character{" +
                "power=" + power +
                ", hp=" + hp +
                '}';
    }
}
