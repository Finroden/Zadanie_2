// Animal.java
public class Animal {
    protected String name;
    protected int age;
    protected double weight;

    // Konstruktor domyślny
    public Animal() {
        this.name = "Unknown";
        this.age = 0;
        this.weight = 0.0;
    }

    // Konstruktor z parametrami
    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Konstruktor z częściowymi parametrami
    public Animal(String name) {
        this.name = name;
        this.age = 0;
        this.weight = 0.0;
    }

    // Metody
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public String getVoice() {
        return "Animal makes a sound.";
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight;
    }

    // Gettery i Settery
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
