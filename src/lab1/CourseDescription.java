package lab1;

import javax.swing.JOptionPane;

/**
 * This class contains general properties and methods for describing a college
 * course.  
 * - Course name, course number, and credits are common attributes for
 * all courses so they have been defined here in the abstract class.  All three
 * also have getters and setters.  The setters do basic validation, but 
 * validation methods have been declared here as abstract methods so they are 
 * required for each of these fields in the child.  Course names and numbers 
 * can vary in format by department, for example.  
 * - Similarly, course credit validation may vary by department so only basic 
 * validation is done here using the minimum and maximum credit hours. MIN and 
 * MAX credits are defined here as constants as the widest range of credits 
 * currently known, but can easily be changed here in just this one place if 
 * the range changes.
 * - Validation is tricky.  My validation uses the JOptionPane class to display
 * validation messages because that seemed to be the standard for the 3 classes
 * written, but I'm not really comfortable with this.  It locks all children 
 * into using this method for errors and that may not be a good thing.  This
 * class would be need to be changed if a different communication path was 
 * needed.  Still, if there are errors, they need to be communicated somehow.
 * I could send back a return value indicating an error occurred and store the
 * error message in a string to be retrieved, but then the method is no longer
 * a real 'setter'.  That's the reason I continued to used JOptionPane, even
 * realizing it's not a great answer.
 * - I have included an indicator field to be set to true if a course requires
 * any prerequisites and false if it does not.  The actual prerequisites are to 
 * be stored in derived classes.
  *
 * @author Mary King
 * @version 1.00
 */
public abstract class CourseDescription {

    private String courseName;
    private String courseNumber;
    //number of credits the course is worth:
    private double courseCredits;  
    //set to true if the course has prerequisites & false if not
    private boolean courseHasPrerequisite; 
    //these contain the known min & max values allowed for number of
    //credits - change these values if the range widens
    public static final double MIN_CREDITS = 0.0;
    public static final double MAX_CREDITS = 4.0;

    //courseName is to be validated in any class derived from this one -
    //return true if valiaation passes & false if not
    public abstract boolean validateCourseName(String courseName);
    //courseNumber is to be validated in any class derived from this one - 
    //return true if valiaation passes & false if not
    public abstract boolean validateCourseNumber(String courseNumber);
    //courseCredits is to be validated in any class derived from this one -
    //return true if valiaation passes & false if not
    public abstract boolean validateCourseCredits(double courseCredits);
    
    //returns value of courseName as stored
    public final String getCourseName() {
        return courseName;
    }

    //only simple validation is done here before allowing the courseName field
    //to be set - more course-specific validation is to be done in 
    //validateCourseName() before this method is called 
    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: Course Name cannot be null or empty string");
            return;
        }
        this.courseName = courseName;
    }

    //returns value of courseNumber as stored
    public final String getCourseNumber() {
        return courseNumber;
    }

    //only simple validation is done here before allowing the courseNumber
    //field to be set - more course-specific validation is to be done in 
    //validateCourseNumber() before this method is called 
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: Course Number cannot be null or empty string");
            return;
        }
        this.courseNumber = courseNumber;
    }

    //returns value of courseCredits as stored
    public final double getCourseCredits() {
        return courseCredits;
    }

    //only simple validation is done here before allowing the courseCredits 
    //field to be set - more course-specific validation is to be done in 
    //validateCourseCredits() before this method is called 
    public final void setCourseCredits(double courseCredits) {
        if(courseCredits < MIN_CREDITS || courseCredits > MAX_CREDITS) {
            JOptionPane.showMessageDialog(null,
                    "Error: Course Credits must be in the range " + MIN_CREDITS
                    + " to " + MAX_CREDITS);
            return;
        }
        this.courseCredits = courseCredits;
    }

    //returns value of true if a course haas prerequisite & false if not
    public final boolean isCourseHasPrerequisite() {
        return courseHasPrerequisite;
    }

    //set a value of true if a course haas prerequisite & false if not
    public final void setCourseHasPrerequisite(boolean courseHasPrerequisite) {
        this.courseHasPrerequisite = courseHasPrerequisite;
    }
    
    @Override
    public String toString() {
        return ("Course: " + courseName + "\nNumber: " + courseNumber 
                + "\nCredits: " + courseCredits + "\nPrerequisites: "
                + (courseHasPrerequisite ? "yes" : "no"));
        
    }
}
