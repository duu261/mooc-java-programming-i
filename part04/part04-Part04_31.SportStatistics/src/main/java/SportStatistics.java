
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // NOTE: this is second version after i see the solution
        // really sleepy when first try this..

        System.out.println("File: ");
        String file = scan.nextLine();
        ArrayList<Match> matches = getMatches(file);

        System.out.println("Team: ");
        String team = scan.nextLine();
        scan.close();
        int count = 0, wins = 0;
        ArrayList<Match> teamMatches = new ArrayList<>();
        for (Match match : matches) {
            if (match.getTeam(team)) {
                teamMatches.add(match);
                count++;
            }
        }

        for (Match teamMatch : teamMatches) {
            if (teamMatch.getTeamWins(team)) {
                wins++;
            }
        }

        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (count - wins));
    }

    public static ArrayList<Match> getMatches(String file) {
        ArrayList<Match> matches = new ArrayList<>();
        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                String[] split = fileScan.nextLine().split(",");
                String homeTeam = split[0];
                String visitTeam = split[1];
                int homeScore = Integer.parseInt(split[2]);
                int visitScore = Integer.parseInt(split[3]);
                matches.add(new Match(homeTeam, visitTeam, homeScore, visitScore));

            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        return matches;
    }

}
