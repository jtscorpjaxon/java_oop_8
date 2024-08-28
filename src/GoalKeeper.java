public class GoalKeeper extends FootballPlayer {
    int countOfSaves;

    public GoalKeeper(String nameOfPlayer, String teamName, int numberPosition, int countOfRedCard, int countOfYellowCard, int countOfGoals,int CountOfSaves) {
        super(nameOfPlayer, teamName, numberPosition, countOfRedCard, countOfYellowCard, countOfGoals);
        this.countOfSaves = CountOfSaves;
    }

    //getter and setter
    public int getCountOfSaves() {
        return countOfSaves;
    }

    public void setCountOfSaves(int countOfSaves) {
        this.countOfSaves = countOfSaves;
    }
}
