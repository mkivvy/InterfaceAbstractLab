package lab2;

import javax.swing.JOptionPane;

/**
 *
 * @author Mary
 */
public class CourseCatalog implements CourseWithPrereq {

    private String courseName;
    private String courseNumber;
    //number of credits the course is worth:
    private double courseCredits;
    //number of prerequisites a course has
    private int numPrereqs;
    //String array holds the names of the courses that are preqs for this course
    private String[] prerequisites;
    //semester in which the course is offered:
    private String catalogSemester;

    public void setCourseName(String courseName) {
        boolean passedValidation = validateCourseName(courseName);
        if (passedValidation) {
            this.courseName = courseName;
        } else {
            this.courseName = "Default Course Name";
        }
    }

    public void setCourseNumber(String courseNumber) {
        boolean passedValidation = validateCourseNumber(courseNumber);
        if (passedValidation) {
            this.courseNumber = courseNumber;
        } else {
            this.courseNumber = "000-Default-Course-Number";
        }
    }

    public void setCourseCredits(double courseCredits) {
        boolean passedValidation = validateCourseCredits(courseCredits);
        if (passedValidation) {
            this.courseCredits = courseCredits;
        } else {
            this.courseCredits = 0.0;
        }
    }

    public void setNumPrereqs(int numPrereqs) {
        boolean passedValidation = validatetNumPrereqs(numPrereqs);
        if (passedValidation) {
            this.numPrereqs = numPrereqs;
        } else {
            this.numPrereqs = 0;
        }
    }

    public void setPrerequisites(String[] prerequisites) {
        boolean passedValidation = validatePrerequisites(prerequisites);
        if (passedValidation) {
            this.prerequisites = new String[prerequisites.length];
            for (int sub = 0; sub < prerequisites.length; sub++) {
                if (prerequisites[sub] == null || prerequisites[sub].length() == 0) {
                    //this should never happen if validation passed, but justincase
                    return;
                } else {
                    this.prerequisites[sub] = prerequisites[sub];
                }
            }
        } else {
            this.prerequisites = new String[1];
            this.prerequisites[0] = "no prerequisites listed";
        }
    }
    
    public void setCatalogSemester(String catalogSemester) {
        boolean passedValidation = validateCatalogSemester(catalogSemester);
        if (passedValidation) {
            this.catalogSemester = catalogSemester;
        } else {
            this.catalogSemester = "Fall ";
        }
    }

    public boolean validateCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: Course Name cannot be null or empty string");
            return (false);
        }
        return (true);
    }

    public boolean validateCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: Course Number cannot be null or empty string");
            return (false);
        }
        return (true);
    }

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

    public boolean validatetNumPrereqs(int numPrereqs) {
        if (numPrereqs < 0 || numPrereqs > 10) {
            JOptionPane.showMessageDialog(null,
                    "Error: Number of Prerequisites must be in the range "
                    + " 0 to 10 ");
            return (false);
        }
        return (true);
    }

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

    public boolean validateCatalogSemester(String catalogSemester) {
        if (catalogSemester == null || catalogSemester.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: Course Name cannot be null or empty string");
            return (false);
        }
        return (true);
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public double getCourseCredits() {
        return courseCredits;
    }

    public int getNumPrereqs() {
        return numPrereqs;
    }

    public String[] getPrerequisites() {
        return prerequisites;
    }

    public String getPrerequitesString() {
        if (prerequisites == null || prerequisites.length == 0) {
            return " ";
        }
        String prereqList = "";
        for (int i = 0; i < prerequisites.length; i++) {
            prereqList = prereqList + (i + 1) + ". " + prerequisites[i] + " ";
        }
        return prereqList;
    }

    public String getCatalogSemester() {
        return catalogSemester;
    }

    @Override
    public String toString() {
        return ("Course: " + courseName + "\nNumber: " + courseNumber
                + "\nCredits: " + courseCredits + "\nPrerequisites: "
                + (courseHasPrerequisite ? "yes" : "no"));

    }

}