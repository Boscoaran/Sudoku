package modelo;

import java.util.ArrayList;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class CatalogoUsuarios extends Observable{
	private ArrayList<Usuario> lUsuarios;
	private static CatalogoUsuarios mCatUsuarios; 
	
	private CatalogoUsuarios() {
		lUsuarios = new ArrayList<>();
	}
	
	public static CatalogoUsuarios getCatalogoUsuarios() {
		if (mCatUsuarios == null) mCatUsuarios = new CatalogoUsuarios();
		return mCatUsuarios;
	}
	
	public void anadirUsuario(Usuario u) {
		lUsuarios.add(u);
	}
	
	public void mostrar() {
		Usuario lU[] = new Usuario[lUsuarios.size()];
		int i = 0;
		while (i < lUsuarios.size()) {
			lU[i] = lUsuarios.get(i);
			i++;
		}
		this.setChanged();
		this.notifyObservers(lU);
	}
}
