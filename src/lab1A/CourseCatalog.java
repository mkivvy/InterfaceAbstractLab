package lab1A;

import javax.swing.JOptionPane;

/**
 * CourseCatalog inherits from Course which contains basic information about
 * college courses.  The fields courseName, courseNumber, courseCredits,
 * and prerequisites are stored in the parent class.  This class is responsible 
 * for validation methods for those fields.  Course also contains 
 * courseHasPrerequisite, a boolean field set to true if a course has 
 * prerequisites.
 * This class adds a field, catalogSemester, for which the course is being
 * offered.  It has a getter and setter for this additional field.
 * This class uses JOptionPane for validation which limits calling programs to
 * doing the same.  However, error messages need to be communicated somehow 
 * and this was the method chosen for this application.
 *
 * @author Mary King
 * @version 1.00
 */
public class CourseCatalog extends Course {
    private String catalogSemester;

    public CourseCatalog(String courseName, String courseNumber,
            double courseCredits, boolean courseHasPrerequisite) {
        super.setCourseName(courseName);
        super.setCourseNumber(courseNumber);
        super.setCourseCredits(courseCredits);
        super.setCourseHasPrerequisite(courseHasPrerequisite);
        
    }

    public final String getCatalogSemester() {
        return catalogSemester;
    }

    public final void setCatalogSemester(String catalogSemester) {
        if (catalogSemester == null || catalogSemester.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: Course Name cannot be null or empty string");
            this.catalogSemester = "Fall";
        } else {
            this.catalogSemester = catalogSemester;
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
    public final boolean validatePrerequisites(String[] prerequisites) {
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
