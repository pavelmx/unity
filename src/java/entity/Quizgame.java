/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author павел
 */
@Entity
@Table(name = "quizgame")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Quizgame.findAll", query = "SELECT q FROM Quizgame q")
    , @NamedQuery(name = "Quizgame.findById", query = "SELECT q FROM Quizgame q WHERE q.id = :id")
    , @NamedQuery(name = "Quizgame.findByTextQuestion", query = "SELECT q FROM Quizgame q WHERE q.textQuestion = :textQuestion")
    , @NamedQuery(name = "Quizgame.findByTextAnswer1", query = "SELECT q FROM Quizgame q WHERE q.textAnswer1 = :textAnswer1")
    , @NamedQuery(name = "Quizgame.findByTextAnswer2", query = "SELECT q FROM Quizgame q WHERE q.textAnswer2 = :textAnswer2")
    , @NamedQuery(name = "Quizgame.findByTextAnswer3", query = "SELECT q FROM Quizgame q WHERE q.textAnswer3 = :textAnswer3")})
public class Quizgame implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "TextQuestion")
    private String textQuestion;
    @Column(name = "TextAnswer1")
    private String textAnswer1;
    @Column(name = "TextAnswer2")
    private String textAnswer2;
    @Column(name = "TextAnswer3")
    private String textAnswer3;

    public Quizgame() {
    }

    public Quizgame(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTextQuestion() {
        return textQuestion;
    }

    public void setTextQuestion(String textQuestion) {
        this.textQuestion = textQuestion;
    }

    public String getTextAnswer1() {
        return textAnswer1;
    }

    public void setTextAnswer1(String textAnswer1) {
        this.textAnswer1 = textAnswer1;
    }

    public String getTextAnswer2() {
        return textAnswer2;
    }

    public void setTextAnswer2(String textAnswer2) {
        this.textAnswer2 = textAnswer2;
    }

    public String getTextAnswer3() {
        return textAnswer3;
    }

    public void setTextAnswer3(String textAnswer3) {
        this.textAnswer3 = textAnswer3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quizgame)) {
            return false;
        }
        Quizgame other = (Quizgame) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Quizgame[ id=" + id + " ]";
    }
    
}
