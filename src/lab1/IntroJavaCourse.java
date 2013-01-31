package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Mary King
 * @version     1.00
 */
public class IntroJavaCourse extends CourseDescription {
    //should this be array?
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber,
            double courseCredits) {
        if (validateCourseName(courseName))
            setCourseName(courseName);
        else setCourseName("Intro to Java");
        
        if (validateCourseNumber(courseNumber))
            setCourseNumber(courseNumber);
        else setCourseNumber("000");

        if (validateCourseCredits(courseCredits))
            setCourseCredits(courseCredits);
        else setCourseCredits(MIN_CREDITS);
        
        setCourseHasPrerequisite(true); //prereq needed for this course
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
        if(courseCredits < MIN_CREDITS || courseCredits > MAX_CREDITS) {
            JOptionPane.showMessageDialog(null,
                    "Error: Course Credits must be in the range " 
                    + MIN_CREDITS + " to "
                    + MAX_CREDITS);
            return (false);
        }
        return(true);
    }

}
