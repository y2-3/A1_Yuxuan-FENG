import java.util.Set;

/**
 * Specialist subclass
 */
public class Specialist extends HealthProfessional {
    private String specialty;

    public Specialist(int id, String name, Set<Integer> workingDays, String specialty) {
        super(id, name, workingDays);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String getJobType() {
        return "Specialist";
    }

    @Override
    public String toString() {
        return super.toString() + ", Specialty: " + specialty + ", Job Type: " + getJobType();
    }
}

