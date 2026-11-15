import java.util.Set;

/**
 * Dietitian subclass
 */
public class Dietitian extends HealthProfessional {
    private String dietArea;

    public Dietitian(int id, String name, Set<Integer> workingDays, String dietArea) {
        super(id, name, workingDays);
        this.dietArea = dietArea;
    }

    public String getDietArea() {
        return dietArea;
    }

    public void setDietArea(String dietArea) {
        this.dietArea = dietArea;
    }

    @Override
    public String getJobType() {
        return "Dietitian";
    }

    @Override
    public String toString() {
        return super.toString() + ", Diet Focus: " + dietArea + ", Job Type: " + getJobType();
    }
}
