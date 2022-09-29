/**
 * Java Basic, Home Work #8
 *
 * @author Mykola Sheremet
 * @todo 28.09.2022
 * @done 30.09.2022
 */
public class JavaBasic8HomeWork {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "red", 2, 1);
        System.out.println(cat);
        System.out.println("Try to play: " + cat.play());
        cat.feed();
        System.out.println("Try to play: " + cat.play());
        System.out.println("Try to play: " + cat.play());
        cat.feed();
        System.out.println("Try to jump: " + cat.jump(1));
        cat.feed();
        System.out.println("Try to jump: " + cat.jump(2));
    }
}
