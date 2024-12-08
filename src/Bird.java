// Bird.java
public class Bird extends Animal {
    private String featherColor;

    // Konstruktor domyślny
    public Bird() {
        super();
        this.featherColor = "Unknown";
    }

    // Konstruktor z parametrami
    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    // Konstruktor z częściowymi parametrami
    public Bird(String name, String featherColor) {
        super(name);
        this.featherColor = featherColor;
    }

    // Nadpisana metoda getVoice
    @Override
    public String getVoice() {
        return "Bird makes a chirping sound.";
    }

    @Override
    public String toString() {
        return super.toString() + ", Feather Color: " + featherColor;
    }

    // Gettery i Settery
    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    // Dodatkowa metoda
    public void fly() {
        System.out.println(name + " is flying.");
    }
}

