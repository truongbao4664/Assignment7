import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment7_2 {
    public static void main(String[] args) {
        ArrayList<Integer> muoi = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        muoi.remove(4);
        System.out.println(Arrays.toString(muoi.toArray()));
    }
}
