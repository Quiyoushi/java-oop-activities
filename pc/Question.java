package pc;

class Question {
    private String question;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public boolean checkAnswer(String userAnswer) {
        return answer.equalsIgnoreCase(userAnswer);
    }

    public String getAnswer() {
        return answer;
    }
}
