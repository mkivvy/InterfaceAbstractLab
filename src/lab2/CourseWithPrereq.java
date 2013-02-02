package lab2;

/**
 * This interface class is intended to be used when defining college courses 
 * that have prerequisites.  It extends the Course class so only adds 
 * methods it requires for handling prerequisites: validatePrerequisites and
 * getPrerequitesString.
 *
 * @author Mary King
 * @version 1.00
 */
public interface CourseWithPrereq extends Course {
    
    //the contents of the input prerequisites String array is to be validated in  
    //any class derived from this one before the class String array prerequisites 
    //is set - return true if valiadtion passes & false if not
    public abstract boolean validatePrerequisites(String[] prerequisites);

    //returns a String list with all prerequisite courses
    public abstract String getPrerequitesString();

}
