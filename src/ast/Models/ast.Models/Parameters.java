package ast.Models.ast.Models;

import ast.Models.*;
import ast.Models.Argument;
import ast.Models.Expression;
import ast.Models.Node;

public class Parameters extends Node {
    ArrowFunction arrowFunction;
    CallIdentifier callIdentifier;
    ast.Models.Argument argument;
    CallFunction callFunction;
    ast.Models.Expression expression;
    BlockOfarguments blockOfarguments;

    public ArrowFunction getArrowFunction() {
        return arrowFunction;
    }

    public void setArrowFunction(ArrowFunction arrowFunction) {
        this.arrowFunction = arrowFunction;
    }

    public CallIdentifier getCallIdentifier() {
        return callIdentifier;
    }

    public void setCallIdentifier(CallIdentifier callIdentifier) {
        this.callIdentifier = callIdentifier;
    }

    public ast.Models.Argument getArgument() {
        return argument;
    }

    public void setArgument(Argument argument) {
        this.argument = argument;
    }

    public ast.Models.Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public BlockOfarguments getBlockOfarguments() {
        return blockOfarguments;
    }

    public void setBlockOfarguments(BlockOfarguments blockOfarguments) {
        this.blockOfarguments = blockOfarguments;
    }

    public CallFunction getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(CallFunction callFunction) {
        this.callFunction = callFunction;
    }
    public String generateCode(){
        String content="";
        if(arrowFunction !=null){
            content= arrowFunction.generateCode();
        }
        if(callIdentifier !=null){
            content = callFunction.generateCode();
        }
        if(argument!=null){
            content = argument.generateCode();
        }
        if(callFunction!=null){
            content=callFunction.generateCode();
        }
        if(expression!=null){
            content= expression.generateCode();
        }
        if(blockOfarguments!=null){
            content= blockOfarguments.getHtml();
        }
        return content ;
    }
}

