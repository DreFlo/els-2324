package pt.up.fe.els2023;

import pt.up.fe.els2023.FileParser.InputFileParser.YamlFileParser;

import java.io.File;



public class Main {
	
	public static void main(String[] args) {
		YamlFileParser yamlFileParser = new YamlFileParser();
		yamlFileParser.parse(new File(args[0]));

	}
}