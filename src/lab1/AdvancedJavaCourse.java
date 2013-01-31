package lab1;

import javax.swing.JOptionPane;

/**
 * This class sets up the Advanced Java Course, inheriting from
 * CourseDescription. This constructor requires 3 fields: courseName,
 * courseNumber, and courseCredits. All 3 fields are validated in their
 * respective validate methods. If the values pass the validations, they are
 * passed to the set methods of the the superclass. If they fail the
 * validations, default values are passed to the set methods. Because this
 * course DOES have prerequisites, the CourseHasPrerequisite indicator in the
 * parent class is set to true.  
 * This class also includes a String array to contain any prerequisites this
 * course needs.  There is a setter and getter for this array.
 * (Note: I removed the method getCapitalizedCourseName since that's a simple
 * String function that can be applied to the data in the calling program once
 * it is retrieved.  It was also not needed elsewhere in this class.)
 * @author Mary King
 * @version 1.00
 */
public class AdvancedJavaCourse extends CourseDescription {
    private String[] prerequisites;
    private double minCourseCredits = 0.5; //this course requires at least 0.5

    public AdvancedJavaCourse(String courseName, String courseNumber,
            double courseCredits) {
        if (validateCourseName(courseName)) {
            setCourseName(courseName);
        } else {
            setCourseName("Advanced Java");
        }

        if (validateCourseNumber(courseNumber)) {
            setCourseNumber(courseNumber);
        } else {
            setCourseNumber("000");
        }

        if (validateCourseCredits(courseCredits)) {
            setCourseCredits(courseCredits);
        } else {
            setCourseCredits(minCourseCredits);
        }

        setCourseHasPrerequisite(true); //prereq needed for this course
    }

    public final String[] getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String[] prerequisites) {

        if (prerequisites == null || prerequisites.length == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: at least one Prerequisites course is required");
            return;
        }
        for (int sub = 0; sub < prerequisites.length; sub++) {
            if (prerequisites[sub] == null || prerequisites[sub].length() == 0) {
                JOptionPane.showMessageDialog(null,
                        "Error: Prerequisite cannot be null or empty string");
                return;
            } else {
                this.prerequisites[sub] = prerequisites[sub];
            }
        }
    }

    @Override
    public final boolean validateCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: Course Name cannot be null or empty string");
            return (false);
        }
        return (true);
    }

    @Override
    public final boolean validateCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: Course Number cannot be null or empty string");
            return (false);
        }
        return (true);
    }

    @Override
    public final boolean validateCourseCredits(double courseCredits) {
        if (courseCredits < minCourseCredits || courseCredits > MAX_CREDITS) {
            JOptionPane.showMessageDialog(null,
                    "Error: Course Credits must be in the range "
                    + minCourseCredits + " to "
                    + MAX_CREDITS);
            return (false);
        }
        return (true);
    }
}
