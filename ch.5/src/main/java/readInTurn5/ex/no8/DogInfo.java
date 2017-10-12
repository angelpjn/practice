
package readInTurn5.ex.no8;

class DogInfo {
	String name, type;
	int age;
	
	public void setInfo(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	public void getInfo() {
		System.out.printf("이름 : %s \n품종 : %s \n나이 : %d 살\n", name, type, age);
	}
}
