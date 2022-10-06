import java.util.ArrayList;

public class Operador {
    private ArrayList<Usuario> usuario;

    public Operador() {
        usuario = new ArrayList<Usuario>();
    }

    public void cadastraUsuario(Usuario user){
        usuario.add(user);
    }

    public Usuario escolheUsuario(String id){
        for (Usuario usuarios: usuario ){
            if (usuarios.getId().equals(id)){
                return usuarios;
            }
        }
        return null;
    }

    public void printaUser(){
        for (int i=0;i<usuario.size();i++);
        System.out.println();
    }
}