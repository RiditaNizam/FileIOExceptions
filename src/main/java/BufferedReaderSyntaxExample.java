import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class BufferedReaderSyntaxExample {

	public ArrayList<String> readWholeFileAsList() {
		String filename = "output.txt";
		ArrayList<String> lines = new ArrayList<String>();
		try {
			Reader reader = new FileReader(filename);
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line = bufferedReader.readLine();
			while (line != null) {
				lines.add(line);
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			// Do something to recover from the FileNotFoundException
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			// Do something to recover from the IOException
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return lines;
	}

}