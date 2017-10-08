public enum Direction {
    NORTH("Pólnoc", 0),
    SOUTH("Południe", 1),
    WEST("Zachód", 2),
    EAST("Wschód", 3),
    UNDEFINED("Niezdefiniowany", 5);

    private final String description;
    private final int number;

    public String getDescription() {
        return description;
    }

    public int getNumber() {
        return number;
    }

    Direction(String description, int number) {
        this.description = description;
        this.number = number;

    }

    public void convert(int number) {
        if (number == NORTH.getNumber()) {
            System.out.println(NORTH.getDescription());
        }
        if (number == EAST.getNumber()) {
            System.out.println(EAST.getDescription());
        }
        if (number == SOUTH.getNumber()) {
            System.out.println(SOUTH.getDescription());
        }
        if (number == WEST.getNumber()) {
            System.out.println(WEST.getDescription());
        }
        if (number < 0 || number > 4) {
            System.out.println(Direction.UNDEFINED.getDescription());
        }
    }
}
