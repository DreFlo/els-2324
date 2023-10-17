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
    protected Map<String, Object> getMapFromFile() {
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

        return Utils.generateXMLMap(doc.getDocumentElement());
    }
}
