package org.example;

import org.eclipse.rdf4j.model.*;
import org.eclipse.rdf4j.model.util.ModelBuilder;
import org.eclipse.rdf4j.model.util.Models;
import org.eclipse.rdf4j.model.util.Values;
import org.eclipse.rdf4j.model.vocabulary.FOAF;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import org.eclipse.rdf4j.query.*;
import org.eclipse.rdf4j.query.resultio.text.tsv.SPARQLResultsTSVWriter;
import org.eclipse.rdf4j.repository.Repository;
import org.eclipse.rdf4j.repository.RepositoryConnection;
import org.eclipse.rdf4j.repository.RepositoryResult;
import org.eclipse.rdf4j.repository.sail.SailRepository;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.RDFHandler;
import org.eclipse.rdf4j.rio.Rio;
import org.eclipse.rdf4j.sail.memory.MemoryStore;
import org.example.CustomVocabularies.EX;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Set;

import static org.eclipse.rdf4j.model.util.Values.iri;
import static org.eclipse.rdf4j.model.util.Values.literal;

public class RDF4JExamples {
    public static void main(String[] args) throws IOException {

//        String ex = "http://example.org/";
//
//        IRI picasso = Values.iri(ex, "Picasso");
//        IRI artist = Values.iri(ex, "Artist");

        // Example of Model 2.1

//        Model model = new TreeModel();
//
//        model.add(picasso, RDF.TYPE, artist);
//        model.add(picasso, FOAF.FIRST_NAME, Values.literal("Pablo"));
//
//        for (Statement statement : model) {
//            System.out.println(statement);
//        }

        // Example of Model Builder 2.2
//        ModelBuilder modelBuilder = new ModelBuilder();
//        Model model = modelBuilder.setNamespace("ex","http://example.org/")
//                .subject("ex:Picasso")
//                .add(RDF.TYPE,"ex:Artist")
//                .add(FOAF.FIRST_NAME,"Pablo")
//                .build();
//
//        model.forEach(System.out::println);

        // Example 3.1 Model Builder using date and a number

//        ModelBuilder builder = new ModelBuilder();
//        Model model = builder
//                .setNamespace("ex", "http://example.org/")
//                .subject("ex:PotatoEasters")
//                //.add("ex:creationDate", literal("1885-04-01", XSD.DATE))
//                .add("ex:creationDate", LocalDate.parse("1885-04-01"))
//                .add("ex:creationDate2", literal("1885-04-01", XSD.DATE))
//                .add("ex:peopleDepicted", 5)
//                .build();
//
//        for (Statement statement : model) {
//            IRI property = statement.getPredicate();
//            Value value = statement.getObject();
//
//            if (value.isLiteral()) {
//                Literal literal = (Literal) value;
//                System.out.println("datatype: " + literal.getDatatype());
//
//
//                if (property.getLocalName().equals("peopleDepicted")) {
//                    int peopleDepicted = literal.intValue();
//                    System.out.println(peopleDepicted + " people are depicted in this painting");
//                } else if (property.getLocalName().equals("creationDate")) {
//                    LocalDate date = LocalDate.from(literal.temporalAccessorValue());
//                    System.out.println("The painting was created on " + date);
//                }
//
//                System.out.println("Lexical value: '" + literal.getLabel() + "'");
//
//            }
//        }

        // Example 3.2 adding an artwork’s title in Dutch and English

//        ModelBuilder builder = new ModelBuilder();
//        Model model = builder
//                .setNamespace("ex","http://example.org/")
//                .subject("ex:PotatoEaters")
//                .add(DC.TITLE, Values.literal("The Potato Eaters","en"))
//                .add(DC.TITLE, Values.literal("De Aardappeleters","hollland"))
//                .build();
//
//        for (Statement statement : model) {
//            Value value = statement.getObject();
//           // System.out.println("Predicate " + statement.getPredicate());
//            if(value.isLiteral()){
//                Literal title = (Literal) value;
//               // System.out.println(title);
//                System.out.println("language "+ title.getLanguage().orElse("unknown"));
//                System.out.println(" title: "+ title.getLabel());
//            }
//        }

        // Example 4.1 adding blank nodes to a Model

//        BNode address = Values.bnode();
//
//        ModelBuilder builder = new ModelBuilder();
//        Model model = builder
//                .setNamespace("ex","http://example.org/")
//                .subject("ex:Picasso")
//                .add(RDF.TYPE, "ex:Artist")
//                .add(FOAF.FIRST_NAME, "Pablo")
//                //using blankNode
//                .add("ex:homeAddress", address)
//                //switch subject to blankNode
//                .subject(address)
//                .add("ex:street","31 Art Gallery")
//                .add("ex:city","Madrid")
//                .add("ex:country","Spain")
//                .build();
//
//      Rio.write(model, System.out, RDFFormat.TURTLE);
//      Rio.write(model, System.out, RDFFormat.TURTLESTAR);
//       Rio.write(model, System.out, RDFFormat.BINARY);
//       Rio.write(model, System.out, RDFFormat.TRIG);
//       Rio.write(model, System.out, RDFFormat.N3);
//
//        for (Statement statement : model) {
//            System.out.println(statement);
//        }
//
//        //shows how we can write our Model as RDF/XML, using the RDF4J Rio parser/writer tools
//        Rio.write(model, System.out, RDFFormat.RDFXML);


        // Example 5.3 Reading a Turtle RDF file


//        String filename = "files/ex002.ttl";
//
//        InputStream input = RDF4JExamples.class.getResourceAsStream("/" + filename);
//
//        Model model = Rio.parse(input, "",RDFFormat.TURTLE);
//
//        model.forEach(System.out::println);


        // Example 6.1 filtering on a specific subject

//        String filename = "files/ex002.ttl";
//
//        InputStream input = RDF4JExamples.class.getResourceAsStream("/" + filename);
//
//        Model model = Rio.parse(input, "",RDFFormat.TURTLE);
//
//        IRI vanGogh = Values.iri("http://example.org/richard");
//
//        Model aboutRichard = model.filter(vanGogh, null, null);
//
//        for (Statement statement : aboutRichard) {
//            IRI sub = (IRI) statement.getSubject();
//
//            IRI predicate = statement.getPredicate();
//
//            Value object = statement.getObject();
//
//            System.out.println(sub.getLocalName() + " " + predicate.getLocalName()+" ");
//
//            if(object.isLiteral()){
//                System.out.println("\""+((Literal)object).getLabel()+"\"");
//                System.out.println(object);
//                System.out.println(((Literal) object).getDatatype());
//                System.out.println(((Literal) object).getLanguage());
//            }else if( object.isIRI()){
//                System.out.println(((IRI)object).getLocalName());
//            }else {
//                System.out.println(object);
//            }
//        }

        // Example 6.2 Getting all property values for a resource. Create a custom class/vocabulary

//        String filename = "files/ex002.ttl";
//
//        InputStream input = RDF4JExamples.class.getResourceAsStream("/" + filename);
//
//        Model model = Rio.parse(input, "",RDFFormat.TURTLE);
//
//        IRI picasso = iri(EX.NAMESPACE,"Picasso");
//
//        //Model aboutRichard = model.filter(richard, null, null);
//
//        Set<Value> paintings = model.filter(picasso, EX.CREATOR_OF, null).objects();
//        Model asd = model.filter(picasso, EX.CREATOR_OF, null);
//
//        for (Value painting : paintings) {
//            if (painting instanceof Resource){
//                Model paintingProperties = model.filter((Resource)painting, null, null);
//
//                System.out.println("--- information about painting: " + painting);
//
//                Rio.write(paintingProperties, System.out, RDFFormat.TURTLE);
//                System.out.println();
//            }
//        }
        // Example 6.2 Retrieving a single property value

//        String filename = "files/ex002.ttl";
//
//        InputStream input = RDF4JExamples.class.getResourceAsStream("/" + filename);
//
//        Model model = Rio.parse(input, "",RDFFormat.TURTLE);
//
//        IRI picasso = iri(EX.NAMESPACE,"Picasso");
//
//        //Set<Resource> subjects = model.filter(null, RDF.TYPE, EX.ARTIST).subjects();
//        for (Resource subject:model.filter(null, RDF.TYPE, EX.ARTIST).subjects()) {
//            System.out.println(subject);
//
//            Model firstNameTriples = model.filter(subject, FOAF.FIRST_NAME, null);
//            System.out.println(firstNameTriples);
//
//            String firstName = Models.objectString(firstNameTriples).orElse("(unknown)");
//
//            System.out.println(firstName);
//
//        }



        // Example 7.1 Adding statements to two named graphs

//        ModelBuilder builder = new ModelBuilder();
//        builder.setNamespace("ex","http://example.org/");
//
//        builder.namedGraph("ex:namedGraph1")
//                .subject("ex:Picasso")
//                .add(RDF.TYPE,EX.ARTIST)
//                .add(FOAF.FIRST_NAME,"Pablo");
//
//        builder.namedGraph("ex:namedGraph2")
//                .subject("ex:VanGogh")
//                .add(RDF.TYPE,EX.ARTIST)
//                .add(FOAF.FIRST_NAME,"Vincent");
//
//        Model model = builder.build();
//
//        for (Resource context : model.contexts()) {
//            System.out.println("Named graph " + context + " contains: ");
//
//            Rio.write(model.filter(null,null,null,context),System.out,RDFFormat.TURTLE);
//            System.out.println();
//        }

        // Example 8.1 Adding an RDF Model to a database

//        String filename = "files/ex002.ttl";
//
//        InputStream input = RDF4JExamples.class.getResourceAsStream("/"+filename);
//        Model model = Rio.parse(input,"",RDFFormat.TURTLE);
//
//
//        Repository db = new SailRepository(new MemoryStore());
//
//        try(RepositoryConnection conn=  db.getConnection()){
//            conn.add(model);
//
//            try(RepositoryResult<Statement> result = conn.getStatements(null, null, null)){
//                for (Statement statement : result) {
//                    System.out.println("db contains: "+ statement);
//                }
//            }
//        } finally {
//            db.shutDown();
//        }

        // Example 8.2 Adding an RDF Model to a database directly without Model model

//        Repository db = new SailRepository(new MemoryStore());
//
//        try(RepositoryConnection conn = db.getConnection()){
//            String filename = "files/ex002.ttl";
//            try(InputStream input = RDF4JExamples.class.getResourceAsStream("/"+filename)){
//                conn.add(input,"",RDFFormat.TURTLE);
//            }
//
//            try(RepositoryResult<Statement> result = conn.getStatements(null, null,null)){
//                for (Statement statement : result) {
//                    System.out.println("db contains " + statement);
//                }
//            }
//        }finally {
//            db.shutDown();
//        }

        // Example 8.3 SPARQL SELECT Queries

//        Repository db = new SailRepository(new MemoryStore());
//
//        try(RepositoryConnection connection = db.getConnection()){
//            String filename = "files/ex002.ttl";
//
//            try(InputStream input = RDF4JExamples.class.getResourceAsStream("/"+filename)){
//                connection.add(input,"",RDFFormat.TURTLE);
//            }
//
//
//            String queryString = "PREFIX ex: <http://example.org/> \n";
//            queryString += "PREFIX foaf: <"+FOAF.NAMESPACE+">\n";
//            queryString += "SELECT ?s ?n \n";
//            queryString += "WHERE {\n";
//            queryString += " ?s a ex:Artist; \n";
//            queryString += "     foaf:firstName ?n \n";
//            queryString += "}";
//
//            TupleQuery query  = connection.prepareTupleQuery(queryString);
//
//
//            // get information from query method 1
////            List<BindingSet> result = QueryResults.asList(query.evaluate());
////
////            for (BindingSet solution : result) {
////                System.out.println(solution);
////                System.out.println("?s = "+solution.getValue("s"));
////                System.out.println("?n = "+solution.getValue("n"));
////            }
//
//
//            // get information from query method 3
////            TupleQueryResultHandler tsvWriter = new SPARQLResultsTSVWriter(System.out);
////            query.evaluate(tsvWriter);
//
//
//            // get information from query method 2
//
////            try(TupleQueryResult result = query.evaluate()){
////
////                System.out.println(result);
////
////                for (BindingSet solution : result) {
////                    System.out.println(solution);
////                    System.out.println("?s = "+solution.getValue("s"));
////                    System.out.println("?n = "+solution.getValue("n"));
////                }
////            }
//        }finally {
//            db.shutDown();
//        }


        // Example 8.4 SPARQL CONSTRUCT Queries

//        Repository db = new SailRepository(new MemoryStore());
//
//        try(RepositoryConnection conn = db.getConnection()){
//
//            String filename = "files/ex002.ttl";
//            try(InputStream input = RDF4JExamples.class.getResourceAsStream("/"+filename)){
//                conn.add(input,"",RDFFormat.TURTLE);
//            }
//
//            String queryString = "PREFIX ex: <http://example.org/> \n";
//            queryString += "PREFIX foaf: <"+FOAF.NAMESPACE+">\n";
//            queryString += "CONSTRUCT \n";
//            queryString += "WHERE {\n";
//            queryString += " ?s a ex:Artist; \n";
//            queryString += "     foaf:firstName ?n .\n";
//            queryString += "}";
//
//            GraphQuery query = conn.prepareGraphQuery(queryString);
//
//
////                get information from query method 1
//
////            Model result = QueryResults.asModel(query.evaluate());
////            for (Statement statement : result) {
////                System.out.println(statement);
////
//
//
////              get information from query method 3
//
////            RDFHandler turtleWriter = Rio.createWriter(RDFFormat.TURTLE,System.out);
////            query.evaluate(turtleWriter);
//
//
////              get information from query method 2
//
////            try(GraphQueryResult result = query.evaluate()){
////                for (Statement statement : result) {
////                    System.out.println(statement);
////                }
////            }
//        } finally {
//            db.shutDown();
//        }

    }
}
