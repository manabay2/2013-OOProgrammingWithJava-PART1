
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class NhlStatisticsPart2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");

        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                // Print the top ten players sorted by points.
                NHLStatistics.sortByPoints();
                NHLStatistics.top(10);
            } else if (command.equals("goals")) {
                // Print the top ten players sorted by goals.
                NHLStatistics.sortByGoals();
                NHLStatistics.top(10);
            } else if (command.equals("assists")) {
                NHLStatistics.sortByAssists();
                NHLStatistics.top(10);
                //  Print the top ten players sorted by assists.
            } else if (command.equals("penalties")) {
                NHLStatistics.sortByPenalties();
                NHLStatistics.top(10);
                //  Print the top ten players sorted by penalties.
            } else if (command.equals("player")) {
                System.out.println("Which player?");
                NHLStatistics.searchByPlayer(reader.nextLine());
                // Ask the user first which player's statistics are needed and then print them.
            } else if (command.equals("club")) {
                NHLStatistics.sortByPoints();
                System.out.println("Which club?");
                NHLStatistics.teamStatistics(reader.nextLine());
                // Ask the user first which club's statistics are needed and then print them.
                // Note: When printing statistics they should be ordered by points (so the players with the most points come first).
            }

        }
    }
}