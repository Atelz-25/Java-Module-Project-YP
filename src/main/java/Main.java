import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Auto> autoList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название машины " + (i + 1));
            String autoName = scanner.next();
            int autoSpeed = -1;
            while (true) {
                System.out.println("Введите скорость машины " + (i + 1));
                if (scanner.hasNextInt()) {
                    autoSpeed = scanner.nextInt();
                } else {
                    scanner.next(); // Clear the invalid input
                }
                if (autoSpeed > 0 & autoSpeed <= 250)
                    break;
                System.out.println("Неправильная скорость");
            }
            autoList.add(new Auto(autoName, autoSpeed));
        }
        System.out.println("Победил " + Race.winDetector(autoList.get(0), autoList.get(1), autoList.get(2)));

    }

    static class Auto {
        String name;
        int speed;

        Auto(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }
    }

    static class Race {
        static Auto winner;

        public static String winDetector(Auto car1, Auto car2, Auto car3) {
            winner = (car1.speed * 24 > car2.speed * 24 ? (car1.speed * 24 > car3.speed * 24 ? car1 : car3) : (car2.speed * 24 > car3.speed * 24 ? car2 : car3));
            return winner.name;
        }
    }
}