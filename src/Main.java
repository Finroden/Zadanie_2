// Main.java
public class Main {
    public static void main(String[] args) {
        // Tworzymy tablicę obiektów Animal
        Animal[] animals = new Animal[6];

        // Tworzymy obiekty różnych klas
        animals[0] = new Mammal("Lion", 5, 200.0, "Short");
        animals[1] = new Mammal("Elephant", 10, 6000.0, "Rough");
        animals[2] = new Fish("Goldfish", 2, 0.5, "Freshwater");
        animals[3] = new Fish("Shark", 7, 2000.0, "Saltwater");
        animals[4] = new Bird("Parrot", 3, 1.0, "Green");
        animals[5] = new Bird("Eagle", 5, 4.0, "Brown");

        // Wywołujemy metody dla różnych obiektów
        for (Animal animal : animals) {
            System.out.println(animal.toString());
            System.out.println(animal.getVoice());
            animal.eat();
            System.out.println();

            // Sprawdzamy, jakie metody są dostępne w obiektach
            if (animal instanceof Mammal) {
                ((Mammal) animal).nurse();
            } else if (animal instanceof Fish) {
                ((Fish) animal).swim();
            } else if (animal instanceof Bird) {
                ((Bird) animal).fly();
            }
            System.out.println("-----------------------------");
        }
    }
}
