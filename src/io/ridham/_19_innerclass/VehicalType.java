package io.ridham._19_innerclass;
// Interface inside class
public class VehicalType {

	interface Vehical {
		public int getNoOfWheels();
	}
	
	class Bus implements Vehical {
		@Override
		public int getNoOfWheels() {
			return 6;
		}		
	}
}
