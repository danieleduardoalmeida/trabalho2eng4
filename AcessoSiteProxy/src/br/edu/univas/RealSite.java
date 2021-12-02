package br.edu.univas;

import java.io.IOException;

public class RealSite implements Site{

	@Override
	public void connectar(String url) throws IOException {
		System.out.println("Conectando ao site: "+ url);
	}

}