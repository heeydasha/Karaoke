
public class Musician {
    private String name;
    private String country;
    private String style;
    private String timePeriod;

    public Musician (String name, String country,String style,String timePeriod) {

        this.name = name;
        this.country = country;
        this.style = style;
        this.timePeriod = timePeriod;

    }
    public String showMusician() {

        return  name + " " + country + " " + style + " " + timePeriod;
    }

}
