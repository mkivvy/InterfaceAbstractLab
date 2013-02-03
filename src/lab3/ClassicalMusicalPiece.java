package lab3;

/**
 * I decided to make this class abstract so I could implement the methods
 * required by the abstract class  MusicalPiece here, but leave the Classical 
 * Musical Piece methods to be implemented at the lowest level along with behaviors
 * appropriate to the children.  This way  everything up the hierarchy is
 * handled up to here and the children just have from this class on down to
 * work with.  Methods for getting and setting the composer and the music
 * classification (Baroque, Romantic, etc) and added here as these are common
 * to classical musical pieces.
 * @author Mary King
 * @version 1.00
 */
public abstract class ClassicalMusicalPiece extends MusicalPiece {
    private String recordingTitle;
    private String recordingGenre;
    private String recordingType;
    private String musicalPieceTitle;
    private String musicalPieceType;
    private String musicalPieceGenre;

    public abstract String getComposer();

    public abstract void setComposer(String composer);
    
    public abstract String getMusicClassification();

    public abstract void setMusicClassification(String musicClassification);
    
    public String getRecordingTitle() {
        return recordingTitle;
    }

    public void setRecordingTitle(String recordingTitle) {
        this.recordingTitle = recordingTitle;
    }

    public String getRecordingGenre() {
        return recordingGenre;
    }

    public void setRecordingGenre(String recordingGenre) {
        this.recordingGenre = recordingGenre;
    }

    public String getRecordingType() {
        return recordingType;
    }

    public void setRecordingType(String recordingType) {
        this.recordingType = recordingType;
    }

    public String getMusicalPieceTitle() {
        return musicalPieceTitle;
    }

    public void setMusicalPieceTitle(String musicalPieceTitle) {
        this.musicalPieceTitle = musicalPieceTitle;
    }

    public String getMusicalPieceType() {
        return musicalPieceType;
    }

    public void setMusicalPieceType(String musicalPieceType) {
        this.musicalPieceType = musicalPieceType;
    }

    public String getMusicalPieceGenre() {
        return musicalPieceGenre;
    }

    public void setMusicalPieceGenre(String musicalPieceGenre) {
        this.musicalPieceGenre = musicalPieceGenre;
    }

}
