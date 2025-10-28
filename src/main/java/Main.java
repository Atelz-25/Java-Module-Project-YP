import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Auto> autoList = new ArrayList<>();

        int minSpeed = 0;
        int maxSpeed = 250;

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название машины " + (i + 1));
            String autoName = scanner.next();
            int autoSpeed = -1;

            while (true) {
                System.out.println("Введите скорость машины " + (i + 1));
                if (scanner.hasNextInt()) {
                    autoSpeed = scanner.nextInt();
                } else {
                    scanner.next();
                }
                if (autoSpeed > minSpeed & autoSpeed <= maxSpeed)
                    break;
                System.out.println("Неправильная скорость");
            }
            autoList.add(new Auto(autoName, autoSpeed));
        }

        System.out.println("Победил " + Race.winDetector(autoList.get(0), autoList.get(1), autoList.get(2)));
    }
}