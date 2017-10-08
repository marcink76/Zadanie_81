public enum Direction {
    NORTH("Pólnoc", 1),
    SOUTH("Południe", 2),
    WEST("Zachód", 3),
    EAST("Wschód", 4);

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
}
