/**
 * Java Basic, Home Work 1
 *
 * @author Mykola Sheremet
 * @todo 5.9.2022
 * @date 14.09.2022
 */
class HomeWork1a {
    public static void main(String[] args) {
        //task 1
        int a = 15;
        int b = 8;
        int p = (a + b) * 2;
        int r = a * b;
        System.out.println("Perimeter = " + p);
        System.out.println("Area = " + r);

        //task 2
        a = 5;
        b = 3;
        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d - %d = %d\n", a, b, a * b);
        System.out.printf("%d - %d = %f\n", a, b, (float)a / b);

        //task 3
        int[] array = {7, 3, 2, 5, 1};
        System.out.printf("[%d, %d, %d, %d]\n", array[0], array[1], array[2], array[3], array[4]);
    }
}