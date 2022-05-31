package org.example;

import org.apache.zookeeper.data.Stat;
import org.eclipse.rdf4j.model.*;
import org.eclipse.rdf4j.model.impl.LinkedHashModel;
import org.eclipse.rdf4j.model.util.Models;
import org.eclipse.rdf4j.model.util.Statements;
import org.eclipse.rdf4j.model.util.Values;
import org.eclipse.rdf4j.model.vocabulary.FOAF;
import org.eclipse.rdf4j.query.TupleQuery;
import org.eclipse.rdf4j.query.TupleQueryResult;
import org.eclipse.rdf4j.repository.Repository;
import org.eclipse.rdf4j.repository.RepositoryConnection;
import org.eclipse.rdf4j.repository.RepositoryResult;
import org.eclipse.rdf4j.repository.sail.SailRepository;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.Rio;
import org.eclipse.rdf4j.sail.memory.MemoryStore;
import org.eclipse.rdf4j.sparqlbuilder.core.query.Queries;
import org.eclipse.rdf4j.sparqlbuilder.core.query.SelectQuery;

import javax.management.Query;
import javax.swing.plaf.nimbus.State;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;

public class RDFStarAndSPARQLStar {
    public static void main(String[] args) throws IOException, URISyntaxException {

        //TODO: The RDF-star data model in RDF4J
        IRI bob = Values.iri("http://example.org/bob");
        Triple bobsAge = Values.triple(bob, FOAF.AGE, Values.literal(23));

        IRI certainly = Values.iri("http://example.org/certainty");
        Statement aboutBobsAge = Statements.statement(bobsAge, certainly, Values.literal(0.9), null);

        Statement ageStatement = Statements.toStatement(bobsAge);
        Triple backToTriple = Values.triple(ageStatement);

        //TODO: Read TurtleStar File Format
        //Model model = Rio.parse(new FileInputStream("/filePath.ttls"), "", RDFFormat.TURTLESTAR);

        //TODO: Write TurtleStar File Format
        //Rio.write(model, new FileOutputStream("/filePath.ttls"), "", RDFFormat.TURTLESTAR);


        //TODO: Storing and retrieving RDF-star in a Repository
        Model model = new LinkedHashModel();
        model.add(aboutBobsAge);

        Repository repo = new SailRepository(new MemoryStore());
        try (RepositoryConnection conn = repo.getConnection()) {
            conn.add(model);
            RepositoryResult<Statement> result = conn.getStatements(null, null, null);

            //first way
            //result.forEach(System.out::println);


            //second way
//            Statement st = result.next();
//            Triple rdfStarTriple = (Triple) st.getSubject();
//            System.out.println(rdfStarTriple.getSubject());


            //TODO: SPARQL - star queries
//            String queryString ="PREFIX foaf: <http://xmlns.com/foaf/0.1/>\n" +
//                    "PREFIX ex: <http://example.org/>\n" +
//                    "SELECT ?p ?a ?c WHERE {\n" +
//                    "   <<?p foaf:age ?a>> ex:certainty ?c .\n" +
//                    "}";
//            TupleQuery tupleQuery = conn.prepareTupleQuery(queryString);
//            TupleQueryResult evaluate = tupleQuery.evaluate();
//            evaluate.forEach(System.out::println);


            //TODO:Converting RDF-star to regular RDF and back
            Model convertedModel = Models.convertRDFStarToReification(model);
            for (Statement statement : convertedModel) {
                System.out.println(statement);
            }
            Model rdfStarModel = Models.convertReificationToRDFStar(convertedModel);
            for (Statement statement : rdfStarModel) {
                System.out.println(statement);
            }
        }

    }
}
