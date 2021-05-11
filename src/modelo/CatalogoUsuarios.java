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
	
	public String getNombre(int pId) {
		int i = 0;
		boolean enc = false;
		while (i < lUsuarios.size() && !enc) {
			if (lUsuarios.get(i).getId() == pId) return lUsuarios.get(i).getName();
			i++;
		}
		return null;
	}
}
