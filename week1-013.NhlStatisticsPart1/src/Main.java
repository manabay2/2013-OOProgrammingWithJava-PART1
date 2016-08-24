
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
            System.out.println("Top ten by goals");            
            NHLStatistics.sortByGoals();
            NHLStatistics.top(10);
            System.out.println("");
            
            System.out.println("Top 25 by penalty amounts");
            NHLStatistics.sortByPenalties();
            NHLStatistics.top(25);
            System.out.println("");
            
            System.out.println("For Sidney Crosby");
            NHLStatistics.searchByPlayer("Sidney Crosby");
            System.out.println("");
            
            System.out.println("For Philadelphia Flyers");
            NHLStatistics.teamStatistics("PHI");
            System.out.println("");
            
            System.out.println("For Anaheim Ducks");
            NHLStatistics.sortByPoints();
            NHLStatistics.teamStatistics("ANA");
            //System.out.println("");
            
    }
}
