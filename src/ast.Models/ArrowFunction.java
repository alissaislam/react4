package ast.Models;

import java.util.ArrayList;
import java.util.List;

public class ArrowFunction extends  Parameters{

    String async;
    Arguments arguments;
    Id id;
    Expression experssion;
    List<Statement> statementList=new ArrayList<> ();
    Returnstatment returnstatment;
    JsxElement jsxElement;

    public String getAsync() {
        return async;
    }

    public void setAsync(String async) {
        this.async = async;
    }

    public Arguments getArguments() {
        return arguments;
    }

    public void setArguments(Arguments arguments) {
        this.arguments = arguments;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Expression getExperssion() {
        return experssion;
    }

    public void setExperssion(Expression experssion) {
        this.experssion = experssion;
    }

    public List<Statement> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<Statement> statementList) {
        this.statementList = statementList;
    }

    public Returnstatment getReturnstatment() {
        return returnstatment;
    }

    public void setReturnstatment(Returnstatment returnstatment) {
        this.returnstatment = returnstatment;
    }

    public JsxElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }
}
