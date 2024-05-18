package ast.Models;

public class Parameters extends Node  {
    ArrowFunction arrowFunction;
    CallIdentifier callIdentifier;
    Argument argument;
    CallFunction callFunction;
    Expression expression;
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

    public Argument getArgument() {
        return argument;
    }

    public void setArgument(Argument argument) {
        this.argument = argument;
    }

    public Expression getExpression() {
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
}
