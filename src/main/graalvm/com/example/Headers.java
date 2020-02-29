package com.example;

import java.util.*;

import org.graalvm.nativeimage.c.CContext;

public class Headers implements CContext.Directives
{
	@Override
	public List<String> getHeaderFiles()
	{
		return Collections.singletonList("\"/usr/include/unistd.h\"");
	}
}
