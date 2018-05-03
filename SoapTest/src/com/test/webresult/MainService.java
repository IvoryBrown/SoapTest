package com.test.webresult;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.test.webservice.Interpreter;

//ezzel az anotacioval jelzem hogy ez egy webservice 

@WebService
public class MainService {

	// Meghivom az uj osztalyt mint objektum 'new kulcszo a lenyeg minden egyes
	// alkalommal mikor hivatkozok ra uj objektum jonn letre, ha sokszor akarom
	// hasznalni akkor rengeteg memmoriat fog felhasznalni, erre megoldas lehet ha
	// Interpreter osztalyba a metodusok static kulcsszoval latom el', hogy kesobb
	// tudjam
	// hasznalni
	Interpreter num = new Interpreter();

	// ezzel az anotacival jelzem hogy ez egy webmethod, így tudom tesztelni a
	// kesobbiekbe mert a webservice 'felirja' maganak, hogy ez a osztaly emit
	// figyelned kell a webmethod meg ez az a methodus amit 'tesztelni' lehet
	@WebMethod
	// var ket erteket a methodus amit a teszt kornyzetebol kap azért double'ez
	// lehet String, Integer...' mert
	// vissza is kell addni az eredmenyt
	public double getSumma(double a, double b) {
		// itt meghivom a interpreter osztaly setSumma metothodust ami var ket erteket
		// at adom neki a getsumma ket ertket ami vissza ad egy erteket es szinten
		// vissza kuldi a teszt kornyezetbe a kiszamolt erteket
		return num.setSumma(a, b);
	}

	@WebMethod
	public double getSubtraction(double a, double b) {
		return num.setSubtraction(a, b);
	}

	@WebMethod
	public double getDivision(double a, double b) {
		return num.setDivision(a, b);
	}

	@WebMethod
	public double getMultiplication(double a, double b) {
		return num.setMultiplication(a, b);
	}

}
