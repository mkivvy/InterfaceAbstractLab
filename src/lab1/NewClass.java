package lab1;

/**
 *
 * @author Mary
 */
public class NewClass {

    private String[] prerequisites;

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

    public final void setPrerequisites(String[] prerequisites) {
        if (prerequisites == null || prerequisites.length == 0) {
            System.out.println("Error: at least one Prerequisites course is required");
            return;
        }
        this.prerequisites = new String[prerequisites.length];
        for (int sub = 0; sub < prerequisites.length; sub++) {
            if (prerequisites[sub] == null || prerequisites[sub].length() == 0) {
                System.out.println("Error: Prerequisite cannot be null or empty string");
                return;
            } else {
                this.prerequisites[sub] = prerequisites[sub];
            }
        }
    }
}
