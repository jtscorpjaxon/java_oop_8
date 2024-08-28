public class Setter extends VolleyballPlayer {
    int countOfSets;

    public Setter(String nameOfPlayer, String teamName, int numberPosition, int numberOfPoints, int countOfSets) {
        super(nameOfPlayer, teamName, numberPosition, numberOfPoints);
        this.countOfSets = countOfSets;
    }

    public int getCountOfSets() {
        return countOfSets;
    }

    public void setCountOfSets(int countOfSets) {
        this.countOfSets = countOfSets;
    }

    public void printInfo() {
        getInfo();
        System.out.println("Count of sets: " + countOfSets);
    }
}
