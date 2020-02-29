package com.example;

import org.graalvm.nativeimage.*;
import org.graalvm.nativeimage.c.CContext;
import org.graalvm.nativeimage.c.function.*;
import org.graalvm.nativeimage.c.function.CFunction.Transition;
import org.graalvm.nativeimage.c.type.*;
import org.graalvm.nativeimage.c.type.CTypeConversion.*;

@CContext(Headers.class)
@CLibrary("c")
public class Execv
{
	@CFunction(transition = Transition.NO_TRANSITION)
	public static native int execv(CCharPointer base, CCharPointerPointer argv);

	public static int run(String arg, String[] args)
	{
		System.out.println("Graal Impl");
		System.out.flush();

		CCharPointerHolder type = CTypeConversion.toCString(arg);
		CCharPointerPointerHolder argv = CTypeConversion.toCStrings(args);
		return execv(type.get(), argv.get());
	}
}
