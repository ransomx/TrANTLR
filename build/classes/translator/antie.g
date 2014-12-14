grammar antie;

eval	:	mainrule;

mainrule:	command'{'subrule'}';

subrule	:	type P obj P hash;

P 	:	',';
S 	:	':';
ID 	:	(('a'..'z') | ('A'..'Z') | ('@') | ('.') | ('+') | '0'..'9')+;

command :	'con'|'dev'|'mes';

type 	:	'"type"' S str;

obj 	:	'"object"' S object;

hash	:	'"hashCode"' S str;

str 	:	'"' ID '"';

object	:	'{' subobject '}';

subobject 
	:	str S (str|object) (options{greedy=true;}:(P subobject))*
	;









