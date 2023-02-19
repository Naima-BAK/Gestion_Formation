package Bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "formation")
public class Formation {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "nom", nullable = false)
    private String nom;
    @Column(name = "dateDebut", nullable = false)
    private Date dateDebut;
    @Column(name = "dateFin", nullable = false)
    private Date dateFin;
    @Column(name = "prix", nullable = false)
    private String prix;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "formateur", nullable = false)
    private String formateur;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormateur() {
        return formateur;
    }

    public void setFormateur(String formateur) {
        this.formateur = formateur;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
    public Date getDateDebut() {
        return dateDebut;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }
}