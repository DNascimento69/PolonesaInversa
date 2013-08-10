package modelo.handler;


import java.util.LinkedList;

public abstract class AbstractCalcHandler implements CalcHandler {
	
	public static void handle(String expressao) {
		CalcHandler adicao = new AdicaoHandler();
		CalcHandler sub = new SubtracaoHandler();
		CalcHandler numero = new NumeroHandler();

		adicao.setProximoHandler(sub);
		sub.setProximoHandler(numero);
		
		adicao.processa(expressao.split(" "), null);
	}
		
	private CalcHandler proximoHandler;
	
	public void setProximoHandler(CalcHandler handler) {
		proximoHandler = handler;
	}
	
	public void processa(String[] expressao, LinkedList<Integer> lista) {
		boolean encontrado = false;

		if (expressao.length > 0) {
			if (buscaCaracteres() != "") {
				encontrado = true;
			} else {
				if (buscaCaracteres() != "") {
					encontrado = true;
				}
			}
		} else {
			System.out.println("IMPRIME VALOR FINAL");
		}
		
		if (encontrado) {
			handleHere(lista);
		} else {
			proximoHandler.processa(expressao, lista);
		}
	}
	
	protected abstract String buscaCaracteres();
	protected abstract void handleHere(LinkedList<Integer> lista);
	
}
