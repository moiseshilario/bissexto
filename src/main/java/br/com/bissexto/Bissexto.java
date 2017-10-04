package br.com.bissexto;

public class Bissexto {
	public static boolean ehBissexto(int ano) {
		  if (ano % 4 != 0) {
		    return false;
		  } else if (ano % 400 == 0) {
		    return true;
		  } else if (ano % 100 == 0) {
		    return false;
		  } else {
		    return true;
		  }
		}
	}