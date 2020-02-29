package com.example;

import jnr.posix.POSIXFactory;

public class Execv
{
	public static int run(String arg, String[] args)
	{
		System.out.println("JNR Impl");
		System.out.flush();
		return POSIXFactory.getNativePOSIX().execv(arg, args);
	}
}
