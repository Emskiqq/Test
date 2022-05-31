package org.example;

import org.eclipse.rdf4j.model.*;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;
import org.eclipse.rdf4j.model.vocabulary.FOAF;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import org.eclipse.rdf4j.query.*;
import org.eclipse.rdf4j.query.algebra.Str;
import org.eclipse.rdf4j.query.explanation.Explanation;
import org.eclipse.rdf4j.query.resultio.text.csv.SPARQLResultsCSVWriter;
import org.eclipse.rdf4j.repository.Repository;
import org.eclipse.rdf4j.repository.RepositoryConnection;
import org.eclipse.rdf4j.repository.RepositoryResult;
import org.eclipse.rdf4j.repository.config.RepositoryConfig;
import org.eclipse.rdf4j.repository.config.RepositoryImplConfig;
import org.eclipse.rdf4j.repository.http.HTTPRepository;
import org.eclipse.rdf4j.repository.manager.LocalRepositoryManager;
import org.eclipse.rdf4j.repository.sail.SailRepository;
import org.eclipse.rdf4j.repository.sail.SailRepositoryConnection;
import org.eclipse.rdf4j.repository.sail.config.SailRepositoryConfig;
import org.eclipse.rdf4j.repository.sparql.SPARQLRepository;
import org.eclipse.rdf4j.repository.util.Repositories;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.RDFHandler;
import org.eclipse.rdf4j.rio.RDFWriter;
import org.eclipse.rdf4j.rio.Rio;
import org.eclipse.rdf4j.sail.config.SailImplConfig;
import org.eclipse.rdf4j.sail.inferencer.fc.SchemaCachingRDFSInferencer;
import org.eclipse.rdf4j.sail.inferencer.fc.config.SchemaCachingRDFSInferencerConfig;
import org.eclipse.rdf4j.sail.memory.MemoryStore;
import org.eclipse.rdf4j.sail.memory.config.MemoryStoreConfig;
import org.eclipse.rdf4j.sail.nativerdf.NativeStore;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import static org.eclipse.rdf4j.model.util.Values.literal;

public class TheRepositoryAPI {
    public static void main(String[] args) {

        File dataDir = new File("/home/emiliyan/IdeaProjects/demo/ ");

        // 1.1 Main memory RDF Repository && Native RDF Repository
        //Repository repo = new SailRepository(new MemoryStore());


//        String index = "1,2,3";
//        Repository repo2 = new SailRepository(new NativeStore(dataDir,index));

//        MemoryStore memoryStore = new MemoryStore(dataDir);
//        memoryStore.setSyncDelay(1000L);
//        Repository repo = new SailRepository(memoryStore);


        //1.4 RDF Schema inferencing

//        Repository repo = new SailRepository(
//                            new SchemaCachingRDFSInferencer(
//                                new MemoryStore()));
//

        // 1.6 Access over HTTP && SPARQL endpoints

//        String rdf4jServer = "http://localhost:7200/sparql";
//        String repoID = "Chapter4";

        //Repository repo = new HTTPRepository(rdf4jServer,repoID);
        //Repository repo = new SPARQLRepository(rdf4jServer);


        // 1.7 The RepositoryManager and RepositoryProvider

//        boolean persist = true;
//        SailImplConfig backendConfig = new MemoryStoreConfig(persist);
//
//        backendConfig = new SchemaCachingRDFSInferencerConfig(backendConfig);
//
//        SailRepositoryConfig repositoryTypeSpec = new SailRepositoryConfig(backendConfig);


        //2 Using a repository: RepositoryConnections
//        Repository repo = new SailRepository(
//                             new SchemaCachingRDFSInferencer(
//                                 new MemoryStore()));
//        try(RepositoryConnection conn = repo.getConnection()){
//            TupleQuery query = conn.prepareTupleQuery("PREFIX foaf: <http://xmlns.com/foaf/0.1/>\n" +
//                    "SELECT ?friend ?name WHERE\n" +
//                    "{\n" +
//                    "    BIND(<http://example.com/peter> as ?person)\n" +
//                    "\t?person a foaf:Person .\n" +
//                    "\t{\n" +
//                    "\t    BIND(<http://example.com/peter> as ?person)\n" +
//                    "\t\t?person\t(foaf:knows | ^foaf:knows)* ?friend.\n" +
//                    "\t} UNION {\n" +
//                    "\t\t?friend foaf:age ?age.\n" +
//                    "\t\tFILTER(?age >= 18)\n" +
//                    "\t}\n" +
//                    "}");
//            String explanation = query.explain(Explanation.Level.Timed).toString();
//            System.out.println(explanation);
//            String queryString ="SELECT ?x ?p ?y WHERE {?x ?p ?y} ";
//            TupleQuery tupleQuery = conn.prepareTupleQuery(queryString);
//
//            //conn.prepareTupleQuery(queryString).evaluate(new SPARQLResultsCSVWriter(System.out));
//            GraphQueryResult graphResult = conn.prepareGraphQuery("CONSTRUCT { ?s ?p ?o } WHERE {?s ?p ?o }").evaluate();

//            String keyword = "foobar";
//            TupleQuery keywordQuery = conn.prepareTupleQuery("SELECT ?document WHERE { ?document ex:keyword ?keyword . }");
//            keywordQuery.setBinding("keyword", literal(keyword));
//            TupleQueryResult keywordQueryResult = keywordQuery.evaluate();

        // Model m = Repositories.graphQuery(repo, "CONSTRUCT WHERE {?s ?p ?o}", r -> QueryResults.asModel(r));
//            Model resultModel = QueryResults.asModel(graphResult);
//            for (Statement statement : graphResult) {
//                System.out.println(statement);
//            }

        //          try(TupleQueryResult result = tupleQuery.evaluate()){
        //List<BindingSet> resultList = QueryResults.asList(result);

//                for (BindingSet bindings : result) {
//                    System.out.println(bindings.getValue("y"));
//                    System.out.println(bindings.getValue("x"));
//                }


//                List<String> bindingNames = result.getBindingNames();
//                while(result.hasNext()){
//                    BindingSet bindingSet = result.next();
//                    Value firstValue = bindingSet.getValue(bindingNames.get(0));
//                    Value secondValue = bindingSet.getValue(bindingNames.get(1));
//                    System.out.println(firstValue);
//                    System.out.println(secondValue);


//                while(result.hasNext()){
//                    BindingSet bindingSet = result.next();
//                    Value valueOfX = bindingSet.getValue("x");
//                    Value valueOfY = bindingSet.getValue("y");
//                    Value valueOfP = bindingSet.getValue("p");
//                    System.out.println(valueOfX+"-------------"+valueOfY);
//                    System.out.println(valueOfP);
//                }

        //          }
        //   }
//        List<BindingSet> bindingSetList = Repositories.tupleQuery(repo, "SELECT * WHERER {?s ?p ?o}", result -> QueryResults.asList(result));

//        try(RepositoryConnection con = repo.getConnection()){
//            RDFWriter writer = Rio.createWriter(RDFFormat.TURTLE,System.out);
//            con.prepareGraphQuery(QueryLanguage.SPARQL,
//                    "CONSTRUCT {?s ?p ?o} WHERE {?s ?p ?o}").evaluate(writer);
//        }

//        try (RepositoryConnection con = repo.getConnection()){
//            // First, prepare a query that retrieves all names of persons
//            TupleQuery nameQuery = con.prepareTupleQuery("SELECT ?name WHERE { ?person ex:name ?name . }");
//
//            // Then, prepare another query that retrieves all e-mail addresses of persons:
//            TupleQuery mailQuery = con.prepareTupleQuery("SELECT ?mail WHERE { ?person ex:mail ?mail ; ex:name ?name . }");
//
//            // Evaluate the first query to get all names
//            try (TupleQueryResult nameResult = nameQuery.evaluate()){
//                // Loop over all names, and retrieve the corresponding e-mail address.
//                for (BindingSet bindingSet: nameResult) {
//                    Value name = bindingSet.getValue("name");
//
//                    // Retrieve the matching mailbox, by setting the binding for
//                    // the variable 'name' to the retrieved value. Note that we
//                    // can set the same binding name again for each iteration, it will
//                    // overwrite the previous setting.
//                    mailQuery.setBinding("name", name);
//                    try ( TupleQueryResult mailResult = mailQuery.evaluate()) {
//                        // mailResult now contains the e-mail addresses for one particular person
//                        System.out.println(mailResult);
//
//                    }
//                }
//            }

        //queryExplainExample();

    }

    private static void queryExplainExample(){
        SailRepository sailRepository = new SailRepository(new MemoryStore());

        try (SailRepositoryConnection connection = sailRepository.getConnection()) {

            ValueFactory vf = connection.getValueFactory();
            String ex = "http://example.com/";

            IRI peter = vf.createIRI(ex, "peter");
            IRI steve = vf.createIRI(ex, "steve");
            IRI mary = vf.createIRI(ex, "mary");
            IRI patricia = vf.createIRI(ex, "patricia");
            IRI linda = vf.createIRI(ex, "linda");

            connection.add(peter, RDF.TYPE, FOAF.PERSON);

            connection.add(peter, FOAF.KNOWS, patricia);
            connection.add(patricia, FOAF.KNOWS, linda);
            connection.add(patricia, FOAF.KNOWS, steve);
            connection.add(mary, FOAF.KNOWS, linda);

            connection.add(steve, FOAF.AGE, vf.createLiteral(18));
            connection.add(mary, FOAF.AGE, vf.createLiteral(18));

            connection.add(steve, FOAF.NAME, vf.createLiteral("Steve"));

            // Add some dummy data
            for (int i = 0; i < 100; i++) {
                connection.add(vf.createBNode(i + ""), RDF.TYPE, FOAF.PERSON);
            }

            for (int i = 0; i < 1000; i++) {
                connection.add(vf.createBNode(i % 150 + ""), FOAF.KNOWS, vf.createBNode(i + 10 + ""));
            }

            for (int i = 0; i < 10; i++) {
                connection.add(vf.createBNode(i + 3 + ""), FOAF.AGE, vf.createLiteral(i + 10));
            }

            for (int i = 0; i < 4; i++) {
                connection.add(vf.createBNode(i + ""), FOAF.NAME, vf.createLiteral("name" + i));
            }

        }

        try (SailRepositoryConnection connection = sailRepository.getConnection()) {
            TupleQuery query = connection.prepareTupleQuery(String.join("\n", "",
                    "PREFIX foaf: <http://xmlns.com/foaf/0.1/>",
                    "SELECT ?friend ?name WHERE ",
                    "{",
                    "	BIND(<http://example.com/peter> as ?person)",
                    "	?person a foaf:Person ;",
                    "		(foaf:knows | ^foaf:knows)* ?friend.",
                    "	OPTIONAL {",
                    "		?friend foaf:name ?name",
                    "	}",
                    "	?friend foaf:age ?age",
                    "	FILTER(?age >= 18) ",

                    "}"));

            Explanation explain = query.explain(Explanation.Level.Timed);
            System.out.println(explain);

        }

        System.out.println("\n\n");

        try (SailRepositoryConnection connection = sailRepository.getConnection()) {
            TupleQuery query = connection.prepareTupleQuery(String.join("\n", "",
                    "PREFIX foaf: <http://xmlns.com/foaf/0.1/>",
                    "SELECT * WHERE ",
                    "{",
                    "  BIND(<http://example.com/peter> as ?person)",
                    "	?person a foaf:Person .",
                    "	{",
                    "		?person	(foaf:knows | ^foaf:knows)* ?friend.",
                    "	} UNION {",
                    "		?friend foaf:age ?age",
                    "		FILTER(?age >= 18) ",
                    "	}",
                    "}"));

            Explanation explainUnoptimized = query.explain(Explanation.Level.Unoptimized);
            System.out.println(explainUnoptimized);
            System.out.println("\n\n");

            Explanation explain = query.explain(Explanation.Level.Timed);
            System.out.println(explain);

        }

        System.out.println("\n\n");

        try (SailRepositoryConnection connection = sailRepository.getConnection()) {
            TupleQuery query = connection.prepareTupleQuery(String.join("\n", "",
                    "PREFIX foaf: <http://xmlns.com/foaf/0.1/>",
                    "SELECT * WHERE ",
                    "{",
                    "  BIND(<http://example.com/peter> as ?person)",
                    "	?person a foaf:Person .",
                    "	{",
                    "  	BIND(<http://example.com/peter> as ?person)",
                    "		?person	(foaf:knows | ^foaf:knows)* ?friend.",
                    "	} UNION {",
                    "		?friend foaf:age ?age",
                    "		FILTER(?age >= 18) ",
                    "	}",
                    "}"));

            Explanation explain = query.explain(Explanation.Level.Timed);
            System.out.println(explain);
            System.out.println(explain.toDot());

        }

        sailRepository.shutDown();
    }
}
