import java.util.ArrayList;

public class FileIOClient {

	public static void main(String[] args) {
		BufferedWriterSyntaxExample fileWriter = new BufferedWriterSyntaxExample();
		fileWriter.writeLineToFile("This line will be in the file.");

		BufferedReaderSyntaxExample fileReader = new BufferedReaderSyntaxExample();
		ArrayList<String> allLines = fileReader.readWholeFileAsList();
		for (String tempLine : allLines) {
			System.out.println(tempLine);
		}

	}

}