package io.ridham._01_datatypes;

// These are numeric floating-point type datatypes
// Floating point has higher range but lower accuracy
public class C {
	// 4-byte, default: 0.0F
	// 1-bit for sign, 8-bit for exponent(9.87654), 23-bit for mantissa(3)
	// Must use F to define explicitly as float value
	float f1 = 9.87654E3F;
	float f2 = 9876.54F;

	// 8-byte, default: 0.0
	// 1-bit for sign, 11-bit for exponent(1.7), 52-bit for mantissa(308)
	double d = 1.7E308;
}
