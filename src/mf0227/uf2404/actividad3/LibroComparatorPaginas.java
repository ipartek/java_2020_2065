package mf0227.uf2404.actividad3;

import java.util.Comparator;

public class LibroComparatorPaginas implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {		
		return o1.getPaginas() - o2.getPaginas();
	}

}
