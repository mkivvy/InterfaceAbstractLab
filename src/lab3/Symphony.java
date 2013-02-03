package lab3;

/**
 *
 * @author Mary
 */
public class Symphony extends ClassicalMusicalPiece {
    private String composer; 
    private String musicClassification;
    private String symphonyOrchestra; 
    private String conductor;

    public String getSymphonyOrchestra() {
        return symphonyOrchestra;
    }

    public void setSymphonyOrchestra(String symphonyOrchestra) {
        this.symphonyOrchestra = symphonyOrchestra;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
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
