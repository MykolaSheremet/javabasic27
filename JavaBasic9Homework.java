/**
 * Java Basic, Homework #9
 *
 * @author Mykola Sheremet
 * @todo 05.10.2022
 * @done 14.10.2022
 */
public class JavaBasic9Homework {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "red",2);
        Dog dog = new Dog("Polkan", "black", 5);
        IAnimal[] animals = {cat, dog};

        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.voice());
        }
    }
}
