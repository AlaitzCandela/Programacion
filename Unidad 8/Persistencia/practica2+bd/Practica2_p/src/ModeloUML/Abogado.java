/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloUML;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alaitzutzu
 */
@Entity
@Table(name = "abogado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Abogado.findAll", query = "SELECT a FROM Abogado a")
    , @NamedQuery(name = "Abogado.findByDni", query = "SELECT a FROM Abogado a WHERE a.dni = :dni")
    , @NamedQuery(name = "Abogado.findByNombre", query = "SELECT a FROM Abogado a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Abogado.findByApellido", query = "SELECT a FROM Abogado a WHERE a.apellido = :apellido")
    , @NamedQuery(name = "Abogado.findByDireccion", query = "SELECT a FROM Abogado a WHERE a.direccion = :direccion")})
public class Abogado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Dni")
    private String dni;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "Apellido")
    private String apellido;
    @Basic(optional = false)
    @Column(name = "Direccion")
    private String direccion;
    @JoinTable(name = "abogadocaso", joinColumns = {
        @JoinColumn(name = "DniAbogado", referencedColumnName = "Dni")}, inverseJoinColumns = {
        @JoinColumn(name = "NumExp", referencedColumnName = "NumExp")})
    @ManyToMany
    private List<Casojuicio> casojuicioList;

    public Abogado() {
    }

    public Abogado(String dni) {
        this.dni = dni;
    }

    public Abogado(String dni, String nombre, String apellido, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @XmlTransient
    public List<Casojuicio> getCasojuicioList() {
        return casojuicioList;
    }

    public void setCasojuicioList(List<Casojuicio> casojuicioList) {
        this.casojuicioList = casojuicioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dni != null ? dni.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Abogado)) {
            return false;
        }
        Abogado other = (Abogado) object;
        if ((this.dni == null && other.dni != null) || (this.dni != null && !this.dni.equals(other.dni))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ModeloUML.Abogado[ dni=" + dni + " ]";
    }
    
}
