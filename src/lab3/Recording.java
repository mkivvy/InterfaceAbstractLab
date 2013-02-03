package lab3;

/**
 * I decided to make this an interface because the only methods I could come up
 * with for this level of the hierarchy were getters and setters.
 * All Recordings will have properties of RecordingTitle (title of the album or 
 * grouping, such as podcast - the name of the musical piece is to be used if 
 * the piece is not associated with an album or some other grouping), 
 * RecordingGenre (rock, jazz, classical, etc.), and RecordingType (cd, mp3file,
 * etc.).  I found these attributes to be common to all items in the library.
 * @author Mary King
 * @version 1.00
 */
public interface Recording {
    public abstract String getRecordingTitle();

    public abstract void setRecordingTitle(String recordingTitle);

    public abstract String getRecordingGenre();

    public abstract void setRecordingGenre(String recordingGenre);

    public abstract String getRecordingType();

    public abstract void setRecordingType(String recordingType);

}
