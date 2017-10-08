public class ShowDirection {
    public static void showDirection(Direction direction) {

        switch (direction) {
            case NORTH:
                System.out.println("Jedziemy na północ!");
                break;
            case WEST:
                System.out.println("Jedziemy na zachód!");
                break;
            case EAST:
                System.out.println("Jedziemy na wschód");
                break;
            case SOUTH:
                System.out.println("Jedziemy na południe");
        }

    }
}
