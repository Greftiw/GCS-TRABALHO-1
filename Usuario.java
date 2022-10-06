import java.util.ArrayList;

public class Usuario {
    private String id;
    private String nome;
    private String tipo;
    private ArrayList<Medico> medico;
    private ArrayList<Paciente> paciente;
    private ArrayList<Administrador> administrador;

    public Usuario(String id, String nome, String tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
