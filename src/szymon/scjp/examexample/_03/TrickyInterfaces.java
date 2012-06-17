package szymon.scjp.examexample._03;

interface Picker {
	Integer tomato = 57;
}

interface Grinner {
	int doStuff();
}

interface Sinner extends Picker, Grinner {
	int doStuff(boolean maybe);
	int doStuff();
}

public class TrickyInterfaces {

}
