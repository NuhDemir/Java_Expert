package riddle_game;

public class Riddle {

    private String question;
    private String answer;
    private String hint;

    public Riddle(String question,String answer,String hint){
        this.question=question;
        this.answer=answer;
        this.hint=hint;
    }

    public String getQuestion(){
        return question;
    }

    public String getAnswer(){
        return answer;
    }

    public String getHint(){
        return hint;
    }
}
