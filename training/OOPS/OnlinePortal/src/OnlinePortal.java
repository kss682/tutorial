import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * 	OnlinePortal will contain the questions, topics  and categories.
 * 	Each question will belong to a particular topic and category.
 * 	Category - MCQ, para, etc.
 */

public class OnlinePortal {
	private Map<Integer, MCQ> mcqList = new HashMap<Integer, MCQ>();
	private Map<Integer, ParagraphQuestion> pqList = new HashMap<Integer, ParagraphQuestion>();
	private List<Topic> topicList = new ArrayList<Topic>();
	private List<Category> categoryList = new ArrayList<Category>();

	public void createNewQuestion(String topicName, String categoryName, String question, String optionA,
			String optionB, String optionC) {
		Topic topic = null;
		Category category = null;
		for (Topic tp : topicList) {
			if (tp.getTopicName().contentEquals(topicName)) {
				topic = tp;
				break;
			}
		}

		for (Category cat : categoryList) {
			if (cat.getCategoryName().contentEquals(categoryName)) {
				category = cat;
				break;
			}
		}

		mcqList.put(Question.getQuestionCount() + 1, new MCQ(question, topic, category, optionA, optionB, optionC));
	}

	public void creatNewQuestion(String topicName, String categoryName, String question) {
		Topic topic = null;
		Category category = null;
		for (Topic tp : topicList) {
			if (tp.getTopicName().contentEquals(topicName)) {
				topic = tp;
				break;
			}
		}

		for (Category cat : categoryList) {
			if (cat.getCategoryName().contentEquals(categoryName)) {
				category = cat;
				break;
			}
		}
		pqList.put(Question.getQuestionCount() + 1, new ParagraphQuestion(question, topic, category));

	}

	public void createNewTopic(String topicName) {
		topicList.add(new Topic(topicName));
		System.out.printf("Topic %s added\n", topicName);
	}

	public void createNewCategory(String categoryName) {
		categoryList.add(new Category(categoryName));
		System.out.printf("Category %s added\n", categoryName);
	}

	public void listAllQuestions() {
		MCQ mcq = null;
		ParagraphQuestion pq = null;
		for (int i = 1; i <= Question.getQuestionCount(); i++) {
			if (mcqList.containsKey(i)) {
				mcq = mcqList.get(i);
				displayQuestion(mcq.getQuestionID(), mcq.getTopic().getTopicName(), mcq.getCategory().getCategoryName(),
						mcq.getQuestion());
				System.out.print("\nOptions");
				System.out.printf("%s", mcq.getOptions());
			} else if (pqList.containsKey(i)) {
				pq = pqList.get(i);
				displayQuestion(pq.getQuestionID(), pq.getTopic().getTopicName(), pq.getCategory().getCategoryName(),
						pq.getQuestion());
			}
		}
	}

	public void listQuestionByFilter(String topicName) {
		for (int i = 1; i <= Question.getQuestionCount(); i++) {
			if (mcqList.containsKey(i)) {
				MCQ mcq = mcqList.get(i);
				if (mcq.getTopic().getTopicName().contentEquals(topicName)) {
					displayQuestion(mcq.getQuestionID(), mcq.getTopic().getTopicName(),
							mcq.getCategory().getCategoryName(), mcq.getQuestion());
					System.out.println("\nOptions");
					System.out.printf("%s", mcq.getOptions());
				}
			} else {
				ParagraphQuestion pq = pqList.get(i);
				if (pq.getTopic().getTopicName().contentEquals(topicName)) {
					displayQuestion(pq.getQuestionID(), pq.getTopic().getTopicName(),
							pq.getCategory().getCategoryName(), pq.getQuestion());
				}
			}
		}
	}

	public void listQuestionByFilter(String topicName, String categoryName) {
		for (int i = 1; i <= Question.getQuestionCount(); i++) {
			if (mcqList.containsKey(i)) {
				MCQ mcq = mcqList.get(i);
				if (mcq.getTopic().getTopicName().contentEquals(topicName)
						&& mcq.getCategory().getCategoryName().contentEquals(categoryName)) {
					displayQuestion(mcq.getQuestionID(), mcq.getTopic().getTopicName(),
							mcq.getCategory().getCategoryName(), mcq.getQuestion());
					System.out.println("\nOptions");
					System.out.printf("%s", mcq.getOptions());
				}
			} else {
				ParagraphQuestion pq = pqList.get(i);
				if (pq.getTopic().getTopicName().contentEquals(topicName)
						&& pq.getCategory().getCategoryName().contentEquals(categoryName)) {
					displayQuestion(pq.getQuestionID(), pq.getTopic().getTopicName(),
							pq.getCategory().getCategoryName(), pq.getQuestion());
				}
			}
		}
	}

	public boolean checkTopicInPortal(String topicName) {
		for (Topic topic : topicList) {
			if (topic.getTopicName().contentEquals(topicName)) {
				return true;
			}
		}
		return false;
	}

	public boolean checkCatInPortal(String CateName) {
		for (Category cat : categoryList) {
			if (cat.getCategoryName().contentEquals(CateName)) {
				return true;
			}
		}
		return false;
	}

	public void displayQuestion(int questionId, String topicName, String categoryName, String question) {
		System.out.printf("Question No: %d\n", questionId);
		System.out.printf("Topic: %s\n", topicName);
		System.out.printf("Category: %s\n", categoryName);
		System.out.printf("%s\n\n", question);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlinePortal onlinePortal = new OnlinePortal();
		int opt;
		String topicName, categoryName, question, optionA, optionB, optionC;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Menu");
			System.out.println("1.Create new Question \n2.Create new Topic \n3.Create new Category "
					+ "\n4.List all questions \n5.List questions by topic \n6.List questions by topic and category \n7.Get question count \n8.Exit");
			System.out.println("Select one of the above options");
			opt = sc.nextInt();
			if (opt == 8) {
				break;
			}
			switch (opt) {
			case 1:
				System.out.println("Enter new question");
				System.out.println("Enter the topic for the question");
				topicName = sc.next();
				if (onlinePortal.checkTopicInPortal(topicName) == false) {
					onlinePortal.createNewTopic(topicName);
				}
				System.out.println("Enter the category for the question");
				categoryName = sc.next();
				if (onlinePortal.checkCatInPortal(categoryName) == false) {
					onlinePortal.createNewCategory(categoryName);
				}
				System.out.println("Enter the question");
				sc.nextLine();
				question = sc.nextLine();
				if (categoryName.contentEquals("MCQ")) {
					System.out.println("Enter option A");
					optionA = sc.nextLine();
					System.out.println("Enter option B");
					optionB = sc.nextLine();
					System.out.println("Enter option C");
					optionC = sc.nextLine();
					onlinePortal.createNewQuestion(topicName, categoryName, question, optionA, optionB, optionC);
				} else {
					onlinePortal.creatNewQuestion(topicName, categoryName, question);
				}
				break;

			case 2:
				System.out.println("Enter new topic");
				topicName = sc.next();
				onlinePortal.createNewTopic(topicName);
				break;
			case 3:
				System.out.println("Enter new category");
				categoryName = sc.next();
				onlinePortal.createNewCategory(categoryName);
				break;

			case 4:
				onlinePortal.listAllQuestions();
				break;

			case 5:
				System.out.println("Enter topic to filter:");
				topicName = sc.next();
				onlinePortal.listQuestionByFilter(topicName);
				break;

			case 6:
				System.out.println("Enter topic to filter:");
				topicName = sc.next();
				System.out.println("Enter category to filter:");
				categoryName = sc.next();
				onlinePortal.listQuestionByFilter(topicName, categoryName);
				break;

			case 7:
				System.out.printf("Question count: %d\n", Question.getQuestionCount());
			}

		}
	}

}
