public class VolleyballPlayer extends Player{
    int numberOfPoints;

    public VolleyballPlayer(String nameOfPlayer, String teamName, int numberPosition,  int numberOfPoints) {
        super(nameOfPlayer, teamName, numberPosition, "Voleybol");
        this.numberOfPoints= numberOfPoints;
    }

    @Override
    public void getInfo() {
        System.out.println("Player name:" + nameOfPlayer);
        System.out.println("Team:" + teamName);
        System.out.println("Position:" + numberPosition);
        System.out.println("Sport:" + sportType);
        System.out.println("Number of points:" + numberOfPoints);
    }
    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }
    public int getNumberOfPoints() {
        return numberOfPoints;
    }
}
