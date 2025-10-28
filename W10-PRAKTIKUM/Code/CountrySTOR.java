import java.util.*;

public class CountrySTOR {
    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<String>();

        countries.add("Indonesia");
        countries.add("Malaysia");
        countries.add("Singapore");
        countries.add("Thailand");
        countries.add("Indonesia"); //duplicate, will not be added
        countries.add("Vietnam");

        System.out.println(countries);
        
        System.out.println("Total countries: " + countries.size());
    }
}
