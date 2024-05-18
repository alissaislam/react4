// Generated from D:/Intellgi/react4/src/antler/ReactParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReactParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReactParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReactParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ReactParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatment(ReactParser.StatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#statmentElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatmentElement(ReactParser.StatmentElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(ReactParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#forElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForElement(ReactParser.ForElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ReactParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#comments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComments(ReactParser.CommentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(ReactParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(ReactParser.Do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#callfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallfunction(ReactParser.CallfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch(ReactParser.SwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#tryCatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatch(ReactParser.TryCatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#importt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportt(ReactParser.ImporttContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#ifShort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfShort(ReactParser.IfShortContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxElement(ReactParser.JsxElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxElementNonSelfClosing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxElementNonSelfClosing(ReactParser.JsxElementNonSelfClosingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxElementSelfClosing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxElementSelfClosing(ReactParser.JsxElementSelfClosingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxElementIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxElementIn(ReactParser.JsxElementInContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#blockIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockIn(ReactParser.BlockInContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxArguments(ReactParser.JsxArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxParameters(ReactParser.JsxParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxArrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxArrowFunction(ReactParser.JsxArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxCallfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxCallfunction(ReactParser.JsxCallfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxSimpleCallfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxSimpleCallfunction(ReactParser.JsxSimpleCallfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxArgument(ReactParser.JsxArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxExpression(ReactParser.JsxExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxCallIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxCallIdentifier(ReactParser.JsxCallIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsxBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxBlock(ReactParser.JsxBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ReactParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#else_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if(ReactParser.Else_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(ReactParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#forLoopParts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopParts(ReactParser.ForLoopPartsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(ReactParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(ReactParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#blockOfarguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockOfarguments(ReactParser.BlockOfargumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ReactParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationList(ReactParser.VariableDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(ReactParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#returnstatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstatment(ReactParser.ReturnstatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#simpleCallfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCallfunction(ReactParser.SimpleCallfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(ReactParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#hooks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHooks(ReactParser.HooksContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#hook}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHook(ReactParser.HookContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#useState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseState(ReactParser.UseStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#useEffect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseEffect(ReactParser.UseEffectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#useRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseRef(ReactParser.UseRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#useMemo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseMemo(ReactParser.UseMemoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(ReactParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#callIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallIdentifier(ReactParser.CallIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ReactParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport(ReactParser.ExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(ReactParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ReactParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(ReactParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#mapElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapElementList(ReactParser.MapElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#mapElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapElement(ReactParser.MapElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#suquence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuquence(ReactParser.SuquenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#kind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKind(ReactParser.KindContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(ReactParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ReactParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#openParen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenParen(ReactParser.OpenParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#closeParen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseParen(ReactParser.CloseParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ReactParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#closeBrace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseBrace(ReactParser.CloseBraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#openBrace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenBrace(ReactParser.OpenBraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#jsx_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsx_tag(ReactParser.Jsx_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#break}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(ReactParser.BreakContext ctx);
}