import java.util.Scanner;

public class FightimalsGame {

    public int playerAnimalChoice;
    public boolean playerChoiceNotObtained = true;

    public void startGame(){
        System.out.println("!!!!!!! Welcome to FIGHTIMALS !!!!!!!");
        do {
            getPlayerChoice();
            switch (this.playerAnimalChoice) {
                case 1:
                    System.out.println("You choose Lion.");
                    playerChoiceNotObtained=false;
                    break;
                case 2:
                    System.out.println("You choose Hippo.");
                    playerChoiceNotObtained=false;
                    break;
                case 3:
                    System.out.println("You choose Hyena.");
                    playerChoiceNotObtained=false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again");
            }
        }while(playerChoiceNotObtained);
        return;
    }

    public void getPlayerChoice(){
        System.out.println("VVVVV");
        System.out.println("1.Lion");
        System.out.println("2.Hippo");
        System.out.println("3.Hyena");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Player choose your Animal:");
        this.playerAnimalChoice = keyboard.nextInt();

    }

    //public static void main(String[] args) {

    //    fightimalsGame game = new fightimalsGame();

    //}

}
