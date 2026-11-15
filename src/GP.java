import java.util.Set;

/**
 * General Practitioner subclass
 */
public class GP extends HealthProfessional {
    private String clinicName;

    public GP(int id, String name, Set<Integer> workingDays, String clinicName) {
        super(id, name, workingDays);
        this.clinicName = clinicName;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    @Override
    public String getJobType() {
        return "General Practitioner";
    }

    @Override
    public String toString() {
        return super.toString() + ", Clinic: " + clinicName + ", Job Type: " + getJobType();
    }
}
