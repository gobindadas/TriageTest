package com.javainuse.model;

public class Block {
    private String blockName;
    private String question;
    private String answer;
    
    public String getQuestion() {
        return question;
    }
    public String getAnswer() {
        return answer;
    }
    
    public void setQuestion(String question) {
        this.question = question;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public String getBlockName() {
        return blockName;
    }
    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }
    
}
