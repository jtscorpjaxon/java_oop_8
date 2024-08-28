public class FootballPlayer extends Player {
    int countOfRedCard;
    int countOfYellowCard;
    int countOfGoals;

    public FootballPlayer(String nameOfPlayer, String teamName, int numberPosition,  int countOfRedCard, int countOfYellowCard, int countOfGoals) {
        super(nameOfPlayer, teamName, numberPosition, "Futbol");
        this.countOfRedCard = countOfRedCard;
        this.countOfYellowCard = countOfYellowCard;
        this.countOfGoals = countOfGoals;
    }

    @Override
    public void getInfo() {
        System.out.println("Player name:" + nameOfPlayer);
        System.out.println("Team:" + teamName);
        System.out.println("Position:" + numberPosition);
        System.out.println("Sport:" + sportType);
        System.out.println("Red cards:" + countOfRedCard);
        System.out.println("Yellow cards:" + countOfYellowCard);
        System.out.println("Goals:" + countOfGoals);
    }


}
