import java.util.ArrayList;

public class Assignment7_4 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("Java");
        a.add("Python");
        a.add("C++");
        a.add("JavaScript");
        if (a.contains("Python")) {
            System.out.println("Python is in the list.");
        } else {
            System.out.println("Python is not in the list.");
        }
    }
}
