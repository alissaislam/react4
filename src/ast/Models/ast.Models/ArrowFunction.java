package ast.Models.ast.Models;

import ast.Models.Arguments;
import ast.Models.Expression;
import ast.Models.Id;
import ast.Models.JsxElement;
import ast.Models.Parameters;
import ast.Models.Returnstatment;
import ast.Models.Statement;

import java.util.ArrayList;
import java.util.List;

public class ArrowFunction extends Parameters {

    String async;
    ast.Models.Arguments arguments;
    ast.Models.Id id;
    ast.Models.Expression experssion;
    List<ast.Models.Statement> statementList=new ArrayList<> ();
    Returnstatment returnstatment;
    ast.Models.JsxElement jsxElement;

    public String getAsync() {
        return async;
    }

    public void setAsync(String async) {
        this.async = async;
    }

    public ast.Models.Arguments getArguments() {
        return arguments;
    }

    public void setArguments(Arguments arguments) {
        this.arguments = arguments;
    }

    public ast.Models.Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public ast.Models.Expression getExperssion() {
        return experssion;
    }

    public void setExperssion(Expression experssion) {
        this.experssion = experssion;
    }

    public List<ast.Models.Statement> getStatementList() {
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

    public ast.Models.JsxElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }
}
