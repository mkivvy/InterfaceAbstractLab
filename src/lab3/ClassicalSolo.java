package lab3;

/**
 *
 * @author Mary
 */
public class ClassicalSolo extends ClassicalMusicalPiece {
    private String composer; 
    private String musicClassification;
    private String soloist; 
    private String soloInstrument;
    private String accompanist;

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
