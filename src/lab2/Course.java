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

    //courseName is to be validated in any class derived from this one -
    //return true if valiadtion passes & false if not
    public abstract boolean validateCourseName(String courseName);
    //courseNumber is to be validated in any class derived from this one - 
    //return true if valiadtion passes & false if not
    public abstract boolean validateCourseNumber(String courseNumber);
    //courseCredits is to be validated in any class derived from this one -
    //return true if valiadtion passes & false if not
    public abstract boolean validateCourseCredits(double courseCredits);

    //returns value of courseName as stored
    public abstract String getCourseName();

    //class-specific validateCourseName() is to be done before this field is set 
    public abstract void setCourseName(String courseName);

    //returns value of courseNumber as stored
    public abstract String getCourseNumber();

    //class-specific validateCourseNumber() is to be done before this field is set 
    public abstract void setCourseNumber(String courseNumber);

    //returns value of courseCredits as stored
    public abstract double getCourseCredits();

    //class-specific validateCourseCredits() is to be done before this field is set 
    public abstract void setCourseCredits(double courseCredits);

}
