package lab1;

import javax.swing.JOptionPane;

/**
 * This class contains general properties and methods for describing a college
 * course.  Course name, course number, and credits are common attributes for
 * all courses so they have been defined here in the abstract class.  All three
 * also have getters and setters.  The setters do basic validation, but 
 * validation methods have been declared here as abstract methods so they are 
 * required for each of these fields in the child.  Course names and numbers 
 * can vary in format by department, for example.  Similarly, course credit
 * validation may vary by department so only basic validation is done here using
 * the minimum and maximum credit hours. MIN and MAX credits are defined here 
 * as constants and these are the widest range of credits currently known, 
 * but can easily be changed here in just this one place if the range changes.
 * I have included an indicator field to be set to true if a course requires
 * any prerequisites and false if it does not.
 *
 * @author Mary King
 * @version 1.00
 */
public abstract class CourseDescription {

    private String courseName;
    private String courseNumber;
    private double courseCredits;
    private boolean courseHasPrerequisite;
    public static final double MIN_CREDITS = 0.0;
    public static final double MAX_CREDITS = 4.0;

    public abstract void validateCourseName();
    public abstract void validateCourseNumber();
    public abstract void validateCourseCredits();
    
    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null or empty string");
            return;
        }
        this.courseName = courseName;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            return;
        }
        this.courseNumber = courseNumber;
    }

    public final double getCredits() {
        return courseCredits;
    }

    public final void setCredits(double courseCredits) {
        if(courseCredits < MIN_CREDITS || courseCredits > MAX_CREDITS) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits are out of range");
            return;
        }
        this.courseCredits = courseCredits;
    }

    public final boolean isCourseHasPrerequisite() {
        return courseHasPrerequisite;
    }

    public final void setCourseHasPrerequisite(boolean courseHasPrerequisite) {
        this.courseHasPrerequisite = courseHasPrerequisite;
    }
}
