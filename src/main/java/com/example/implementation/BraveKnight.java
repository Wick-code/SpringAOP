package com.example.implementation;

import com.example.service.Knight;
import com.example.service.Quest;

public class BraveKnight implements Knight {
    Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    public void embarkOnQuest(){
        quest.embark();
    }
}
