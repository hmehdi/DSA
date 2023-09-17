package com.company.pattern.bdp.state;

public class TVStartState implements State {

    @Override
    public void doAction(){
        System.out.println("TV is turned ON");
    }
}


