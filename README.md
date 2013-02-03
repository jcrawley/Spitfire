# Spitfire

Spitfire is a language that allows the user to implement solutions as fast as possible using the least amount of keystones. Ain't nobody got time to type out whole words! One day in class, `jcrawley` said I want to make a language that spits fire. On that fateful day, we knew we had our name.

### Examples

SPITFIRE ON THE LEFT, JAVASCRIPT ON THE RIGHT

    P “Hello, world!” 				        console.log(“Hello, world!”);

VARIABLE DECLARATIONS

    V s = spit 					            var v = spit; 
    V f = fire 					            var f = fire;

PARALLEL DECLARATION

    V s,f = spit,fire 				        var s = spit;
    						                var f = fire;

CONSTANTS START WITH _, UPPERCASE VARIABLES DECLARATIONS ARE NOT ALLOWED

    V _pi = 3.14 				            var pi = 3.14;

ASSIGNMENT IS MOST CERTAINLY NOT INITIALIZATION

    V x = 1 					            var x = 1;
    x = x + 1 					            x = x + 1;
    P x                                     console.log(x);

ARITHMETIC EXPRESSIONS

    y / (4 - x) * 2.5 				        y / (4 - x) * 2.5

SWAP

    V x = 34 					            var x = 34;
    V y = 16 					            var y = 16;
    x SW y                                  _1 = x;
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

FUNCTIONS

    V b = D (pounds,inches) 
        V _kilograms_per_pound = = 0.45359237
        V _meters_per_inch = 0.0254
        V kilos = pounds * _kilograms_per_pound
        V inches = inches * _meters_per_inch
        R kilos / (meters * meters)
    Z

KEYWORDS

    I					                	if 
    E				                		else 
    EF			                			else if 
    D			                			define function
    FO			                  			for 
    W	                					while

TYPES 

    B			                			boolean 
    N				                		number (int)
    S		                				string 
    C			                			character
    A		                				array
    V			                			var 
    G			                			global variable
    NL			                			null

TYPES OF NUMBERS

    NB b = 011101                           
    NH h = 267AC1                           var h = 0x267AC1;
    NO o = 337                              var o = 0337;

METHODS
 
    T.ty	               	    			true.typeof()
 
    S s “Hello” 	            			String s = "Hello";
    P s.si			                		console.log(s.size()); 

STRINGS

    "Hello”,“world!”.c  	        		s = “Hello” + “world!”; 
    “Hello, world!".sp(" ")                 “Hello, world!”.split(“ "); 
    “Spit”,”fire".j                         “Spit”,“fire”.join(“”);
    Strip >> “hello, joe”.rm
    “Spitfire”.l                            "Spitfire".length(); 
    “Spitfire is quick”.ios("i")            "Spitfire is quick".indexOf("i");				
    “2”.stn                                 parseInt("2");
    3.nts                                   3.toString()

FOR LOOPS
 
    FO(i,0,5){P i}                          for (var i = 0; i <5; i++) {
                                                console.log(i);
                                            }

    FO(i,2,7,+2){P i*i}                     for(var i = 2; i < 7; i +=2) {
                                                console.log(i*i);
                                            }
                                        
    FO(x,7,0,-3).... 				        for(var i = 7; i > 0; i-=3)

WHILE LOOPS

    W(x>10){I(x<5){x=x-2}E{x=x-1};P x;}         while(x>10){
                                                    if(x<5){x = x - 2}
                                                    else{x=x-1}
                                                    console.log(x)
                                                }

ARRAYS 

    A p = [100, 43, 22, 5, 8]			    var p = [100, 43, 22, 5, 8];
    P p[0]					                console.log(p[0]);
    V q = p					                var q = p;
    A a = [88, false, “0001”, green]		var a = [88, false, “0001”, green]; 
    P a.length					            console.log(a.length);

SYNTAX IN PROGRESS

    SCRIPT        →  (STMT BR)+
    STMT          →  DEC 
                  |  PRINTSTMT
                  |  CONDITIONAL
                  |  LOOP
                  |  PROCCALL
    DEC           →  VARDEC | CONSTDEC | PROCDEC | FUNDEC
    VARDEC        →  V ID | NUM ID
    NUM           →  NB | NH | NO
    CONSTDEC      →  '_' VARDEC
    PROCDEC       →  ID ':= f: (' PARAMS ') ->' BLOCK
    FUNDEC        →  ID ':= f: (' PARAMS ') ->' BLOCK
    PARAMS        →  () | ( )*
                  |  ID (',' ID)*
    ASSIGNMENT    →  DEC | (ID ':=:' ID)              
    PRINTSTMT     →  'p:' EXP
    CONDITIONAL   →  '??:' EXP '?' STMT BR (CONDITIONAL)* (':' EXP '?' STMT BR (CONDITIONAL)*)*  BR (':' STMT )? '??'
    LOOP          →  '8:' RANGE BLOCK
    PROCCALL      →  (ID '('ARGS')') | ANONFUN
    BOOL          →  'T' | 'F'   
    ARRAY         →  '[' EXP* (',' EXP)* ']'
    ARRREF        →  ID '[' '.' | [0-9]+ (('..' | '...') [0-9]+)? ']'
    OBJECT        →  
    HASH          → '#:{' (ID '->' EXP) (',' ID '->' EXP)* '}'
    ANONFUN       → 'f:{' (EXP ('_'('_' | [0-9]+) EXP)*)* '}'
    BLOCK         →  '{' STMT ('!!')? '}'
                  |  '{' (STMT BR)+ ('!!')? '}'
    EXP           →  EXP1 ('|' EXP1)*
    EXP1          →  EXP2 ('&' EXP2)*
    EXP2          →  EXP3 (RELOP EXP3)?
    EXP3          →  EXP4 (MULOP EXP4)*
    EXP4          →  EXP6 (ADDOP EXP6)*
    EXP6          →  EXP7 ('[' EXP (':' EXP)? ']')?
    EXP7          →  EXP8 ('.' ID)?
    EXP8          →  LIT | ID | ARRAY | OBJECT | ANONFUN | PROCCALL | HASH | BOOL
    MULOP         →  '*' | '/' | '%' | '**'
    ADDOP         →  '+' | '-'
    RELOP         →  '<' | '<=' | '==' | '!=' | '>=' | '>' 
    REGEX         → ...Jon will do this part after his date
