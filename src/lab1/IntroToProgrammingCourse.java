package lab1;

import javax.swing.JOptionPane;

/**
 * This class sets up the Intro to Programming Course, inheriting from 
 * CourseDescription.  This constructor requires 3 fields: courseName, 
 * courseNumber, and courseCredits.  All 3 fields are validated in their
 * respective validate methods.  If the values pass the validations, they
 * are passed to the set methods of the the superclass.  If they fail the
 * validations, default values are passed to the set methods.
 * Because this course has NO PREREQUISITES, the CourseHasPrerequisite 
 * indicator in the parent class is set to false.
 *
 * @author      Mary King
 * @version     1.00
 */
public class IntroToProgrammingCourse extends CourseDescription {
    
    public IntroToProgrammingCourse(String courseName, String courseNumber,
            double courseCredits) {
        if (validateCourseName(courseName))
            setCourseName(courseName);
        else setCourseName("Intro to Programming");
        
        if (validateCourseNumber(courseNumber))
            setCourseNumber(courseNumber);
        else setCourseNumber("000");

        if (validateCourseCredits(courseCredits))
            setCourseCredits(courseCredits);
        else setCourseCredits(1.0);
        
        setCourseHasPrerequisite(false); //NO prereq needed for this course
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
        //should we verify numeric? couldn't find anything online that indicates
        //numeric check is needed if a double is passed in - only for strings
        if(courseCredits < 0.5 || courseCredits > MAX_CREDITS) {
            JOptionPane.showMessageDialog(null,
                    "Error: Course Credits must be in the range 0.5 to "
                    + MAX_CREDITS);
            return (false);
        }
        return(true);
    }

}
