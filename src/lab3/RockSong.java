package lab3;

/**
 *
 * @author Mary
 */
public class RockSong implements MusicalPiece {
    private String recordingTitle;
    private String recordingGenre;
    private String recordingType;
    private String musicalPieceTitle;
    private String musicalPieceType;
    private String musicalPieceGenre;
    private String rockGroupName; 
    private String[] groupMembers;

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
