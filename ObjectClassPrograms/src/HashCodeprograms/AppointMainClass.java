package HashCodeprograms;

import toStringMethodPrograms.Appointment;

public class AppointMainClass {
	public static void main(String[] args) {
		Appointment a1 = new Appointment("Dr", "Ram", "12:00", "Nerologist");
		System.out.println(a1.doctorname);
		Appointment a2 = new Appointment("Dr", "Ram", "12:00", "Nerologist");
		a2.appointmentDetails();
		Appointment a3 = new Appointment("Dr", "Ram", "12:00", "Nerologist");
		System.out.println(a3);
		int uid =a1.hashCode();
		System.out.println(uid);
		int uid2 =a2.hashCode();
		System.out.println(uid2);
	}
}
