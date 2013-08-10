package modelo.handler;

import java.util.LinkedList;

public interface CalcHandler {
	public void setProximoHandler(CalcHandler handler);
	public void processa(String[] string, LinkedList<Integer> lista);
}
