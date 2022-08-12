package dio.digitalinnovation.gof;

import dio.digitalinnovation.gof.facade.Facade;
import dio.digitalinnovation.gof.singleton.SingletonEager;
import dio.digitalinnovation.gof.singleton.SingletonLazy;
import dio.digitalinnovation.gof.singleton.SingletonLazyHolder;
import dio.digitalinnovation.gof.strategy.Comportamento;
import dio.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import dio.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import dio.digitalinnovation.gof.strategy.ComportamentoNormal;
import dio.digitalinnovation.gof.strategy.Robo;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("=== Singleton ===");

		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		System.out.println("\n");
		
		
		System.out.println("=== Strategy ===");

		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		System.out.println("\n");
		
		System.out.println("=== Facade ===");		

		Facade facade = new Facade();
		facade.migrarCliente("Caique", "14640000");
		
	}
}
