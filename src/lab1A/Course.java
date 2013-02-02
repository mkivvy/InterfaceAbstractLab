package lab1A;

import javax.swing.JOptionPane;

/**
 * This abstract class contains general properties and methods for describing a
 * college course. - Course name, course number, and credits are common
 * attributes for all courses so they have been defined here in the abstract
 * class. All three also have getters and setters. The setters do basic
 * validation, but validation methods have been declared here as abstract
 * methods so they are required for each of these fields in the child. Course
 * names and numbers can vary in format by department, for example. - Similarly,
 * course credit validation may vary by department so only basic validation is
 * done here using the minimum and maximum credit hours. MIN and MAX credits are
 * defined here as constants as the widest range of credits currently known, but
 * can easily be changed here in just this one place if the range changes. -
 * Validation is tricky. My validation uses the JOptionPane class to display
 * validation messages because that seemed to be the standard for the 3 classes
 * written, but I'm not really comfortable with this. It locks all children into
 * using this method for errors and that may not be a good thing. This class
 * would be need to be changed if a different communication path was needed.
 * Still, if there are errors, they need to be communicated somehow. I could
 * send back a return value indicating an error occurred and store the error
 * message in a string to be retrieved, but then the method is no longer a real
 * 'setter'. That's the reason I continued to used JOptionPane, even realizing
 * it's not a great answer. - I have included an indicator field to be set to
 * true if a course requires any prerequisites and false if it does not. The
 * actual prerequisites are to be stored in derived classes.
 *
 * @author Mary King
 * @version 1.00
 */
public abstract class Course {

    private String courseName;
    private String courseNumber;
    //number of credits the course is worth:
    private double courseCredits;
    //set to true if the course has prerequisites & false if not
    private boolean courseHasPrerequisite;
    //these contain the known min & max values allowed for number of
    //credits - change these values if the range widens
    public static final double MIN_CREDITS = 0.0;
    public static final double MAX_CREDITS = 4.0;
    //String array holds the names of the courses that are preqs for this course
    private String[] prerequisites;

    //courseName is to be validated in any class derived from this one -
    //return true if valiadtion passes & false if not
    public abstract boolean validateCourseName(String courseName);
    //courseNumber is to be validated in any class derived from this one - 
    //return true if valiadtion passes & false if not

    public abstract boolean validateCourseNumber(String courseNumber);
    //courseCredits is to be validated in any class derived from this one -
    //return true if valiadtion passes & false if not

    public abstract boolean validateCourseCredits(double courseCredits);
    //the contents of the prerequisites String array is to be validated in any 
    //class derived from this one - return true if valiadtion passes & false if not

    public abstract boolean validatePrerequisites(String[] prerequisites);

    //returns value of courseName as stored
    public final String getCourseName() {
        return courseName;
    }

    //class-specific validateCourseName() is called before this field is set 
    public final void setCourseName(String courseName) {
        boolean passedValidation = validateCourseName(courseName);
        if (passedValidation) {
            this.courseName = courseName;
        } else {
            this.courseName = "Default Course Name";
        }
        System.out.println("\ncourse name = " + this.courseName);
    }

    //returns value of courseNumber as stored
    public final String getCourseNumber() {
        return courseNumber;
    }

    //class-specific validateCourseNumber() is called before this field is set 
    public final void setCourseNumber(String courseNumber) {
        boolean passedValidation = validateCourseNumber(courseNumber);
        if (passedValidation) {
            this.courseNumber = courseNumber;
        } else {
            this.courseNumber = "000-Default-Course-Number";
        }
        System.out.println("\ncourse number = " + this.courseNumber);

    }

    //returns value of courseCredits as stored
    public final double getCourseCredits() {
        return courseCredits;
    }

    //class-specific validateCourseCredits is called before this field is set 
    public final void setCourseCredits(double courseCredits) {
        boolean passedValidation = validateCourseCredits(courseCredits);
        if (passedValidation) {
            this.courseCredits = courseCredits;
        } else {
            this.courseCredits = 0.0;
        }
        System.out.println("\ncourse credits = " + this.courseCredits);
    }

    //returns value of true if a course haas prerequisite & false if not
    public final boolean isCourseHasPrerequisite() {
        return courseHasPrerequisite;
    }

    //set a value of true if a course haas prerequisite & false if not
    public final void setCourseHasPrerequisite(boolean courseHasPrerequisite) {
        this.courseHasPrerequisite = courseHasPrerequisite;
    }

    //returns the String array of course prerequisites
    public final String[] getPrerequisites() {
        return prerequisites;
    }

    //returns a String numbered list with all prerequisite courses
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

    //class-specific validatePrerequisites() is called before this String array
    //is populated
    public final void setPrerequisites(String[] prerequisites) {
        boolean passedValidation = validatePrerequisites(prerequisites);
        if (passedValidation) {
            this.prerequisites = new String[prerequisites.length];
            for (int sub = 0; sub < prerequisites.length; sub++) {
                if (prerequisites[sub] == null || prerequisites[sub].length() == 0) {
                    JOptionPane.showMessageDialog(null,
                            "Error: Prerequisite cannot be null or empty string");
                    return;
                } else {
                    this.prerequisites[sub] = prerequisites[sub];
                }
            }
        } else {
            this.prerequisites = new String[1];
            this.prerequisites[0] = "no prerequisites listed";
        System.out.println("\nfirst prereq = " + this.prerequisites[0]);
        }
    }

    @Override
    public String toString() {
        return ("Course: " + courseName + "\nNumber: " + courseNumber
                + "\nCredits: " + courseCredits + "\nPrerequisites: "
                + (courseHasPrerequisite ? "yes" : "no"));

    }
}
