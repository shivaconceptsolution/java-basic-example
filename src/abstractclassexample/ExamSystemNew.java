package abstractclassexample;

public class ExamSystemNew extends ExamSystem {

	void examPattern()
    {
		super.examPattern();
    	System.out.println("Grade System");
    }
	public static void main(String[] args) {
		ExamSystem obj = new ExamSystemNew();
		obj.timeDuration();
		obj.examPattern();

	}

}
