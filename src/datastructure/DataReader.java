package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) {

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(textFile))) {

			String line;
			while ((line = br.readLine()) != null) {

			}

		} catch (IOException e) {
			e.printStackTrace();


		}

	}
}