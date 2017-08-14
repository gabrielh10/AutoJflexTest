%%

%line
%column
%unicode
//%debug
%public
%standalone
%class Minijava
%eofclose

letter          = [A-Za-z_]
digit           = [0-9]
integer         = {digit}|[1-9] {digit}+
alphanumeric    = {letter}|{digit}
identifier      = {letter}({alphanumeric})*
whitespace      = [ \n\t\r\f]
comment 		= "//" [^\r\n]* [\r|\n|\r\n]?
comment2 		= "/*" [^*] ~"*/" | "/*" "*"+ "/"
comments 		= {comment}|{comment2}

%%

"*"             { System.out.println ("*"); }
"+"             { System.out.println ("+"); }
"-"             { System.out.println ("-");  }
"&&"			{ System.out.println ("&&");  }
"<"				{ System.out.println ("<");  }
"="				{ System.out.println ("=");  }
"=="			{ System.out.println ("==");  }
"!="			{ System.out.println ("!=");  }
"!"				{ System.out.println ("!");  }
"("				{ System.out.println ("(");  }
")"				{ System.out.println (")");  }
"["				{ System.out.println ("[");  }
"]"				{ System.out.println ("]");  }
"{"				{ System.out.println ("{");  }
"}"				{ System.out.println ("}");  }
";"				{ System.out.println (";");  }
"."				{ System.out.println (".");  }
","				{ System.out.println (",");  }
"boolean"		{ System.out.println ("boolean"); }
"class"			{ System.out.println ("class");  }
"public"		{ System.out.println ("public");  }
"extends"		{ System.out.println ("extends");  }
"static"		{ System.out.println ("static");  }
"void"			{ System.out.println ("void");  }
"main"			{ System.out.println ("main");  }
"String"		{ System.out.println ("String");  }
"int"			{ System.out.println ("int");  }
"while"			{ System.out.println ("while"); }
"if"			{ System.out.println ("if");  }
"else"			{ System.out.println ("else");  }
"return"		{ System.out.println ("return");  }
"length"		{ System.out.println ("length"); }
"true"			{ System.out.println("true"); }
"false"			{ System.out.println("false"); }	
"this"			{ System.out.println("this"); }
"new"			{ System.out.println("new"); }
"System.out.println" { System.out.println("System.out.println"); }
{integer}       { System.out.println(yytext()); }
{identifier}    { System.out.println(yytext()); }
{whitespace}    { /* Ignorar whitespace. */ }
{comments}		{ /* Ignorar comments. */}
     
. { throw new RuntimeException("Caractere ilegal! '" + yytext() + "' na linha: " + yyline + ", coluna: " + yycolumn); }
