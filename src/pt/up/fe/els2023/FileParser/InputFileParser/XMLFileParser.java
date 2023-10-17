package pt.up.fe.els2023.FileParser.InputFileParser;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import pt.up.fe.els2023.Utils;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class XMLFileParser extends InputFileParser{
    public XMLFileParser(File inputFile, boolean storeFolderName) {
        this.inputFile = inputFile;
        this.storeFolderName = storeFolderName;
    }

    @Override
    public void parse() {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
        Document doc = null;

        try {
            dBuilder = dbFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }

        try {
            doc = dBuilder.parse(inputFile);
        } catch (SAXException | IOException e) {
            throw new RuntimeException(e);
        }

        doc.getDocumentElement().normalize();

        obj = Utils.generateXMLMap(doc.getDocumentElement());
        obj.put("filename", inputFile.getName());
        if (storeFolderName) {
            obj.put("folder", inputFile.getParentFile().getName());
        }
    }

    @Override
    public Map<String, Object> getFlattenedRow() {
        return Utils.getFlattenedMap(this.obj, "");
    }
}
