import java.util.HashSet;
import java.util.Set;

public class Pharmacy implements Comparable<Pharmacy> {
    private String name;
    private int power;

    public Pharmacy(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pharmacy pharmacy = (Pharmacy) obj;
        return power == pharmacy.power && name.equals(pharmacy.name);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + power;
    }

    @Override
    public int compareTo(Pharmacy other) {
        if (power == other.power) {
            return name.compareTo(other.name);
        }
        return Integer.compare(power, other.power);
    }

   
}