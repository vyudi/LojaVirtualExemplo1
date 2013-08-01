package br.com.p2center.vitor.lojavirtual.fabricas;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class FabricaDeSessionFactory {
	
	public SessionFactory build(){
		final AnnotationConfiguration configuration = new AnnotationConfiguration().configure();
		return configuration.buildSessionFactory();		
	}

}