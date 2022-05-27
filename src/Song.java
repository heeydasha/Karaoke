
    public class Song {
        private String title;	// what type of accessor should we use?
        private Musician musician;
        private String playlist;	// or genre
        private String url; // Youtube url

        public Song(String title, Musician musician, String playlist, String url) {
            this.title = title;
            this.musician = musician;
            this.playlist = playlist;
            this.url = url;
        }

        public void showSong (){

                System.out.println( title + musician.showMusician() + playlist + url);

    }



    }
