package pt.up.fe.els2023;

import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;


public class Main {
	
	public static void main(String[] args) {
		Yaml yaml = new Yaml();
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(args[0]);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		Map<String, Object> obj = yaml.load(inputStream);
		System.out.println(obj);
	}
}