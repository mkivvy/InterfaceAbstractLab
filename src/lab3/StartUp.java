package lab3;

/**
 * This project was very time-consuming and brain-tiring.  Mostly, I have felt
 * like I don't know what I am doing so I am sure a lot of improvements can be made.
 * The first would be to have this as a stand-alone assignment, not grouped in with
 * finishing a time-consuming lab plus reading.  I don't feel I am able to do my
 * best because I just can't think any more.  I don't know if I chose a good 
 * topic as my project mostly consists of getters & setters.  I know I could use
 * some validation, too.  But maybe this topic doesn't make as much sense in an
 * abstract/interface hierarchical world without more distinctive behaviors?  I
 * don't know.  I just feel very lost, confused, and worn-out by the end of this
 * so I have no idea if I have a handle on anything it was supposed to teach us.
 * @author Mary
 */
public class StartUp {
    public static void main(String[] args) {
        MusicalPiece[] myLibrary = new MusicalPiece[4];
        
        ClassicalSolo solo = new ClassicalSolo("Chopin", "Romantic", "Joshua Bell", 
                "violin", " ", "Le Mystère Stradivarius", "Classical", "iTunes", 
                "Nocturne", "Classical");
        myLibrary[0] = solo;
        Symphony symph = new Symphony("Beethoven", "Beethoven", "New York Philharmonic", 
                "Leonard Bernstein", "Beethoven: Symphony #6", "Classical", "CD", 
                "Symphony #6: The Pastoral", "Beethoven");
        myLibrary[1] = symph;
        JazzSong jazz = new JazzSong("Ken Burns Jazz: Ella Fitzgerald", "Jazz", 
                "iTunes", "A-Tisket, A-Tasket", "Jazz", " ", "Van Alexander/Ella Fitzgerald");
        myLibrary[2] = jazz;
        RockSong rock = new RockSong("Hemishperes", "Rock", "CD", "The Trees", 
                "Rock", "Rush");
        myLibrary[3] = rock;
        
        for (MusicalPiece mp : myLibrary) {
            System.out.println("***");
            System.out.println("Recording: " + mp.getRecordingTitle());
            System.out.println("Song: " + mp.getMusicalPieceTitle());
            System.out.println("Genre: " + mp.getMusicalPieceGenre());
            
        }
    }

}
