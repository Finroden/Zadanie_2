// Mammal.java
public class Mammal extends Animal {
    private String furType;

    // Konstruktor domyślny
    public Mammal() {
        super();
        this.furType = "Unknown";
    }

    // Konstruktor z parametrami
    public Mammal(String name, int age, double weight, String furType) {
        super(name, age, weight);
        this.furType = furType;
    }

    // Konstruktor z częściowymi parametrami
    public Mammal(String name, String furType) {
        super(name);
        this.furType = furType;
    }

    // Nadpisana metoda getVoice
    @Override
    public String getVoice() {
        return "Mammal makes a sound.";
    }

    @Override
    public String toString() {
        return super.toString() + ", Fur Type: " + furType;
    }

    // Gettery i Settery
    public String getFurType() {
        return furType;
    }

    public void setFurType(String furType) {
        this.furType = furType;
    }

    // Dodatkowa metoda
    public void nurse() {
        System.out.println(name + " is nursing.");
    }
}
