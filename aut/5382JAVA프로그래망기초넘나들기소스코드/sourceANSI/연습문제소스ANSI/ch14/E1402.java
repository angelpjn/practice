import java.io.*;
public class E1402 {	
   public static void getDir(File fp) {
	String[ ] filename = fp.list( ); // ���丮�� ���Ե� ���ϰ� ���丮 �̸��� ����Ʈ ���
	for (String s : filename) {
		File f = new File(fp, s);
		if (!f.isFile( )) // ������ �ƴϰ� ���丮 Ÿ���̸�
			System.out.println("\t ���� �̸� = " + s);
	}
}

   public static void getDir(String src) {
	File dir = new File(src);
	File[ ] fList = dir.listFiles( );

	try {
		for (int i = 0; i < fList.length; i++) {
			File file = fList[i];
			if (file.isFile( )) { // ������ �ִٸ� ���� �̸� ���
				System.out.println("\t ���ϸ�: " + file.getPath( ));
			} else if (file.isDirectory( )) {
				System.out.println("���丮��: " + file.getPath( ));
				// ������丮�� �����ϸ� ����� ������� �ٽ� Ž��
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
	int pos = filename.lastIndexOf("."); // ���� ������ ã�� ��ġ
	System.out.println(fp.getPath( )); // ��� ������ ���ϸ�
	System.out.println(filename); // ���ϸ�
	System.out.println(fp.getAbsolutePath( )); // ��ü��� ������ ���ϸ�
	System.out.println(fp.getParent( )); // ������ ���� ���
	fp.delete( );

	File f2 = new File("c:/work/java//Ex1902//src");
	File[ ] fn = fp.listFiles( );
	String[ ] list = f2.list(new FilenameFilter( ) {
		// FilenameFilter�� Interface�̹Ƿ� accept�޼��带 ����
		// �� �޼��忡�� true���� ���� ���� String[ ]���� ��ȯ
		public boolean accept(File dir, String name) {
			return name.endsWith(".java"); // Ȯ���� ���� ����
		}
	});

	for (int i = 0; i < list.length; i++) {
		System.out.println(list[i]);
	}
   }

   public static void main(String[ ] args) throws IOException {
	getDir(new File("C:.\\")); // ���� �۾� ���丮�� ���Ե�
	getDir("c:/work/java");
	getFile( );
   }
}