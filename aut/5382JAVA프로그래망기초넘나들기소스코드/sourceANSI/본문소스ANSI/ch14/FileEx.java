import java.io.File;
import java.io.FilenameFilter;

public class FileEx {
	public static void main(String args[ ]) {

		File f = new File("c:/work/java/Stream.out");

		// toURL( )�� deprecated �ǹǷ� getPath( )�� ��ġ�϶�.
		System.out.println(" ���: " + f.getPath( ));
		System.out.println(" ���� ���: " + f.getAbsolutePath( ));

		System.out.println(" ���ϸ�: " + f.getName( ));
		System.out.println(" �θ� ���ϸ�: " + f.getParent( ));		
		System.out.println(" f.toString( ): " + f.toString( ));
		System.out.println(" f.length( ): " + f.length( ));
		
		File file = new File("c:/work/java/");
		String[ ] list = file.list(new FilenameFilter( ) {
		// FilenameFilter�� Interface�̹Ƿ� accept�޼��带 ���� 
		// �� �޼��忡�� true���� ���� ���� String[ ]���� ��ȯ
			public boolean accept(File dir, String name) {
				return name.endsWith(".bin"); // Ȯ���� ���� ����
			}
		});

		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}