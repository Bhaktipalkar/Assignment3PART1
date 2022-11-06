package firstPackage;

public class Nurse extends HospitalEmployee{
	
	protected  int numOfPatients;
	

	public Nurse(String eName, int eNumber, int nop) {
		super(eName, eNumber);
		numOfPatients=nop;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		super.work();
		System.out.println(name+" is a nurse with "+numOfPatients+ "patients");
	}
	



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return (name+number+" has "+numOfPatients+ "patients");
	}

}
