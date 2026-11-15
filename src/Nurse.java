import java.util.Set;

/**
 * Nurse subclass
 */
public class Nurse extends HealthProfessional {
    private String ward;

    public Nurse(int id, String name, Set<Integer> workingDays, String ward) {
        super(id, name, workingDays);
        this.ward = ward;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    @Override
    public String getJobType() {
        return "Nurse";
    }

    @Override
    public String toString() {
        return super.toString() + ", Ward: " + ward + ", Job Type: " + getJobType();
    }
}
