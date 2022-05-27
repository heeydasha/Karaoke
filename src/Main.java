import java.util.ArrayList;

public class Main {

    public static void main(String[] argv) {
        Musician miles = new TrumpetPlayer("Miles Davis", "USA", "jazz", "1950s", "brass");
        Musician curtis = new Vocalist("Curtis Mayfield", "USA", "soul", "1970s", "Muddy Waters");
        Musician gary = new Guitarist("Gary Clark Jr", "USA", "blues", "2010s", 6);
        Musician homeTeam = new Vocalist("The Home Team", "USA", "Rock", "2020s", "Panic!");
        Musician fallOut = new Vocalist("Fall Out Boy", "USA", "rock", "2000s", "Panic!");

        ArrayList<Song> library = new ArrayList<Song>(); // Create our library
       /*
       We use an Array List to because we are adding to the library, and List allows size changes.
       */
// Add some songs! Add 4-5 to keep it simple.
// But… see anything that upsets your OO sensibilities?
        Song s = new Song("People Get Ready", curtis, " Relaxing",
                " https://www.youtube.com/watch?v=VOXmaSCt4ZE");
        Song a = new Song("Right Through Me", homeTeam, " Rock",
                " https://youtu.be/uXdxA3E8vac");
        Song d = new Song("XO", fallOut, " Rock",
                " https://youtu.be/CJnnNZWB2Xw");
        Song f = new Song("BOOP", gary, " Unknown",
                " https://youtu.be/CJnnNZWB2Xw");

        library.add(s);
        library.add(a);
        library.add(d);
        library.add(f);

// Using a loop, display all your Songs

        displayLibrary(library);
    }

    /*
    Created a method that contains a for loop that displays all the songs in the library.
     */
    public static void displayLibrary(ArrayList<Song> library) { //put the array in the parameters so for loop knows about "library" variable
        for (int i = 0; i < library.size(); i++) { //loop will continue until it reaches the end of the library
            Song music = library.get(i); //get receives the library information, and stores it to "music"
            music.showSong(); //

        }
    }
}

