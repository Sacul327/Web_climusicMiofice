package com.Climusic.Venta;

abstract class VentaxUnidad {
	
	public double realizoVenta(int venta, double precio) {
		double b,c;
		c=0;
		if(venta>=3) {
			precio=precio*venta;
			b=10*precio/100;
			c=precio-b;
		}
		return c;
	}

}
