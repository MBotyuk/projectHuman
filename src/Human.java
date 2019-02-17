
public class Human {
    private String name;
    private int married = -1;
    private int number;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMarried() {
        return married;
    }

    public void setMarried(int married) {
        this.married = married;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
