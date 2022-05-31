package org.example.CustomVocabularies;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.util.Values;

import static org.eclipse.rdf4j.model.util.Values.iri;

public class EX {

    public static final String NAMESPACE= "http://example.org/";

    public static final String PREFIX = "ex";

    public static final IRI CREATOR_OF = iri(NAMESPACE,"creatorOf");

    public static final IRI ARTIST = iri(NAMESPACE, "Artist");
}
