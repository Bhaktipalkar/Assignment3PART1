package firstPackage;
public class HospitalEmployee {
protected String name;
protected int number;

public HospitalEmployee(String eName,int eNumber)
{
	name=eName;
	number=eNumber;
	
}

public void work()
{
System.out.println (name + " works for the hospital.");
}


@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
	return (name+" "+number);
	}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

}
