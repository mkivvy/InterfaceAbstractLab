package lab3;

/**
 * This class is at the bottom of the hierarchy so it needs to be concrete. 
 * Here I implement methods from the interface Recording and the abstract class 
 * MusicalPiece and include properties specific to RockSong: rockGroupName 
 * and groupMembers.
 * @author Mary King
 * @version 1.00
 */
public class RockSong extends MusicalPiece {
    private String recordingTitle;
    private String recordingGenre;
    private String recordingType;
    private String musicalPieceTitle;
    private String musicalPieceGenre;
    private String rockGroupName; 
    private String[] groupMembers;

    public RockSong(String recordingTitle, String recordingGenre, String recordingType, String musicalPieceTitle, String musicalPieceGenre, String rockGroupName) {
        this.recordingTitle = recordingTitle;
        this.recordingGenre = recordingGenre;
        this.recordingType = recordingType;
        this.musicalPieceTitle = musicalPieceTitle;
        this.musicalPieceGenre = musicalPieceGenre;
        this.rockGroupName = rockGroupName;
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

    public String getRockGroupName() {
        return rockGroupName;
    }

    public void setRockGroupName(String rockGroupName) {
        this.rockGroupName = rockGroupName;
    }

    public String[] getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(String[] groupMembers) {
        this.groupMembers = groupMembers;
    }

}
