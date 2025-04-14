package EqualstoPrograms;

import toStringMethodPrograms.Appointment;

public class AppointMainClass {
	public static void main(String[] args) {
		Appointment a1 = new Appointment("Dr", "Ram", "12:00", "Nerologist");
		System.out.println(a1.doctorname);
		Appointment a2 = new Appointment("Dr", "Ram", "12:00", "Nerologist");
		a2.appointmentDetails();
		Appointment a3 = new Appointment("Dr", "Ram", "12:00", "Nerologist");
		System.out.println(a3);
		boolean res =a1.equals(a2);
		System.out.println(res);
		boolean res1 =a1.equals(a3);
		System.out.println(res1);
	}
}
