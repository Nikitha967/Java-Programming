package HashCodeprograms;

public class Appointment {
	public String doctorname;
	public String patientname;
	public String apptime;
	public String deptname;
	public Appointment (String doctorname,String patientname,String apptime,String deptname  ) 
	{
		
		this.doctorname=doctorname;
		this.patientname=patientname;
		this.apptime=apptime;
		this.deptname=deptname;
		
	}
	@Override
	public String toString() {
		return "doctorname: "+doctorname+"\n"+"deptname"+deptname+"\n"+"apptime"+apptime;
	}
	
	public void appointmentDetails() {
		System.out.println("doctorname: "+doctorname);
		System.out.println("patientname: "+patientname);
		System.out.println("apptime: "+apptime);
		System.out.println("deptname: "+deptname);

	}

}
