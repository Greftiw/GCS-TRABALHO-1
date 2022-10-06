import java.util.ArrayList;

public class Medico extends Usuario {
	private ArrayList<Authorization> authorizations = new ArrayList<>();

	public Medico(String id, String nome, String tipo) {
		super(id, nome, tipo);
	}

}