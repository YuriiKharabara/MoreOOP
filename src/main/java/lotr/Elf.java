package lotr;

public class Elf extends Character {
    public Elf(){
        super(10, 10);
    }


    public void kick(Character c){
        if(c.getPower() < power){
            c.setHp(0);
        }else{
            c.setPower(c.getPower()-1);
        }

        //kill everybody weaker than him, otherwise decrease the power of character by 1
    }
}
