package ro.fasttrack.proiectIMC.IMC.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Imc {
    @Id
    @GeneratedValue
    private Integer id;
    private String nume;
    private double inaltime;
    private int greutate;
    private double rezultat;

    public Imc() {

    }

    public Imc(String nume, double inaltime, int greutate, double rezultat) {
        this.nume = nume;
        this.inaltime = inaltime;
        this.greutate = greutate;
        this.rezultat = rezultat;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getInaltime() {
        return inaltime;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    public int getGreutate() {
        return greutate;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    public double getRezultat() {
        return rezultat;
    }

    public void setRezultat(double rezultat) {
        this.rezultat = rezultat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Imc imc = (Imc) o;
        return Double.compare(imc.inaltime, inaltime) == 0 &&
                greutate == imc.greutate &&
                Double.compare(imc.rezultat, rezultat) == 0 &&
                Objects.equals(id, imc.id) &&
                Objects.equals(nume, imc.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nume, inaltime, greutate, rezultat);
    }

    @Override
    public String toString() {
        return "IMC{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", inaltime=" + inaltime +
                ", greutate=" + greutate +
                ", rezultat=" + rezultat +
                '}';
    }
}
