public class Appointment {
    private String patientName;
    private String patientMobile;
    private HealthProfessional healthProfessional;
    private String timeSlot;

    public Appointment(String patientName, String patientMobile, HealthProfessional hp, String timeSlot) {
        if(patientName == null || patientName.isBlank()){
            System.out.println("Warning: patient name cannot be empty");
        }
        if(patientMobile == null || patientMobile.isBlank()){
            System.out.println("Warning: patient mobile cannot be empty");
        }
        if(hp == null){
            System.out.println("Warning: health professional cannot be null");
        }
        if(timeSlot == null || timeSlot.isBlank()){
            System.out.println("Warning: time slot cannot be empty");
        }
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.healthProfessional = hp;
        this.timeSlot = timeSlot;
    }

    public String getPatientName() { return patientName; }
    public String getPatientMobile() { return patientMobile; }
    public HealthProfessional getHealthProfessional() { return healthProfessional; }
    public String getTimeSlot() { return timeSlot; }

    @Override
    public String toString() {
        return "Appointment{PatientName:" + patientName + ", Mobile:" + patientMobile
                + ", Time:" + timeSlot + ", " + healthProfessional + "}";
    }
}