package org.example.OwnRDFHandler;

import org.eclipse.rdf4j.model.Statement;
import org.eclipse.rdf4j.rio.RDFHandler;
import org.eclipse.rdf4j.rio.RDFHandlerException;
import org.eclipse.rdf4j.rio.helpers.AbstractRDFHandler;

public class StatementCounter extends AbstractRDFHandler {

    private int countedStatements =0;

    @Override
    public void handleStatement(Statement st) throws RDFHandlerException {
        countedStatements++;
    }

    public int getCountedStatements(){
        return countedStatements;
    }
}
