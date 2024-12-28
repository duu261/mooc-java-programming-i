public class Match {
    String homeTeam, visitTeam;
    int homeScore, visitScore;

    public Match(String homeTeam, String visitTeam, int homeScore, int visitScore) {
        this.homeTeam = homeTeam;
        this.visitTeam = visitTeam;
        this.homeScore = homeScore;
        this.visitScore = visitScore;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getVisitTeam() {
        return visitTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getVisitScore() {
        return visitScore;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public void setVisitTeam(String visitTeam) {
        this.visitTeam = visitTeam;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public void setVisitScore(int visitScore) {
        this.visitScore = visitScore;
    }

    public boolean getTeam(String team) {
        if (this.getHomeTeam().equals(team) || this.getVisitTeam().equals(team)) {
            return true;
        }
        return false;
    }

    public boolean getTeamWins(String team) {
        if (this.homeTeam.equals(team)) {
            return this.homeScore > this.visitScore;
        } else if (this.visitTeam.equals(team)) {
            return this.visitScore > this.homeScore;
        } else {
            return false;
        }
    }
}
