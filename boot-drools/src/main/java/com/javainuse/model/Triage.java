package com.javainuse.model;

import java.util.List;

public class Triage {
    private List<Block> blocks;
    private String decision;
    public List<Block> getBlocks() {
        return blocks;
    }
    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }
    public String getDecision() {
        return decision;
    }
    public void setDecision(String decision) {
        this.decision = decision;
    }
    
}
