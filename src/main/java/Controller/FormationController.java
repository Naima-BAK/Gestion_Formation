package Controller;

import Bean.Formation;
import service.FormationFacade;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;
@ManagedBean
@SessionScoped
public class FormationController extends BaseControl{


    List<Formation> formations;
    public Formation current;
    @EJB
    private FormationFacade formationFacade;

    @PostConstruct
    public void init() {
        current = new Formation();
    }

    public FormationController() {
    }

    public FormationController(Formation current) {
        this.current = current;
    }

    public List<Formation> getFormations() {
        formations = this.findAll();
        return formations;
    }

    public String prepareView(Formation formation) {
        current = formation;
        return "View";
    }

    public String prepareEdit(Formation formation) {
        current = formation;
        return "Edit";
    }

    public String destroy(Formation formation) {
        this.remove(formation);
        return "List";
    }


    public Formation getCurrent() {
        return current;
    }

    public void setCurrent(Formation current) {
        this.current = current;
    }


    public Formation createFormation(final Formation formation) {
        return this.insert(formation);
    }

    public void removeFormation(final Formation formation) {
        this.remove(formation);
    }

    public void editFormation(final Formation formation) {
        this.edit(formation);
    }


}
