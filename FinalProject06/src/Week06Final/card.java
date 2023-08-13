package Week06Final;

public class card {
    private int value;
    private String name;

    public card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public void describe() {
        System.out.println(name);
    }
}
