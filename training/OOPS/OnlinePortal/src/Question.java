
public class Question {
	private static int QUESTION_COUNT = 0;
	private int questionId;
	private String question;
	private Topic topic;
	private Category category;

	Question(String question, Topic topic, Category category) {
		QUESTION_COUNT++;
		this.questionId = QUESTION_COUNT;
		this.question = question;
		this.topic = topic;
		this.category = category;
	}

	public int getQuestionID() {
		return questionId;
	}

	public String getQuestion() {
		return question;
	}

	public Topic getTopic() {
		return topic;
	}

	public Category getCategory() {
		return category;
	}

	public static int getQuestionCount() {
		return QUESTION_COUNT;
	}
}
