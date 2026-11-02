public class Main2 {
    public static void main(String[] args) {

        int[] data = {3, 5, 1, 4, 2};


        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}