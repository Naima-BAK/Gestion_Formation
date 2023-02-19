package service;

import Bean.Formation;
import Controller.FormationController;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Inject;

public class FormationFacade {

    Formation current;
    @Inject
    @EJB
    private FormationController formationController;

    @PostConstruct
    public void init() {
        current = new Formation();
    }
    public Formation getCurrent() {
        return current;
    }

    public void setCurrent(Formation current) {
        this.current = current;
    }

    public FormationFacade() {
    }

    public Formation createFormation(Formation formation) {
        this.formationController.current=current;
        return this.formationController.createFormation(formation);
    }


}
