public class Main {
    public static void main(String[] args) {

        String firstTeamName = "Cola";


        int firstTeam1 = 5;
        int firstTeam2 = 2;
        int firstTeam3 = 0;
        int firstTeam4 = 1;
        int firstTeam5 = 3;
        int firstTeamFrag = (firstTeam1 + firstTeam2 + firstTeam3 + firstTeam4 + firstTeam5) / 5;
        String secondTeamName = "Pepsi";
        int secondTeam1 = 3;
        int secondTeam2 = 2;
        int secondTeam3 = 0;
        int secondTeam4 = 6;
        int secondTeam5 = 2;
        int secondTeamFrag = (secondTeam1 + secondTeam2 + secondTeam3 + secondTeam4 + secondTeam5) / 5;
        if (firstTeamFrag > secondTeamFrag) {
            System.out.println("Перемогла команда " + " " + firstTeamName + " " + "набрала" + " " + firstTeamFrag + " " + "очків" );
        } else {
            System.out.println("Перемогла команда " + " " + secondTeamName + " " + "набрала" + " " + secondTeamFrag + " " + "очків" );

        }
    }
}