public class Vocalist extends Musician {
// used extends to connect to each class, this is how everything came together This also helped prefilled constructors.
    //All have same properties expect last variables.
    String influencedBy;

    public Vocalist(String name, String country, String style, String timePeriod, String influencedBy) {
        super(name, country, style, timePeriod);
        this.influencedBy = influencedBy;
    }
}
