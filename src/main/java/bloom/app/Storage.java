package bloom.app;

import bloom.constant.Message;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Manages database.
 */

public class Storage {
	
	/** The file path the destination database file */
	private final String FILE_PATH = "src/main/java/bloom/data/bloomDB.txt";

	/**
	 * Saves the list of tasks into the database file.
 	 */
	
	public void saveToDb() {
		try {
			Path path = Paths.get(FILE_PATH);
			
			if (!Files.exists(path)) {
				Files.createFile(path);
			}
			
			StringBuilder stringBuilder = new StringBuilder();
			for (int i = 0; i < TaskList.size(); ++i) {
				stringBuilder.append(TaskList.get(i).toDb());
			}
			String tasks = stringBuilder.toString();
			
			byte[] bytes = tasks.getBytes(tasks);
			Files.write(path, bytes);
		} catch (IOException e) {
			System.out.println(Message.EXCEPTION_IO.getMessage());
		}
	}
}
