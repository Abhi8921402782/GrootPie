final class GrootPie {
    private final int sweet;
    private final int bland;

    public GrootPie(int sweet, int bland) {
        this.sweet = sweet;
        this.bland = bland;
    }

    public int getSweet() {
        return sweet;
    }

    public int getBland() {
        return bland;
    }
}
public static GrootPie something() {
    int number1 = 1;
    int number2 = 2;

    return new GrootPie(number1, number2);
}

public static void main(String[] args) {
    GrootPie result = something();
    System.out.println(result.getSweet() + result.getBland());
}
