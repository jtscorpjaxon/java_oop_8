public class BasketballPlayer extends Player{
    int countOfGoals;

    public BasketballPlayer(String nameOfPlayer, String teamName, int numberPosition,  int countOfGoals) {
        super(nameOfPlayer, teamName, numberPosition,"Basketbol");

        this.countOfGoals = countOfGoals;
    }
    public int getCountOfGoals() {
        return countOfGoals;
    }

    public void setCountOfGoals(int countOfGoals) {
        this.countOfGoals = countOfGoals;
    }

}
