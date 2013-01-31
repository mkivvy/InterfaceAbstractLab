package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Mary King
 * @version     1.00
 */
public class AdvancedJavaCourse extends CourseDescription {
    //array?
    private String prerequisites;
    private double minCourseCredits = 0.5;

    public AdvancedJavaCourse(String courseName, String courseNumber,
            double courseCredits) {
        if (validateCourseName(courseName))
            setCourseName(courseName);
        else setCourseName("Advanced Java");
        
        if (validateCourseNumber(courseNumber))
            setCourseNumber(courseNumber);
        else setCourseNumber("000");

        if (validateCourseCredits(courseCredits))
            setCourseCredits(courseCredits);
        else setCourseCredits(minCourseCredits);
        
        setCourseHasPrerequisite(true); //prereq needed for this course
    }

    public final String getCapitalizedCourseName() {
        return getCourseName().toUpperCase();
    }


    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            return;
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public final boolean validateCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: Course Name cannot be null or empty string");
            return (false);
        }
        return(true);
    }

    @Override
    public final boolean validateCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: Course Number cannot be null or empty string");
            return (false);
        }
        return(true);
    }

    @Override
    public final boolean validateCourseCredits(double courseCredits) {
        if(courseCredits < minCourseCredits || courseCredits > MAX_CREDITS) {
            JOptionPane.showMessageDialog(null,
                    "Error: Course Credits must be in the range " 
                    + minCourseCredits + " to "
                    + MAX_CREDITS);
            return (false);
        }
        return(true);
    }
    
}
