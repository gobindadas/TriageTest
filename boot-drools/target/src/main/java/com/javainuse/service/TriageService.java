package com.javainuse.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javainuse.model.Triage;

@Service
public class TriageService {
    
    private final KieContainer kieContainer;

    @Autowired
    public TriageService(KieContainer kieContainer){
        this.kieContainer = kieContainer;
    }

    public Triage getDecision(Triage triage){
        KieSession kieSession = kieContainer.newKieSession("rulesSession");
        kieSession.insert(triage);
        kieSession.fireAllRules();
        kieSession.dispose();
        return triage;
    }
}
