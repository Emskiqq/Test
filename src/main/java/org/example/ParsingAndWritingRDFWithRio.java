package org.example;

import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.Statement;
import org.eclipse.rdf4j.model.impl.LinkedHashModel;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.RDFParser;
import org.eclipse.rdf4j.rio.RDFWriter;
import org.eclipse.rdf4j.rio.Rio;
import org.eclipse.rdf4j.rio.helpers.BasicParserSettings;
import org.eclipse.rdf4j.rio.helpers.StatementCollector;
import org.example.OwnRDFHandler.StatementCounter;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ParsingAndWritingRDFWithRio {
    public static void main(String[] args) throws IOException {


        //TODO:Read From File
//        String filename = "files/ex002.ttl";
//
//        StatementCounter myCounter = new StatementCounter();
//
//        InputStream inputStream = ParsingAndWritingRDFWithRio.class.getResourceAsStream("/"+filename);
//
//        RDFParser rdfParser = Rio.createParser(RDFFormat.TURTLE);
//
//        Model model = new LinkedHashModel();
//        //you can use any standard Java Collection class (such as java.util.ArrayList or java.util.HashSet) in place of the Model object
//        rdfParser.setRDFHandler(new StatementCollector(model));
//        //rdfParser.setRDFHandler(myCounter);
//
//        try{
//            rdfParser.parse(inputStream);
//
//        }finally {
//            inputStream.close();
//        }


//        //TODO: custom class to return size of statements
//        int numberOfStatements = myCounter.getCountedStatements();
//        System.out.println(numberOfStatements);

//        TODO: Rio guesses the format
//        RDFFormat format = Rio.getParserFormatForFileName(filename).orElse(RDFFormat.RDFXML);
//        RDFParser rdfParser2 = Rio.createParser(format);




        //TODO: write in file via RIO
//        FileOutputStream out = new FileOutputStream("/home/emiliyan/IdeaProjects/demo/src/main/resources/customFiles/ex1.rdfxml");



        //first way
//        RDFWriter writer = Rio.createWriter(RDFFormat.TURTLE,out);
//
//        try {
//            writer.startRDF();
//            for (Statement statement : model) {
//                writer.handleStatement(statement);
//            }
//            writer.endRDF();
//        }finally {
//            out.close();
//        }


            //second way shorter
//        try {
//            Rio.write(model,out,RDFFormat.RDFXML);
//        }finally {
//            out.close();
//        }





        //TODO: read from file and save result in another file without model or any kind of collections
//        FileOutputStream filePath = new FileOutputStream("/home/emiliyan/IdeaProjects/demo/src/main/resources/customFiles/ex2.nquads");
//        FileInputStream fileInputStream = new FileInputStream("/home/emiliyan/IdeaProjects/demo/src/main/resources/customFiles/ex1.ttl");
//        RDFParser rdfParser2 = Rio.createParser(RDFFormat.TURTLE);
//        RDFWriter rdfWriter = Rio.createWriter(RDFFormat.NQUADS,filePath);
//
//        rdfParser2.setRDFHandler(rdfWriter);
//
//        try{
//            rdfParser2.parse(fileInputStream);
//        }finally {
//            inputStream.close();
//        }






        //TODO: Programmatic configuration

//By default the Rio parsers validate IRI syntax and produce a fatal error if an IRI can not be parsed. You can disable this as follows:
//        RDFParser rdfParser1 = Rio.createParser(RDFFormat.TURTLE);
//        rdfParser1.getParserConfig().set(BasicParserSettings.VERIFY_URI_SYNTAX,false);
//
////If you want to make Rio still report syntax errors, but continue processing the file, you can do so as follows:
//        RDFParser rdfParser2=Rio.createParser(RDFFormat.TURTLE);
//        rdfParser2.getParserConfig().addNonFatalError(BasicParserSettings.VERIFY_URI_SYNTAX);
//
////If you want to preserve blank node identifiers as found in the source file (by default the parser creates new identifiers to ensure uniqueness across multiple files), you can reconfigure the parser as follows:
//        RDFParser rdfParser3 = Rio.createParser(RDFFormat.TURTLE);
//        rdfParser3.getParserConfig().set(BasicParserSettings.PRESERVE_BNODE_IDS,true);


    }
}
