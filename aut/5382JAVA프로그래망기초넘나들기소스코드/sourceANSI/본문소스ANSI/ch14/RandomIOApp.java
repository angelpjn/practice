import java.io.*;

public class RandomIOApp {
	public static void main(String args[ ]) throws IOException {
		String fileName = "c:/work/java/rio.dat";
		String msg = "I can do it.\n";
		String msg2 = "Java";
		StringBuffer sb = new StringBuffer(msg2);
		sb.setLength(msg2.length( ));

		RandomAccessFile f = new RandomAccessFile(fileName, "rw");
		f.writeBoolean(true);
		f.writeInt(7788);
		f.writeChar(65);
		f.writeUTF("J");
		f.writeDouble(1234.56);
		f.writeChars(sb.toString( ));
		f.writeBytes(msg);

		f.seek(0);

		System.out.println(f.readBoolean( ));
		System.out.println(f.readInt( ));
		System.out.println(f.readChar( ));
		System.out.println(f.readUTF( ));
		System.out.println(f.readDouble( ));

		char[ ] temp = new char[msg2.length( )];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = f.readChar( );
			System.out.print(temp[i]);
		}
		System.out.println( );

		long pos = f.getFilePointer( );
		f.seek(pos);

		byte[ ] buffer = new byte[msg.length( )];
		f.read(buffer);
		System.out.println(new String(buffer));
		f.close( );
	}
}