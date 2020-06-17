import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterSyntaxExample {

	public void writeLineToFile(String line) {
		// Use relative path. Absolute paths might not work depending on Windows vs. Mac
		String filename = "output.txt";

		try {
			// BufferedWriter- a chain stream that works with chars
			// FileWriter- a connection stream that writes chars
			// Don't need to keep a reference to the FileWriter object
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename, true));

			// Write them out one per line
			bufferedWriter.write(line);

			bufferedWriter.newLine();

			bufferedWriter.close();
		}

		// Lots of things can go wrong when connecting to the text file
		catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}