package firstPackage;

public class Surgeon extends Doctor{
	public boolean operating;
public Surgeon(String eName, int eNumber, String specs, boolean ope) {
		super(eName, eNumber, specs);
		operating=ope;
		// TODO Auto-generated constructor stub
	}
@Override
public void work() {
	// TODO Auto-generated method stub
	super.work();
	System.out.println(name+" is operating now");
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return (name+number+" "+Speciality+"operating"+": "+operating);
	}

}
