package com.fabio.calc.modelo;
@FunctionalInterface
public interface MemoriaObservador {
	
	void valorAlterado(String novoValor);
}
