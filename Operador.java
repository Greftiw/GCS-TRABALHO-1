import java.util.ArrayList;

public class Operador {
    private ArrayList<Usuario> usuario;

    public Operador() {
        usuario = new ArrayList<Usuario>();
    }

    public void cadastraUsuario(Usuario user){
        usuario.add(user);
    }

    public Usuario escolheUser(String id){
        for (Usuario usuarios: usuario ){
            if (usuarios.getId().equals(id)){
                return usuarios;
            }
        }
        return null;
    }

    public void listaUser() {
        for (Usuario usuarios : usuario) {
            System.out.println(usuarios.getId()+","+usuarios.getNome()+ ","+usuarios.getTipo());
        }
    }


}