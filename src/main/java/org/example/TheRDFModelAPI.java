package org.example;

import org.eclipse.rdf4j.model.*;
import org.eclipse.rdf4j.model.impl.*;
import org.eclipse.rdf4j.model.util.*;
import org.eclipse.rdf4j.model.vocabulary.FOAF;
import org.eclipse.rdf4j.model.vocabulary.RDF;


import java.lang.reflect.Array;
import java.util.*;

import static org.eclipse.rdf4j.model.util.Statements.statement;
import static org.eclipse.rdf4j.model.util.Values.*;

public class TheRDFModelAPI {
    public static void main(String[] args) {


        //1.1 Creating Values, Statements IRI


        ValueFactory factory = SimpleValueFactory.getInstance();
//
//        IRI bob = iri("http://example.org/bob");
//        IRI namePop = iri("http://example.org/name");
//        Literal bobsName = literal("BOB");
//        Literal bobsAge = literal(42);
//
//        Statement st = statement(bob,namePop,bobsName);

//        IRI bob = factory.createIRI("http://example.org/bob");
//        IRI name = factory.createIRI("http://example.org/name");
//        Literal bobsName = factory.createLiteral("Bob");

//        Statement nameStatement = factory.createStatement(bob,name,bobsName);
//        Statement typeStatement = factory.createStatement(bob,RDF.TYPE,FOAF.PERSON);
//
//        Model model = new TreeModel();
//
//        model.add(typeStatement);
//        model.add(bob,name,bobsName);

//        for (Statement statement : model) {
//            System.out.println(statement);
//        }

//        for (Statement statement : model.filter(null, RDF.TYPE, FOAF.PERSON)) {
//            System.out.println(statement);
//        }
//
//        for(Resource person : model.filter(null, RDF.TYPE, FOAF.PERSON).subjects()){
//            System.out.println(person);
//            Optional<Literal> literal = Models.objectLiteral(model.filter(person, FOAF.NAME, null));
//            System.out.println(literal);
//        }

//        ModelBuilder builder = new ModelBuilder();
//
//        builder.setNamespace("ex","http://example.org/")
//                .setNamespace(FOAF.NS);
//
//        builder.namedGraph("ex:graph1")
//                .subject("ex:john")
//                .add(RDF.TYPE,FOAF.PERSON)
//                .add(FOAF.NAME,"John")
//                .add(FOAF.AGE,42)
//                .add(FOAF.MBOX,"john@examples.org");
//
//        builder.defaultGraph().add("ex:graph1",RDF.TYPE,"ex:Graph");
//
//        Model m = builder.build();

//        for (Statement statement : m) {
//            System.out.println(statement);
//        }

//        for (Resource person: m.filter(null, RDF.TYPE, FOAF.PERSON).subjects()){
//            System.out.println(person);
////            Literal newName = factory.createLiteral("John");
////            Models.setProperty(person,FOAF.NAME,newName);
//            Optional<Literal> propertyLiteral = Models.getPropertyLiteral(m, person, FOAF.NAME);
//            Optional<Literal> literal = Models.objectLiteral(m.filter(person, FOAF.NAME, null));
//            System.out.println(propertyLiteral + " ----------- " + literal );
//
//            Set<Literal> propertyLiterals = Models.getPropertyLiterals(m, person, FOAF.NAME);
//            System.out.println();
//        }


            // 5.1 Converting to/from Java Collections

//        String ns = "http://example.org/";
//
//        // IRI for ex:favoriteLetters
//        IRI favouriteLetters = iri(ns,"favoriteLetters");
//
//        // IRI for ex:John
//        IRI john = iri(ns,"John");
//
//        // create a list of letters
//        List<Literal> letters = Arrays.asList(literal("A"),
//                literal("B"),
//                literal("C"));
//
//        // create a head resource for our list
//        Resource head = bnode();
//
//        // convert our list and add it to a newly-created Model
//        Model aboutJohn = RDFCollections.asRDF(letters,head,new LinkedHashModel());
//
//        // set the ex:favoriteLetters property to link to the head of the list
//        aboutJohn.add(john,favouriteLetters,head);


//        for (Statement statement : aboutJohn) {
//            System.out.println(statement);
//        }

        // get the value of the ex:favoriteLetters property
//        Resource node = Models.objectResource(aboutJohn.filter(john,favouriteLetters,null)).orElse(null);
//
//        // Convert its collection back to an ArrayList of values
//        if(node !=null){
//            List<Value> values = RDFCollections.asValues(aboutJohn,node,new ArrayList<Value>());
//            // you may need to cast back to Literal.
//            Literal a = (Literal) values.get(2);
//            System.out.println(a);
//
//        }

        //Delete rdf triples method 1

//        // get the RDF Collection in a separate model
//        Model rdfList = RDFCollections.getCollection(aboutJohn, node, new LinkedHashModel());
//        System.out.println(rdfList);
//
//        // remove the collection from our model about John
//        aboutJohn.removeAll(rdfList);
//
//        // finally remove the triple that linked John to the collection
//        aboutJohn.remove(john,favouriteLetters,node);

        //Delete rdf triples method 2
//        RDFCollections.extract(aboutJohn,node,st->aboutJohn.remove(st));
//
//        aboutJohn.remove(john,favouriteLetters,node);


        // 6 Working with rdf:Alt, rdf:Bag, rdf:Seq
//        List<Literal> letters1 = Arrays.asList(literal("A"), literal("B"), literal("C"));
//        IRI myBag = iri("urn:myBag");
//        Model letterBag = RDFContainers.toRDF(RDF.BAG, letters1, myBag, new TreeModel());
//
//        for (Statement statement : letterBag) {
//            System.out.println(statement);
//        }
//
//        List<Value> newList = RDFContainers.toValues(RDF.BAG, letterBag, myBag, new ArrayList<>());
//
//        for (Value value : newList) {
//            System.out.println(value);
//        }
    }
}
