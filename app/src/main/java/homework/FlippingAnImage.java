package homework;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int size = image.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size / 2; j++) {
                int start = image[i][j];
                image[i][j] = image[i][size - j - 1];
                image[i][size - j - 1] = start;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <size; j++) {
                image[i][j] = (image[i][j] + 1) % 2;
            }
        }
        return image;
    }
}
