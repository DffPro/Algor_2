import java.util.Arrays;

public class Main {


    public static int countCommonElements(int[] arr1, int[] arr2) {
        int count = 0;
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                count++;
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array1 = {5, 8, 12};
        int[] array2 = {2, 8, 12, 16};

        int result = countCommonElements(array1, array2);

        System.out.println("Массив 1: " + Arrays.toString(array1));
        System.out.println("Массив 2: " + Arrays.toString(array2));
        System.out.println("Количество общих элементов: " + result);
    }
}