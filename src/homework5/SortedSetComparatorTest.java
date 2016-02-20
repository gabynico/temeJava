package homework5;

import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by ns on 2/6/2016.
 */
//[ZP] i don't see the comparator
//[ZP] where is the binarySearch
//[ZP] 0
public class SortedSetComparatorTest {

    public static void main(String[] args) {
        // Create a sorted set sorted by Name
        SortedSet<Country> countrysByName;
        countrysByName = new TreeSet<>(Comparator.comparing(Country::getNameContry));

        // Add soem countrys to the set
        countrysByName.add(new Country("Name2", "CapitalAdam"));
        countrysByName.add(new Country("Name3", "CapitalEve"));
        countrysByName.add(new Country("Name1", "CapitalJohn"));
        countrysByName.add(new Country("Name4", "CapitalDonna"));
        countrysByName.add(new Country("Name4", "CapitalDonna")); // A duplicate Country
        // Print the set
        System.out.println("Countrys by Name:");
        //countrysByName.forEach(System.out::println);
        for( Country s : countrysByName){
            System.out.println(s.getNameContry());
        }


        // Create a sorted set sorted by capital
        SortedSet<Country> countrysByCapital;
        countrysByCapital = new TreeSet<>(Comparator.comparing(Country::getCapital));

        countrysByCapital.add(new Country("Name1", "CapitalJohn"));
        countrysByCapital.add(new Country("Name2", "CapitalAdam"));
        countrysByCapital.add(new Country("Name3", "CapitalEve"));
        countrysByCapital.add(new Country("Name4", "CapitalDonna"));
        countrysByCapital.add(new Country("Name4", "CapitalKip")); // Not a duplicate country
        System.out.println("Countrys by Capital: ");
        //countrysByCapital.forEach(System.out::println);
        for( Country s : countrysByCapital){
            System.out.println(s.getCapital());
        }
    }
}
