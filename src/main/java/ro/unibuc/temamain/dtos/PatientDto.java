package ro.unibuc.temamain.dtos;

import java.util.Objects;

public final class PatientDto {

    private final String name;
    private final long cnp;

    public PatientDto(String name, long cnp) {
        this.name = name;
        this.cnp = cnp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientDto that = (PatientDto) o;
        return cnp == that.cnp && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cnp);
    }

    public String getName() {
        return name;
    }

    public long getCnp() {
        return cnp;
    }

    @Override
    public String toString() {
        return "PatientDto{" +
                "name='" + name + '\'' +
                ", cnp=" + cnp +
                '}';
    }
}
