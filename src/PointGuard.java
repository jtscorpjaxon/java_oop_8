public class PointGuard extends BasketballPlayer{
    int countOfGuard;

    public PointGuard(String nameOfPlayer, String teamName, int numberPosition, String sportType, int countOfGoals, int countOfGuard) {
        super(nameOfPlayer, teamName, numberPosition,  countOfGoals);
        this.countOfGuard = countOfGuard;
    }

    public void printInfo() {
        getInfo();
        System.out.println("Count of guard: " + countOfGuard);
    }
}
