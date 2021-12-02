package br.edu.univas;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		String url = lerUrl();
		if (validarUrl(url)) {
			conectar(url);
		} else {
			System.out.println("Url inválida");
		}
	}

	private static void conectar(String url) {
		try {
			Site site = new ProxySite();
			site.connectar(url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static String lerUrl() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Entre com a url do site que deseja conectar:");
			String url = sc.nextLine();
			return url;
		}
	}

	private static boolean validarUrl(String url) {
		String regex = "((W|w){3}.)?[a-zA-Z0-9]+\\.[a-zA-Z]+";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(url);
		return m.find();
	}
}