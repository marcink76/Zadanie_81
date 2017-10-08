import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Direction direction;
        System.out.println("Podaj kierunek: ");
        try {
            direction = Direction.valueOf(scanner.nextLine());
            ShowDirection.showDirection(direction);
        } catch (IllegalArgumentException e) {
            System.out.println("Uruchom program ponownie i napisz jeszcze raz");
        }
    }
}
