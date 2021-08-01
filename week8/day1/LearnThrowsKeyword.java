package week8.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LearnThrowsKeyword {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		FileInputStream fis =new FileInputStream("./data/test.xlsx");
		
		Thread.sleep(500);

	}

}
