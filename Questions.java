public class Questions {
    private int id;
    private String question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private int opt1_id;
    private int opt2_id;
    private int opt3_id;
    private int opt4_id;
    private int answer;
    public int getId() {
        return id;
    }
    
    public Questions(int id, String question, int opt1_id,String opt1,int opt2_id, String opt2,int opt3_id, String opt3,int opt4_id, String opt4, int answer) {
        this.id = id;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.opt1_id = opt1_id;
        this.opt2_id = opt2_id;
        this.opt3_id = opt3_id;
        this.opt4_id = opt4_id;
        this.answer = answer;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getOpt1() {
        return opt1;
    }
    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }
    public String getOpt2() {
        return opt2;
    }
    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }
    public String getOpt3() {
        return opt3;
    }
    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }
    public String getOpt4() {
        return opt4;
    }
    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }
    
    public int getOpt1_id() {
        return opt1_id;
    }

    public void setOpt1_id(int opt1_id) {
        this.opt1_id = opt1_id;
    }

    public int getOpt2_id() {
        return opt2_id;
    }

    public void setOpt2_id(int opt2_id) {
        this.opt2_id = opt2_id;
    }

    public int getOpt3_id() {
        return opt3_id;
    }

    public void setOpt3_id(int opt3_id) {
        this.opt3_id = opt3_id;
    }

    public int getOpt4_id() {
        return opt4_id;
    }

    public void setOpt4_id(int opt4_id) {
        this.opt4_id = opt4_id;
    }

    public int getAnswer() {
        return answer;
    }
    public void setAnswer(int answer) {
        this.answer = answer;
    }
     
}
