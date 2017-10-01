import java.io.File;
import java.io.FilenameFilter;

public class FileEx {
	public static void main(String args[ ]) {

		File f = new File("c:/work/java/Stream.out");

		// toURL( )는 deprecated 되므로 getPath( )로 대치하라.
		System.out.println(" 경로: " + f.getPath( ));
		System.out.println(" 절대 경로: " + f.getAbsolutePath( ));

		System.out.println(" 파일명: " + f.getName( ));
		System.out.println(" 부모 파일명: " + f.getParent( ));		
		System.out.println(" f.toString( ): " + f.toString( ));
		System.out.println(" f.length( ): " + f.length( ));
		
		File file = new File("c:/work/java/");
		String[ ] list = file.list(new FilenameFilter( ) {
		// FilenameFilter는 Interface이므로 accept메서드를 구현 
		// 이 메서드에서 true값을 갖는 값만 String[ ]으로 반환
			public boolean accept(File dir, String name) {
				return name.endsWith(".bin"); // 확장자 갖는 파일
			}
		});

		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}