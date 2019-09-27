package adventure_game_oop;

import java.util.Random;

public class Character {


        //CREATES INSTANCE OF RANDOM CLASS

        Random random = new Random();

        //SETS THE HEALTH AND ATTACK DAMAGE

        private int health = 100;

        private final int attack = random.nextInt(20);

        //GETS CHARACTER HEALTH

        public int getHealth() {
            return health;
        }

        //GET CHARACTER ATTACK

        public int getAttack() {
            return attack;
        }


} //Character class
