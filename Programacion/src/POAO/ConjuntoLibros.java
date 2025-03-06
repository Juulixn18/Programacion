package POAO;

public class ConjuntoLibros {
	private static int TAM = 3;
	private Libro[] conjuntoLibros;

	// constructores
	public ConjuntoLibros() {
		this.conjuntoLibros = new Libro[TAM];
	}

	public ConjuntoLibros(int size) {
		this.conjuntoLibros = new Libro[size];
	}

	// getters
	public void añadirLibro(Libro l) {
		for (int i = 0; i < conjuntoLibros.length; i++) {
			if (conjuntoLibros[i] == null) {
				conjuntoLibros[i] = l;
				i = TAM + 1;
			}
		}
	}

	public void eliminarLibrosPorTitulo(String titulo) {
		for (int i = 0; i < conjuntoLibros.length; i++) {
			if (conjuntoLibros[i] != null) {
				if (conjuntoLibros[i].getconsultaTitulo().equals(titulo)) {
					conjuntoLibros[i] = null;
				}
			}
		}
	}

	public void eliminarLibrosPorAutor(String autor) {
		for (int i = 0; i < conjuntoLibros.length; i++) {
			if (conjuntoLibros[i] != null) {
				if (conjuntoLibros[i].getconsultaAutor().equals(autor)) {
					conjuntoLibros[i] = null;
				}
			}
		}
	}

	public String toString() {
		String cad = "";
		for (int i = 0; i < conjuntoLibros.length; i++) {
			if (conjuntoLibros[i] != null) {
				cad += conjuntoLibros[i].toString() + "\n";
			}
		}
		return cad;
	}

	public void mostrarLibrosMaxNota() {
		double max = 0;
		ConjuntoLibros libroxMaxNota = new ConjuntoLibros();
		for (int i = 0; i < conjuntoLibros.length; i++) {
			if (conjuntoLibros[i] != null) {
				if (max < conjuntoLibros[i].getconsultaNota()) {
					max = conjuntoLibros[i].getconsultaNota();
				}
			}
		}
		for (int i = 0; i < conjuntoLibros.length; i++) {
			if (conjuntoLibros[i] != null) {
				if (conjuntoLibros[i].getconsultaNota() == max) {
					System.out.println(conjuntoLibros[i]);
				}
			}
		}
	}

	public void mostrarLibrosMinNota() {
		double min = 10;
		ConjuntoLibros libroxMinNota = new ConjuntoLibros();
		for (int i = 0; i < conjuntoLibros.length; i++) {
			if (conjuntoLibros[i] != null) {
				if (min > conjuntoLibros[i].getconsultaNota()) {
					min = conjuntoLibros[i].getconsultaNota();
				}
			}
		}
		for (int i = 0; i < conjuntoLibros.length; i++) {
			if (conjuntoLibros[i] != null) {
				if (conjuntoLibros[i].getconsultaNota() == min) {
					System.out.println(conjuntoLibros[i]);
				}
			}
		}
	}

}
