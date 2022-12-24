import java.util.Arrays;

public class Homeworck {
    private int number;
    private String word;
    private int[] array;

    public Homeworck(int number, String word, int[] array) {
        this.number = number;
        this.word = word;
        this.array = array;
    }

    @Override
    public String toString() {
        return "Homeworck{" +
                "number=" + number +
                ", word='" + word + '\'' +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
