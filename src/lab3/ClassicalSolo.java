package lab3;

/**
 * This class is at the bottom of the hierarchy so it needs to be concrete.
 * Here I implement methods required by ClassicalMusicalPiece and include
 * properties specific to ClassicalSolo: soloist, soloInstrument, and accompanist.
 * @author Mary King
 * @version 1.00
 */
public class ClassicalSolo extends ClassicalMusicalPiece {
    private String composer; 
    private String musicClassification;
    private String soloist; 
    private String soloInstrument;
    private String accompanist;

    public ClassicalSolo(String composer, String musicClassification, String soloist, String soloInstrument, String accompanist, String recordingTitle, String recordingGenre, String recordingType, String musicalPieceTitle, String musicalPieceGenre) {
        super(recordingTitle, recordingGenre, recordingType, musicalPieceTitle, musicalPieceGenre);
        this.composer = composer;
        this.musicClassification = musicClassification;
        this.soloist = soloist;
        this.soloInstrument = soloInstrument;
        this.accompanist = accompanist;
    }

    public String getSoloist() {
        return soloist;
    }

    public void setSoloist(String soloist) {
        this.soloist = soloist;
    }

    public String getSoloInstrument() {
        return soloInstrument;
    }

    public void setSoloInstrument(String soloInstrument) {
        this.soloInstrument = soloInstrument;
    }

    public String getAccompanist() {
        return accompanist;
    }

    public void setAccompanist(String accompanist) {
        this.accompanist = accompanist;
    }
    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getMusicClassification() {
        return musicClassification;
    }

    public void setMusicClassification(String musicClassification) {
        this.musicClassification = musicClassification;
    }

    public boolean validateComposer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean validateMusicClassification() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
