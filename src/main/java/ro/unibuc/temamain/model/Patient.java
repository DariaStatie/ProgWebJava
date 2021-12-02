package ro.unibuc.temamain.model;

import java.util.Objects;

public class Patient {
    private final Integer id;
    private final String name;
    private final long cnp;

    public Patient(Integer id, String name, long cnp) {
        this.id = id;
        this.name = name;
        this.cnp = cnp;
    }

    public Patient(String name, long cnp) {
        this (null, name, cnp);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return cnp == patient.cnp && Objects.equals(id, patient.id) && Objects.equals(name, patient.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cnp);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getCnp() {
        return cnp;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cnp=" + cnp +
                '}';
    }
}
