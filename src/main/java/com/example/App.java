package com.example;

public class App
{
	public static void main(String[] args)
	{
		int code = Execv.run("/bin/ls", new String[] { "ls", "-lah", "/" });
		System.err.println("Error code = " + code);
	}
}
