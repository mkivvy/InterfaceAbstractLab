package lab1A;

import javax.swing.JOptionPane;

/**
 *
 * @author Mary
 */
public class CourseCatalog extends Course {

    public CourseCatalog(String courseName, String courseNumber,
            double courseCredits, boolean courseHasPrerequisite) {
        super.setCourseName(courseName);
        super.setCourseNumber(courseNumber);
        super.setCourseCredits(courseCredits);
        super.setCourseHasPrerequisite(courseHasPrerequisite);
        
    }

    @Override
    public boolean validateCourseName(String courseName) {
        System.out.println("\nin Validate Course Name ");
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: Course Name cannot be null or empty string");
            return (false);
        }
        System.out.println("\nCourse Name validated");
        return (true);
    }

    @Override
    public boolean validateCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: Course Number cannot be null or empty string");
            return (false);
        }
        return (true);
    }

    @Override
    public boolean validateCourseCredits(double courseCredits) {
        if (courseCredits < MIN_CREDITS || courseCredits > MAX_CREDITS) {
            JOptionPane.showMessageDialog(null,
                    "Error: Course Credits must be in the range "
                    + MIN_CREDITS + " to "
                    + MAX_CREDITS);
            return (false);
        }
        return (true);
    }

    @Override
    public boolean validatePrerequisites(String[] prerequisites) {
        if (prerequisites == null || prerequisites.length == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: no Prerequisites courses have been entered");
            return false;
        }
        for (int sub = 0; sub < prerequisites.length; sub++) {
            if (prerequisites[sub] == null || prerequisites[sub].length() == 0) {
                JOptionPane.showMessageDialog(null,
                        "Error: Prerequisite cannot be null or empty string");
                return false;
            }
        }
        return true;
    }
}
