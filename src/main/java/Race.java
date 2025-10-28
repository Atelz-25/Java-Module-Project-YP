public class Race {
    static Auto winner;

    public static String winDetector(Auto car1, Auto car2, Auto car3) {
        winner = (car1.speed * 24 > car2.speed * 24 ?
                (car1.speed * 24 > car3.speed * 24 ? car1 : car3) :
                (car2.speed * 24 > car3.speed * 24 ? car2 : car3));
        return winner.name;
    }
}