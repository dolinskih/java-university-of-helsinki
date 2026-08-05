
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println("Smallest: " + MainProgram.smallest(array));
    }

    public static int smallest(int[] array) {
        if (array.length > 0) {
            int smallest = array[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i] < smallest) {
                    smallest = array[i];
                }
            }

            return smallest;
        }

        return -1;
    }

    public static int indexOfSmallest(int[] array) {
        if (array.length > 0) {
            int indexOfSmallest = 0;

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[indexOfSmallest]) {
                    indexOfSmallest = i;
                }
            }

            return indexOfSmallest;
        }

        return -1;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        if (table.length > 0) {
            int indexOfSmallest = startIndex;

            for (int i = startIndex + 1; i < table.length; i++) {
                if (table[i] < table[indexOfSmallest]) {
                    indexOfSmallest = i;
                }
            }

            return indexOfSmallest;
        }

        return -1;
    }

    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }

    public static void sort(int[] array) {
        System.out.println(array);

        for (int i = 0; i < array.length; i++) {
            int indexOfSmallestFrom = indexOfSmallestFrom(array, i);
            swap(array, i, indexOfSmallestFrom);
            System.out.println(array);
        }
    }
}
