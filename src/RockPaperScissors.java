import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain;

        do {
            String playerA = getMove(scanner, "Player A");
            String playerB = getMove(scanner, "Player B");

            System.out.println("Player A: " + playerA + " | Player B: " + playerB);
            determineWinner(playerA, playerB);

            do {
                System.out.print("Play again? (Y/N): ");
                playAgain = scanner.nextLine().trim().toLowerCase();
            } while (!playAgain.equals("y") && !playAgain.equals("n"));

        } while (playAgain.equals("y"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    public static String getMove(Scanner scanner, String player) {
        String move;
        do {
            System.out.print(player + " (rock/paper/scissors): ");
            move = scanner.nextLine().trim().toLowerCase();
        } while (!move.equals("rock") && !move.equals("paper") && !move.equals("scissors"));
        return move;
    }

    public static void determineWinner(String a, String b) {
        if (a.equals(b)) {
            System.out.println("It's a tie!");
        } else if ((a.equals("rock") && b.equals("scissors")) || (a.equals("paper") && b.equals("rock")) || (a.equals("scissors") && b.equals("paper"))) {
            System.out.println("Player A wins!");
        } else {
            System.out.println("Player B wins!");
        }
    }
}

