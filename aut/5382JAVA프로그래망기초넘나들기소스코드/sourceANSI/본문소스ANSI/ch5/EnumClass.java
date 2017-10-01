enum AnimalCategory { // 열거된 5 가지만 허용
	DOG, CAT, LION, TIGER, ELEPHANT
}

class Animal {
	AnimalCategory type; // 필드, 열거된 5 가지만 허용
	String size; // 필드

	public void InitInfo( ) {
		this.type = AnimalCategory.DOG; // 점(.)으로 구분
		this.size = "귀없고 작다."; // this.필드 , 여기서는 this.을 생략해도 같음
	}

	public void showInfo( ) {
		System.out.println("동물 이름: " + type);
		System.out.println("크기 : " + size);
	}

}
public class EnumClass {
	public static void main(String[ ] args) {
		Animal obj = new Animal( );
		obj.InitInfo( ); // 필드 값을 지정한 후
		obj.showInfo( ); // 출력해야 함(위 문장이 없으면 null (값이 없으므로) 출력
	}
}