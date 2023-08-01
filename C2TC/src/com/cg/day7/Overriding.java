package com.cg.day7;

public class Overriding {
	int getRateOfInterest() {
		return 8;
	}
}
class SBI extends Overriding{
	int getRateOfInterest() {
		return 9;
	}
}
class HDFC extends Overriding{
	int getRateOfInterest() {
		return 10;
	}
}
class ILFC extends Overriding{
	int getRateOfInterest() {
		return 7;
	}
}
