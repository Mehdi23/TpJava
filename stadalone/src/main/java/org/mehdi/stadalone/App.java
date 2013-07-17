package org.mehdi.stadalone;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import org.xtext.example.mydsl.FMLStandaloneSetup;

import com.google.inject.Inject;
import com.google.inject.Injector; 

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.parser.ParseException;

public class App 
{
    @Inject
    private IParser parser;
 
    public App() {
        setupParser();
    }
 
    private void setupParser() {
        Injector injector = new FMLStandaloneSetup().createInjectorAndDoEMFRegistration();
        injector.injectMembers(this);
    }
 
    /**
     * Parses data provided by an input reader using Xtext and returns the root node of the resulting object tree.
     * @param reader Input reader
     * @return root object node
     * @throws IOException when errors occur during the parsing process
     */
    public EObject parse(Reader reader) throws IOException
    {
        IParseResult result = parser.parse(reader);
        if(result.hasSyntaxErrors())
        {
            throw new ParseException("Provided input contains syntax errors.");
        }
        return result.getRootASTElement();
    }
    
    public String findError(Reader reader) 
    {
        IParseResult result = parser.parse(reader);
        if(result.hasSyntaxErrors())
        {
            Iterable<INode> errorsList = result.getSyntaxErrors();
            return errorsList.toString();
        }
        return result.getRootASTElement().toString();
    }
	
    public static void main( String[] args ) throws IOException
    {
    	Reader reader = new StringReader("ViewDefinition Exemple1 uri= http://exemple1 {VirtualModel VM1 type = hjdlhkd uri = http://exemple { }}");
    	App test = new App();
    	System.out.println(test.findError(reader));
    	//EObject e = test.parse(reader);
    	//System.out.println(e.toString());
    	//System.out.println(EcoreUtil.getIdentification(e));
    }
}
