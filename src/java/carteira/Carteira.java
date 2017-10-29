/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carteira;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author maico
 */
@Entity
@Table(name = "carteira")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carteira.findAll", query = "SELECT c FROM Carteira c"),
    @NamedQuery(name = "Carteira.findById", query = "SELECT c FROM Carteira c WHERE c.id = :id"),
    @NamedQuery(name = "Carteira.findByNome", query = "SELECT c FROM Carteira c WHERE c.nome = :nome"),
    @NamedQuery(name = "Carteira.findByRg", query = "SELECT c FROM Carteira c WHERE c.rg = :rg"),
    @NamedQuery(name = "Carteira.findByCurso", query = "SELECT c FROM Carteira c WHERE c.curso = :curso"),
    @NamedQuery(name = "Carteira.findBySala", query = "SELECT c FROM Carteira c WHERE c.sala = :sala"),
    @NamedQuery(name = "Carteira.findByTelefone", query = "SELECT c FROM Carteira c WHERE c.telefone = :telefone"),
    @NamedQuery(name = "Carteira.findByDeter", query = "SELECT c FROM Carteira c WHERE c.deter = :deter"),
    @NamedQuery(name = "Carteira.findByFretamento", query = "SELECT c FROM Carteira c WHERE c.fretamento = :fretamento")})
public class Carteira implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "situaco")
    private int situaco;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rg")
    private int rg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "curso")
    private String curso;
    @Size(max = 255)
    @Column(name = "sala")
    private String sala;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telefone")
    private int telefone;
    @Column(name = "deter")
    private Integer deter;
    @Column(name = "fretamento")
    private Integer fretamento;

    public Carteira() {
    }

    public Carteira(Integer id) {
        this.id = id;
    }

    public Carteira(Integer id, String nome, int rg, String curso, int telefone) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.curso = curso;
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Integer getDeter() {
        return deter;
    }

    public void setDeter(Integer deter) {
        this.deter = deter;
    }

    public Integer getFretamento() {
        return fretamento;
    }

    public void setFretamento(Integer fretamento) {
        this.fretamento = fretamento;
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
        if (!(object instanceof Carteira)) {
            return false;
        }
        Carteira other = (Carteira) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "carteira.Carteira[ id=" + id + " ]";
    }

    public int getSituaco() {
        return situaco;
    }

    public void setSituaco(int situaco) {
        this.situaco = situaco;
    }
    
}
