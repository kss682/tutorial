
public class ParagraphQuestion extends Question{
	private String longAnswer;
	
	ParagraphQuestion(String question, Topic topic, Category category){
		super(question, topic, category);
		this.longAnswer = "";
	}

	public boolean validateAnswer(String response) {
		return longAnswer.contentEquals(response);
	}
}
