package lotr;

import java.util.Random;

public class CharacterFactory {
    Character createCharacter() {
        int rnd = new Random().nextInt(4);
        if (rnd == 0) {
            return new Elf();
        } else if (rnd == 1) {
            return new Hobbit();
        } else if (rnd == 2) {
            return new King();
        } else {
            return new Knight();
        }
    }
}
