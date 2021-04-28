/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloUML;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alaitzutzu
 */
@Entity
@Table(name = "casojuicio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Casojuicio.findAll", query = "SELECT c FROM Casojuicio c")
    , @NamedQuery(name = "Casojuicio.findByNumExp", query = "SELECT c FROM Casojuicio c WHERE c.numExp = :numExp")
    , @NamedQuery(name = "Casojuicio.findByFechaInicio", query = "SELECT c FROM Casojuicio c WHERE c.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Casojuicio.findByFechaFin", query = "SELECT c FROM Casojuicio c WHERE c.fechaFin = :fechaFin")
    , @NamedQuery(name = "Casojuicio.findByEstado", query = "SELECT c FROM Casojuicio c WHERE c.estado = :estado")
    , @NamedQuery(name = "Casojuicio.findByDniCliente", query = "SELECT c FROM Casojuicio c WHERE c.dniCliente = :dniCliente")})
public class Casojuicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NumExp")
    private Integer numExp;
    @Basic(optional = false)
    @Column(name = "FechaInicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "FechaFin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Basic(optional = false)
    @Column(name = "Estado")
    private String estado;
    @Basic(optional = false)
    @Column(name = "DniCliente")
    private String dniCliente;
    @ManyToMany(mappedBy = "casojuicioList")
    private List<Abogado> abogadoList;

    public Casojuicio() {
    }

    public Casojuicio(Integer numExp) {
        this.numExp = numExp;
    }

    public Casojuicio(Integer numExp, Date fechaInicio, String estado, String dniCliente) {
        this.numExp = numExp;
        this.fechaInicio = fechaInicio;
        this.estado = estado;
        this.dniCliente = dniCliente;
    }

    public Integer getNumExp() {
        return numExp;
    }

    public void setNumExp(Integer numExp) {
        this.numExp = numExp;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    @XmlTransient
    public List<Abogado> getAbogadoList() {
        return abogadoList;
    }

    public void setAbogadoList(List<Abogado> abogadoList) {
        this.abogadoList = abogadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numExp != null ? numExp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Casojuicio)) {
            return false;
        }
        Casojuicio other = (Casojuicio) object;
        if ((this.numExp == null && other.numExp != null) || (this.numExp != null && !this.numExp.equals(other.numExp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ModeloUML.Casojuicio[ numExp=" + numExp + " ]";
    }
    
}
