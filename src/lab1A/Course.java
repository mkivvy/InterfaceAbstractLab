package lab1A;

/**
 * This abstract class contains general properties and methods for describing a
 * college course. 
 * - Course name, course number, and credits are common attributes for all 
 * courses here so they have been defined here in the abstract
 * class. All three have getters that return the value of the respective field.
 * - Course name, course number, and credits all also have setters that call the 
 * validation methods have been declared here as abstract.  These are to be
 * coded in the derived class.  Course names and numbers can vary in format 
 * by department, for example. 
 * - Similarly, course credit validation may vary by department. However,
 * MIN_CREDITS and MAX_CREDITS credits are defined here as constants using the 
 * widest range of credits currently known. Child classes may use their own
 * minimum & maximum number of credits, if necessary, but defining these as
 * global constants means these values can easily be changed in just this one 
 * place if the range changes. 
 * - Having the child class handle validation allows the child to determine
 * how error messages are to be displayed rather than forcing JOptionPane
 * to be used.
 * - There is an indicator field, courseHasPrerequisite, to be set to true if 
 * a course requires any prerequisites and false if it does not. 
 * - There is also a String array, prerequisites, to be validated in the derived
 * class and then populated with the course names (or course numbers, depending 
 * on the child class's needs) of the courses that are the prerequisites.
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

    @Override
    public String toString() {
        return ("Course: " + courseName + "\nNumber: " + courseNumber
                + "\nCredits: " + courseCredits + "\nPrerequisites: "
                + (courseHasPrerequisite ? "yes" : "no"));

    }
}
