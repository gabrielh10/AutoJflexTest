package atividade1;

/* The following code was generated by JFlex 1.6.1 */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>src/main/resources/ghds.flex</tt>
 */
public class Minijava {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\4\1\6\1\56\1\4\1\6\22\0\1\4\1\15\4\0"+
    "\1\12\1\0\1\16\1\17\1\7\1\10\1\26\1\11\1\25\1\5"+
    "\1\2\11\3\1\0\1\24\1\13\1\14\3\0\22\1\1\47\7\1"+
    "\1\20\1\0\1\21\1\0\1\1\1\0\1\33\1\27\1\35\1\44"+
    "\1\32\1\54\1\51\1\53\1\41\2\1\1\31\1\46\1\34\1\30"+
    "\1\37\1\1\1\50\1\36\1\43\1\40\1\45\1\52\1\42\1\55"+
    "\1\1\1\22\1\0\1\23\7\0\1\56\u1fa2\0\1\56\1\56\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\3\2\1\3\1\1\1\4\1\5\1\6"+
    "\1\1\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\17\2\1\23\1\24"+
    "\1\0\1\25\1\26\1\27\11\2\1\30\11\2\1\24"+
    "\2\0\4\2\1\31\3\2\1\32\11\2\1\0\2\2"+
    "\1\33\4\2\1\34\1\35\1\36\1\37\10\2\1\40"+
    "\5\2\1\41\1\42\1\2\1\43\1\2\1\44\1\45"+
    "\1\46\1\2\1\47\1\50\1\51\13\0\1\52";

  private static int [] zzUnpackAction() {
    int [] result = new int[134];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\136\0\57\0\215\0\57\0\274\0\57"+
    "\0\57\0\57\0\353\0\57\0\u011a\0\u0149\0\57\0\57"+
    "\0\57\0\57\0\57\0\57\0\57\0\57\0\57\0\u0178"+
    "\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263\0\u0292\0\u02c1\0\u02f0"+
    "\0\u031f\0\u034e\0\u037d\0\u03ac\0\u03db\0\u040a\0\57\0\u0439"+
    "\0\u0468\0\57\0\57\0\57\0\u0497\0\u04c6\0\u04f5\0\u0524"+
    "\0\u0553\0\u0582\0\u05b1\0\u05e0\0\u060f\0\136\0\u063e\0\u066d"+
    "\0\u069c\0\u06cb\0\u06fa\0\u0729\0\u0758\0\u0787\0\u07b6\0\57"+
    "\0\u07e5\0\u0814\0\u0843\0\u0872\0\u08a1\0\u08d0\0\136\0\u08ff"+
    "\0\u092e\0\u095d\0\136\0\u098c\0\u09bb\0\u09ea\0\u0a19\0\u0a48"+
    "\0\u0a77\0\u0aa6\0\u0ad5\0\u0b04\0\u0b33\0\u0b62\0\u0b91\0\136"+
    "\0\u0bc0\0\u0bef\0\u0c1e\0\u0c4d\0\136\0\136\0\136\0\136"+
    "\0\u0c7c\0\u0cab\0\u0cda\0\u0d09\0\u0d38\0\u0d67\0\u0d96\0\u0dc5"+
    "\0\136\0\u0df4\0\u0e23\0\u0e52\0\u0e81\0\u0eb0\0\136\0\136"+
    "\0\u0edf\0\136\0\u0f0e\0\136\0\136\0\136\0\u0f3d\0\136"+
    "\0\136\0\136\0\u0f6c\0\u0f9b\0\u0fca\0\u0ff9\0\u1028\0\u1057"+
    "\0\u1086\0\u10b5\0\u10e4\0\u1113\0\u1142\0\57";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[134];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\6\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\3\1\31\1\32\1\3\1\33\1\34\1\35\1\36"+
    "\1\3\1\37\1\3\1\40\1\3\1\41\1\42\1\43"+
    "\1\44\1\3\1\45\1\3\1\46\1\3\1\47\60\0"+
    "\3\3\23\0\27\3\3\0\2\5\60\0\1\50\1\0"+
    "\1\51\61\0\1\52\60\0\1\53\56\0\1\54\43\0"+
    "\3\3\23\0\1\3\1\55\25\3\2\0\3\3\23\0"+
    "\3\3\1\56\23\3\2\0\3\3\23\0\2\3\1\57"+
    "\10\3\1\60\13\3\2\0\3\3\23\0\3\3\1\61"+
    "\23\3\2\0\3\3\23\0\2\3\1\62\24\3\2\0"+
    "\3\3\23\0\14\3\1\63\12\3\2\0\3\3\23\0"+
    "\11\3\1\64\15\3\2\0\3\3\23\0\5\3\1\65"+
    "\17\3\1\66\1\3\2\0\3\3\23\0\21\3\1\67"+
    "\2\3\1\70\2\3\2\0\3\3\23\0\1\3\1\71"+
    "\25\3\2\0\3\3\23\0\4\3\1\72\22\3\2\0"+
    "\3\3\23\0\14\3\1\73\11\3\1\74\2\0\3\3"+
    "\23\0\3\3\1\75\23\3\2\0\3\3\23\0\24\3"+
    "\1\76\2\3\2\0\3\3\23\0\4\3\1\77\22\3"+
    "\1\0\6\50\1\100\50\50\7\101\1\102\47\101\1\0"+
    "\3\3\23\0\1\3\1\103\25\3\2\0\3\3\23\0"+
    "\5\3\1\104\21\3\2\0\3\3\23\0\7\3\1\105"+
    "\17\3\2\0\3\3\23\0\14\3\1\106\12\3\2\0"+
    "\3\3\23\0\23\3\1\107\3\3\2\0\3\3\23\0"+
    "\4\3\1\110\22\3\2\0\3\3\23\0\4\3\1\111"+
    "\22\3\2\0\3\3\23\0\1\112\26\3\2\0\3\3"+
    "\23\0\14\3\1\113\12\3\2\0\3\3\23\0\11\3"+
    "\1\114\15\3\2\0\3\3\23\0\12\3\1\115\14\3"+
    "\2\0\3\3\23\0\12\3\1\116\14\3\2\0\3\3"+
    "\23\0\12\3\1\117\14\3\2\0\3\3\23\0\21\3"+
    "\1\120\5\3\2\0\3\3\23\0\7\3\1\121\17\3"+
    "\2\0\3\3\23\0\14\3\1\122\12\3\2\0\3\3"+
    "\23\0\12\3\1\123\14\3\2\0\3\3\23\0\2\3"+
    "\1\124\24\3\1\0\7\101\1\125\47\101\5\0\1\100"+
    "\1\0\1\102\50\0\3\3\23\0\2\3\1\126\24\3"+
    "\2\0\3\3\23\0\22\3\1\127\4\3\2\0\3\3"+
    "\23\0\3\3\1\130\23\3\2\0\3\3\23\0\3\3"+
    "\1\131\23\3\2\0\3\3\23\0\7\3\1\132\17\3"+
    "\2\0\3\3\23\0\14\3\1\133\12\3\2\0\3\3"+
    "\23\0\2\3\1\134\24\3\2\0\3\3\23\0\3\3"+
    "\1\135\23\3\2\0\3\3\23\0\7\3\1\136\17\3"+
    "\2\0\3\3\23\0\15\3\1\137\11\3\2\0\3\3"+
    "\23\0\5\3\1\140\21\3\2\0\3\3\23\0\12\3"+
    "\1\141\14\3\2\0\3\3\23\0\14\3\1\142\12\3"+
    "\2\0\3\3\23\0\11\3\1\143\15\3\2\0\3\3"+
    "\23\0\2\3\1\144\24\3\2\0\3\3\23\0\7\3"+
    "\1\145\17\3\1\0\5\101\1\100\1\101\1\125\47\101"+
    "\1\0\3\3\23\0\3\3\1\146\23\3\2\0\3\3"+
    "\23\0\14\3\1\147\12\3\2\0\3\3\23\0\5\3"+
    "\1\150\21\3\2\0\3\3\23\0\7\3\1\151\17\3"+
    "\2\0\3\3\23\0\12\3\1\152\14\3\2\0\3\3"+
    "\23\0\12\3\1\153\14\3\2\0\3\3\23\0\5\3"+
    "\1\154\21\3\2\0\3\3\23\0\3\3\1\155\23\3"+
    "\2\0\3\3\23\0\21\3\1\156\5\3\2\0\3\3"+
    "\23\0\3\3\1\157\23\3\2\0\3\3\23\0\3\3"+
    "\1\160\23\3\2\0\3\3\23\0\4\3\1\161\22\3"+
    "\2\0\3\3\23\0\24\3\1\162\2\3\2\0\3\3"+
    "\23\0\15\3\1\163\11\3\2\0\3\3\23\0\6\3"+
    "\1\164\20\3\2\0\3\3\23\0\6\3\1\165\20\3"+
    "\2\0\3\3\23\0\22\3\1\166\4\3\2\0\3\3"+
    "\23\0\17\3\1\167\7\3\2\0\3\3\23\0\5\3"+
    "\1\170\21\3\2\0\3\3\23\0\5\3\1\171\21\3"+
    "\2\0\3\3\23\0\7\3\1\172\17\3\2\0\3\3"+
    "\21\0\1\173\1\0\27\3\31\0\1\174\66\0\1\175"+
    "\61\0\1\176\40\0\1\177\70\0\1\200\67\0\1\201"+
    "\47\0\1\202\51\0\1\203\65\0\1\204\44\0\1\205"+
    "\61\0\1\206\22\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4465];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\1\1\1\11\1\1\3\11"+
    "\1\1\1\11\2\1\11\11\17\1\1\11\1\1\1\0"+
    "\3\11\23\1\1\11\2\0\22\1\1\0\45\1\13\0"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[134];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Minijava(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 172) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { throw new RuntimeException("Caractere ilegal! '" + yytext() + "' na linha: " + yyline + ", coluna: " + yycolumn);
            }
          case 43: break;
          case 2: 
            { System.out.println(yytext());
            }
          case 44: break;
          case 3: 
            { /* Ignorar whitespace. */
            }
          case 45: break;
          case 4: 
            { System.out.println ("*");
            }
          case 46: break;
          case 5: 
            { System.out.println ("+");
            }
          case 47: break;
          case 6: 
            { System.out.println ("-");
            }
          case 48: break;
          case 7: 
            { System.out.println ("<");
            }
          case 49: break;
          case 8: 
            { System.out.println ("=");
            }
          case 50: break;
          case 9: 
            { System.out.println ("!");
            }
          case 51: break;
          case 10: 
            { System.out.println ("(");
            }
          case 52: break;
          case 11: 
            { System.out.println (")");
            }
          case 53: break;
          case 12: 
            { System.out.println ("[");
            }
          case 54: break;
          case 13: 
            { System.out.println ("]");
            }
          case 55: break;
          case 14: 
            { System.out.println ("{");
            }
          case 56: break;
          case 15: 
            { System.out.println ("}");
            }
          case 57: break;
          case 16: 
            { System.out.println (";");
            }
          case 58: break;
          case 17: 
            { System.out.println (".");
            }
          case 59: break;
          case 18: 
            { System.out.println (",");
            }
          case 60: break;
          case 19: 
            { System.out.print(yytext());
            }
          case 61: break;
          case 20: 
            { /* Ignorar comments. */
            }
          case 62: break;
          case 21: 
            { System.out.println ("&&");
            }
          case 63: break;
          case 22: 
            { System.out.println ("==");
            }
          case 64: break;
          case 23: 
            { System.out.println ("!=");
            }
          case 65: break;
          case 24: 
            { System.out.println ("if");
            }
          case 66: break;
          case 25: 
            { System.out.println("new");
            }
          case 67: break;
          case 26: 
            { System.out.println ("int");
            }
          case 68: break;
          case 27: 
            { System.out.println ("else");
            }
          case 69: break;
          case 28: 
            { System.out.println("true");
            }
          case 70: break;
          case 29: 
            { System.out.println("this");
            }
          case 71: break;
          case 30: 
            { System.out.println ("void");
            }
          case 72: break;
          case 31: 
            { System.out.println ("main");
            }
          case 73: break;
          case 32: 
            { System.out.println ("class");
            }
          case 74: break;
          case 33: 
            { System.out.println ("while");
            }
          case 75: break;
          case 34: 
            { System.out.println("false");
            }
          case 76: break;
          case 35: 
            { System.out.println ("length");
            }
          case 77: break;
          case 36: 
            { System.out.println ("static");
            }
          case 78: break;
          case 37: 
            { System.out.println ("public");
            }
          case 79: break;
          case 38: 
            { System.out.println ("String");
            }
          case 80: break;
          case 39: 
            { System.out.println ("return");
            }
          case 81: break;
          case 40: 
            { System.out.println ("boolean");
            }
          case 82: break;
          case 41: 
            { System.out.println ("extends");
            }
          case 83: break;
          case 42: 
            { System.out.println("System.out.println");
            }
          case 84: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java Minijava [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Minijava scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Minijava(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
