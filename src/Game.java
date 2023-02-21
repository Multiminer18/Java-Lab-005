import javax.security.auth.callback.NameCallback;
import java.util.Scanner;

public class Game {
    public class Player{
        private String name;
        private int score;

        static void getName(Player) {

        }

        void getScore(score){

        }

        static void toss(){

        }
    }
    public class Dice {

        private int sideFacingUp;
        private int sides;
        private Random randomGenerator;



        // Constructor
        public Dice(int sides) {
            this.sides = sides;  // this is a keyword for "this" object that's being created.
        }

    }
    public static void main(String[] args) {
        //Method nextPlayer needs to use conditions to check the current Player parameter, and switch to the other Player (i.e. Either instance variable this.p1 or this.p2).
         void nextPlayer(){

        }
    }
//Method play needs to declare a local Player variable named current that gets assigned this.p1 and calls methods takeTurn, nextPlayer, and takeTurn again before printing method announceWinner
        static void play(){

            this.p1(takeTurn+ nextPlayer+ takeTurn)
        }

    Dice d1 = new Dice(6);
    Dice d2 = new Dice(20);

    Player p1;
    Player p2;
    Dice die;

    public void play() {
    }

    public Player nextPlayer(Player current) {
    }

    public void takeTurn(Player player) {
        player.toss(this.die);
    }

    public String announceWinner() {
    }

    public static void main(String[] args) {
    }
}
