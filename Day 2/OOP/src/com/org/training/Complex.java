package com.org.training;

public class Complex {
       private int real;
       private int imag;
	
       public Complex() {
		super();
	}

	public Complex(int real, int imag) {
		super();
		this.real = real;
		this.imag = imag;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImag() {
		return imag;
	}

	public void setImag(int imag) {
		this.imag = imag;
	}

	@Override
	public String toString() {
		return "Complex [real=" + real + ", imag=" + imag + "]";
	}
       
    public void showValues()
    {
    	System.out.println("Complex value is "+this.imag+" &  Real Value is "+this.real);
    }
       

}
