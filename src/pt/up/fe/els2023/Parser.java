package pt.up.fe.els2023;

import org.eclipse.xtext.parser.IParser;
import com.google.inject.Inject;
import org.feup.els5.dsl.TableDSLStandaloneSetup;
import java.io.StringReader;

public class Parser {

    @Inject
    private IParser parser;

    public Parser() {
        var injector = new TableDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
        injector.injectMembers(this);
    }

    public void parse(String code) {
        var result = parser.parse(new StringReader(code));

        if (result.hasSyntaxErrors()) {
            for (var error : result.getSyntaxErrors()) {
                System.out.println("ERRORS:" + error.getSyntaxErrorMessage());
            }

            return;
        }

        var ast = result.getRootASTElement();
        var tree = ast.eAllContents();

        while (tree.hasNext()) {
            var element = tree.next();
            System.out.println("NEXT: " + element);
            System.out.println(element.getClass());
        }

    }
}