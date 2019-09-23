import java.util.Random;
import java.util.Scanner;
public class Adventure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int playerHealth = 100;
        int enemyHealth = 100;



        System.out.println("Do you want to play a game?");
        String begin = sc.nextLine();
        String userName = "";
        if(begin.equalsIgnoreCase("yes")){
            System.out.println("Good what's your name?");
        }else{
            System.out.println("Too bad, what's your name?");
        }
        userName = sc.nextLine();

        System.out.println("Did you say Bob?");
        String nameConfirm = sc.nextLine();
        if(nameConfirm.equalsIgnoreCase("yes")){
            System.out.println("You're lying, we're off to a rough start " + userName);
        }else{
            System.out.println("OK Bob, lets play!");
            userName = "Bob";
        }

        System.out.println("A wild Pikachu appears \n");

        while (enemyHealth > 0 || playerHealth > 0){

            if (playerHealth <= 0){
                System.out.println("GAME OVER YOU LOSER");
                break;
            } else if (enemyHealth <= 0){
                System.out.println("YOU DEFEATED PIKACHU!");
                break;
            }else{
                System.out.println( displayStats(playerHealth, enemyHealth));

                System.out.println("\n 1) attack \n");

                System.out.println(" What do you wanna do? ");

                String playerAction = sc.nextLine();

                if(playerAction.equalsIgnoreCase("attack") || playerAction.equalsIgnoreCase("1")){
                    int playerAttack = random.nextInt(20);
                    int enemyAttack = random.nextInt(20);
                    enemyHealth -= playerAttack;
                    System.out.println("CRITICAL HIT!");
                    System.out.println("you did " + playerAttack + " damage to Pikachu");
                    System.out.println("=============================");
                    System.out.println("Pikachu attacks back");
                    playerHealth-= enemyAttack;
                    System.out.println("Pikachu did " + enemyAttack + " damage");
                }
            }



        }
    }

    public static String displayStats(int playerHealth, int enemyHealth){
        return "============================ \n" +
                " YOUR STATS \n " +
                "Health: " + playerHealth + "\n" + "----------------- \n"
                + "ENEMY STATS \n" +
                "health: " + enemyHealth;

    }
}
