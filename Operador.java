import java.util.ArrayList;

public class Operador {
	private ArrayList<Medico> medicos;
	private ArrayList<Paciente> pacientes;
	private ArrayList<Administrador> administradores;
	private ArrayList<Usuario> usuarios;
	private Usuario usuarioAtivo;

	public Operador() {
		medicos = new ArrayList<Medico>();
	}

	public Usuario escolheUser(String id) {
		for (Usuario usuario : usuarios) {
			if (usuario.getId().equals(id)) {
				this.usuarioAtivo = usuario;
				return this.usuarioAtivo;
			}
		}
		return null;
	}

	public void listaUser() {
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getId() + "," + usuario.getNome() + "," + usuario.getTipo());
		}
	}

	public Usuario getUsuarioAtivo() {
		return this.usuarioAtivo;
	}

	public ArrayList<Medico> getMedicos() {
		return this.medicos;
	}

	public void addMedicos(Medico medico) {
		this.medicos.add(medico);
		this.addUsuarios(medico);
	}

	public ArrayList<Paciente> getPacientes() {
		return this.pacientes;
	}

	public void addPacientes(Paciente paciente) {
		this.pacientes.add(paciente);
		this.addUsuarios(paciente);
	}

	public ArrayList<Administrador> getAdministradores() {
		return this.administradores;
	}

	public void addAdministradores(Administrador administrador) {
		this.administradores.add(administrador);
		this.addUsuarios(administrador);
	}

	public ArrayList<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void addUsuarios(Usuario usuario) {
		this.usuarios.add(usuario);
	}
}