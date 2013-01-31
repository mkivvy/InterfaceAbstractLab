package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Mary King
 * @version     1.00
 */
public class AdvancedJavaCourse extends CourseDescription {
    //need private
    String courseName;
    private String courseNumber;
    //credits not used here?
    private double credits;
    //array?
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        //needs validation
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    public String getCapitalizedCourseName() {
        //why would capitalized course name be unique to only this course?
        return this.getCourseName().toUpperCase();
    }


    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            return;
        }
        this.prerequisites = prerequisites;
    }

    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            return;
        }
        this.setCredits(credits);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        //need validation
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        //need validation
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        //needs validation
        this.courseNumber = courseNumber;
    }

    @Override
    public boolean validateCourseName(String courseName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean validateCourseNumber(String courseNumber) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean validateCourseCredits(double courseCredits) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
