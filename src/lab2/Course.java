package lab2;

/**
 *
 * @author Mary
 */
public interface Course {
    //these contain the known min & max values allowed for number of
    //credits - change these values if the range widens
    public static final double MIN_CREDITS = 0.0;
    public static final double MAX_CREDITS = 4.0;

    //the contents of the input String courseName is to be validated in any 
    //class derived from this one before the class field courseName is set -
    //return true if valiadtion passes & false if not
    public abstract boolean validateCourseName(String courseName);
    
    //the contents of the input String courseNumber is to be validated in any  
    //class derived from this one before the class field courseNumber is set -
    //return true if valiadtion passes & false if not
    public abstract boolean validateCourseNumber(String courseNumber);
    
    //the contents of the input double courseCredits is to be validated in any  
    //class derived from this one before the class field courseCredits is set -
    //return true if valiadtion passes & false if not
    public abstract boolean validateCourseCredits(double courseCredits);

}
