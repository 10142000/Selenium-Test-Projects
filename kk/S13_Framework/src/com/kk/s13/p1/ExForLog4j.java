package com.kk.s13.p1;

import org.apache.log4j.Logger;

public class ExForLog4j {

	public static void main(String[] args) {
		Logger l=Logger.getLogger("get");
		l.info("Hello this is an info message");

	}

}
