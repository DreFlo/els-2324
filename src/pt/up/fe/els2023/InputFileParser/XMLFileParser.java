package pt.up.fe.els2023.InputFileParser;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import pt.up.fe.els2023.Utils.TableUtils;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class XMLFileParser extends InputFileParser{
    public XMLFileParser(File inputFile) {
        this.inputFile = inputFile;
    }

    @Override
    protected Map<String, Object> getMapFromFile() {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        Document doc;

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

        return TableUtils.generateXMLMap(doc.getDocumentElement());
    }
}
