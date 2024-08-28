//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FootballPlayer player = new FootballPlayer("Kamron", "Humo", 1, 0, 3, 1);
        player.getInfo();
        BasketballPlayer player1 = new BasketballPlayer("Erkin", "Olmaliq", 1, 10);
        player1.getInfo();
        VolleyballPlayer player2 = new VolleyballPlayer("Sardor", "Toshkent", 1,  10);
        player2.getInfo();
    }
}