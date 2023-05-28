// Generated from D:/Mestrado/Engenharia de Linguagens de Programação/drawscript/src\Drawscript.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DrawscriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, BINARY_OPERATOR=28, OPERATOR_ARITHMETIC=29, 
		OPERATOR_LOGIC=30, OP_ADD=31, OP_SUB=32, OP_MUL=33, OP_DIV=34, OP_MOD=35, 
		OP_GT=36, OP_LT=37, OP_GEQ=38, OP_LEQ=39, OP_EQ=40, INTEGER=41, BOOL=42, 
		IDENTIFIER=43, NEWLINE=44, SPACE=45, TABS=46;
	public static final int
		RULE_script = 0, RULE_constants = 1, RULE_parameters = 2, RULE_definition = 3, 
		RULE_sequence = 4, RULE_instruction = 5, RULE_expression = 6, RULE_number = 7, 
		RULE_boolean = 8, RULE_point = 9, RULE_colour = 10, RULE_interval = 11, 
		RULE_reference = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "constants", "parameters", "definition", "sequence", "instruction", 
			"expression", "number", "boolean", "point", "colour", "interval", "reference"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'---'", "'dimension:'", "'background:'", "':'", "'line'", "', '", 
			"'rectangle'", "'x'", "'square'", "'ellipse'", "'circle'", "'polyline'", 
			"'setlinecolor'", "'setfillcolor'", "'if ('", "') {'", "'}'", "' else {'", 
			"'for '", "' in '", "' {'", "'('", "','", "')'", "'|'", "'['", "']'", 
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'>'", "'<'", "'>='", 
			"'<='", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "BINARY_OPERATOR", "OPERATOR_ARITHMETIC", "OPERATOR_LOGIC", 
			"OP_ADD", "OP_SUB", "OP_MUL", "OP_DIV", "OP_MOD", "OP_GT", "OP_LT", "OP_GEQ", 
			"OP_LEQ", "OP_EQ", "INTEGER", "BOOL", "IDENTIFIER", "NEWLINE", "SPACE", 
			"TABS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Drawscript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DrawscriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(DrawscriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DrawscriptParser.NEWLINE, i);
		}
		public TerminalNode EOF() { return getToken(DrawscriptParser.EOF, 0); }
		public ConstantsContext constants() {
			return getRuleContext(ConstantsContext.class,0);
		}
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(26);
				constants();
				setState(27);
				match(NEWLINE);
				}
			}

			setState(31);
			match(T__0);
			setState(32);
			parameters();
			setState(33);
			match(NEWLINE);
			setState(34);
			match(T__0);
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(35);
				sequence();
				}
			}

			setState(38);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantsContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(DrawscriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DrawscriptParser.NEWLINE, i);
		}
		public ConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitConstants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantsContext constants() throws RecognitionException {
		ConstantsContext _localctx = new ConstantsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			definition();
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(41);
					match(NEWLINE);
					setState(42);
					definition();
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(48);
					match(NEWLINE);
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public PointContext dimPoint;
		public ReferenceContext dimRef;
		public ColourContext bgColor;
		public ReferenceContext bgRef;
		public List<TerminalNode> NEWLINE() { return getTokens(DrawscriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DrawscriptParser.NEWLINE, i);
		}
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public ColourContext colour() {
			return getRuleContext(ColourContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(54);
				match(NEWLINE);
				setState(55);
				match(T__1);
				setState(58);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(56);
					((ParametersContext)_localctx).dimPoint = point();
					}
					break;
				case IDENTIFIER:
					{
					setState(57);
					((ParametersContext)_localctx).dimRef = reference();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(62);
				match(NEWLINE);
				setState(63);
				match(T__2);
				setState(66);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__24:
					{
					setState(64);
					((ParametersContext)_localctx).bgColor = colour();
					}
					break;
				case IDENTIFIER:
					{
					setState(65);
					((ParametersContext)_localctx).bgRef = reference();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					match(NEWLINE);
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DrawscriptParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(IDENTIFIER);
			setState(77);
			match(T__3);
			setState(78);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SequenceContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(DrawscriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DrawscriptParser.NEWLINE, i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sequence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(80);
					match(NEWLINE);
					setState(81);
					instruction();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(84); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					match(NEWLINE);
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SquareContext extends InstructionContext {
		public PointContext start;
		public ExpressionContext length;
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SquareContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterSquare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitSquare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitSquare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends InstructionContext {
		public PointContext start;
		public PointContext end;
		public List<PointContext> point() {
			return getRuleContexts(PointContext.class);
		}
		public PointContext point(int i) {
			return getRuleContext(PointContext.class,i);
		}
		public LineContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IterationContext extends InstructionContext {
		public SequenceContext body;
		public TerminalNode IDENTIFIER() { return getToken(DrawscriptParser.IDENTIFIER, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(DrawscriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DrawscriptParser.NEWLINE, i);
		}
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public IterationContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitIteration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitIteration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RectangleContext extends InstructionContext {
		public PointContext start;
		public ExpressionContext width;
		public ExpressionContext height;
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RectangleContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterRectangle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitRectangle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitRectangle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EllipseContext extends InstructionContext {
		public PointContext center;
		public ExpressionContext width;
		public ExpressionContext height;
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EllipseContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterEllipse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitEllipse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitEllipse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CircleContext extends InstructionContext {
		public PointContext center;
		public ExpressionContext radius;
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CircleContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterCircle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitCircle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitCircle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetFillColourContext extends InstructionContext {
		public ColourContext colour() {
			return getRuleContext(ColourContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public SetFillColourContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterSetFillColour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitSetFillColour(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitSetFillColour(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BranchContext extends InstructionContext {
		public ExpressionContext guard;
		public SequenceContext then;
		public SequenceContext else_;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(DrawscriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DrawscriptParser.NEWLINE, i);
		}
		public List<SequenceContext> sequence() {
			return getRuleContexts(SequenceContext.class);
		}
		public SequenceContext sequence(int i) {
			return getRuleContext(SequenceContext.class,i);
		}
		public BranchContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitBranch(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PolylineContext extends InstructionContext {
		public PointContext start;
		public PointContext point;
		public List<PointContext> points = new ArrayList<PointContext>();
		public List<PointContext> point() {
			return getRuleContexts(PointContext.class);
		}
		public PointContext point(int i) {
			return getRuleContext(PointContext.class,i);
		}
		public PolylineContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterPolyline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitPolyline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitPolyline(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetLineColourContext extends InstructionContext {
		public ColourContext colour() {
			return getRuleContext(ColourContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public SetLineColourContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterSetLineColour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitSetLineColour(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitSetLineColour(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instruction);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new LineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(T__4);
				setState(93);
				((LineContext)_localctx).start = point();
				setState(94);
				match(T__5);
				setState(95);
				((LineContext)_localctx).end = point();
				}
				break;
			case T__6:
				_localctx = new RectangleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(T__6);
				setState(98);
				((RectangleContext)_localctx).start = point();
				setState(99);
				match(T__5);
				setState(100);
				((RectangleContext)_localctx).width = expression(0);
				setState(101);
				match(T__7);
				setState(102);
				((RectangleContext)_localctx).height = expression(0);
				}
				break;
			case T__8:
				_localctx = new SquareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(T__8);
				setState(105);
				((SquareContext)_localctx).start = point();
				setState(106);
				match(T__5);
				setState(107);
				((SquareContext)_localctx).length = expression(0);
				}
				break;
			case T__9:
				_localctx = new EllipseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				match(T__9);
				setState(110);
				((EllipseContext)_localctx).center = point();
				setState(111);
				match(T__5);
				setState(112);
				((EllipseContext)_localctx).width = expression(0);
				setState(113);
				match(T__7);
				setState(114);
				((EllipseContext)_localctx).height = expression(0);
				}
				break;
			case T__10:
				_localctx = new CircleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				match(T__10);
				setState(117);
				((CircleContext)_localctx).center = point();
				setState(118);
				match(T__5);
				setState(119);
				((CircleContext)_localctx).radius = expression(0);
				}
				break;
			case T__11:
				_localctx = new PolylineContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
				match(T__11);
				setState(122);
				((PolylineContext)_localctx).start = point();
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(123);
					match(T__5);
					setState(124);
					((PolylineContext)_localctx).point = point();
					((PolylineContext)_localctx).points.add(((PolylineContext)_localctx).point);
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__12:
				_localctx = new SetLineColourContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				match(T__12);
				setState(133);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__24:
					{
					setState(131);
					colour();
					}
					break;
				case IDENTIFIER:
					{
					setState(132);
					reference();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__13:
				_localctx = new SetFillColourContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(135);
				match(T__13);
				setState(138);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__24:
					{
					setState(136);
					colour();
					}
					break;
				case IDENTIFIER:
					{
					setState(137);
					reference();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__14:
				_localctx = new BranchContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(140);
				match(T__14);
				setState(141);
				((BranchContext)_localctx).guard = expression(0);
				setState(142);
				match(T__15);
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(143);
					match(NEWLINE);
					}
					break;
				}
				setState(147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(146);
					((BranchContext)_localctx).then = sequence();
					}
					break;
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(149);
					match(NEWLINE);
					}
				}

				setState(152);
				match(T__16);
				setState(154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(153);
					match(NEWLINE);
					}
					break;
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(156);
					match(T__17);
					setState(158);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(157);
						match(NEWLINE);
						}
						break;
					}
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(160);
						((BranchContext)_localctx).else_ = sequence();
						}
						break;
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(163);
						match(NEWLINE);
						}
					}

					setState(166);
					match(T__16);
					setState(168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(167);
						match(NEWLINE);
						}
						break;
					}
					}
				}

				}
				break;
			case T__18:
				_localctx = new IterationContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(172);
				match(T__18);
				setState(173);
				match(IDENTIFIER);
				setState(174);
				match(T__19);
				setState(175);
				interval();
				setState(176);
				match(T__20);
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(177);
					match(NEWLINE);
					}
					break;
				}
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(180);
					((IterationContext)_localctx).body = sequence();
					}
					break;
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(183);
					match(NEWLINE);
					}
				}

				setState(186);
				match(T__16);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntervalExpressionContext extends ExpressionContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterIntervalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitIntervalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitIntervalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BINARY_OPERATOR() { return getToken(DrawscriptParser.BINARY_OPERATOR, 0); }
		public BinaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitBinaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PointExpressionContext extends ExpressionContext {
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public PointExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterPointExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitPointExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitPointExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReferenceExpressionContext extends ExpressionContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public ReferenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterReferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitReferenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitReferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberExpressionContext extends ExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColourExpressionContext extends ExpressionContext {
		public ColourContext colour() {
			return getRuleContext(ColourContext.class,0);
		}
		public ColourExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterColourExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitColourExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitColourExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExpressionContext extends ExpressionContext {
		public BooleanContext boolean_() {
			return getRuleContext(BooleanContext.class,0);
		}
		public BooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(191);
				number();
				}
				break;
			case BOOL:
				{
				_localctx = new BooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				boolean_();
				}
				break;
			case T__24:
				{
				_localctx = new ColourExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				colour();
				}
				break;
			case T__21:
				{
				_localctx = new PointExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				point();
				}
				break;
			case T__25:
			case T__26:
				{
				_localctx = new IntervalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				interval();
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new ReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				reference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
					((BinaryExpressionContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(199);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(200);
					((BinaryExpressionContext)_localctx).operator = match(BINARY_OPERATOR);
					setState(201);
					((BinaryExpressionContext)_localctx).right = expression(2);
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public Token value;
		public TerminalNode INTEGER() { return getToken(DrawscriptParser.INTEGER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			((NumberContext)_localctx).value = match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends ParserRuleContext {
		public Token value;
		public TerminalNode BOOL() { return getToken(DrawscriptParser.BOOL, 0); }
		public BooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanContext boolean_() throws RecognitionException {
		BooleanContext _localctx = new BooleanContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_boolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			((BooleanContext)_localctx).value = match(BOOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PointContext extends ParserRuleContext {
		public ExpressionContext x;
		public ExpressionContext y;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__21);
			setState(212);
			((PointContext)_localctx).x = expression(0);
			setState(213);
			match(T__22);
			setState(214);
			((PointContext)_localctx).y = expression(0);
			setState(215);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColourContext extends ParserRuleContext {
		public ExpressionContext red;
		public ExpressionContext green;
		public ExpressionContext blue;
		public ExpressionContext rgb;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ColourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colour; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterColour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitColour(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitColour(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColourContext colour() throws RecognitionException {
		ColourContext _localctx = new ColourContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_colour);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(217);
				match(T__24);
				setState(218);
				((ColourContext)_localctx).red = expression(0);
				setState(219);
				match(T__24);
				setState(220);
				((ColourContext)_localctx).green = expression(0);
				setState(221);
				match(T__24);
				setState(222);
				((ColourContext)_localctx).blue = expression(0);
				setState(223);
				match(T__24);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(T__24);
				setState(226);
				((ColourContext)_localctx).rgb = expression(0);
				setState(227);
				match(T__24);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntervalContext extends ParserRuleContext {
		public ExpressionContext start;
		public ExpressionContext end;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__26) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(232);
			((IntervalContext)_localctx).start = expression(0);
			setState(233);
			match(T__5);
			setState(234);
			((IntervalContext)_localctx).end = expression(0);
			setState(235);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__26) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReferenceContext extends ParserRuleContext {
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(DrawscriptParser.IDENTIFIER, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			((ReferenceContext)_localctx).id = match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u00f0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001e\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"%\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001,\b\u0001\n\u0001\f\u0001/\t\u0001\u0001\u0001\u0005\u0001"+
		"2\b\u0001\n\u0001\f\u00015\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002;\b\u0002\u0003\u0002=\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002C\b\u0002\u0003\u0002E\b\u0002"+
		"\u0001\u0002\u0005\u0002H\b\u0002\n\u0002\f\u0002K\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0004\u0004"+
		"S\b\u0004\u000b\u0004\f\u0004T\u0001\u0004\u0005\u0004X\b\u0004\n\u0004"+
		"\f\u0004[\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005~\b"+
		"\u0005\n\u0005\f\u0005\u0081\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0086\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u008b\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0091\b\u0005\u0001\u0005\u0003\u0005\u0094\b\u0005\u0001\u0005\u0003"+
		"\u0005\u0097\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u009b\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u009f\b\u0005\u0001\u0005\u0003\u0005"+
		"\u00a2\b\u0005\u0001\u0005\u0003\u0005\u00a5\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00a9\b\u0005\u0003\u0005\u00ab\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00b3\b\u0005\u0001\u0005\u0003\u0005\u00b6\b\u0005\u0001\u0005\u0003"+
		"\u0005\u00b9\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00bd\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00c6\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u00cb\b\u0006\n\u0006\f\u0006\u00ce\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00e6\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0000"+
		"\u0001\f\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u0000\u0001\u0001\u0000\u001a\u001b\u010c\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004<\u0001\u0000\u0000\u0000"+
		"\u0006L\u0001\u0000\u0000\u0000\bR\u0001\u0000\u0000\u0000\n\u00bc\u0001"+
		"\u0000\u0000\u0000\f\u00c5\u0001\u0000\u0000\u0000\u000e\u00cf\u0001\u0000"+
		"\u0000\u0000\u0010\u00d1\u0001\u0000\u0000\u0000\u0012\u00d3\u0001\u0000"+
		"\u0000\u0000\u0014\u00e5\u0001\u0000\u0000\u0000\u0016\u00e7\u0001\u0000"+
		"\u0000\u0000\u0018\u00ed\u0001\u0000\u0000\u0000\u001a\u001b\u0003\u0002"+
		"\u0001\u0000\u001b\u001c\u0005,\u0000\u0000\u001c\u001e\u0001\u0000\u0000"+
		"\u0000\u001d\u001a\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0005\u0001\u0000\u0000"+
		" !\u0003\u0004\u0002\u0000!\"\u0005,\u0000\u0000\"$\u0005\u0001\u0000"+
		"\u0000#%\u0003\b\u0004\u0000$#\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&\'\u0005\u0000\u0000\u0001\'\u0001\u0001"+
		"\u0000\u0000\u0000(-\u0003\u0006\u0003\u0000)*\u0005,\u0000\u0000*,\u0003"+
		"\u0006\u0003\u0000+)\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000"+
		"-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.3\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u000002\u0005,\u0000\u000010\u0001\u0000\u0000"+
		"\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000"+
		"\u0000\u00004\u0003\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u0000"+
		"67\u0005,\u0000\u00007:\u0005\u0002\u0000\u00008;\u0003\u0012\t\u0000"+
		"9;\u0003\u0018\f\u0000:8\u0001\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000"+
		";=\u0001\u0000\u0000\u0000<6\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000"+
		"\u0000=D\u0001\u0000\u0000\u0000>?\u0005,\u0000\u0000?B\u0005\u0003\u0000"+
		"\u0000@C\u0003\u0014\n\u0000AC\u0003\u0018\f\u0000B@\u0001\u0000\u0000"+
		"\u0000BA\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000D>\u0001\u0000"+
		"\u0000\u0000DE\u0001\u0000\u0000\u0000EI\u0001\u0000\u0000\u0000FH\u0005"+
		",\u0000\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u0005\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000LM\u0005+\u0000\u0000MN\u0005\u0004\u0000"+
		"\u0000NO\u0003\f\u0006\u0000O\u0007\u0001\u0000\u0000\u0000PQ\u0005,\u0000"+
		"\u0000QS\u0003\n\u0005\u0000RP\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UY\u0001\u0000"+
		"\u0000\u0000VX\u0005,\u0000\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\t\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0005\u0005\u0000\u0000"+
		"]^\u0003\u0012\t\u0000^_\u0005\u0006\u0000\u0000_`\u0003\u0012\t\u0000"+
		"`\u00bd\u0001\u0000\u0000\u0000ab\u0005\u0007\u0000\u0000bc\u0003\u0012"+
		"\t\u0000cd\u0005\u0006\u0000\u0000de\u0003\f\u0006\u0000ef\u0005\b\u0000"+
		"\u0000fg\u0003\f\u0006\u0000g\u00bd\u0001\u0000\u0000\u0000hi\u0005\t"+
		"\u0000\u0000ij\u0003\u0012\t\u0000jk\u0005\u0006\u0000\u0000kl\u0003\f"+
		"\u0006\u0000l\u00bd\u0001\u0000\u0000\u0000mn\u0005\n\u0000\u0000no\u0003"+
		"\u0012\t\u0000op\u0005\u0006\u0000\u0000pq\u0003\f\u0006\u0000qr\u0005"+
		"\b\u0000\u0000rs\u0003\f\u0006\u0000s\u00bd\u0001\u0000\u0000\u0000tu"+
		"\u0005\u000b\u0000\u0000uv\u0003\u0012\t\u0000vw\u0005\u0006\u0000\u0000"+
		"wx\u0003\f\u0006\u0000x\u00bd\u0001\u0000\u0000\u0000yz\u0005\f\u0000"+
		"\u0000z\u007f\u0003\u0012\t\u0000{|\u0005\u0006\u0000\u0000|~\u0003\u0012"+
		"\t\u0000}{\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u00bd"+
		"\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0085"+
		"\u0005\r\u0000\u0000\u0083\u0086\u0003\u0014\n\u0000\u0084\u0086\u0003"+
		"\u0018\f\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u00bd\u0001\u0000\u0000\u0000\u0087\u008a\u0005\u000e"+
		"\u0000\u0000\u0088\u008b\u0003\u0014\n\u0000\u0089\u008b\u0003\u0018\f"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u00bd\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u000f\u0000"+
		"\u0000\u008d\u008e\u0003\f\u0006\u0000\u008e\u0090\u0005\u0010\u0000\u0000"+
		"\u008f\u0091\u0005,\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092"+
		"\u0094\u0003\b\u0004\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0097"+
		"\u0005,\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a\u0005"+
		"\u0011\u0000\u0000\u0099\u009b\u0005,\u0000\u0000\u009a\u0099\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u00aa\u0001\u0000"+
		"\u0000\u0000\u009c\u009e\u0005\u0012\u0000\u0000\u009d\u009f\u0005,\u0000"+
		"\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u00a2\u0003\b\u0004\u0000"+
		"\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a5\u0005,\u0000\u0000\u00a4"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a8\u0005\u0011\u0000\u0000\u00a7"+
		"\u00a9\u0005,\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u009c"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00bd"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0013\u0000\u0000\u00ad\u00ae"+
		"\u0005+\u0000\u0000\u00ae\u00af\u0005\u0014\u0000\u0000\u00af\u00b0\u0003"+
		"\u0016\u000b\u0000\u00b0\u00b2\u0005\u0015\u0000\u0000\u00b1\u00b3\u0005"+
		",\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b6\u0003\b\u0004"+
		"\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b9\u0005,\u0000\u0000"+
		"\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u0011\u0000\u0000"+
		"\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\\\u0001\u0000\u0000\u0000\u00bc"+
		"a\u0001\u0000\u0000\u0000\u00bch\u0001\u0000\u0000\u0000\u00bcm\u0001"+
		"\u0000\u0000\u0000\u00bct\u0001\u0000\u0000\u0000\u00bcy\u0001\u0000\u0000"+
		"\u0000\u00bc\u0082\u0001\u0000\u0000\u0000\u00bc\u0087\u0001\u0000\u0000"+
		"\u0000\u00bc\u008c\u0001\u0000\u0000\u0000\u00bc\u00ac\u0001\u0000\u0000"+
		"\u0000\u00bd\u000b\u0001\u0000\u0000\u0000\u00be\u00bf\u0006\u0006\uffff"+
		"\uffff\u0000\u00bf\u00c6\u0003\u000e\u0007\u0000\u00c0\u00c6\u0003\u0010"+
		"\b\u0000\u00c1\u00c6\u0003\u0014\n\u0000\u00c2\u00c6\u0003\u0012\t\u0000"+
		"\u00c3\u00c6\u0003\u0016\u000b\u0000\u00c4\u00c6\u0003\u0018\f\u0000\u00c5"+
		"\u00be\u0001\u0000\u0000\u0000\u00c5\u00c0\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c5\u00c2\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6"+
		"\u00cc\u0001\u0000\u0000\u0000\u00c7\u00c8\n\u0001\u0000\u0000\u00c8\u00c9"+
		"\u0005\u001c\u0000\u0000\u00c9\u00cb\u0003\f\u0006\u0002\u00ca\u00c7\u0001"+
		"\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\r\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005)\u0000"+
		"\u0000\u00d0\u000f\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005*\u0000\u0000"+
		"\u00d2\u0011\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u0016\u0000\u0000"+
		"\u00d4\u00d5\u0003\f\u0006\u0000\u00d5\u00d6\u0005\u0017\u0000\u0000\u00d6"+
		"\u00d7\u0003\f\u0006\u0000\u00d7\u00d8\u0005\u0018\u0000\u0000\u00d8\u0013"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u0019\u0000\u0000\u00da\u00db"+
		"\u0003\f\u0006\u0000\u00db\u00dc\u0005\u0019\u0000\u0000\u00dc\u00dd\u0003"+
		"\f\u0006\u0000\u00dd\u00de\u0005\u0019\u0000\u0000\u00de\u00df\u0003\f"+
		"\u0006\u0000\u00df\u00e0\u0005\u0019\u0000\u0000\u00e0\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0005\u0019\u0000\u0000\u00e2\u00e3\u0003\f\u0006"+
		"\u0000\u00e3\u00e4\u0005\u0019\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e5\u00d9\u0001\u0000\u0000\u0000\u00e5\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e6\u0015\u0001\u0000\u0000\u0000\u00e7\u00e8\u0007\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0003\f\u0006\u0000\u00e9\u00ea\u0005\u0006\u0000\u0000"+
		"\u00ea\u00eb\u0003\f\u0006\u0000\u00eb\u00ec\u0007\u0000\u0000\u0000\u00ec"+
		"\u0017\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005+\u0000\u0000\u00ee\u0019"+
		"\u0001\u0000\u0000\u0000\u001e\u001d$-3:<BDITY\u007f\u0085\u008a\u0090"+
		"\u0093\u0096\u009a\u009e\u00a1\u00a4\u00a8\u00aa\u00b2\u00b5\u00b8\u00bc"+
		"\u00c5\u00cc\u00e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}