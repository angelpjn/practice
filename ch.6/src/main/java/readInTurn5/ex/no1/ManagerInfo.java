package readInTurn5.ex.no1;

class ManagerInfo extends Employee {

	ManagerInfo(String name, String address, String telephone) {
		super(name, address, telephone);
	}
	
	public String toString() {
		return ("name : " + super.name + "\naddress : " + address + "\ntelephone : " + telephone);
	}
}
