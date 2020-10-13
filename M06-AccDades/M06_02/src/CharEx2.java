import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class CharEx2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("/home/sergimc/Desktop/prova.txt"),"ISO-8859-1");
		writer.write("çaó-ñss");
		writer.write(5);
		
		writer.close();
	}

}
