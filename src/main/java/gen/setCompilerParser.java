package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class setCompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, SET=5, ELEMENT=6, ADD=7, REMOVE=8, PRINT=9, 
		INT=10, WHILE=11, FOR=12, CONST=13, IF=14, ELSE=15, CALL=16, RETURN=17, 
		SEPARATOR=18, DELIMITER=19, COLON=20, GLOBAL=21, ADDS=22, SUB=23, MUL=24, 
		DIV=25, NEGATION=26, EQUAL=27, NON_EQUAL=28, LESS=29, LESS_OR_EQUALS=30, 
		GREATER=31, GREATER_OR_EQUALS=32, O_BRACKET=33, C_BRACKET=34, K_O_BRACKET=35, 
		K_C_BRACKET=36, ID=37, STRING=38, NUMBER=39, WS=40, COMMENTS=41;
	public static final int
		RULE_global_program = 0, RULE_program = 1, RULE_block = 2, RULE_statement = 3, 
		RULE_digit_expression = 4, RULE_intialize_set = 5, RULE_intialize_element = 6, 
		RULE_assign_var_method_invocation = 7, RULE_assign_set = 8, RULE_assign_var = 9, 
		RULE_print = 10, RULE_operations = 11, RULE_operarions_with_set = 12, 
		RULE_simple_compare = 13, RULE_hard_compare = 14, RULE_while_cicle = 15, 
		RULE_if_else = 16, RULE_for_each = 17, RULE_global_assign_set = 18, RULE_global_assign_var = 19, 
		RULE_type = 20, RULE_type_1 = 21, RULE_subprogram_return = 22, RULE_signature = 23, 
		RULE_subprogram_non_return = 24, RULE_block_return = 25, RULE_block_non_return = 26, 
		RULE_signature_method_invokation = 27, RULE_method_invokation = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"global_program", "program", "block", "statement", "digit_expression", 
			"intialize_set", "intialize_element", "assign_var_method_invocation", 
			"assign_set", "assign_var", "print", "operations", "operarions_with_set", 
			"simple_compare", "hard_compare", "while_cicle", "if_else", "for_each", 
			"global_assign_set", "global_assign_var", "type", "type_1", "subprogram_return", 
			"signature", "subprogram_non_return", "block_return", "block_non_return", 
			"signature_method_invokation", "method_invokation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "','", "'='", "'func'", "'set'", "'element'", "'add'", 
			"'remove'", "'print'", "'int'", "'while'", "'for'", "'const'", "'if'", 
			"'else'", "'call'", "'return'", "';'", "'.'", "':'", "'global'", "'+'", 
			"'-'", "'*'", "'/'", "'!'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", 
			"'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "SET", "ELEMENT", "ADD", "REMOVE", "PRINT", 
			"INT", "WHILE", "FOR", "CONST", "IF", "ELSE", "CALL", "RETURN", "SEPARATOR", 
			"DELIMITER", "COLON", "GLOBAL", "ADDS", "SUB", "MUL", "DIV", "NEGATION", 
			"EQUAL", "NON_EQUAL", "LESS", "LESS_OR_EQUALS", "GREATER", "GREATER_OR_EQUALS", 
			"O_BRACKET", "C_BRACKET", "K_O_BRACKET", "K_C_BRACKET", "ID", "STRING", 
			"NUMBER", "WS", "COMMENTS"
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
	public String getGrammarFileName() { return "setCompiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public setCompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Global_programContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public List<Global_assign_setContext> global_assign_set() {
			return getRuleContexts(Global_assign_setContext.class);
		}
		public Global_assign_setContext global_assign_set(int i) {
			return getRuleContext(Global_assign_setContext.class,i);
		}
		public List<Global_assign_varContext> global_assign_var() {
			return getRuleContexts(Global_assign_varContext.class);
		}
		public Global_assign_varContext global_assign_var(int i) {
			return getRuleContext(Global_assign_varContext.class,i);
		}
		public List<Subprogram_non_returnContext> subprogram_non_return() {
			return getRuleContexts(Subprogram_non_returnContext.class);
		}
		public Subprogram_non_returnContext subprogram_non_return(int i) {
			return getRuleContext(Subprogram_non_returnContext.class,i);
		}
		public List<Subprogram_returnContext> subprogram_return() {
			return getRuleContexts(Subprogram_returnContext.class);
		}
		public Subprogram_returnContext subprogram_return(int i) {
			return getRuleContext(Subprogram_returnContext.class,i);
		}
		public Global_programContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterGlobal_program(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitGlobal_program(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitGlobal_program(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_programContext global_program() throws RecognitionException {
		Global_programContext _localctx = new Global_programContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_global_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GLOBAL) {
				{
				setState(60);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(58);
					global_assign_set();
					}
					break;
				case 2:
					{
					setState(59);
					global_assign_var();
					}
					break;
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				setState(67);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(65);
					subprogram_non_return();
					}
					break;
				case 2:
					{
					setState(66);
					subprogram_return();
					}
					break;
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			program();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				setState(76);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(74);
					subprogram_non_return();
					}
					break;
				case 2:
					{
					setState(75);
					subprogram_return();
					}
					break;
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__0);
			setState(82);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode K_O_BRACKET() { return getToken(setCompilerParser.K_O_BRACKET, 0); }
		public TerminalNode K_C_BRACKET() { return getToken(setCompilerParser.K_C_BRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(K_O_BRACKET);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << ELEMENT) | (1L << PRINT) | (1L << INT) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << CALL) | (1L << ID))) != 0)) {
				{
				{
				setState(85);
				statement();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(K_C_BRACKET);
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

	public static class StatementContext extends ParserRuleContext {
		public Assign_varContext assign_var() {
			return getRuleContext(Assign_varContext.class,0);
		}
		public Assign_setContext assign_set() {
			return getRuleContext(Assign_setContext.class,0);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public Assign_var_method_invocationContext assign_var_method_invocation() {
			return getRuleContext(Assign_var_method_invocationContext.class,0);
		}
		public While_cicleContext while_cicle() {
			return getRuleContext(While_cicleContext.class,0);
		}
		public If_elseContext if_else() {
			return getRuleContext(If_elseContext.class,0);
		}
		public Method_invokationContext method_invokation() {
			return getRuleContext(Method_invokationContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public Operarions_with_setContext operarions_with_set() {
			return getRuleContext(Operarions_with_setContext.class,0);
		}
		public For_eachContext for_each() {
			return getRuleContext(For_eachContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				assign_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				assign_set();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				operations();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				assign_var_method_invocation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				while_cicle();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
				if_else();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(99);
				method_invokation();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(100);
				print();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(101);
				operarions_with_set();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(102);
				for_each();
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

	public static class Digit_expressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(setCompilerParser.ID, 0); }
		public TerminalNode O_BRACKET() { return getToken(setCompilerParser.O_BRACKET, 0); }
		public List<Digit_expressionContext> digit_expression() {
			return getRuleContexts(Digit_expressionContext.class);
		}
		public Digit_expressionContext digit_expression(int i) {
			return getRuleContext(Digit_expressionContext.class,i);
		}
		public TerminalNode C_BRACKET() { return getToken(setCompilerParser.C_BRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(setCompilerParser.NUMBER, 0); }
		public TerminalNode MUL() { return getToken(setCompilerParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(setCompilerParser.DIV, 0); }
		public TerminalNode ADDS() { return getToken(setCompilerParser.ADDS, 0); }
		public TerminalNode SUB() { return getToken(setCompilerParser.SUB, 0); }
		public Digit_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterDigit_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitDigit_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitDigit_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Digit_expressionContext digit_expression() throws RecognitionException {
		return digit_expression(0);
	}

	private Digit_expressionContext digit_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Digit_expressionContext _localctx = new Digit_expressionContext(_ctx, _parentState);
		Digit_expressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_digit_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(106);
				match(ID);
				}
				break;
			case O_BRACKET:
				{
				setState(107);
				match(O_BRACKET);
				setState(108);
				digit_expression(0);
				setState(109);
				match(C_BRACKET);
				}
				break;
			case NUMBER:
				{
				setState(111);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(120);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new Digit_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_digit_expression);
						setState(114);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(115);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(116);
						digit_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new Digit_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_digit_expression);
						setState(117);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(118);
						_la = _input.LA(1);
						if ( !(_la==ADDS || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(119);
						digit_expression(5);
						}
						break;
					}
					} 
				}
				setState(124);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Intialize_setContext extends ParserRuleContext {
		public TerminalNode K_C_BRACKET() { return getToken(setCompilerParser.K_C_BRACKET, 0); }
		public TerminalNode K_O_BRACKET() { return getToken(setCompilerParser.K_O_BRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(setCompilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(setCompilerParser.ID, i);
		}
		public TerminalNode MUL() { return getToken(setCompilerParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(setCompilerParser.DIV, 0); }
		public TerminalNode ADDS() { return getToken(setCompilerParser.ADDS, 0); }
		public TerminalNode SUB() { return getToken(setCompilerParser.SUB, 0); }
		public Intialize_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intialize_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterIntialize_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitIntialize_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitIntialize_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Intialize_setContext intialize_set() throws RecognitionException {
		Intialize_setContext _localctx = new Intialize_setContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_intialize_set);
		int _la;
		try {
			int _alt;
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_C_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(125);
				match(K_C_BRACKET);
				setState(126);
				match(K_O_BRACKET);
				}
				}
				break;
			case K_O_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(127);
				match(K_O_BRACKET);
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(128);
						match(ID);
						setState(129);
						match(T__1);
						}
						} 
					}
					setState(134);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				{
				setState(135);
				match(ID);
				}
				setState(136);
				match(K_C_BRACKET);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(137);
				match(ID);
				setState(138);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDS) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(139);
				match(ID);
				}
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

	public static class Intialize_elementContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(setCompilerParser.STRING, 0); }
		public Intialize_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intialize_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterIntialize_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitIntialize_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitIntialize_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Intialize_elementContext intialize_element() throws RecognitionException {
		Intialize_elementContext _localctx = new Intialize_elementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_intialize_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(STRING);
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

	public static class Assign_var_method_invocationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(setCompilerParser.ID, 0); }
		public Method_invokationContext method_invokation() {
			return getRuleContext(Method_invokationContext.class,0);
		}
		public TerminalNode CONST() { return getToken(setCompilerParser.CONST, 0); }
		public Assign_var_method_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_var_method_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterAssign_var_method_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitAssign_var_method_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitAssign_var_method_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_var_method_invocationContext assign_var_method_invocation() throws RecognitionException {
		Assign_var_method_invocationContext _localctx = new Assign_var_method_invocationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign_var_method_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			type();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(145);
				match(CONST);
				}
			}

			setState(148);
			match(ID);
			setState(149);
			match(T__2);
			setState(150);
			method_invokation();
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

	public static class Assign_setContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(setCompilerParser.SET, 0); }
		public TerminalNode ID() { return getToken(setCompilerParser.ID, 0); }
		public TerminalNode SEPARATOR() { return getToken(setCompilerParser.SEPARATOR, 0); }
		public Intialize_setContext intialize_set() {
			return getRuleContext(Intialize_setContext.class,0);
		}
		public TerminalNode CONST() { return getToken(setCompilerParser.CONST, 0); }
		public Assign_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterAssign_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitAssign_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitAssign_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_setContext assign_set() throws RecognitionException {
		Assign_setContext _localctx = new Assign_setContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(SET);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(153);
				match(CONST);
				}
			}

			setState(156);
			match(ID);
			setState(157);
			match(T__2);
			{
			setState(158);
			intialize_set();
			}
			setState(159);
			match(SEPARATOR);
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

	public static class Assign_varContext extends ParserRuleContext {
		public Type_1Context type_1() {
			return getRuleContext(Type_1Context.class,0);
		}
		public TerminalNode ID() { return getToken(setCompilerParser.ID, 0); }
		public TerminalNode SEPARATOR() { return getToken(setCompilerParser.SEPARATOR, 0); }
		public Digit_expressionContext digit_expression() {
			return getRuleContext(Digit_expressionContext.class,0);
		}
		public Intialize_elementContext intialize_element() {
			return getRuleContext(Intialize_elementContext.class,0);
		}
		public TerminalNode CONST() { return getToken(setCompilerParser.CONST, 0); }
		public Assign_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterAssign_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitAssign_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitAssign_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_varContext assign_var() throws RecognitionException {
		Assign_varContext _localctx = new Assign_varContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			type_1();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(162);
				match(CONST);
				}
			}

			setState(165);
			match(ID);
			setState(166);
			match(T__2);
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case O_BRACKET:
			case ID:
			case NUMBER:
				{
				setState(167);
				digit_expression(0);
				}
				break;
			case STRING:
				{
				setState(168);
				intialize_element();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(171);
			match(SEPARATOR);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(setCompilerParser.PRINT, 0); }
		public TerminalNode O_BRACKET() { return getToken(setCompilerParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(setCompilerParser.C_BRACKET, 0); }
		public TerminalNode SEPARATOR() { return getToken(setCompilerParser.SEPARATOR, 0); }
		public TerminalNode ID() { return getToken(setCompilerParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(setCompilerParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(setCompilerParser.STRING, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(PRINT);
			setState(174);
			match(O_BRACKET);
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRING) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(176);
			match(C_BRACKET);
			setState(177);
			match(SEPARATOR);
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

	public static class OperationsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(setCompilerParser.ID, 0); }
		public Digit_expressionContext digit_expression() {
			return getRuleContext(Digit_expressionContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(setCompilerParser.SEPARATOR, 0); }
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitOperations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitOperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		OperationsContext _localctx = new OperationsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(ID);
			setState(180);
			match(T__2);
			setState(181);
			digit_expression(0);
			setState(182);
			match(SEPARATOR);
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

	public static class Operarions_with_setContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(setCompilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(setCompilerParser.ID, i);
		}
		public TerminalNode DELIMITER() { return getToken(setCompilerParser.DELIMITER, 0); }
		public TerminalNode SEPARATOR() { return getToken(setCompilerParser.SEPARATOR, 0); }
		public TerminalNode ADD() { return getToken(setCompilerParser.ADD, 0); }
		public TerminalNode REMOVE() { return getToken(setCompilerParser.REMOVE, 0); }
		public TerminalNode O_BRACKET() { return getToken(setCompilerParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(setCompilerParser.C_BRACKET, 0); }
		public Operarions_with_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operarions_with_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterOperarions_with_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitOperarions_with_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitOperarions_with_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operarions_with_setContext operarions_with_set() throws RecognitionException {
		Operarions_with_setContext _localctx = new Operarions_with_setContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operarions_with_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(ID);
			setState(185);
			match(DELIMITER);
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==REMOVE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(187);
			match(O_BRACKET);
			setState(188);
			match(ID);
			setState(189);
			match(C_BRACKET);
			}
			setState(191);
			match(SEPARATOR);
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

	public static class Simple_compareContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(setCompilerParser.EQUAL, 0); }
		public TerminalNode NON_EQUAL() { return getToken(setCompilerParser.NON_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(setCompilerParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(setCompilerParser.GREATER, 0); }
		public TerminalNode LESS_OR_EQUALS() { return getToken(setCompilerParser.LESS_OR_EQUALS, 0); }
		public TerminalNode GREATER_OR_EQUALS() { return getToken(setCompilerParser.GREATER_OR_EQUALS, 0); }
		public List<Digit_expressionContext> digit_expression() {
			return getRuleContexts(Digit_expressionContext.class);
		}
		public Digit_expressionContext digit_expression(int i) {
			return getRuleContext(Digit_expressionContext.class,i);
		}
		public Simple_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterSimple_compare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitSimple_compare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitSimple_compare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_compareContext simple_compare() throws RecognitionException {
		Simple_compareContext _localctx = new Simple_compareContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simple_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(193);
			digit_expression(0);
			}
			setState(194);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NON_EQUAL) | (1L << LESS) | (1L << LESS_OR_EQUALS) | (1L << GREATER) | (1L << GREATER_OR_EQUALS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(195);
			digit_expression(0);
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

	public static class Hard_compareContext extends ParserRuleContext {
		public TerminalNode O_BRACKET() { return getToken(setCompilerParser.O_BRACKET, 0); }
		public Simple_compareContext simple_compare() {
			return getRuleContext(Simple_compareContext.class,0);
		}
		public TerminalNode C_BRACKET() { return getToken(setCompilerParser.C_BRACKET, 0); }
		public TerminalNode NEGATION() { return getToken(setCompilerParser.NEGATION, 0); }
		public Hard_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hard_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterHard_compare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitHard_compare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitHard_compare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hard_compareContext hard_compare() throws RecognitionException {
		Hard_compareContext _localctx = new Hard_compareContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_hard_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGATION) {
				{
				setState(197);
				match(NEGATION);
				}
			}

			setState(200);
			match(O_BRACKET);
			setState(201);
			simple_compare();
			setState(202);
			match(C_BRACKET);
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

	public static class While_cicleContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(setCompilerParser.WHILE, 0); }
		public TerminalNode O_BRACKET() { return getToken(setCompilerParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(setCompilerParser.C_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Simple_compareContext simple_compare() {
			return getRuleContext(Simple_compareContext.class,0);
		}
		public Hard_compareContext hard_compare() {
			return getRuleContext(Hard_compareContext.class,0);
		}
		public While_cicleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_cicle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterWhile_cicle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitWhile_cicle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitWhile_cicle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_cicleContext while_cicle() throws RecognitionException {
		While_cicleContext _localctx = new While_cicleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_cicle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(WHILE);
			setState(205);
			match(O_BRACKET);
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(206);
				simple_compare();
				}
				break;
			case 2:
				{
				setState(207);
				hard_compare();
				}
				break;
			}
			setState(210);
			match(C_BRACKET);
			setState(211);
			block();
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

	public static class If_elseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(setCompilerParser.IF, 0); }
		public TerminalNode O_BRACKET() { return getToken(setCompilerParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(setCompilerParser.C_BRACKET, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(setCompilerParser.ELSE, 0); }
		public Simple_compareContext simple_compare() {
			return getRuleContext(Simple_compareContext.class,0);
		}
		public Hard_compareContext hard_compare() {
			return getRuleContext(Hard_compareContext.class,0);
		}
		public If_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterIf_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitIf_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitIf_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_elseContext if_else() throws RecognitionException {
		If_elseContext _localctx = new If_elseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(IF);
			setState(214);
			match(O_BRACKET);
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(215);
				simple_compare();
				}
				break;
			case 2:
				{
				setState(216);
				hard_compare();
				}
				break;
			}
			setState(219);
			match(C_BRACKET);
			setState(220);
			block();
			setState(221);
			match(ELSE);
			setState(222);
			block();
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

	public static class For_eachContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(setCompilerParser.FOR, 0); }
		public TerminalNode O_BRACKET() { return getToken(setCompilerParser.O_BRACKET, 0); }
		public TerminalNode ELEMENT() { return getToken(setCompilerParser.ELEMENT, 0); }
		public List<TerminalNode> ID() { return getTokens(setCompilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(setCompilerParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(setCompilerParser.COLON, 0); }
		public TerminalNode C_BRACKET() { return getToken(setCompilerParser.C_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_eachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterFor_each(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitFor_each(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitFor_each(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_eachContext for_each() throws RecognitionException {
		For_eachContext _localctx = new For_eachContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_for_each);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(FOR);
			setState(225);
			match(O_BRACKET);
			setState(226);
			match(ELEMENT);
			setState(227);
			match(ID);
			setState(228);
			match(COLON);
			setState(229);
			match(ID);
			setState(230);
			match(C_BRACKET);
			setState(231);
			block();
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

	public static class Global_assign_setContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(setCompilerParser.GLOBAL, 0); }
		public Assign_setContext assign_set() {
			return getRuleContext(Assign_setContext.class,0);
		}
		public Global_assign_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_assign_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterGlobal_assign_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitGlobal_assign_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitGlobal_assign_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_assign_setContext global_assign_set() throws RecognitionException {
		Global_assign_setContext _localctx = new Global_assign_setContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_global_assign_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(GLOBAL);
			setState(234);
			assign_set();
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

	public static class Global_assign_varContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(setCompilerParser.GLOBAL, 0); }
		public Assign_varContext assign_var() {
			return getRuleContext(Assign_varContext.class,0);
		}
		public Global_assign_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_assign_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterGlobal_assign_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitGlobal_assign_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitGlobal_assign_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_assign_varContext global_assign_var() throws RecognitionException {
		Global_assign_varContext _localctx = new Global_assign_varContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_global_assign_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(GLOBAL);
			setState(237);
			assign_var();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(setCompilerParser.INT, 0); }
		public TerminalNode ELEMENT() { return getToken(setCompilerParser.ELEMENT, 0); }
		public TerminalNode SET() { return getToken(setCompilerParser.SET, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << ELEMENT) | (1L << INT))) != 0)) ) {
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

	public static class Type_1Context extends ParserRuleContext {
		public TerminalNode INT() { return getToken(setCompilerParser.INT, 0); }
		public TerminalNode ELEMENT() { return getToken(setCompilerParser.ELEMENT, 0); }
		public Type_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterType_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitType_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitType_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_1Context type_1() throws RecognitionException {
		Type_1Context _localctx = new Type_1Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_type_1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !(_la==ELEMENT || _la==INT) ) {
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

	public static class Subprogram_returnContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(setCompilerParser.ID, 0); }
		public Block_returnContext block_return() {
			return getRuleContext(Block_returnContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(setCompilerParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(setCompilerParser.C_BRACKET, 0); }
		public Subprogram_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterSubprogram_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitSubprogram_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitSubprogram_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_returnContext subprogram_return() throws RecognitionException {
		Subprogram_returnContext _localctx = new Subprogram_returnContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_subprogram_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__3);
			setState(244);
			type();
			setState(245);
			match(ID);
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(246);
				signature();
				}
				break;
			case 2:
				{
				{
				setState(247);
				match(O_BRACKET);
				setState(248);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(251);
			block_return();
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

	public static class SignatureContext extends ParserRuleContext {
		public TerminalNode O_BRACKET() { return getToken(setCompilerParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(setCompilerParser.C_BRACKET, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(setCompilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(setCompilerParser.ID, i);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_signature);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(253);
			match(O_BRACKET);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(254);
					type();
					setState(255);
					match(ID);
					setState(256);
					match(T__1);
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			{
			setState(263);
			type();
			setState(264);
			match(ID);
			}
			setState(266);
			match(C_BRACKET);
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

	public static class Subprogram_non_returnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(setCompilerParser.ID, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public Block_non_returnContext block_non_return() {
			return getRuleContext(Block_non_returnContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(setCompilerParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(setCompilerParser.C_BRACKET, 0); }
		public Subprogram_non_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_non_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterSubprogram_non_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitSubprogram_non_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitSubprogram_non_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_non_returnContext subprogram_non_return() throws RecognitionException {
		Subprogram_non_returnContext _localctx = new Subprogram_non_returnContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_subprogram_non_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__3);
			setState(269);
			match(ID);
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(270);
				signature();
				}
				break;
			case 2:
				{
				{
				setState(271);
				match(O_BRACKET);
				setState(272);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(275);
				block_non_return();
				}
				break;
			case 2:
				{
				setState(276);
				block();
				}
				break;
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

	public static class Block_returnContext extends ParserRuleContext {
		public TerminalNode K_O_BRACKET() { return getToken(setCompilerParser.K_O_BRACKET, 0); }
		public TerminalNode RETURN() { return getToken(setCompilerParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(setCompilerParser.ID, 0); }
		public TerminalNode SEPARATOR() { return getToken(setCompilerParser.SEPARATOR, 0); }
		public TerminalNode K_C_BRACKET() { return getToken(setCompilerParser.K_C_BRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterBlock_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitBlock_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitBlock_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_returnContext block_return() throws RecognitionException {
		Block_returnContext _localctx = new Block_returnContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_block_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(K_O_BRACKET);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << ELEMENT) | (1L << PRINT) | (1L << INT) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << CALL) | (1L << ID))) != 0)) {
				{
				{
				setState(280);
				statement();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
			match(RETURN);
			setState(287);
			match(ID);
			setState(288);
			match(SEPARATOR);
			setState(289);
			match(K_C_BRACKET);
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

	public static class Block_non_returnContext extends ParserRuleContext {
		public TerminalNode K_O_BRACKET() { return getToken(setCompilerParser.K_O_BRACKET, 0); }
		public TerminalNode RETURN() { return getToken(setCompilerParser.RETURN, 0); }
		public TerminalNode SEPARATOR() { return getToken(setCompilerParser.SEPARATOR, 0); }
		public TerminalNode K_C_BRACKET() { return getToken(setCompilerParser.K_C_BRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block_non_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_non_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterBlock_non_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitBlock_non_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitBlock_non_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_non_returnContext block_non_return() throws RecognitionException {
		Block_non_returnContext _localctx = new Block_non_returnContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_block_non_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(K_O_BRACKET);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << ELEMENT) | (1L << PRINT) | (1L << INT) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << CALL) | (1L << ID))) != 0)) {
				{
				{
				setState(292);
				statement();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
			match(RETURN);
			setState(299);
			match(SEPARATOR);
			setState(300);
			match(K_C_BRACKET);
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

	public static class Signature_method_invokationContext extends ParserRuleContext {
		public TerminalNode O_BRACKET() { return getToken(setCompilerParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(setCompilerParser.C_BRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(setCompilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(setCompilerParser.ID, i);
		}
		public Signature_method_invokationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature_method_invokation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterSignature_method_invokation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitSignature_method_invokation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitSignature_method_invokation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signature_method_invokationContext signature_method_invokation() throws RecognitionException {
		Signature_method_invokationContext _localctx = new Signature_method_invokationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_signature_method_invokation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(302);
			match(O_BRACKET);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(303);
					match(ID);
					setState(304);
					match(T__1);
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			{
			setState(310);
			match(ID);
			}
			setState(311);
			match(C_BRACKET);
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

	public static class Method_invokationContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(setCompilerParser.CALL, 0); }
		public TerminalNode ID() { return getToken(setCompilerParser.ID, 0); }
		public TerminalNode SEPARATOR() { return getToken(setCompilerParser.SEPARATOR, 0); }
		public Signature_method_invokationContext signature_method_invokation() {
			return getRuleContext(Signature_method_invokationContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(setCompilerParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(setCompilerParser.C_BRACKET, 0); }
		public Method_invokationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_invokation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).enterMethod_invokation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof setCompilerListener ) ((setCompilerListener)listener).exitMethod_invokation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof setCompilerVisitor ) return ((setCompilerVisitor<? extends T>)visitor).visitMethod_invokation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_invokationContext method_invokation() throws RecognitionException {
		Method_invokationContext _localctx = new Method_invokationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_method_invokation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(CALL);
			setState(314);
			match(ID);
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(315);
				signature_method_invokation();
				}
				break;
			case 2:
				{
				{
				setState(316);
				match(O_BRACKET);
				setState(317);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(320);
			match(SEPARATOR);
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
		case 4:
			return digit_expression_sempred((Digit_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean digit_expression_sempred(Digit_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0145\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\7\2?\n\2\f"+
		"\2\16\2B\13\2\3\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\2\3\2\7\2O\n\2"+
		"\f\2\16\2R\13\2\3\3\3\3\3\3\3\4\3\4\7\4Y\n\4\f\4\16\4\\\13\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5j\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6s\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6{\n\6\f\6\16\6~\13\6\3\7\3"+
		"\7\3\7\3\7\3\7\7\7\u0085\n\7\f\7\16\7\u0088\13\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u008f\n\7\3\b\3\b\3\t\3\t\5\t\u0095\n\t\3\t\3\t\3\t\3\t\3\n\3\n\5\n"+
		"\u009d\n\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u00a6\n\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00ac\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\20\5\20\u00c9\n\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00d3"+
		"\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u00dc\n\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u00fc\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\7\31\u0105\n\31\f\31\16"+
		"\31\u0108\13\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0114\n\32\3\32\3\32\5\32\u0118\n\32\3\33\3\33\7\33\u011c\n\33\f\33\16"+
		"\33\u011f\13\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\7\34\u0128\n\34\f\34"+
		"\16\34\u012b\13\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u0134\n\35"+
		"\f\35\16\35\u0137\13\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u0141"+
		"\n\36\3\36\3\36\3\36\2\3\n\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:\2\n\3\2\32\33\3\2\30\31\3\2\30\33\3\2\')\3\2\t"+
		"\n\3\2\35\"\4\2\7\b\f\f\4\2\b\b\f\f\2\u014d\2@\3\2\2\2\4S\3\2\2\2\6V\3"+
		"\2\2\2\bi\3\2\2\2\nr\3\2\2\2\f\u008e\3\2\2\2\16\u0090\3\2\2\2\20\u0092"+
		"\3\2\2\2\22\u009a\3\2\2\2\24\u00a3\3\2\2\2\26\u00af\3\2\2\2\30\u00b5\3"+
		"\2\2\2\32\u00ba\3\2\2\2\34\u00c3\3\2\2\2\36\u00c8\3\2\2\2 \u00ce\3\2\2"+
		"\2\"\u00d7\3\2\2\2$\u00e2\3\2\2\2&\u00eb\3\2\2\2(\u00ee\3\2\2\2*\u00f1"+
		"\3\2\2\2,\u00f3\3\2\2\2.\u00f5\3\2\2\2\60\u00ff\3\2\2\2\62\u010e\3\2\2"+
		"\2\64\u0119\3\2\2\2\66\u0125\3\2\2\28\u0130\3\2\2\2:\u013b\3\2\2\2<?\5"+
		"&\24\2=?\5(\25\2><\3\2\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AG\3"+
		"\2\2\2B@\3\2\2\2CF\5\62\32\2DF\5.\30\2EC\3\2\2\2ED\3\2\2\2FI\3\2\2\2G"+
		"E\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\5\4\3\2KP\b\2\1\2LO\5\62\32"+
		"\2MO\5.\30\2NL\3\2\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\3\3\2"+
		"\2\2RP\3\2\2\2ST\7\3\2\2TU\5\6\4\2U\5\3\2\2\2VZ\7%\2\2WY\5\b\5\2XW\3\2"+
		"\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7&\2\2^\7\3"+
		"\2\2\2_j\5\24\13\2`j\5\22\n\2aj\5\30\r\2bj\5\20\t\2cj\5 \21\2dj\5\"\22"+
		"\2ej\5:\36\2fj\5\26\f\2gj\5\32\16\2hj\5$\23\2i_\3\2\2\2i`\3\2\2\2ia\3"+
		"\2\2\2ib\3\2\2\2ic\3\2\2\2id\3\2\2\2ie\3\2\2\2if\3\2\2\2ig\3\2\2\2ih\3"+
		"\2\2\2j\t\3\2\2\2kl\b\6\1\2ls\7\'\2\2mn\7#\2\2no\5\n\6\2op\7$\2\2ps\3"+
		"\2\2\2qs\7)\2\2rk\3\2\2\2rm\3\2\2\2rq\3\2\2\2s|\3\2\2\2tu\f\7\2\2uv\t"+
		"\2\2\2v{\5\n\6\bwx\f\6\2\2xy\t\3\2\2y{\5\n\6\7zt\3\2\2\2zw\3\2\2\2{~\3"+
		"\2\2\2|z\3\2\2\2|}\3\2\2\2}\13\3\2\2\2~|\3\2\2\2\177\u0080\7&\2\2\u0080"+
		"\u008f\7%\2\2\u0081\u0086\7%\2\2\u0082\u0083\7\'\2\2\u0083\u0085\7\4\2"+
		"\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\'\2\2\u008a"+
		"\u008f\7&\2\2\u008b\u008c\7\'\2\2\u008c\u008d\t\4\2\2\u008d\u008f\7\'"+
		"\2\2\u008e\177\3\2\2\2\u008e\u0081\3\2\2\2\u008e\u008b\3\2\2\2\u008f\r"+
		"\3\2\2\2\u0090\u0091\7(\2\2\u0091\17\3\2\2\2\u0092\u0094\5*\26\2\u0093"+
		"\u0095\7\17\2\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3"+
		"\2\2\2\u0096\u0097\7\'\2\2\u0097\u0098\7\5\2\2\u0098\u0099\5:\36\2\u0099"+
		"\21\3\2\2\2\u009a\u009c\7\7\2\2\u009b\u009d\7\17\2\2\u009c\u009b\3\2\2"+
		"\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\'\2\2\u009f\u00a0"+
		"\7\5\2\2\u00a0\u00a1\5\f\7\2\u00a1\u00a2\7\24\2\2\u00a2\23\3\2\2\2\u00a3"+
		"\u00a5\5,\27\2\u00a4\u00a6\7\17\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\'\2\2\u00a8\u00ab\7\5\2\2\u00a9"+
		"\u00ac\5\n\6\2\u00aa\u00ac\5\16\b\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\24\2\2\u00ae\25\3\2\2\2\u00af"+
		"\u00b0\7\13\2\2\u00b0\u00b1\7#\2\2\u00b1\u00b2\t\5\2\2\u00b2\u00b3\7$"+
		"\2\2\u00b3\u00b4\7\24\2\2\u00b4\27\3\2\2\2\u00b5\u00b6\7\'\2\2\u00b6\u00b7"+
		"\7\5\2\2\u00b7\u00b8\5\n\6\2\u00b8\u00b9\7\24\2\2\u00b9\31\3\2\2\2\u00ba"+
		"\u00bb\7\'\2\2\u00bb\u00bc\7\25\2\2\u00bc\u00bd\t\6\2\2\u00bd\u00be\7"+
		"#\2\2\u00be\u00bf\7\'\2\2\u00bf\u00c0\7$\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c2\7\24\2\2\u00c2\33\3\2\2\2\u00c3\u00c4\5\n\6\2\u00c4\u00c5\t\7\2"+
		"\2\u00c5\u00c6\5\n\6\2\u00c6\35\3\2\2\2\u00c7\u00c9\7\34\2\2\u00c8\u00c7"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7#\2\2\u00cb"+
		"\u00cc\5\34\17\2\u00cc\u00cd\7$\2\2\u00cd\37\3\2\2\2\u00ce\u00cf\7\r\2"+
		"\2\u00cf\u00d2\7#\2\2\u00d0\u00d3\5\34\17\2\u00d1\u00d3\5\36\20\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7$"+
		"\2\2\u00d5\u00d6\5\6\4\2\u00d6!\3\2\2\2\u00d7\u00d8\7\20\2\2\u00d8\u00db"+
		"\7#\2\2\u00d9\u00dc\5\34\17\2\u00da\u00dc\5\36\20\2\u00db\u00d9\3\2\2"+
		"\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\7$\2\2\u00de\u00df"+
		"\5\6\4\2\u00df\u00e0\7\21\2\2\u00e0\u00e1\5\6\4\2\u00e1#\3\2\2\2\u00e2"+
		"\u00e3\7\16\2\2\u00e3\u00e4\7#\2\2\u00e4\u00e5\7\b\2\2\u00e5\u00e6\7\'"+
		"\2\2\u00e6\u00e7\7\26\2\2\u00e7\u00e8\7\'\2\2\u00e8\u00e9\7$\2\2\u00e9"+
		"\u00ea\5\6\4\2\u00ea%\3\2\2\2\u00eb\u00ec\7\27\2\2\u00ec\u00ed\5\22\n"+
		"\2\u00ed\'\3\2\2\2\u00ee\u00ef\7\27\2\2\u00ef\u00f0\5\24\13\2\u00f0)\3"+
		"\2\2\2\u00f1\u00f2\t\b\2\2\u00f2+\3\2\2\2\u00f3\u00f4\t\t\2\2\u00f4-\3"+
		"\2\2\2\u00f5\u00f6\7\6\2\2\u00f6\u00f7\5*\26\2\u00f7\u00fb\7\'\2\2\u00f8"+
		"\u00fc\5\60\31\2\u00f9\u00fa\7#\2\2\u00fa\u00fc\7$\2\2\u00fb\u00f8\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\5\64\33\2\u00fe"+
		"/\3\2\2\2\u00ff\u0106\7#\2\2\u0100\u0101\5*\26\2\u0101\u0102\7\'\2\2\u0102"+
		"\u0103\7\4\2\2\u0103\u0105\3\2\2\2\u0104\u0100\3\2\2\2\u0105\u0108\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010a\5*\26\2\u010a\u010b\7\'\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010d\7$\2\2\u010d\61\3\2\2\2\u010e\u010f\7\6\2\2\u010f\u0113"+
		"\7\'\2\2\u0110\u0114\5\60\31\2\u0111\u0112\7#\2\2\u0112\u0114\7$\2\2\u0113"+
		"\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0118\5\66"+
		"\34\2\u0116\u0118\5\6\4\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118"+
		"\63\3\2\2\2\u0119\u011d\7%\2\2\u011a\u011c\5\b\5\2\u011b\u011a\3\2\2\2"+
		"\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7\23\2\2\u0121\u0122\7\'\2\2"+
		"\u0122\u0123\7\24\2\2\u0123\u0124\7&\2\2\u0124\65\3\2\2\2\u0125\u0129"+
		"\7%\2\2\u0126\u0128\5\b\5\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2"+
		"\2\2\u012c\u012d\7\23\2\2\u012d\u012e\7\24\2\2\u012e\u012f\7&\2\2\u012f"+
		"\67\3\2\2\2\u0130\u0135\7#\2\2\u0131\u0132\7\'\2\2\u0132\u0134\7\4\2\2"+
		"\u0133\u0131\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7\'\2\2\u0139"+
		"\u013a\7$\2\2\u013a9\3\2\2\2\u013b\u013c\7\22\2\2\u013c\u0140\7\'\2\2"+
		"\u013d\u0141\58\35\2\u013e\u013f\7#\2\2\u013f\u0141\7$\2\2\u0140\u013d"+
		"\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\7\24\2\2"+
		"\u0143;\3\2\2\2\36>@EGNPZirz|\u0086\u008e\u0094\u009c\u00a5\u00ab\u00c8"+
		"\u00d2\u00db\u00fb\u0106\u0113\u0117\u011d\u0129\u0135\u0140";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}