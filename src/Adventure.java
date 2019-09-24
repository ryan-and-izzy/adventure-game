import java.util.Random;
import java.util.Scanner;

public class Adventure {

    public static void main(String[] args) {

        //ALLOWS USER INPUT

        Scanner sc = new Scanner(System.in);

        //GENERATES A RANDOM NUMBER

        Random random = new Random();

        //GLOBAL VAR

        int playerHealth = 50;
        int enemyHealth = 5;
        int playerPotionCount = 3;


        //START OF THE GAME
        System.out.println(
                "    ▄██▀▀▀▀▀▀▀▀▀▀▀▀▀██▄\n" +
                "   ███                ███\n" +
                "  ███   ▄▀▀▄     ▄▀▀▄   ███\n" +
                " ████ ▄▀    ▀▄─▄▀    ▀▄ ████\n" +
                " ████  ▄████    ████▄  █████\n" +
                "█████ ██   ██   ██   ██ █████\n" +
                "█████ ██ █ ██   ██ █ ██ █████\n" +
                "█████ ██   █▀─▄─▀█   ██ █████\n" +
                "████▀──▀▀▀▀▀─▄█▄─▀▀▀▀▀  ▀████\n" +
                "███ ▄▀▀▀▄    ███   ▄▀▀▀▄ ███\n" +
                "███  ▄▀▄ █  █████  █ ▄▀▄  ███\n" +
                "███ █  █ █  █████  █ █  █ ███\n" +
                "███ █ ▀  █ ▄█████▄ █  ▀ █ ███\n" +
                "███▄ ▀▀▀▀  █─▀█▀─█  ▀▀▀▀─▄███\n" +
                "████                     ████\n" +
                " ███   ▀█████████████▀   ████\n" +
                " ████     █      █    █████\n" +
                "  ███▄  █    █    █  ▄█████\n" +
                "   ▀█████▄▄███▄▄█████▀\n" +
                "          █▄     ▄█\n" +
                "       ▄████     ████▄\n" +
                "   ▄██████████{}██████████▄\n" +
                "  ███▀   █████/\\████   ▀███\n" +
                "▌▌▌▌▒▒   █████  ████   ▒▒▐▐▐▐\n" +
                "      ▒▒ █████\\/█████  ▒▒\n" +
                "        ▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                "         ████░░█████\n" +
                "        █████░░██████\n" +
                "      ███████░░███████\n" +
                "     █████  █░░█  █████\n" +
                "     █████  ████  █████\n" +
                "      ████   ██   ████\n" +
                "      ████  ████  ████\n" +
                " ██    ██   ████   ██     ██\n" +
                " ██   ████  ████  ████    ██\n" +
                " ███████████████████████████\n" +
                " ██         ████          ██\n" +
                " ██         ████          ██\n" +
                "            ████\n" +
                "             ██");

        System.out.println("Do you want to play a game?");

        String begin = sc.nextLine();

        String userName = "";

        //CHECKS USER INPUT

        if(begin.equalsIgnoreCase("yes")){
            System.out.println("Good what's your name?");
        }else{
            System.out.println("Too bad, what's your name?");
        }

        userName = sc.nextLine();

        System.out.println("Did you enter Bob?");

        String nameConfirm = sc.nextLine();

        //CHECKS IF USER ENTERED THE NAME BOB OR NOT

        if(nameConfirm.equalsIgnoreCase("yes")){
            System.out.println("You're lying, we're off to a rough start " + userName);
        }else{
            System.out.println("OK Bob, lets play!");
            userName = "Bob";
        }

        sc.nextLine();

        System.out.println("`;-.          ___,\n" +
                "  `.`\\_...._/`.-\"`\n" +
                "    \\        /      ,\n" +
                "    /()   () \\    .' `-._\n" +
                "   |)  .    ()\\  /   _.'\n" +
                "   \\  -'-     ,; '. <\n" +
                "    ;.__     ,;|   > \\\n" +
                "   / ,    / ,  |.-'.-'\n" +
                "  (_/    (_/ ,;|.<`\n" +
                "    \\    ,     ;-`\n" +
                "     >   \\    /\n" +
                "    (_,-'`> .'\n" +
                "         (_,'");

        System.out.println("A wild Pikachu appears \n");

        System.out.println("Press enter to Begin Fight!");
        sc.nextLine();

        //RUNS BATTLE SEQUENCE WHILE ENEMY OR PLAYER HEALTH IS GREATER THAN ZERO

        while (enemyHealth > 0 || playerHealth > 0){
            System.out.println("\n\n\n\n");


            if (playerHealth <= 0){
                System.out.println("GAME OVER YOU LOSER");
                break;
            } else if (enemyHealth <= 0){
                System.out.println("YOU DEFEATED PIKACHU!");

                System.out.println("`;-.          ___,\n" +
                        "  `.`\\_...._/`.-\"`\n" +
                        "    \\        /      ,\n" +
                        "    / X   X  \\    .' `-._\n" +
                        "   |)  .    ()\\  /   _.'\n" +
                        "   \\  -'-     ,; '. <\n" +
                        "    ;.__     ,;|   > \\\n" +
                        "   / ,    / ,  |.-'.-'\n" +
                        "  (_/    (_/ ,;|.<`\n" +
                        "    \\    ,     ;-`\n" +
                        "     >   \\    /\n" +
                        "    (_,-'`> .'\n" +
                        "         (_,'");

                System.out.println("Press Enter to claim reward!");
                sc.nextLine();
                System.out.println("" +
                        "               ________________\n" +
                        "              \\      __      /         __\n" +
                        "               \\_____()_____/         /  )\n" +
                        "               '============`        /  /\n" +
                        "                #---\\  /---#        /  /\n" +
                        "               (# @\\| |/@  #)      /  /\n" +
                        "                \\   (_)   /       /  /\n" +
                        "                |\\ '---` /|      /  /\n" +
                        "        _______/ \\\\_____// \\____/ o_|\n" +
                        "       /       \\  /     \\  /   / o_|\n" +
                        "      / |           o|        / o_| \\\n" +
                        "     /  |  _____     |       / /   \\ \\\n" +
                        "    /   |  |===|    o|      / /\\    \\ \\\n" +
                        "   |    |   \\@/      |     / /  \\    \\ \\\n" +
                        "   |    |___________o|__/----)   \\    \\/\n" +
                        "   |    '              ||  --)    \\     |\n" +
                        "   |___________________||  --)     \\    /\n" +
                        "        |           o|   ''''   |   \\__/\n" +
                        "        |            |          |\n" +
                        "\n" +
                        "\"YOU'RE UNDER ARREST FOR ANIMAL CRUELTY!!!\"");
                break;
            }else{
                System.out.println( displayStats(playerHealth, enemyHealth, playerPotionCount));

                System.out.println("\n 1) attack \n");

                System.out.println(" 2) Use Potion \n");

                System.out.println(" What do you wanna do?  \n\n\n");

                String playerAction = sc.nextLine();

                //PRINTS THE RESULT OF THE ATTACKS

                if(playerAction.equalsIgnoreCase("attack") || playerAction.equalsIgnoreCase("1")){
                    int playerAttack = random.nextInt(20);
                    int enemyAttack = random.nextInt(20);
                    enemyHealth -= playerAttack;
                    System.out.println(userName + " uses attack!");

                    if(playerAttack > 15){
                        System.out.println("CRITICAL HIT!");
                    }
                    System.out.println("you did " + playerAttack + " damage to Pikachu");
                    System.out.println("Pikachu attacks");
                    playerHealth-= enemyAttack;
                    System.out.println("Pikachu did " + enemyAttack + " damage");


                } else if(playerAction.equalsIgnoreCase("use potion") || playerAction.equalsIgnoreCase("2")) {

                    if(playerPotionCount == 0) {
                        System.out.println("You don't have any potions left, learn to count");
                    } else {
                        playerHealth += 10;
                        System.out.println("Your health increased to " + playerHealth);
                        System.out.println(" ");
                        playerPotionCount -= 1;
                        System.out.println("You have " + playerPotionCount + " potions left");


                    } //If

                    int enemyAttack = random.nextInt(20);
                    System.out.println("Pikachu attacks");
                    playerHealth-= enemyAttack;
                    System.out.println("Pikachu did " + enemyAttack + " damage \n");
                } //If
            } //Outer If
            System.out.println("Press Enter to continue");
            sc.nextLine();


        } //While
    } //Main()

    public static String displayStats(int playerHealth, int enemyHealth, int potionCount){
        return "============================ \n" +
                " YOUR STATS \n " +
                "Health: " + playerHealth + "\n Potions: " + potionCount + "\n ----------------- \n"
                + " ENEMY STATS \n" +
                " health: " + enemyHealth;

    } //displayStats()

}//Adventure class
