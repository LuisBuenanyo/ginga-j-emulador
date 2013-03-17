#!/bin/sh

export EMULATOR_HOME="."

export CLASSPATH="$EMULATOR_HOME/lib/cake.jar:$EMULATOR_HOME/lib/metouia.jar:$EMULATOR_HOME/lib/nanoxml-2.2.3.jar:$EMULATOR_HOME/lib/javassist.jar:$EMULATOR_HOME/lib/javatv.jar:$EMULATOR_HOME/lib/jmf:$EMULATOR_HOME/build/classes:$EMULATOR_HOME"

sync; $JAVA_HOME/bin/java -Xbootclasspath/p:. -classpath $CLASSPATH net/beiker/xletview/Main
