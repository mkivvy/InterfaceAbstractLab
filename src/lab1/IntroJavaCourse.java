package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      Mary King
 * @version     1.00
 */
public class IntroJavaCourse {
    //need private
    //course name is set only in constructor w/ no validation & has not getter
    String courseName;
    private String courseNumber;
    private double credits;
    //should this be array?
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        //needs validation
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        //validate
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }


    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        //validate
        this.prerequisites = prerequisites;
    }

        public void setCredits(double credits) {
            //check numeric? 
            //note this check differs from IntorP
        if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            //return instead?
            System.exit(0);
        }
        this.setCredits(credits);
    }

}
