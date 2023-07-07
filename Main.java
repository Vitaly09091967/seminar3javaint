import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Pharmacy> result = new HashSet<>();
        Pharmacy pharmacy1 = new Pharmacy("Medicine A", 100);
        Pharmacy pharmacy2 = new Pharmacy("Medicine B", 200);
        Pharmacy pharmacy3 = new Pharmacy("Medicine A", 100);
        Pharmacy pharmacy4 = new Pharmacy("Medicine C", 150);
        Pharmacy pharmacy5 = new Pharmacy("Medicine A", 100);

        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);
        result.add(pharmacy4);
        result.add(pharmacy5);

        System.out.println(result.size()); // Output: 3
    }
}
