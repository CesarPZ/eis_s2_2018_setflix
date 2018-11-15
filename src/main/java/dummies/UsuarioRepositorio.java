package dummies;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;


public class UsuarioRepositorio {
    private List<Usuario> usuarios = new ArrayList<>();

    public UsuarioRepositorio(){
        //0
        Usuario usuario1 = new Usuario("Aschisema", "1234", "Marcelo", "Di Costanzo");

        //1
        Usuario usuario2 = new Usuario("Negro", "1234", "Cesar", "Perez");

        //2
        Usuario usuario3 = new Usuario("Rodri", "1234", "Rodrigo", "sss");

        //3
        Usuario usuario4 = new Usuario("Osc", "1234", "Oscar", "Lezcano");

        //4
        Usuario usuario5 = new Usuario("Nico", "1234", "Nicolas", "fff");

        //5
        Usuario usuario6 = new Usuario("Fer", "1234", "Fernando", "ggg");

        //6
        Usuario usuario7 = new Usuario("jLopez", "1234", "Juan", "lopez");

        //7
        Usuario usuario8 = new Usuario("Juan", "1234", "juan", "pppp");


        usuarios.add(usuario1);usuarios.add(usuario2);usuarios.add(usuario3);
        usuarios.add(usuario4);usuarios.add(usuario5);usuarios.add(usuario6);
        usuarios.add(usuario7);usuarios.add(usuario8);
    }

    public List<Usuario> getUsuarios() { return usuarios; }
}