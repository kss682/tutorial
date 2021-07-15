
public class MCQ extends Question {
	private String optionA;
	private String optionB;
	private String optionC;
	private String answer;

	MCQ(String question, Topic topic, Category category, String optionA, String optionB, String optionC) {
		super(question, topic, category);
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.answer = "";
	}

	public String getOptions() {
		String options = "A.";
		options = options + optionA + "\tB." + optionB + "\tC." + optionC + "\n\n";
		return options;
	}

	public boolean validateAnswer(String response) {
		return answer.contentEquals(response);
	}
}
