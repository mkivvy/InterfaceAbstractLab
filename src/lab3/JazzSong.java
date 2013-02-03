package lab3;

/**
 * This class is at the bottom of the hierarchy so it needs to be concrete.
 * Here I implement methods from the interface Recording and the abstract class 
 * MusicalPiece and include properties specific to JazzSong: soloists, 
 * jazzGroupName, groupMembers, and composer.
 * @author Mary King
 * @version 1.00
 */
public class JazzSong extends MusicalPiece {
    private String recordingTitle;
    private String recordingGenre;
    private String recordingType;
    private String musicalPieceTitle;
    private String musicalPieceGenre;
    private String[] soloists;
    private String jazzGroupName; 
    private String[] groupMembers;
    private String composer;

    public JazzSong(String recordingTitle, String recordingGenre, String recordingType, String musicalPieceTitle, String musicalPieceGenre, String jazzGroupName, String composer) {
        this.recordingTitle = recordingTitle;
        this.recordingGenre = recordingGenre;
        this.recordingType = recordingType;
        this.musicalPieceTitle = musicalPieceTitle;
        this.musicalPieceGenre = musicalPieceGenre;
        this.jazzGroupName = jazzGroupName;
        this.composer = composer;
    }

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

    public String getMusicalPieceGenre() {
        return musicalPieceGenre;
    }

    public void setMusicalPieceGenre(String musicalPieceGenre) {
        this.musicalPieceGenre = musicalPieceGenre;
    }

    public String[] getSoloists() {
        return soloists;
    }

    public void setSoloists(String[] soloists) {
        this.soloists = soloists;
    }

    public String getJazzGroupName() {
        return jazzGroupName;
    }

    public void setJazzGroupName(String jazzGroupName) {
        this.jazzGroupName = jazzGroupName;
    }

    public String[] getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(String[] groupMembers) {
        this.groupMembers = groupMembers;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }
}
