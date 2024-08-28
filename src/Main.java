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
        BaseConverter selsiy=new BaseConverter(32,"C");
        System.out.println("Selsiy: "+selsiy.getTemperature());
        System.out.println("Fahrenheit: "+selsiy.convertToFahrenheit());
        System.out.println("Kelvin: "+selsiy.convertToKelvin());

        BaseConverter kel= new BaseConverter(1,"K");
        System.out.println("Kelvin: "+kel.getTemperature());
        System.out.println("Fahrenheit: "+kel.convertToFahrenheit());
        System.out.println("Celsius: "+kel.convertToCelsius());
        System.out.println("Kelvin: "+kel.convertToKelvin());

    }
}