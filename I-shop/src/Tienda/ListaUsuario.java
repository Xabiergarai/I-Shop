package Tienda;

import java.util.ArrayList;

public class ListaUsuario {

    private ArrayList<Usuario> usuarios;

    public static void main(String[] args) {
        ListaUsuario listaUsuario = new ListaUsuario();
        ArrayList<Usuario> lista = listaUsuario.getUsuarios();
        lista.add(
                new Usuario(
                "Mikel", "1234",
                "@test","Mikel",""
                )
        );

        lista.get(0);
    }

    public ListaUsuario() {
        this.usuarios = new ArrayList<Usuario>();
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
}
