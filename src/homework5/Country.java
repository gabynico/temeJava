package homework5;

/**
 * Created by ns on 2/6/2016.
 */
//[ZP] country should be Comparable
public class Country {
    String nameContry;
    String capital;

    public Country(String nameContry, String capital) {
        this.nameContry = nameContry;
        this.capital = capital;
    }

    public String getNameContry() {
        return nameContry;
    }


    public String getCapital() {
        return capital;
    }


}
