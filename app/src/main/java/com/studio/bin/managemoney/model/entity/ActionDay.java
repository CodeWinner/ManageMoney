package com.studio.bin.managemoney.model.entity;

import java.util.Date;

public class ActionDay {
    private int idAction;
    private int idWorkOfMounth;
    private double moneyGoalOfDay;
    private Date actionDate;
    private int status;

    public ActionDay() {
    }

    public int getIdAction() {
        return idAction;
    }

    public void setIdAction(int idAction) {
        this.idAction = idAction;
    }

    public int getIdWorkOfMounth() {
        return idWorkOfMounth;
    }

    public void setIdWorkOfMounth(int idWorkOfMounth) {
        this.idWorkOfMounth = idWorkOfMounth;
    }

    public double getMoneyGoalOfDay() {
        return moneyGoalOfDay;
    }

    public void setMoneyGoalOfDay(double moneyGoalOfDay) {
        this.moneyGoalOfDay = moneyGoalOfDay;
    }

    public Date getActionDate() {
        return actionDate;
    }

    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
