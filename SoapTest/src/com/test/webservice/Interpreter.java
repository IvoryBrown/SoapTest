package com.test.webservice;

//letre hozzok egy osztalyt ahol definialom a muveleteket '+-/*'
public class Interpreter {

	// osszeadas, a metodus ket valtozot kap amit parameter kent at kell adnunk
	// mikor meghivjuk, azert public mert masik package-ba el
	public double setSumma(double a, double b) {
		// kell egy seged valtozo amibe tarolom az erteket es vissza tudom adni
		double ered;
		// muvelet itt tortenik az 'a' és a 'b' osszeadom es eltarolom egy valtozoba
		ered = a + b;
		// mivel a metodus var egy erteket ami double tipusu (ha void tipus lenne akkor
		// nem kell a return, nincs vissza teresi erteke) ezert vissza kell adni valamit
		return ered;
	}

	// kivonas
	public double setSubtraction(double a, double b) {
		double ered;
		ered = a - b;
		return ered;
	}

	// osztas
	public double setDivision(double a, double b) {
		double ered = 0;
		// Try catch blokk hiba kezelesre szolgal ha a bevitt ertek megfelolo akkor a
		// catch ag nem futt le, ha hiba van akkor a catch ag futt le
		try {
			ered = a / b;
			// aritmetikai hiba, ha IOException lenne akkor altalanos I/O hiba lenne stb...
		} catch (ArithmeticException e) {
			
		}
		return ered;
	}

	// szorzas
	public double setMultiplication(double a, double b) {
		double ered;
		ered = a * b;
		return ered;
	}
}
