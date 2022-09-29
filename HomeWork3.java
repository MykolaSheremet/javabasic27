/**
 *Java Basic, Home Work #3
 *
 * @author Mykola Sheremet
 * @todo 12.9.2022
 * @date 30.9.2022
 */
class HomeWork3 {
    public static void main(String[] args) {
        //task 1
        int[] array = {32, 65, 42, 33, 0, -3};
        printArray(array);

        //task 2
        int max = getMax(array);
        System.out.println("Max = " + max);

        //task 3
        int[] invArray = {1, 0, 0, 1, 1, 0, 1, 0, 0};
        printArray(invArray);
        printArray(invertArray(invArray));
    }

    static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) { //i++ <-> i = i + 1
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.println(", ");
            }
        }
        System.out.println("]");
    }

    static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static int[] invertArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            result[i] = 1 - array[i];
        }
        return result;
    }
}
