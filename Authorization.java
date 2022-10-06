public class Authorization {
	private int id;
	private String date;
	private String doctorsName;
	private String patientsName;
	private String exam;

	public Authorization(int id, String date, String doctorsName, String patientsName, String exam) {
		this.id = id;
		this.date = date;
		this.doctorsName = doctorsName;
		this.patientsName = patientsName;
		this.exam = exam;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDoctorsName() {
		return this.doctorsName;
	}

	public void setDoctorsName(String doctorsName) {
		this.doctorsName = doctorsName;
	}

	public String getPatientsName() {
		return this.patientsName;
	}

	public void setPatientsName(String patientsName) {
		this.patientsName = patientsName;
	}

	public String getExam() {
		return this.exam;
	}

	public void setExam(String exam) {
		this.exam = exam;
	}

}
