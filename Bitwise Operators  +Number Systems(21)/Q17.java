import java.util.Arrays;

public class Q17 {
    static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;

            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0},
        };
        flipAndInvertImage(image);
        for(int row[]:image){
            System.out.println(Arrays.toString(row));
        }
    }
}
