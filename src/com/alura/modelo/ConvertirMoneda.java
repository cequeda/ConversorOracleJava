package com.alura.modelo;


public class ConvertirMoneda {
	
	public double ConvertirCantidad(double valorRecibido,String principal,String secundaria) {
		double convertido = 0;
		
		switch (principal) {
		case "Colones": {
			switch (secundaria) {
			case "Colones": {
				System.out.println(valorRecibido);
				convertido = valorRecibido;
				break;
				}
			case "Dolares":{
				convertido = valorRecibido / 586.64;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Euros":{
				convertido = valorRecibido / 629.53;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Libra Esterlina":{
				convertido = valorRecibido / 714.29;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Yen":{
				convertido = valorRecibido / 4.45;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Won SurCoreano":{
				convertido = valorRecibido / 0.47;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			}
			break;
			}
		case "Dolares": {
			switch (secundaria) {
			case "Colones": {
				convertido = valorRecibido / 0.0017;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Dolares":{
				convertido = valorRecibido;
				break;
				}
			case "Euros":{
				convertido = valorRecibido / 1.07;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Libra Esterlina":{
				convertido = valorRecibido / 1.22;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Yen":{
				convertido = valorRecibido / 0.0076;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Won SurCoreano":{
				convertido = valorRecibido / 0.00081;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			}
			break;
			}
		case "Euros": {
			switch (secundaria) {
			case "Colones": {
				convertido = valorRecibido / 0.0016;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Dolares":{
				convertido = valorRecibido / 0.93;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Euros":{
				convertido = valorRecibido;
				break;
				}
			case "Libra Esterlina":{
				convertido = valorRecibido / 1.13;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Yen":{
				convertido = valorRecibido / 0.0071;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Won SurCoreano":{
				convertido = valorRecibido / 0.00075;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			}
			break;
			}
		case "Libra Esterlina": {
			switch (secundaria) {
			case "Colones": {
				convertido = valorRecibido / 0.0014;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Dolares":{
				convertido = valorRecibido / 0.82;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Euros":{
				convertido = valorRecibido / 0.88;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Libra Esterlina":{
				convertido = valorRecibido;
				break;
				}
			case "Yen":{
				convertido = valorRecibido / 0.0062;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Won SurCoreano":{
				convertido = valorRecibido / 0.00066;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			}
			break;
			}
		case "Yen": {
			switch (secundaria) {
			case "Colones": {
				convertido = valorRecibido / 0.22;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Dolares":{
				convertido = valorRecibido / 131.91;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Euros":{
				convertido = valorRecibido / 141.58;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Libra Esterlina":{
				convertido = valorRecibido / 160.48;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Yen":{
				convertido = valorRecibido;
				break;
				}
			case "Won SurCoreano":{
				convertido = valorRecibido / 0.11;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			}
			break;
			}
		case "Won SurCoreano": {
			switch (secundaria) {
			case "Colones": {
				convertido = valorRecibido / 2.11;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Dolares":{
				convertido = valorRecibido / 1240.54;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Euros":{
				convertido = valorRecibido / 1331.39;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Libra Esterlina":{
				convertido = valorRecibido / 1508.55;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Yen":{
				convertido = valorRecibido / 9.40;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Won SurCoreano":{
				convertido = valorRecibido;
				break;
				}
			}
			break;
			}
		}
		return convertido;
	}
}
//"Colones", "Dolares", "Euros", "Libra Esterlina", "Yen", "Won SurCoreano"