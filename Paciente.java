import java.util.ArrayList;

public class Paciente extends Usuario {
	ArrayList<Authorization> authorizedExams = new ArrayList<>();

	public Paciente(String id, String nome, String tipo) {
		super(id, nome, tipo);
	}

	public void setAuthorizedExams(Authorization Exam) {
		this.authorizedExams.add(Exam);
	}
}
