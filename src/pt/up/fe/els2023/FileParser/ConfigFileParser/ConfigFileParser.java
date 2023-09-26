package pt.up.fe.els2023.FileParser.ConfigFileParser;

import pt.up.fe.els2023.Config.TableConfig;
import pt.up.fe.els2023.FileParser.FileParser;

import java.util.List;

public interface ConfigFileParser extends FileParser {
    List<TableConfig> getConfigurationFiles();

}
