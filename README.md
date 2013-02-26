# Spitfire

Spitfire is a language that allows the user to implement solutions as fast as possible using the least amount of keystones. Ain't nobody got time to type out whole words! One day in class, `jcrawley` said I want to make a language that spits fire. On that fateful day, we knew we had our name.

### Examples

SPITFIRE ON THE LEFT, JAVASCRIPT ON THE RIGHT

    P “Hello, world!”     			        console.log(“Hello, world!”);

VARIABLE DECLARATIONS

    S s = "spit" 					        var s = "spit"; 
    S f = "fire" 					        var f = "fire";
    B found = T                             var found = true;
    N hex = 0x34A4                          var hex = 0x34A4;

PARALLEL DECLARATION

    S s,f = "spit","fire" 				    var s = "spit";
    						                var f = "fire";

CONSTANTS START WITH _, UPPERCASE VARIABLES DECLARATIONS ARE NOT ALLOWED

    N _pi = 3.14 				            var pi = 3.14;

ASSIGNMENT IS MOST CERTAINLY NOT INITIALIZATION

    N x = 1 					            var x = 1;
    x = x + 1 					            x = x + 1;
    P x                                     console.log(x);

ARITHMETIC EXPRESSIONS

    y / (4 - x) * 2.5 				        y / (4 - x) * 2.5

SWAP

    N x = 34 					            var x = 34;
    N y = 16 					            var y = 16;
    x <=> y                                 _1 = x;
                                            _2 = y;
                                            x = _2;
                                            y = _1;
    
    P x,y                                   console.log(x);
                                            console.log(y);
                                            
    P x+y                                   console.log(x+y);

BOOLEANS 

    T					                	true
    F						                false
    5 > 7					                5 > 7
    x /\ y                                  x && y
    x \/ y                                  x || y

FUNCTIONS

    DF bmi (pounds,inches) 
        N _kilograms_per_pound = 0.45359237
        N _meters_per_inch = 0.0254
        N kilos = pounds * _kilograms_per_pound
        N inches = inches * _meters_per_inch
        R kilos / (meters * meters)

KEYWORDS

    I					                	if 
    E				                		else 
    EI			                			else if 
    DF			                			define function
    DC                                      define class
    L			                  			loop (e.g. for, while)
    R                                       return

TYPES 

    B			                			boolean 
    N				                		number
    S		                				string 
    C			                			character
    []		                				array
    Y                                       any
    <>			                			null
    
CLASSES

    DC point
      N x
      N y
      S color
      
    point p = point.new(4,5,"purple")
    
    DC polygon
      [point] vertices
      

TYPES OF NUMBERS
                        
    N h = 0x267AC1                          var h = 0x267AC1;
    N o = 0337                              var o = 0337;

METHODS
 
    T.ty	               	    			typeof true
 
    S s = “Hello” 	            			var s = "Hello";
    P s.l			                		console.log(s.length()); // perhaps |s|

STRINGS

    "Hello”,“world!”.c  	        		s = “Hello” + “world!”; 
    “Hello, world!" | " "                   “Hello, world!”.split(“ "); // perhaps symbols for split(string) and join(array), | or j
    [“Spit”,”fire"] @ "-"                   [“Spit”, “fire”].join(“”);
    “Spitfire”.l                            "Spitfire".length(); 
    “Spitfire is quick”.f("i")              "Spitfire is quick".indexOf("i"); // .pos .ix				
    “2”.num                                 parseInt("2");
    3.str                                   3 .toString();

LOOPS
 
    LU 5                                    for (var i = 0; i <5; i++) {
      P i                                       console.log(i);                                          
                                            }

    LF i 2 7 2                              for (var i = 2; i < 7; i +=2) {
      P i*i                                     console.log(i*i);
                                            }
                                        
    LF i 7 0 -3 				            for (var i = 7; i > 0; i-=3) {
                    
                                            }
                                            
    LF x a                                  a.forEach(function (x) {console.log(x)});
      P i

    LW x>10                                 while (x>10) {
      I x<5                                     if (x<5) {
        x=x-2                                       x = x - 2;
      E                                         } else {
        x=x-1                                       x = x - 1;
      P x                                       }
                                                console.log(x);
                                            }

ARRAYS 

    [N] p = [100, 43, 22, 5, 8]			    var p = [100, 43, 22, 5, 8];
    P p[0]					                console.log(p[0]);
    [N] q = p					            var q = p;
    [Y] a = [88, false, “0001”, green]		var a = [88, false, “0001”, green]; 
    P a.length					            console.log(a.length);

SYNTAX IN PROGRESS

    SCRIPT        →  (STMT BR)+
    STMT          →  DEC
                  |  ASSIGNMENT
                  |  PRINTSTMT
                  |  CONDITIONAL
                  |  FORLOOP
                  |  WHILELOOP
                  |  EXP
    DEC           →  VARDEC | FUNDEC
    TYPE          →  'B' | 'N' | 'C' | 'S' | 'Y' | ID | '<>' | '[' TYPE ']'
    VARDEC        →  TYPE ID '=' EXP
    FUNDEC        →  'DF' ID '(' PARAMS ') NEWLINE BLOCK
    PARAMS        →  (' 'ID)*
    ASSIGNMENT    →  ID ‘=’ EXP
    PRINTSTMT     →  'P' EXP
    CONDITIONAL   → ‘I’ EXP BLOCK (| ‘EF’ EXP BLOCK)* (| ‘E' EXP BLOCK)?
    LOOP          →  'LU' EXP NEWLINE BLOCK
                  →  ‘LF’ ID EXP EXP EXP? NEWLINE BLOCK
                  →  'LW' EXP NEWLINE BLOCK
    PRINTSTMT     →  ‘P’ EXP
    RETURNSTMT    →  ‘R’ EXP 
    EXP           →  EXP1 ('||' EXP1)*
    EXP1          →  EXP2 ('&&' EXP2)*
    EXP2          →  EXP3 (RELOP EXP3)?
    EXP3          →  EXP4 (MULOP EXP4)?
    BOOL          →  ‘T’ | ‘F’
    ADDOP         →  '+' | '-'
    MULOP         →  '*' | '/' | '%'
    PREFIXOP      →  '-' | '!' | '~' | 'char' | 'int' | 'string' | 'length'
    BLOCK         →  (STMT NEWLINE)+
    NEWLINE       →  


MICROSYNTAX

    COMMENT       → ‘$’ ()*  NEWLINE
                  | ‘$$’ ()* ‘$$’
    ID            →  '_'?[a-z]+ ([-_a-z0-9])*
    NUMLIT        →  [0-9]+ ('.' [0-9]*)?
    STRLIT        →  '"'  ( NUMLIT | [a-Z])*  '"'
