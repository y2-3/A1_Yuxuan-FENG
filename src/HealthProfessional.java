import java.util.Set;

/**
 * Abstract class representing a health professional
 */
public abstract class HealthProfessional {
    protected int id;
    protected String name;
    protected Set<Integer> workingDays;

    /**
     * Constructor with validation
     * @param id professional id
     * @param name professional name
     * @param workingDays set of working days
     */
    public HealthProfessional(int id, String name, Set<Integer> workingDays) {
        if (id <= 0) {
            System.out.println("Warning: Invalid ID, ID must be greater than 0.");
        }
        if (name == null || name.isBlank()) {
            System.out.println("Warning: Name cannot be empty.");
        }
        this.id = id;
        this.name = name;
        this.workingDays = workingDays;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Integer> getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(Set<Integer> workingDays) {
        this.workingDays = workingDays;
    }

    public abstract String getJobType();

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Working Days: " + workingDays;
    }
}
