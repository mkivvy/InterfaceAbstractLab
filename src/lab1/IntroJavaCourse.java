package lab1;

import javax.swing.JOptionPane;

/**
 * This class sets up the Intro to Java Course, inheriting from 
 * CourseDescription.  This constructor requires 3 fields: courseName, 
 * courseNumber, and courseCredits.  All 3 fields are validated in their
 * respective validate methods.  If the values pass the validations, they
 * are passed to the set methods of the the superclass.  If they fail the
 * validations, default values are passed to the set methods.
 * Because this course DOES have prerequisites, the CourseHasPrerequisite 
 * indicator in the parent class is set to true.
 * This class also includes a String array to contain any prerequisites this
 * course needs.  There is a setter and getter for this array.
 *
 * @author      Mary King
 * @version     1.00
 */
public class IntroJavaCourse extends CourseDescription {
    private String[] prerequisites;

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

    public final String[] getPrerequisites() {
        return prerequisites;
    }

    public final String getPrerequitesString() {
        if (prerequisites == null || prerequisites.length == 0) {
            return " ";
        }
        String prereqList = "";
        for (int i = 0; i < prerequisites.length; i++) {
            prereqList = prereqList + (i + 1) + ". " + prerequisites[i] + " ";
        }
        return prereqList;
    }

    public final void setPrerequisites(String[] prereq) {
        if (prereq == null || prereq.length == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: at least one Prerequisites course is required");
            return;
        }
        this.prerequisites = new String[prereq.length];
        for (int sub = 0; sub < prereq.length; sub++) {
            if (prereq[sub] == null || prereq[sub].length() == 0) {
                JOptionPane.showMessageDialog(null,
                        "Error: Prerequisite cannot be null or empty string");
                return;
            } else {
                this.prerequisites[sub] = prereq[sub];
            }
        }
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
