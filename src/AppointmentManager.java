import java.util.ArrayList;

public class AppointmentManager {
    private ArrayList<Appointment> appointmentList;

    public AppointmentManager() {
        appointmentList = new ArrayList<>();
    }

    public void addAppointment(Appointment newApp) {
        for(int i = 0; i < appointmentList.size(); i++){
            Appointment a = appointmentList.get(i);
            if(a.getHealthProfessional().getId() == newApp.getHealthProfessional().getId()
                    && a.getTimeSlot().equals(newApp.getTimeSlot())){
                System.out.println("Error: Double booking. This professional is occupied at " + newApp.getTimeSlot());
                return;
            }
        }
        appointmentList.add(newApp);
        System.out.println("Success: appointment added.");
    }

    public ArrayList<Appointment> findByDoctorId(int doctorId) {
        ArrayList<Appointment> result = new ArrayList<>();
        for(int i = 0; i < appointmentList.size(); i++){
            Appointment a = appointmentList.get(i);
            if(a.getHealthProfessional().getId() == doctorId){
                result.add(a);
            }
        }
        return result;
    }

    public ArrayList<Appointment> findByMobile(String mobile) {
        ArrayList<Appointment> result = new ArrayList<>();
        for(int i = 0; i < appointmentList.size(); i++){
            Appointment a = appointmentList.get(i);
            if(a.getPatientMobile().equals(mobile)){
                result.add(a);
            }
        }
        return result;
    }

    public void sortByTime() {
        for(int i = 0; i < appointmentList.size()-1; i++){
            for(int j = 0; j < appointmentList.size()-1-i; j++){
                Appointment a1 = appointmentList.get(j);
                Appointment a2 = appointmentList.get(j+1);
                if(a1.getTimeSlot().compareTo(a2.getTimeSlot()) > 0){
                    Appointment temp = a1;
                    appointmentList.set(j,a2);
                    appointmentList.set(j+1,temp);
                }
            }
        }
    }

    public void cancelByDoctorAndTime(int doctorId, String time) {
        int index = -1;
        for(int i = 0; i < appointmentList.size(); i++){
            Appointment a = appointmentList.get(i);
            if(a.getHealthProfessional().getId() == doctorId && a.getTimeSlot().equals(time)){
                index = i;
                break;
            }
        }
        if(index != -1){
            appointmentList.remove(index);
            System.out.println("Success: appointment cancelled.");
        }else{
            System.out.println("Error: cannot find this appointment to cancel.");
        }
    }

    public void cancelByMobile(String mobile) {
        boolean found = false;
        for(int i = appointmentList.size()-1; i >= 0; i--){
            Appointment a = appointmentList.get(i);
            if(a.getPatientMobile().equals(mobile)){
                appointmentList.remove(i);
                found = true;
            }
        }
        if(found){
            System.out.println("Success: all appointments for this mobile cancelled.");
        }else{
            System.out.println("Error: no appointment found for this mobile.");
        }
    }

    public void printAllAppointments() {
        if(appointmentList.isEmpty()){
            System.out.println("No appointments stored.");
            return;
        }
        for(int i = 0; i < appointmentList.size(); i++){
            System.out.println(appointmentList.get(i));
        }
    }
}
