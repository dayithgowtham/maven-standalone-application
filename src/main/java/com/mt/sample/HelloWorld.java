package com.mt.sample;

/**
 * Hello world!
 *
 */
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Welcome to Maven Build Tool !! Today Date is: 24th July 2025  " + getLocalCurrentDate());

	}

	private static Date getLocalCurrentDate() {
		String m = "Mithun Technologies";
		return new Date();

	}

}
