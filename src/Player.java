abstract public class Player implements Information{
    String nameOfPlayer;
    String sportType;
    int numberPosition;
    String teamName;

    public Player(String nameOfPlayer, String teamName, int numberPosition, String sportType) {
        this.nameOfPlayer = nameOfPlayer;
        this.teamName = teamName;
        this.numberPosition = numberPosition;
        this.sportType = sportType;
    }

    @Override
    public void getInfo() {
        System.out.println("Player name:" + nameOfPlayer);
        System.out.println("Team:" + teamName);
        System.out.println("Position:" + numberPosition);
        System.out.println("Sport:" + sportType);
    }
    @Override
    public String getTeamName() {
        return teamName;
    }

}
