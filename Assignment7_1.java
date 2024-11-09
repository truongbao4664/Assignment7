import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong nguoi: ");
        int x = sc.nextInt();
        // khi dang nhap kieu so nguyen phai chuyen qua kieu ki tu sc.nextline();
        sc.nextLine();
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            System.out.println("Nhap ten cua ban thu " + (i + 1));
            String name = sc.nextLine();
            names.add(name);
        }
        System.out.println("Ten cua "+x+" ban la" + Arrays.toString(names.toArray()));

    }
}
