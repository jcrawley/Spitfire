# Spitfire

Spitfire is a language that allows the user to implement solutions as fast as possible using the least amount of keystones. Ain't nobody got time to type out whole words! Spitfire is statically and strongly typed. It is FORTRAN-esque in that all of its keywords are capitalized. One day in class, `jcrawley` said,  `"I want to make a language that spits fire."` On that fateful day, we knew we had our name.

### Examples

SPITFIRE ON THE LEFT, JAVASCRIPT ON THE RIGHT

    P “Hello, world!”     			        console.log(“Hello, world!”);

VARIABLE DECLARATIONS

    S s = "spitfire" 					    var s = "spit"; 
    B found = T                             var found = true;
    N hex = 0x34A4                          var hex = 0x34A4;
    C f = 'f'                               var f = 'f';

PARALLEL DECLARATION

    S s,f = "spit","fire" 				    var s = "spit";
    						                var f = "fire";

CONSTANTS

In Spitfire constants start with `_`. Uppercase identifier names are not allowed.

    N _pi = 3.14 				            var pi = 3.14;
    

ASSIGNMENT IS MOST CERTAINLY NOT INITIALIZATION

    N x = 1 					            var x = 1;
    x = x + 1 					            x = x + 1;
    P x                                     console.log(x);

ARITHMETIC EXPRESSIONS

    y / (4 - x) * 2.5 				        y / (4 - x) * 2.5

SWAP

Spitfire allows its user to swap two variables by using `<=>`. It is demonstrated below. The types of the two variables that are being switched do not need to be the same.

    N x = 34 					            var x = 34;
    S s = "spitfire" 					    var s = "spitfire";
    x <=> y                                 _1 = x;
                                            _2 = y;
                                            x = _2;
                                            y = _1;

BOOLEANS AND BOOLEAN ARITHMETIC

In Spitfire, true and false are denoted by `T` and `F` respectively. 

    T					                	true
    F						                false
    5 > 7					                5 > 7
    T && F                                  x && y
    T || F                                  x || y

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
    LU                                      loop until
    LF                                      for loop
    LW                                      while loop
    R                                       return

TYPES 

In Spitfire, there are five main types: `B` is for booleans, `N` is for any type of number (integer and floating point numbers work), `S` is for strings, `C` is for characters, and `<>` for the null type. `[]` is used for array declarations and `Y` is used to denote arrays with multiple types of elements.

    B			                			boolean 
    N				                		number
    S		                				string 
    C			                			character
    <>    		                			null
    []		                				array
    Y                                       "any" type
    
CLASSES

    DC point
      N x
      N y
      S color
      
    point p = point.new(4,5,"purple")
    
    DC polygon
      [point] vertices
      
NUMBERS AND THIER TYPES
                        
    N h = 0x267AC1                          var h = 0x267AC1;
    N o = 0337                              var o = 0337;
    N n = 135792468                         var n = 135792468;

STRINGS AND STRING MANIPULATION

    S s = "Hello” + “world!” 	            var s = “Hello” + “world!”; 
    “Hello, world!" | " "                   “Hello, world!”.split(“ "); // perhaps symbols for split(string) and join(array), | or j
    [“Spit”,”fire"] @ "-"                   [“Spit”, “fire”].join(“”);
    “Spitfire”.l                            "Spitfire".length(); 
    “Spitfire is quick”.f("i")              "Spitfire is quick".indexOf("i"); // .pos .ix				
    “2”.num                                 parseInt("2");
    3.str                                   3 .toString();

LOOPS

Spitfire includes three different types of loops: `LU` is loop until, `LF` is loop for, and `LW` is loop while. `LU` is a simplified `for` loop that will iterate through the code that the user provides `n` amount of times. `LF` works just like any `for` loop. The user would provide an identifier of their choice for initialization, the starting index, the ending index (the condition for each iteration), and an afterthought (which can be positive or negative). Lastly, we have `LW` which will iterate through the body of code that a user provides as long as their given boolean expression is `true`. Below are some examples:
 
    LU 5                                    for (var i = 0; i <5; i++) {
      P i                                       console.log(i);                                          
                                            }

    LF i 2 7 2                              for (var i = 2; i < 7; i += 2) {
      P i*i                                     console.log(i*i);
                                            }
                                        
    LF i 7 0 -3 				            for (var i = 7; i > 0; i -= 3) {
      P i^i                                     console.log(i**i);
                                            }
                                            
    LF x a                                  a.forEach(function (x) {console.log(x)});
      P i

    LW x > 10                               while (x > 10) {
      I x < 5                                   if (x < 5) {
        x = x - 2                                   x = x - 2;
      E                                         } else {
        x = x - 1                                   x = x - 1;
      P x                                       }
                                                console.log(x);
                                            }

ARRAYS

Spitfire's arrays are just like any other languages but with some spice. Array declarations are used by having a left hand bracket `[` followed by one of Spitfire's type declarations followed by a right hand bracket `]`. For arrays of multiple types, the user cany use the type `Y` denoting "any" type. To access the last position in an array the user can use the index `-1` just like in Ruby. Also, a user can append an element to the end of an array by using `<=`. Some examples are listed below:

    [N] p = [100, 43, 22, 5, 8]			    var p = [100, 43, 22, 5, 8];
    N n = 78                                var n = 78;
    p <= n                                  p.push(n);
    P p[-1]					                console.log(p[p.length-1]);
    [N] q = p					            var q = p;
    [Y] a = [88, false, “0001”, green]		var a = [88, false, “0001”, green]; 

SYNTAX IN PROGRESS

    SCRIPT        →  (STMT BR)+
    STMT          →  DEC
                  |  ASSIGNMENT
                  |  PRINTSTMT
                  |  CONDITIONAL
                  |  LOOP
                  |  EXP
    DEC           →  VARDEC | FUNDEC
    TYPE          →  'B' | 'N' | 'C' | 'S' | 'Y' | ID | '<>' | '[' TYPE ']'
    VARDEC        →  TYPE ID '=' EXP
    FUNDEC        →  'DF' ID ARGS BR BLOCK
    PARAMS        →  '(' ID (ID ',')* ')'
    ASSIGNMENT    →  ID ‘=’ EXP
    PRINTSTMT     →  'P' EXP
    CONDITIONAL   → ‘I’ EXP BLOCK (| ‘EF’ EXP BLOCK)* (| ‘E' EXP BLOCK)?
    LOOP          →  'LU' EXP BR BLOCK
                  →  ‘LF’ ID EXP EXP EXP? BR BLOCK
                  →  'LW' EXP BR BLOCK
    PRINTSTMT     →  ‘P’ EXP
    RETURNSTMT    →  ‘R’ EXP 
    EXP           →  EXP1 ('||' EXP1)*
    EXP1          →  EXP2 ('&&' EXP2)*
    EXP2          →  EXP3 (RELOP EXP3)?
    EXP3          →  EXP4 (ADDOP EXP4)?
    EXP4          →  EXP5 (MULOP EXP5)?
    EXP5          →  PREFIXOP? EXP6
    EXP6          →  NUMLIT | STRLIT | ID | '(' EXP ')' | EXP '[' EXP ']' | ID ARGS
    BOOL          →  ‘T’ | ‘F’
    ADDOP         →  '+' | '-'
    MULOP         →  '*' | '/' | '%'
    PREFIXOP      →  '-' | '!' | '~' | 'char' | 'int' | 'string' | 'length'
    BLOCK         →  (STMT BR)+
    ARGS          →  '('EXP (EXP ',')* ')' | '()' 


MICROSYNTAX
    
    BR            → NEWLINE
    COMMENT       → ‘$’ ()*  NEWLINE
                  | ‘$$’ ()* ‘$$’
    ID            →  '_'?[a-z]+ ([-_a-z0-9])*
    NUMLIT        →  [0-9]+ ('.' [0-9]*)?
    STRLIT        →  '"'  ( NUMLIT | [a-Z])*  '"'
