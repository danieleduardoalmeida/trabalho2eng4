package br.edu.univas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProxySite implements Site {

	private Site site = new RealSite();
	private List<String> sitesProibidos = new ArrayList<String>();

	public ProxySite() {
		sitesProibidos.add("www.facebook.com");
		sitesProibidos.add("www.twitter.com");
		sitesProibidos.add("www.instagram.com");
	}

	@Override
	public void connectar(String url) throws IOException {
	
		if (sitesProibidos.contains(url.toLowerCase())) {
			throw new IOException("Acesso ao site negado");
		}
		site.connectar(url);
	}
}