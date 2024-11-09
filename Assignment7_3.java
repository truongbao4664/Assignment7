import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> tp = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            System.out.println("Nhap ten thanh pho thu "+(i+1));
            String tx = sc.nextLine();
            tp.add(tx);
        }
        System.out.println(Arrays.toString(tp.toArray()));

    }
}
