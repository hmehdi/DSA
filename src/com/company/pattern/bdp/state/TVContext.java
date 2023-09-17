package com.company.pattern.bdp.state;

public class TVContext implements State {

    public State getTvState() {
        return tvState;
    }

    public void setTvState(State tvState) {
        this.tvState = tvState;
    }

    private State tvState;


    @Override
    public void doAction() {
        this.tvState.doAction();

    }
}
