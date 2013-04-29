# Spitfire (maybe)

Spitfire is a language that allows the user to implement solutions as fast as possible using the least amount of keystrokes. Ain't nobody got time to type out whole words! Spitfire is statically and strongly typed. It is FORTRAN-esque in that all of its keywords are capitalized. One day in class, `jcrawley` said,  `"I want to make a language that spits fire."` On that fateful day, we knew we had our name.

--------------------------------

#Examples

**SPITFIRE ON THE LEFT, JAVASCRIPT ON THE RIGHT**

Bet you knew what the first example would be.

    P “Hello, world!”                           console.log(“Hello, world!”);

**VARIABLE DECLARATIONS**

Variable declarations are simple and easy in Spitfire. No semicolons necessary!

    S s = "spitfire"                            var s = "spitfire"; 
    B found = T                                 var found = true;
    N hex = 0x34A4                              var hex = 0x34A4;
    C f = 'f'                                   var f = 'f';

**PARALLEL DECLARATION**

Spitfire allows parallel declaration. simply put a space between the variables you want to declare, and a space between the values you want the variables to be inititialized to.

    S s f = "spit" "fire"                       var s = "spit";
                                                var f = "fire";

**CONSTANTS**

In Spitfire constants start with `_`. Uppercase identifier names are not allowed.

    N _pi = 3.14                                var pi = 3.14;
    
**ASSIGNMENT IS MOST CERTAINLY NOT INITIALIZATION**

In Spitfire, assignment is as you would probably expect.

    N x = 1                                     var x = 1;
    x = x + 1                                   x = x + 1;
    P x                                         console.log(x);

**ARITHMETIC EXPRESSIONS**

Arithmetic expressions work similarly to most languages. Spitfire allows both `^` and `**` for denoting powers.

    (3/2 - (a * b)) ^ ((300 % c) + d ** 2)      Math.pow(3/2 - a * b, (300 % c) + Math.pow(d,2))

**SWAP**

Spitfire allows its user to swap two variables by using `<=>`. It is demonstrated below. The types of the two variables that are being switched do not need to be the same.

    N x = 34                                    var x = 34;
    S s = "spitfire"                            var s = "spitfire";
    x <=> y                                     _1 = x;
                                                _2 = y;
                                                x = _2;
                                                y = _1;

**BOOLEANS AND BOOLEAN ARITHMETIC**

In Spitfire, true and false are denoted by `T` and `F` respectively. Spitfire also has the boolean conditional statement with `?` and `:`.

    T                                           true
    F                                           false
    S s = T || F ? "spit" : "fire"              var s = true || false ? "spit : "fire";              
    T && F                                      true && false

**FUNCTIONS**

Function calls in Spitfire will work as shown below. A return type is optional in Spitfire. If nothing is provided after the function name, the function is assumed to return void.

    DF N bmi (N pounds, N inches)               var bmi = function (pounds, inches) {
      N _kilograms_per_pound = 0.45359237           var KILOGRAMS_PER_POUND = 0.45359237;
      N _meters_per_inch = 0.0254                   var METERS_PER_INCH = 0.0254;
      N kilos = pounds * _kilograms_per_pound       var kilos = pounds * KILOGRAMS_PER_POUND;
      N inches = inches * _meters_per_inch          var inches = inches * METERS_PER_INCH;
      R kilos / (meters * meters)                   return kilos / (meters * meters)
                                                }
        
    DF N gcd (x, y)                             var gcd = function (x, y) {
      R x % y == 0 ? x : gcd(y, x % y)              return x%y == 0 ? x : gcd(y, x%y); 
                                                }
                                                                  
**KEYWORDS**

Spitfire's keywords are short and simple. Maxing out at two characters, the short and sweet style saves you keystrokes.

    I                                       if 
    E                                       else 
    EI                                      else if 
    DF                                      define function
    DC                                      define class
    LU                                      loop until
    LF                                      for loop
    LW                                      while loop
    R                                       return

**TYPES**

In Spitfire, there are five main types: `B` is for booleans, `N` is for any type of number (integer and floating point numbers work), `S` is for strings, `C` is for characters, and `<>` for the null type. `[]` is used for array declarations and `Y` is used to denote arrays with multiple types of elements.

    B                                       boolean 
    N                                       number
    S                                       string 
    C                                       character
    <>                                      type of the null literal
    []                                      array (e.g., [N] is array of number)
    Y                                       "any" type
    
**CLASSES**

Classes in Spitfire are very simple. After naming the class, you simply need to state which variables you want to be associated with the class.

    DC point
      N x
      N y
      S color
      
Class names automatically become constructor functions, taking as arguments the fields in the order that they were declared:

    point a = point(4, 5, "purple")
    point b = point(-3, 0, "red")
    point c = point(12, -9, "orange)
    
    [point] myPoints = [a, b, c]
    
    DC polygon
      [point] vertices
      
    polygon triangle = polygon(myPoints)
      
**NUMBERS AND THEIR TYPES**

Numbers in Spitfire can be denoted as octal, hexadecimal, or decimal. Octal numbers are prefixed with a `0` and hexadecimal numbers are prefixed with a `0x`. Decimal numbers have no prefix.
                        
    N o = 0337                              var o = 0337;
    N h = 0x267AC1                          var h = 0x267AC1;
    N d = 135792468                         var d = 135792468;

**STRINGS AND STRING MANIPULATION**

Strings in Spitfire are easy to manipulate and use. Many ways of manipulating string in Spitfire use thses brackets: `[` and `]`. For a certain slice of a string, one can specify which part by viewing the string as an array of characters. Let us use `i` and `j` to describe how this works. `i` will be the beginning index and `j` to denote the end index. If a user puts `[i..j]` after a string, the slice of the string, not including `j`, will be returned. If a user simply puts `[i..]`, the slice will be from the beginning index until the end of the string.

    S s = "Hello” + “world!”                var s = “Hello” + “world!”; 
    “Hello, world!" | " "                   “Hello, world!”.split(“ ");
    [“Spit”,”fire"] @ ""                    [“Spit”, “fire”].join(“”);
    S s = “Spitfire”[3..5]                  var s = "Spitfire".slice(3,6);
    S f = "Spitfire"[3..]                   var f = "Spitfire".slice(3);
    “Spitfire is quick” % "is"              "Spitfire is quick".indexOf("is");  // 10
    “Spitfire is quick”[4]                  "Spitfire is quick"[4]              // 'f'
    
**TYPECASTING**

In Spitfire, users can typecast any expression with the `::` operator.
    
    “2”::N                                 parseInt("2");
    3::S                                   3 .toString();
    C a = '8'                              var a = 'c';
    S b = a::S                             var b = String.valueOf(c);
    S c = "f"                              var c = "f";
    C d = c::C                             var d = c.charAt(0);

**LOOPS**

Spitfire includes three different types of loops: `L` to loop a fixed number of times, or forever; `LU` to loop until and expression is true, `LF` to loop for elements in a range or sequence, and `LW` to loop while an expression is true.
 
    L                                       while (true) {
      P "make it stop"                          console.log("make it stop");
                                            }
      
    L 5                                     for (var i = 0; i < 5; i++) {
      P i                                       console.log(i);                                          
                                            }
                                            
    LF i 1 100 1                            for (var i = 1; i <= 100; i++) {
      S fb = i % 3 == 0 ? "Fizz" : ""           if (i % 15 == 0) {
      fb += i % 5 == 0 ? 'Buzz' : ""               console.log("FizzBuzz");
      P fb                                      } else if (i % 3 == 0) {
                                                    console.log("Fizz");
                                                } else if (i % 5 == 0) {
                                                    console.log("Buzz");
                                                } else {
                                                    console.log(i);
                                                }
                                            }

    LF i 2 7 2                              for (var i = 2; i < 7; i += 2) {
      P i*i                                     console.log(i*i);
                                            }
                                        
    LF i 7 0 -3                             for (var i = 7; i > 0; i -= 3) {
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

**ARRAYS**

Spitfire's arrays are just like any other languages but with some spice. Array declarations are used by having a left hand bracket `[` followed by one of Spitfire's type declarations followed by a right hand bracket `]`. For arrays of multiple types, the user cany use the type `Y` denoting "any" type. To access the last position in an array the user can use the index `-1` just like in Ruby. Also, a user can append an element to the end of an array by using `<=`. Some examples are listed below:

    [N] p = [100, 43, 22, 5, 8]             var p = [100, 43, 22, 5, 8];
    N n = 78                                var n = 78;
    p += n                                  p.push(n);
    P p[-1]                                 console.log(p[p.length-1]);
    [N] q = p                               var q = p;
    [Y] a = [88, false, “0001”, green]      var a = [88, false, “0001”, green]; 

**SYNTAX**

Here is the syntax for Spitfire. Our EBNF symbols are as follows: `|` is for alternatives, `*` is zero or more, `+` is for one or more, `?` is for zero or one, and parentheses are for groups.

    SCRIPT        →  (STMT BR)+
    STMT          →  DEC
                  |  ASSIGNMENT
                  |  PRINTSTMT
                  |  RETURNSTMT
                  |  CONDITIONAL
                  |  LOOP
    DEC           →  VARDEC | FUNDEC | CLASSDEC
    TYPE          →  'B' | 'N' | 'C' | 'S' | 'Y' | ID | '<>' | '[' TYPE ']'
    VARDEC        →  TYPE ID (ID)* '=' EXP (EXP)*
    FUNDEC        →  'DF' ID PARAMS BR BLOCK
    CLASSDEC      →  'DC' ID BR VARDEC+
    PARAMS        →  '(' ID (ID ',')* ')'
    ASSIGNMENT    →  ID '=' EXP
    PRINTSTMT     →  'P' EXP
    RETURNSTMT    →  'R' EXP
    CONDITIONAL   →  'I' EXP BLOCK ('EI' EXP BLOCK)* ('E' BLOCK)?
    LOOP          →  'L' EXP? BR BLOCK
                  →  'LU' EXP BR BLOCK
                  →  'LF' ID EXP (EXP EXP?)? BR BLOCK
                  →  'LW' EXP BR BLOCK
    EXP           →  EXP1 ('||' EXP1)*
    EXP1          →  EXP2 ('&&' EXP2)*
    EXP2          →  EXP3 (RELOP EXP3)?
    EXP3          →  EXP4 (ADDOP EXP4)*
    EXP4          →  EXP5 (MULOP EXP5)*
    EXP5          →  PREFIXOP? EXP6
    EXP6          →  EXP7 ('::' TYPE | '@' EXP7 | '|' EXP7)?
    EXP7          →  'T' | 'F' | NUMLIT | STRLIT | VAREXP | '(' EXP ')'
    VAREXP        →  ID ('[' EXP ']' | '.' ID | ARGS)*
    ADDOP         →  '+' | '-'
    MULOP         →  '*' | '/' | '%' | '^' | '**'
    RELOP         →  '<' | '<=' | '==' | '!=' | '>=' | '>'
    PREFIXOP      →  '-' | '!'
    BLOCK         →  (STMT BR+)+
    PARAMS        →  '(' ')' | '(' TYPE ID (',' TYPE ID)* ')'
    ARGS          →  '(' ')' | '(' EXP (',' EXP)* ')'

**MICROSYNTAX**
    
    BR            → NEWLINE
    COMMENT       → '$' ()*  NEWLINE
                  | '$$' ()* '$$'
    ID            →  '_'?[a-z]+ ([-_a-z0-9])*
    NUMLIT        →  [0-9]+ ('.' [0-9]*)?
    STRLIT        →  '"'  ( NUMLIT | [a-Z])*  '"'