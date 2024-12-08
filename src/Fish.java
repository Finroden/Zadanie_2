// Fish.java
public class Fish extends Animal {
    private String waterType;

    // Konstruktor domyślny
    public Fish() {
        super();
        this.waterType = "Freshwater";
    }

    // Konstruktor z parametrami
    public Fish(String name, int age, double weight, String waterType) {
        super(name, age, weight);
        this.waterType = waterType;
    }

    // Konstruktor z częściowymi parametrami
    public Fish(String name, String waterType) {
        super(name);
        this.waterType = waterType;
    }

    // Nadpisana metoda getVoice
    @Override
    public String getVoice() {
        return "Fish makes a bubbling sound.";
    }

    @Override
    public String toString() {
        return super.toString() + ", Water Type: " + waterType;
    }

    // Gettery i Settery
    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    // Dodatkowa metoda
    public void swim() {
        System.out.println(name + " is swimming.");
    }
}
