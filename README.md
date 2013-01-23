# Spitfire

Spitfire is a language that allows the user to implement solutions as fast as possible using the least amount of keystones. It relies on indentation. It makes all other languages it’s bitch.

### Examples

Spitfire on the left, Javascript on the right

    P “Hello, world!” 				console.log(“Hello, world!”);

Variable Declaration

    V s = spit 					var v = spit; 
    V f = fire 					var f = fire;

Parallel declaration

    V s,f = spit,fire 				var s = spit;
						var f = fire;

Constants, upper case variables are not allowed, starts with _

    V _pi = 3.14 				var pi = 3.14;

Assignment is not initialization

    V x = 1 					var x = 1;
    x = x + 1 					x = x + 1;
    P x 					console.log(x);

Arithmetic expression

    y / (4 - x) * 2.5 				y / (4 - x) * 2.5

Swap

    V x = 34 					var x = 34
    V y = 16 					var y = 16
    x SW y

Booleans 

    T						true
    F						false
    5 > 7					5 > 7

Functions

    V b = D (pounds,inches) 
        V _kilograms_per_pound = = 0.45359237
        V _meters_per_inch = 0.0254
        V kilos = pounds * _kilograms_per_pound
        V inches = inches * _meters_per_inch
        R kilos / (meters * meters)
    Z


    I(T.ty.e(B)){P “hi”}  //if the typeof true is equal to boolean, print hi

Keywords

    I >> if 
    E >> else 
    EF >> else if 
    D >> define function
    FO >> for 
    W >> while
    A >> array

EXAMPLES

    I 5 > 2 P T // If 5 is greater than 2, print “true”. 
    I T == T P T E P F // if true is true, print true, else print

TYPES 

    B >> boolean 
    T >> true constant
    F >> false constant 
    N >> number (int) 
    N+ >> number (long) 
    N- >> number (short) 
    S >> string 
    C >> character 
    V >> var 
    G >> global variable?

METHODS

    P >> print P “Hello world!”
    .ty >> typeof 
        T.ty >> boolean 
    .si >> sizeof 
        S s “Hello” 
        s.si >> 5

Variables

    local variable >> V x = 1 
    global variable >> G x = 1 
    assignment >> x = 1 
    NL >> Null

Strings

    Concatenation >> C.“Hello”,“World” 		s = “hello” + “world”; 
    Split >> SP.“hello,world” 			“hello, world”.split(“”); 
    Join >> J.(“hel”,”lo”) “hel”,		“lo”.join(“”);
    Strip >> “hello, joe”.rm
    Length >> “howdy”.L 
    Index Of String >> “try this”.IoS 
    String to Number >> 3 + StN(“2”) 
    Number to String >> NtS(3)

For loops 
 
    FO(i,0,5){P i} for (var i = 0; i <5; i++) { console.log(i); }

    FO(i,2,7,+2){P i*i} for(var i = 2; i < 7; i +=2){ console.log(i*i); } FO(x,7,0,-3).... for(var i = 7; i > 0; i-=3)

While loops 

    W(x>10){I(x<5){x-2}E{x-1};P x;}

Arrays 

    A p = [100, 43, 22, 5, 8]			var p = [100, 43, 22, 5, 8];
    P p[0]					console.log(p[0]);
    V q = p					var q = p;
    A a = [88, false, “0001”, green]		var a = [88, false, “0001”, green]; 
    P a.length					console.log(a.length);