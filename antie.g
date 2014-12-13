grammar antie;

eval	:	mainrule;

mainrule:	command'{'subrule'}';

subrule	:	type P obj P hash;

P 	:	',';
S 	:	':';
ID 	:	(('a'..'z') | ('A'..'Z') | ('@') | ('.') | ('+') | '0'..'9')+;

fragment
INT 	:	'0'..'9'+;

command :	ID;

type 	:	'"type"' S str;

obj 	:	'"object"' S object;

hash	:	'"hashCode"' S INT;

str 	:	'"' ID '"';

object	:	'{' subobject '}';

subobject 
	:	str S (str|INT|object) (options{greedy=true;}:(P subobject))*
	;









