package lab3;

/**
 * I decided to make this an abstract class to cement the hierarchical 
 * relationship this class has with the interface Recording. In addition to the
 * getters & setters to be implemented by Recording, a MusicalPiece has a
 * PieceTitle and a PieceGenre (which may differ from the the genre for the 
 * entire Recording).  I made the additional methods in this class abstract
 * because the only methods I could come up with for this level of the hierarchy 
 * were getters and setters. I did not combine these into the Recording interface
 * because that could be used alone to represent an overview of the 
 * album/grouping and these are specific to the piece/song.
 * @author Mary King
 * @version 1.00
*/
public abstract class MusicalPiece implements Recording {
    public abstract String getMusicalPieceTitle();

    public abstract void setMusicalPieceTitle(String musicalPieceTitle);

    public abstract String getMusicalPieceGenre();

    public abstract void setMusicalPieceGenre(String musicalPieceGenre);
}
