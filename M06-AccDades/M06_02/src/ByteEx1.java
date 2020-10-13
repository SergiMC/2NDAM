import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		DataOutputStream streamEscriptura = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("/home/sergimc/eclipse-workspace/M06_02/filebyte1.txt",true)));
		streamEscriptura.writeBoolean(true);
		streamEscriptura.writeUTF("Sergi");
		streamEscriptura.writeInt(100500);
		streamEscriptura.close();



	
	}	

}
