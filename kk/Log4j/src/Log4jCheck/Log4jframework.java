package Log4jCheck;

import org.apache.log4j.Logger;

/*Log 4jframework
1.Create a simple script to generate logs on debug and info level
The output should be printed in console in this format
[main] DEBUG Example - Hello this is a debug message
[main] INFO Example - Hello this is an info message

2.For the above generate log in notepad i.e simple text format*/

public class Log4jframework {
	public void main(String args[]) {
		Logger l=Logger.getLogger("get");
		l.debug("Hello this is an info message");
		l.info("Hello this is an info message");
		
	}

}
