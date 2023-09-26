package pt.up.fe.els2023;


import pt.up.fe.els2023.Config.TableConfig;
import pt.up.fe.els2023.Controller.Controller;
import pt.up.fe.els2023.FileParser.ConfigFileParser.JSONConfigFileParser;

import java.io.File;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Controller controller = new Controller(new File(args[0]));
		controller.setup();
		controller.run();
	}
}