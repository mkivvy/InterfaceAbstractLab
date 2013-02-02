package lab2;

/**
 *
 * @author Mary
 */
public interface CourseWithPrereq extends Course {
    
    //the contents of the prerequisites String array is to be validated in any 
    //class derived from this one - return true if valiadtion passes & false 
    //if not
    public abstract boolean validatePrerequisites(String[] prerequisites);

    //returns the String array of course prerequisites
    public abstract String[] getPrerequisites();

    //returns a String list with all prerequisite courses
    public abstract String getPrerequitesString();

    //class-specific vvalidatePrerequisites() is to be done before this array
    //is populated
    public abstract void setPrerequisites(String[] prerequisites);

}
