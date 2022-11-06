package firstPackage;

public class Doctor extends HospitalEmployee {
	protected String Speciality;
public Doctor(String eName, int eNumber, String specs) {
		super(eName, eNumber);
		Speciality=specs;
		// TODO Auto-generated constructor stub
	}
@Override
public void work() {
	// TODO Auto-generated method stub
	super.work();
	System.out.println(name+" is a Heart doctor");
}


@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
	return (name+" "+number+" "+Speciality);
	
	}
}
