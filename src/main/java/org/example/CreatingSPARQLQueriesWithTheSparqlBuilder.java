package org.example;

import com.github.jsonldjava.shaded.com.google.common.graph.GraphBuilder;
import org.eclipse.rdf4j.model.vocabulary.DC;
import org.eclipse.rdf4j.model.vocabulary.FOAF;
import org.eclipse.rdf4j.sparqlbuilder.constraint.Expression;
import org.eclipse.rdf4j.sparqlbuilder.constraint.Expressions;
import org.eclipse.rdf4j.sparqlbuilder.core.Prefix;
import org.eclipse.rdf4j.sparqlbuilder.core.SparqlBuilder;
import org.eclipse.rdf4j.sparqlbuilder.core.Variable;
import org.eclipse.rdf4j.sparqlbuilder.core.query.ConstructQuery;
import org.eclipse.rdf4j.sparqlbuilder.core.query.Queries;
import org.eclipse.rdf4j.sparqlbuilder.core.query.SelectQuery;
import org.eclipse.rdf4j.sparqlbuilder.graphpattern.GraphPattern;
import org.eclipse.rdf4j.sparqlbuilder.graphpattern.GraphPatternNotTriples;
import org.eclipse.rdf4j.sparqlbuilder.graphpattern.GraphPatterns;
import org.eclipse.rdf4j.sparqlbuilder.graphpattern.TriplePattern;
import org.eclipse.rdf4j.sparqlbuilder.rdf.Rdf;
import org.eclipse.rdf4j.sparqlbuilder.rdf.RdfLiteral;

import static org.eclipse.rdf4j.model.util.Values.iri;

public class CreatingSPARQLQueriesWithTheSparqlBuilder {
    public static void main(String[] args) {

                //2. Queries

//        SelectQuery selectQuery = Queries.SELECT();
//        ConstructQuery constructQuery = Queries.CONSTRUCT();
//
//        Prefix ex = null;
//        Variable product = null;
//        TriplePattern personWroteBook = null, personAuthoredBook = null;
//
//        selectQuery.prefix(ex)
//                .select(product)
//                .where(product.isA(ex.iri("book")));
//
//        constructQuery
//                .prefix(ex)
//                .construct(personWroteBook)
//                .where(personAuthoredBook);


        //3. Elements

//        Variable price = SparqlBuilder.var("price");
//        System.out.println(price.getQueryString());
//
//        Prefix foaf = SparqlBuilder.prefix(FOAF.NS);
//        System.out.println(foaf.getQueryString());


        //4.1 Triple Patterns
//        Prefix dc = SparqlBuilder.prefix("dc", iri("http://purl.org/dc/elements/1.1/"));
//        Variable book = SparqlBuilder.var("book");
//
//        TriplePattern triple = GraphPatterns.tp(book,dc.iri("author"), Rdf.literalOf(".R.R. Tolkien"));
//        System.out.println(triple.getQueryString());


        //4.1 Triple Patterns with RDF4J
//        Prefix dc = SparqlBuilder.prefix(DC.NS);
//        Variable book = SparqlBuilder.var("book");
//
//        TriplePattern triple = GraphPatterns.tp(book,DC.CREATOR,Rdf.literalOf("J.R.R. Tolkien"));
//


        //4.1 Triple Patterns created with has() and isA() shortcut meyhod of RdfSubject
//        Prefix foaf = SparqlBuilder.prefix(FOAF.NS);
//        Variable x = SparqlBuilder.var("x");
//        Variable name = SparqlBuilder.var("name");
//
//
//        TriplePattern triple = x.has(FOAF.NICK, Rdf.literalOf("Alice"), Rdf.literalOf("Alice_"))
//                .andHas(FOAF.NAME,name);
//
//        System.out.println(triple.getQueryString());


        //4.2 Property Paths
//        Prefix foaf = SparqlBuilder.prefix(FOAF.NS);
//        Variable x = SparqlBuilder.var("x");
//        Variable name = SparqlBuilder.var("name");
//
//        SelectQuery query = Queries
//                .SELECT(name)
//                .prefix(FOAF.NS)
//                .where(x.has(p->p.pred(FOAF.ACCOUNT)
//                .then(FOAF.MBOX),name));
//
//        //p -> p.pred(FOAF.ACCOUNT).then(FOAF.MBOX) =	foaf:account / foaf:mbox
//        //p -> p.pred(RDF.TYPE).then(RDFS.SUBCLASSOF).zeroOrMore() =	rdf:type / rdfs:subClassOf *
//        //p -> p.pred(EX.MOTHER_OF).or(EX.FATHER_OF).oneOrMore() =	( ex:motherOf \| ex:fatherOf ) +
//        //p -> p.pred(EX.MOTHER_OF).or(p1 -> p1.pred(EX.FATHER_OF).zeroOrOne()) =	ex:motherOf \| ( ex:fatherOf ? )
//        //p -> p.negProp().pred(RDF.TYPE).invPred(RDF.TYPE)=	!( rdf:type \| ^ rdf:type )



        //4.3 Compound graph patterns GraphPatternNotTriple
        //GraphPatterns#and()

//        Variable name = SparqlBuilder.var("name");
//
//        Variable mbox = SparqlBuilder.var("mbox");
//        Variable x = SparqlBuilder.var("x");
//
//        GraphPatternNotTriples groupPattern = GraphPatterns.and(x.has(FOAF.NAME,name),x.has(FOAF.MBOX,mbox));
//
//        System.out.println(groupPattern.getQueryString());


        //GraphPatterns#union()
//        Prefix dc10 = SparqlBuilder.prefix("dc10",iri("http://purl.org/dc/elements/1.0/"));
//        Prefix dc11 = SparqlBuilder.prefix("dc11",iri("http://purl.org/dc/elements/1.1/"));
//
//        Variable book = SparqlBuilder.var("book");
//        Variable title = SparqlBuilder.var("title");
//
//        GraphPatternNotTriples union =
//                GraphPatterns
//                        .union(book.has(dc10.iri("title"),title),book.has(dc11.iri("title"),title));
//        System.out.println(union.getQueryString());


        //GraphPatterns#optional()
//        Prefix foaf = SparqlBuilder.prefix(FOAF.NS);
//        Variable x = SparqlBuilder.var("x");
//        Variable mbox = SparqlBuilder.var("name");
//
//        GraphPatternNotTriples optionalPattern = GraphPatterns.optional(GraphPatterns.tp(x,foaf.iri("mbox"),mbox));
//        System.out.println(optionalPattern.getQueryString());

        // Sub - select
    //SubSelect subQuery = GraphPatterns.select();



        //5 Query Constraints
//        Variable name = SparqlBuilder.var("name");
//        Expression<?> regExpression = Expressions.regex(name,"Sm");
//        System.out.println(regExpression.getQueryString());
//
//        Variable price = SparqlBuilder.var("price");
//        Expression<?> priceLimit = Expressions.lt(price, 100);
//        System.out.println(priceLimit.getQueryString());
//
//        RdfLiteral.NumericLiteral discount = Rdf.literalOf(0.9);
//        Expression<?> discountedPrice = Expressions.multiply(price, discount);


    }
}
