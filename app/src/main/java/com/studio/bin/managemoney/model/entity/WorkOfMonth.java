package com.studio.bin.managemoney.model.entity;

import java.util.Date;
import java.util.List;

public class WorkOfMonth {
    private int idWork;
    private int workName;
    private double goalMoneyOfWork;
    private Date mounthOfWork;
    private List<ActionDay> actionDateds;

    /**
     * Contructor
     * */
    public WorkOfMonth(){}

    public List<ActionDay> getActionDateds() {
        return actionDateds;
    }

    public void setActionDateds(List<ActionDay> actionDateds) {
        this.actionDateds = actionDateds;
    }

    public int getIdWork() {
        return idWork;
    }

    public void setIdWork(int idWork) {
        this.idWork = idWork;
    }

    public int getWorkName() {
        return workName;
    }

    public void setWorkName(int workName) {
        this.workName = workName;
    }

    public double getGoalMoneyOfWork() {
        return goalMoneyOfWork;
    }

    public void setGoalMoneyOfWork(double goalMoneyOfWork) {
        this.goalMoneyOfWork = goalMoneyOfWork;
    }

    public Date getMounthOfWork() {
        return mounthOfWork;
    }

    public void setMounthOfWork(Date mounthOfWork) {
        this.mounthOfWork = mounthOfWork;
    }
}
