package lab2;

/**
 *
 * @author Mary
 */
public interface CourseWithPrereq extends Course {
    
    //the contents of the input prerequisites String array is to be validated in  
    //any class derived from this one before the class String array prerequisites 
    //is set - return true if valiadtion passes & false if not
    public abstract boolean validatePrerequisites(String[] prerequisites);

    //returns a String list with all prerequisite courses
    public abstract String getPrerequitesString();

}
