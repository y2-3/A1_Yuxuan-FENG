import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AssignmentOne {
    public static void main(String[] args) {
        // GP构造：id, name, workingDays Set, clinicName
        Set<Integer> day1 = new HashSet<>();
        day1.add(1);
        day1.add(2);
        day1.add(3);
        HealthProfessional drAlice = new GP(101, "Dr. Alice", day1, "City Community Clinic");

        Set<Integer> day2 = new HashSet<>();
        day2.add(4);
        day2.add(5);
        HealthProfessional drBob = new Specialist(201, "Dr. Bob", day2, "Cardiology");

        System.out.println("=== All Health Professionals ===");
        System.out.println(drAlice);
        System.out.println(drBob);

        AppointmentManager manager = new AppointmentManager();

        // Appointment顺序：name, mobile, hp, time
  Appointment a1 = new Appointment("Tom", "0400111222", drAlice, "08:30");
Appointment a2 = new Appointment("Lily", "0400333444", drBob, "09:00");
Appointment a3 = new Appointment("Tom", "0400111222", drAlice, "08:30");

        System.out.println("\n===== Appointment System Demo =====");
        manager.addAppointment(a1);
        manager.addAppointment(a2);
        manager.addAppointment(a3);

        System.out.println("\n--- All Appointments ---");
        manager.printAllAppointments();

        System.out.println("\n--- Filter by doctor id = 101 ---");
        ArrayList<Appointment> list1 = manager.findByDoctorId(101);
        for (Appointment ap : list1) {
            System.out.println(ap);
        }

        System.out.println("\n--- Sort appointments by time ---");
        manager.sortByTime();
        manager.printAllAppointments();

        System.out.println("\n--- Cancel appointment (doctorId=101, time=08:30) ---");
        manager.cancelByDoctorAndTime(101, "08:30");

        System.out.println("\n--- Try cancel non-existent appointment ---");
        manager.cancelByDoctorAndTime(101, "09:30");

        System.out.println("\n--- Final appointment list ---");
        manager.printAllAppointments();

        System.out.println("\n--- Delete all appointments by mobile 0400333444 ---");
        manager.cancelByMobile("0400333444");
        manager.printAllAppointments();
    }
}
