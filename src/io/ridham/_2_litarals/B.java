package io.ridham._2_litarals;

public class B {
	// By default compiler treat every integral value as integer,
	// 		literal as decimal and floating-point as double

	int x1 = 10;
	long x2 = 10L;
//	int x3 = 10L;
	long l = 10;

	// If byte, short are in specified range you don't have to define explicitly

	byte b = 127;
	short s = 32256;

//	float f1 = 123.456;
	float f2 = 123.456F;
	double d1 = 123.456;
	double d2 = 123.456F;
	double d3 = 123.456D;

	// floating point values can only be defined in decimal literal
//	double d4 = 0786;
	double d5 = 0XFACE;
	double d6 = 0780.0;
//	double d7 = 0XFACE.0;


}
