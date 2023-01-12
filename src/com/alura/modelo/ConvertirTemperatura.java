package com.alura.modelo;

public class ConvertirTemperatura {

	public double ConvertirTemperaturas(double valorRecibido,String principal,String secundaria) {
		//System.out.println("hola");
		double convertido = 0;
		switch (principal) {
		case "Fahrenheit": {
			switch (secundaria) {
			case "Fahrenheit": {
				convertido = valorRecibido;
				break;
				}
			case "Celsius":{
				convertido = (valorRecibido - 32) ;
				convertido = convertido * 5;
				convertido = convertido / 9;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Kelvin":{
				convertido = (valorRecibido - 32) ;
				convertido = convertido * 5;
				convertido = convertido / 9;
				convertido = convertido + 273.15;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			}
			break;
		}
		case "Celsius": {
			switch (secundaria) {
			case "Fahrenheit": {
				convertido = valorRecibido;
				convertido = convertido * 2 - convertido/5;
				convertido = convertido +32;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Celsius":{
				convertido = valorRecibido;
				break;
				}
			case "Kelvin":{
				convertido = valorRecibido + 273.15;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			}
			break;
		}
		case "Kelvin": {
			switch (secundaria) {
			case "Fahrenheit": {
				convertido = valorRecibido;
				convertido = convertido - 273.15;
				convertido = convertido * 9;
				convertido = convertido / 5;
				convertido = convertido +32;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Celsius":{
				convertido = valorRecibido - 273.15;
				convertido = (double) Math.round(convertido*100d)/100;
				break;
				}
			case "Kelvin":{
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
//"Fahrenheit ", "Celsius"