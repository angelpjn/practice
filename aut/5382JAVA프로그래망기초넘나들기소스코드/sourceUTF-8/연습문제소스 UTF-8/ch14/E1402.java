import java.io.*;
public class E1402 {	
   public static void getDir(File fp) {
	String[ ] filename = fp.list( ); // 디렉토리에 포함된 파일과 디렉토리 이름의 리스트 얻기
	for (String s : filename) {
		File f = new File(fp, s);
		if (!f.isFile( )) // 파일이 아니고 디렉토리 타입이면
			System.out.println("\t 파일 이름 = " + s);
	}
}

   public static void getDir(String src) {
	File dir = new File(src);
	File[ ] fList = dir.listFiles( );

	try {
		for (int i = 0; i < fList.length; i++) {
			File file = fList[i];
			if (file.isFile( )) { // 파일이 있다면 파일 이름 출력
				System.out.println("\t 파일명: " + file.getPath( ));
			} else if (file.isDirectory( )) {
				System.out.println("디렉토리명: " + file.getPath( ));
				// 서브디렉토리가 존재하면 재귀적 방법으로 다시 탐색
				getDir(file.getCanonicalPath( ).toString( ));
			}
		}
	} catch (IOException e) {
   }
}

   public static void getFile( ) throws IOException {
	File fp = new File("c:/work/java/FileTest.java");
	String filename = fp.getName( );
	fp.createNewFile( );
	int pos = filename.lastIndexOf("."); // 문자 끝부터 찾은 위치
	System.out.println(fp.getPath( )); // 경로 포함한 파일명
	System.out.println(filename); // 파일명
	System.out.println(fp.getAbsolutePath( )); // 전체경로 포함한 파일명
	System.out.println(fp.getParent( )); // 파일이 속한 경로
	fp.delete( );

	File f2 = new File("c:/work/java//Ex1902//src");
	File[ ] fn = fp.listFiles( );
	String[ ] list = f2.list(new FilenameFilter( ) {
		// FilenameFilter는 Interface이므로 accept메서드를 구현
		// 이 메서드에서 true값을 갖는 값만 String[ ]으로 반환
		public boolean accept(File dir, String name) {
			return name.endsWith(".java"); // 확장자 갖는 파일
		}
	});

	for (int i = 0; i < list.length; i++) {
		System.out.println(list[i]);
	}
   }

   public static void main(String[ ] args) throws IOException {
	getDir(new File("C:.\\")); // 현재 작업 디렉토리에 포함된
	getDir("c:/work/java");
	getFile( );
   }
}