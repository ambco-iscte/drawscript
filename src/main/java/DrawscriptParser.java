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
		T__24=25, T__25=26, T__26=27, OP_POW=28, OP_ADD_SUB=29, OP_MUL_DIV_MOD=30, 
		OPERATOR_RELATIONAL=31, OP_GT=32, OP_LT=33, OP_GEQ=34, OP_LEQ=35, OP_EQ=36, 
		INTEGER=37, BOOL=38, IDENTIFIER=39, NEWLINE=40, SPACE=41, TABS=42;
	public static final int
		RULE_script = 0, RULE_constants = 1, RULE_parameters = 2, RULE_dimension = 3, 
		RULE_background = 4, RULE_definition = 5, RULE_sequence = 6, RULE_instruction = 7, 
		RULE_expression = 8, RULE_number = 9, RULE_boolean = 10, RULE_point = 11, 
		RULE_colour = 12, RULE_interval = 13, RULE_reference = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "constants", "parameters", "dimension", "background", "definition", 
			"sequence", "instruction", "expression", "number", "boolean", "point", 
			"colour", "interval", "reference"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'---'", "'dimension:'", "'background:'", "':'", "'line'", "', '", 
			"'rectangle'", "'x'", "'square'", "'ellipse'", "'circle'", "'polyline'", 
			"'setlinecolor'", "'setfillcolor'", "'if ('", "') {'", "'}'", "' else {'", 
			"'for '", "' in '", "' {'", "'('", "')'", "','", "'|'", "'['", "']'", 
			"'^'", null, null, null, "'>'", "'<'", "'>='", "'<='", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "OP_POW", "OP_ADD_SUB", "OP_MUL_DIV_MOD", "OPERATOR_RELATIONAL", 
			"OP_GT", "OP_LT", "OP_GEQ", "OP_LEQ", "OP_EQ", "INTEGER", "BOOL", "IDENTIFIER", 
			"NEWLINE", "SPACE", "TABS"
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(30);
				constants();
				setState(31);
				match(NEWLINE);
				}
			}

			setState(35);
			match(T__0);
			setState(36);
			parameters();
			setState(37);
			match(NEWLINE);
			setState(38);
			match(T__0);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(39);
				sequence();
				}
			}

			setState(42);
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
			setState(44);
			definition();
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(45);
					match(NEWLINE);
					setState(46);
					definition();
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(52);
					match(NEWLINE);
					}
					} 
				}
				setState(57);
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
		public DimensionContext dim;
		public BackgroundContext bg;
		public List<TerminalNode> NEWLINE() { return getTokens(DrawscriptParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DrawscriptParser.NEWLINE, i);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public BackgroundContext background() {
			return getRuleContext(BackgroundContext.class,0);
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
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(58);
				match(NEWLINE);
				setState(59);
				match(T__1);
				setState(60);
				((ParametersContext)_localctx).dim = dimension();
				}
				break;
			}
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(63);
				match(NEWLINE);
				setState(64);
				match(T__2);
				setState(65);
				((ParametersContext)_localctx).bg = background();
				}
				break;
			}
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
					match(NEWLINE);
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
	public static class DimensionContext extends ParserRuleContext {
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dimension);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				point();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				reference();
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
	public static class BackgroundContext extends ParserRuleContext {
		public ColourContext colour() {
			return getRuleContext(ColourContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public BackgroundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_background; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterBackground(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitBackground(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitBackground(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackgroundContext background() throws RecognitionException {
		BackgroundContext _localctx = new BackgroundContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_background);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				colour();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				reference();
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
		enterRule(_localctx, 10, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(IDENTIFIER);
			setState(83);
			match(T__3);
			setState(84);
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
		enterRule(_localctx, 12, RULE_sequence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(86);
					match(NEWLINE);
					setState(87);
					instruction();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(90); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					match(NEWLINE);
					}
					} 
				}
				setState(97);
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
		public BackgroundContext color;
		public BackgroundContext background() {
			return getRuleContext(BackgroundContext.class,0);
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
		public BackgroundContext color;
		public BackgroundContext background() {
			return getRuleContext(BackgroundContext.class,0);
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
		enterRule(_localctx, 14, RULE_instruction);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new LineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(T__4);
				setState(99);
				((LineContext)_localctx).start = point();
				setState(100);
				match(T__5);
				setState(101);
				((LineContext)_localctx).end = point();
				}
				break;
			case T__6:
				_localctx = new RectangleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(T__6);
				setState(104);
				((RectangleContext)_localctx).start = point();
				setState(105);
				match(T__5);
				setState(106);
				((RectangleContext)_localctx).width = expression(0);
				setState(107);
				match(T__7);
				setState(108);
				((RectangleContext)_localctx).height = expression(0);
				}
				break;
			case T__8:
				_localctx = new SquareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(T__8);
				setState(111);
				((SquareContext)_localctx).start = point();
				setState(112);
				match(T__5);
				setState(113);
				((SquareContext)_localctx).length = expression(0);
				}
				break;
			case T__9:
				_localctx = new EllipseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				match(T__9);
				setState(116);
				((EllipseContext)_localctx).center = point();
				setState(117);
				match(T__5);
				setState(118);
				((EllipseContext)_localctx).width = expression(0);
				setState(119);
				match(T__7);
				setState(120);
				((EllipseContext)_localctx).height = expression(0);
				}
				break;
			case T__10:
				_localctx = new CircleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				match(T__10);
				setState(123);
				((CircleContext)_localctx).center = point();
				setState(124);
				match(T__5);
				setState(125);
				((CircleContext)_localctx).radius = expression(0);
				}
				break;
			case T__11:
				_localctx = new PolylineContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(127);
				match(T__11);
				setState(128);
				((PolylineContext)_localctx).start = point();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(129);
					match(T__5);
					setState(130);
					((PolylineContext)_localctx).point = point();
					((PolylineContext)_localctx).points.add(((PolylineContext)_localctx).point);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__12:
				_localctx = new SetLineColourContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(136);
				match(T__12);
				setState(137);
				((SetLineColourContext)_localctx).color = background();
				}
				break;
			case T__13:
				_localctx = new SetFillColourContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(138);
				match(T__13);
				setState(139);
				((SetFillColourContext)_localctx).color = background();
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
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(143);
					match(NEWLINE);
					}
					break;
				}
				setState(147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
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
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
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
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(157);
						match(NEWLINE);
						}
						break;
					}
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
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
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
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
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(177);
					match(NEWLINE);
					}
					break;
				}
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
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
	public static class EnclosedExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnclosedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterEnclosedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitEnclosedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitEnclosedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpressionAddSubContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_ADD_SUB() { return getToken(DrawscriptParser.OP_ADD_SUB, 0); }
		public BinaryExpressionAddSubContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterBinaryExpressionAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitBinaryExpressionAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitBinaryExpressionAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpressionMulDivModContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_MUL_DIV_MOD() { return getToken(DrawscriptParser.OP_MUL_DIV_MOD, 0); }
		public BinaryExpressionMulDivModContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterBinaryExpressionMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitBinaryExpressionMulDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitBinaryExpressionMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpressionPowContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_POW() { return getToken(DrawscriptParser.OP_POW, 0); }
		public BinaryExpressionPowContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterBinaryExpressionPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitBinaryExpressionPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitBinaryExpressionPow(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpressionRelationalContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OPERATOR_RELATIONAL() { return getToken(DrawscriptParser.OPERATOR_RELATIONAL, 0); }
		public BinaryExpressionRelationalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterBinaryExpressionRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitBinaryExpressionRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitBinaryExpressionRelational(this);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				_localctx = new EnclosedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(191);
				match(T__21);
				setState(192);
				expression(0);
				setState(193);
				match(T__22);
				}
				break;
			case 2:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				number();
				}
				break;
			case 3:
				{
				_localctx = new BooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				boolean_();
				}
				break;
			case 4:
				{
				_localctx = new ColourExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				colour();
				}
				break;
			case 5:
				{
				_localctx = new PointExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				point();
				}
				break;
			case 6:
				{
				_localctx = new IntervalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				interval();
				}
				break;
			case 7:
				{
				_localctx = new ReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				reference();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpressionPowContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionPowContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(203);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(204);
						((BinaryExpressionPowContext)_localctx).operator = match(OP_POW);
						setState(205);
						((BinaryExpressionPowContext)_localctx).right = expression(5);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpressionMulDivModContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionMulDivModContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(207);
						((BinaryExpressionMulDivModContext)_localctx).operator = match(OP_MUL_DIV_MOD);
						setState(208);
						((BinaryExpressionMulDivModContext)_localctx).right = expression(4);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpressionAddSubContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionAddSubContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(209);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(210);
						((BinaryExpressionAddSubContext)_localctx).operator = match(OP_ADD_SUB);
						setState(211);
						((BinaryExpressionAddSubContext)_localctx).right = expression(3);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpressionRelationalContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryExpressionRelationalContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(212);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(213);
						((BinaryExpressionRelationalContext)_localctx).operator = match(OPERATOR_RELATIONAL);
						setState(214);
						((BinaryExpressionRelationalContext)_localctx).right = expression(2);
						}
						break;
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 18, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
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
		enterRule(_localctx, 20, RULE_boolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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
		enterRule(_localctx, 22, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__21);
			setState(225);
			((PointContext)_localctx).x = expression(0);
			setState(226);
			match(T__23);
			setState(227);
			((PointContext)_localctx).y = expression(0);
			setState(228);
			match(T__22);
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
		enterRule(_localctx, 24, RULE_colour);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(230);
				match(T__24);
				setState(231);
				((ColourContext)_localctx).red = expression(0);
				setState(232);
				match(T__24);
				setState(233);
				((ColourContext)_localctx).green = expression(0);
				setState(234);
				match(T__24);
				setState(235);
				((ColourContext)_localctx).blue = expression(0);
				setState(236);
				match(T__24);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(T__24);
				setState(239);
				((ColourContext)_localctx).rgb = expression(0);
				setState(240);
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
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
	 
		public IntervalContext() { }
		public void copyFrom(IntervalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LeftOpenIntervalContext extends IntervalContext {
		public ExpressionContext start;
		public ExpressionContext end;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LeftOpenIntervalContext(IntervalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterLeftOpenInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitLeftOpenInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitLeftOpenInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClosedIntervalContext extends IntervalContext {
		public ExpressionContext start;
		public ExpressionContext end;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ClosedIntervalContext(IntervalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterClosedInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitClosedInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitClosedInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RightOpenIntervalContext extends IntervalContext {
		public ExpressionContext start;
		public ExpressionContext end;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RightOpenIntervalContext(IntervalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterRightOpenInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitRightOpenInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitRightOpenInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpenIntervalContext extends IntervalContext {
		public ExpressionContext start;
		public ExpressionContext end;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OpenIntervalContext(IntervalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).enterOpenInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawscriptListener ) ((DrawscriptListener)listener).exitOpenInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawscriptVisitor ) return ((DrawscriptVisitor<? extends T>)visitor).visitOpenInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interval);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new ClosedIntervalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(T__25);
				setState(245);
				((ClosedIntervalContext)_localctx).start = expression(0);
				setState(246);
				match(T__5);
				setState(247);
				((ClosedIntervalContext)_localctx).end = expression(0);
				setState(248);
				match(T__26);
				}
				break;
			case 2:
				_localctx = new OpenIntervalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(T__26);
				setState(251);
				((OpenIntervalContext)_localctx).start = expression(0);
				setState(252);
				match(T__5);
				setState(253);
				((OpenIntervalContext)_localctx).end = expression(0);
				setState(254);
				match(T__25);
				}
				break;
			case 3:
				_localctx = new LeftOpenIntervalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(T__26);
				setState(257);
				((LeftOpenIntervalContext)_localctx).start = expression(0);
				setState(258);
				match(T__5);
				setState(259);
				((LeftOpenIntervalContext)_localctx).end = expression(0);
				setState(260);
				match(T__26);
				}
				break;
			case 4:
				_localctx = new RightOpenIntervalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				match(T__25);
				setState(263);
				((RightOpenIntervalContext)_localctx).start = expression(0);
				setState(264);
				match(T__5);
				setState(265);
				((RightOpenIntervalContext)_localctx).end = expression(0);
				setState(266);
				match(T__25);
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
		enterRule(_localctx, 28, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
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
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001*\u0111\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000\"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000)\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00010\b\u0001\n\u0001\f\u0001"+
		"3\t\u0001\u0001\u0001\u0005\u00016\b\u0001\n\u0001\f\u00019\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002>\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002C\b\u0002\u0001\u0002\u0005\u0002F\b\u0002"+
		"\n\u0002\f\u0002I\t\u0002\u0001\u0003\u0001\u0003\u0003\u0003M\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u0004Q\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0004\u0006Y\b\u0006"+
		"\u000b\u0006\f\u0006Z\u0001\u0006\u0005\u0006^\b\u0006\n\u0006\f\u0006"+
		"a\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0084\b\u0007"+
		"\n\u0007\f\u0007\u0087\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0091"+
		"\b\u0007\u0001\u0007\u0003\u0007\u0094\b\u0007\u0001\u0007\u0003\u0007"+
		"\u0097\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u009b\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u009f\b\u0007\u0001\u0007\u0003\u0007\u00a2"+
		"\b\u0007\u0001\u0007\u0003\u0007\u00a5\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00a9\b\u0007\u0003\u0007\u00ab\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b3"+
		"\b\u0007\u0001\u0007\u0003\u0007\u00b6\b\u0007\u0001\u0007\u0003\u0007"+
		"\u00b9\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00bd\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00ca\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00d8\b\b\n"+
		"\b\f\b\u00db\t\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00f3\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u010d\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0000\u0001\u0010\u000f"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u0000\u0000\u0130\u0000!\u0001\u0000\u0000\u0000\u0002,\u0001\u0000"+
		"\u0000\u0000\u0004=\u0001\u0000\u0000\u0000\u0006L\u0001\u0000\u0000\u0000"+
		"\bP\u0001\u0000\u0000\u0000\nR\u0001\u0000\u0000\u0000\fX\u0001\u0000"+
		"\u0000\u0000\u000e\u00bc\u0001\u0000\u0000\u0000\u0010\u00c9\u0001\u0000"+
		"\u0000\u0000\u0012\u00dc\u0001\u0000\u0000\u0000\u0014\u00de\u0001\u0000"+
		"\u0000\u0000\u0016\u00e0\u0001\u0000\u0000\u0000\u0018\u00f2\u0001\u0000"+
		"\u0000\u0000\u001a\u010c\u0001\u0000\u0000\u0000\u001c\u010e\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0003\u0002\u0001\u0000\u001f \u0005(\u0000\u0000"+
		" \"\u0001\u0000\u0000\u0000!\u001e\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0005\u0001\u0000\u0000$%\u0003"+
		"\u0004\u0002\u0000%&\u0005(\u0000\u0000&(\u0005\u0001\u0000\u0000\')\u0003"+
		"\f\u0006\u0000(\'\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)*"+
		"\u0001\u0000\u0000\u0000*+\u0005\u0000\u0000\u0001+\u0001\u0001\u0000"+
		"\u0000\u0000,1\u0003\n\u0005\u0000-.\u0005(\u0000\u0000.0\u0003\n\u0005"+
		"\u0000/-\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u000027\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u000046\u0005(\u0000\u000054\u0001\u0000\u0000\u000069\u0001"+
		"\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"8\u0003\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:;\u0005(\u0000"+
		"\u0000;<\u0005\u0002\u0000\u0000<>\u0003\u0006\u0003\u0000=:\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>B\u0001\u0000\u0000\u0000?@\u0005"+
		"(\u0000\u0000@A\u0005\u0003\u0000\u0000AC\u0003\b\u0004\u0000B?\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CG\u0001\u0000\u0000\u0000"+
		"DF\u0005(\u0000\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\u0005\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000JM\u0003\u0016\u000b\u0000KM\u0003"+
		"\u001c\u000e\u0000LJ\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000"+
		"M\u0007\u0001\u0000\u0000\u0000NQ\u0003\u0018\f\u0000OQ\u0003\u001c\u000e"+
		"\u0000PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000Q\t\u0001\u0000"+
		"\u0000\u0000RS\u0005\'\u0000\u0000ST\u0005\u0004\u0000\u0000TU\u0003\u0010"+
		"\b\u0000U\u000b\u0001\u0000\u0000\u0000VW\u0005(\u0000\u0000WY\u0003\u000e"+
		"\u0007\u0000XV\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[_\u0001\u0000\u0000\u0000"+
		"\\^\u0005(\u0000\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\r\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u0005\u0005\u0000\u0000cd\u0003"+
		"\u0016\u000b\u0000de\u0005\u0006\u0000\u0000ef\u0003\u0016\u000b\u0000"+
		"f\u00bd\u0001\u0000\u0000\u0000gh\u0005\u0007\u0000\u0000hi\u0003\u0016"+
		"\u000b\u0000ij\u0005\u0006\u0000\u0000jk\u0003\u0010\b\u0000kl\u0005\b"+
		"\u0000\u0000lm\u0003\u0010\b\u0000m\u00bd\u0001\u0000\u0000\u0000no\u0005"+
		"\t\u0000\u0000op\u0003\u0016\u000b\u0000pq\u0005\u0006\u0000\u0000qr\u0003"+
		"\u0010\b\u0000r\u00bd\u0001\u0000\u0000\u0000st\u0005\n\u0000\u0000tu"+
		"\u0003\u0016\u000b\u0000uv\u0005\u0006\u0000\u0000vw\u0003\u0010\b\u0000"+
		"wx\u0005\b\u0000\u0000xy\u0003\u0010\b\u0000y\u00bd\u0001\u0000\u0000"+
		"\u0000z{\u0005\u000b\u0000\u0000{|\u0003\u0016\u000b\u0000|}\u0005\u0006"+
		"\u0000\u0000}~\u0003\u0010\b\u0000~\u00bd\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005\f\u0000\u0000\u0080\u0085\u0003\u0016\u000b\u0000\u0081\u0082"+
		"\u0005\u0006\u0000\u0000\u0082\u0084\u0003\u0016\u000b\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u00bd"+
		"\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0005\r\u0000\u0000\u0089\u00bd\u0003\b\u0004\u0000\u008a\u008b\u0005"+
		"\u000e\u0000\u0000\u008b\u00bd\u0003\b\u0004\u0000\u008c\u008d\u0005\u000f"+
		"\u0000\u0000\u008d\u008e\u0003\u0010\b\u0000\u008e\u0090\u0005\u0010\u0000"+
		"\u0000\u008f\u0091\u0005(\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000"+
		"\u0092\u0094\u0003\f\u0006\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095"+
		"\u0097\u0005(\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a"+
		"\u0005\u0011\u0000\u0000\u0099\u009b\u0005(\u0000\u0000\u009a\u0099\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u00aa\u0001"+
		"\u0000\u0000\u0000\u009c\u009e\u0005\u0012\u0000\u0000\u009d\u009f\u0005"+
		"(\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000"+
		"\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u00a2\u0003\f\u0006"+
		"\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a5\u0005(\u0000\u0000"+
		"\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a8\u0005\u0011\u0000\u0000"+
		"\u00a7\u00a9\u0005(\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa"+
		"\u009c\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab"+
		"\u00bd\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0013\u0000\u0000\u00ad"+
		"\u00ae\u0005\'\u0000\u0000\u00ae\u00af\u0005\u0014\u0000\u0000\u00af\u00b0"+
		"\u0003\u001a\r\u0000\u00b0\u00b2\u0005\u0015\u0000\u0000\u00b1\u00b3\u0005"+
		"(\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b6\u0003\f\u0006"+
		"\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b9\u0005(\u0000\u0000"+
		"\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u0011\u0000\u0000"+
		"\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bcb\u0001\u0000\u0000\u0000\u00bc"+
		"g\u0001\u0000\u0000\u0000\u00bcn\u0001\u0000\u0000\u0000\u00bcs\u0001"+
		"\u0000\u0000\u0000\u00bcz\u0001\u0000\u0000\u0000\u00bc\u007f\u0001\u0000"+
		"\u0000\u0000\u00bc\u0088\u0001\u0000\u0000\u0000\u00bc\u008a\u0001\u0000"+
		"\u0000\u0000\u00bc\u008c\u0001\u0000\u0000\u0000\u00bc\u00ac\u0001\u0000"+
		"\u0000\u0000\u00bd\u000f\u0001\u0000\u0000\u0000\u00be\u00bf\u0006\b\uffff"+
		"\uffff\u0000\u00bf\u00c0\u0005\u0016\u0000\u0000\u00c0\u00c1\u0003\u0010"+
		"\b\u0000\u00c1\u00c2\u0005\u0017\u0000\u0000\u00c2\u00ca\u0001\u0000\u0000"+
		"\u0000\u00c3\u00ca\u0003\u0012\t\u0000\u00c4\u00ca\u0003\u0014\n\u0000"+
		"\u00c5\u00ca\u0003\u0018\f\u0000\u00c6\u00ca\u0003\u0016\u000b\u0000\u00c7"+
		"\u00ca\u0003\u001a\r\u0000\u00c8\u00ca\u0003\u001c\u000e\u0000\u00c9\u00be"+
		"\u0001\u0000\u0000\u0000\u00c9\u00c3\u0001\u0000\u0000\u0000\u00c9\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c9\u00c5\u0001\u0000\u0000\u0000\u00c9\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00c8"+
		"\u0001\u0000\u0000\u0000\u00ca\u00d9\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\n\u0004\u0000\u0000\u00cc\u00cd\u0005\u001c\u0000\u0000\u00cd\u00d8\u0003"+
		"\u0010\b\u0005\u00ce\u00cf\n\u0003\u0000\u0000\u00cf\u00d0\u0005\u001e"+
		"\u0000\u0000\u00d0\u00d8\u0003\u0010\b\u0004\u00d1\u00d2\n\u0002\u0000"+
		"\u0000\u00d2\u00d3\u0005\u001d\u0000\u0000\u00d3\u00d8\u0003\u0010\b\u0003"+
		"\u00d4\u00d5\n\u0001\u0000\u0000\u00d5\u00d6\u0005\u001f\u0000\u0000\u00d6"+
		"\u00d8\u0003\u0010\b\u0002\u00d7\u00cb\u0001\u0000\u0000\u0000\u00d7\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d1\u0001\u0000\u0000\u0000\u00d7\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u0011"+
		"\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0005%\u0000\u0000\u00dd\u0013\u0001\u0000\u0000\u0000\u00de\u00df\u0005"+
		"&\u0000\u0000\u00df\u0015\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0016"+
		"\u0000\u0000\u00e1\u00e2\u0003\u0010\b\u0000\u00e2\u00e3\u0005\u0018\u0000"+
		"\u0000\u00e3\u00e4\u0003\u0010\b\u0000\u00e4\u00e5\u0005\u0017\u0000\u0000"+
		"\u00e5\u0017\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u0019\u0000\u0000"+
		"\u00e7\u00e8\u0003\u0010\b\u0000\u00e8\u00e9\u0005\u0019\u0000\u0000\u00e9"+
		"\u00ea\u0003\u0010\b\u0000\u00ea\u00eb\u0005\u0019\u0000\u0000\u00eb\u00ec"+
		"\u0003\u0010\b\u0000\u00ec\u00ed\u0005\u0019\u0000\u0000\u00ed\u00f3\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0005\u0019\u0000\u0000\u00ef\u00f0\u0003"+
		"\u0010\b\u0000\u00f0\u00f1\u0005\u0019\u0000\u0000\u00f1\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f2\u00e6\u0001\u0000\u0000\u0000\u00f2\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f3\u0019\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u001a"+
		"\u0000\u0000\u00f5\u00f6\u0003\u0010\b\u0000\u00f6\u00f7\u0005\u0006\u0000"+
		"\u0000\u00f7\u00f8\u0003\u0010\b\u0000\u00f8\u00f9\u0005\u001b\u0000\u0000"+
		"\u00f9\u010d\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u001b\u0000\u0000"+
		"\u00fb\u00fc\u0003\u0010\b\u0000\u00fc\u00fd\u0005\u0006\u0000\u0000\u00fd"+
		"\u00fe\u0003\u0010\b\u0000\u00fe\u00ff\u0005\u001a\u0000\u0000\u00ff\u010d"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u001b\u0000\u0000\u0101\u0102"+
		"\u0003\u0010\b\u0000\u0102\u0103\u0005\u0006\u0000\u0000\u0103\u0104\u0003"+
		"\u0010\b\u0000\u0104\u0105\u0005\u001b\u0000\u0000\u0105\u010d\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0005\u001a\u0000\u0000\u0107\u0108\u0003\u0010"+
		"\b\u0000\u0108\u0109\u0005\u0006\u0000\u0000\u0109\u010a\u0003\u0010\b"+
		"\u0000\u010a\u010b\u0005\u001a\u0000\u0000\u010b\u010d\u0001\u0000\u0000"+
		"\u0000\u010c\u00f4\u0001\u0000\u0000\u0000\u010c\u00fa\u0001\u0000\u0000"+
		"\u0000\u010c\u0100\u0001\u0000\u0000\u0000\u010c\u0106\u0001\u0000\u0000"+
		"\u0000\u010d\u001b\u0001\u0000\u0000\u0000\u010e\u010f\u0005\'\u0000\u0000"+
		"\u010f\u001d\u0001\u0000\u0000\u0000\u001e!(17=BGLPZ_\u0085\u0090\u0093"+
		"\u0096\u009a\u009e\u00a1\u00a4\u00a8\u00aa\u00b2\u00b5\u00b8\u00bc\u00c9"+
		"\u00d7\u00d9\u00f2\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}