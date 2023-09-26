package pt.up.fe.els2023.FileParser.InputFileParser;

import pt.up.fe.els2023.FileParser.FileParser;

import java.util.List;

public interface InputFileParser extends FileParser {

    // set source

    // add column

    // TODO Probably going to need args for columns to retrieve
    List<Object> getRow(List<String> headers);



}
