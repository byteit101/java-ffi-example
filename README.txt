An example project showing how to perform FFI in both a GraalVM Native Image and a normal JDK with JNR.

The maven configuration adds either src/main/jdk or src/main/graalvm to the path depending on if we are using GraalVM or not.

mvn package

Or to make a normal jar under GraalVM:

mvn package -P-graalvm,normal
