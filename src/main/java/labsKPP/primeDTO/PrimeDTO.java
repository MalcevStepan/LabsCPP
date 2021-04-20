package labsKPP.primeDTO;

import java.util.Objects;

public class PrimeDTO {
    private int value;

    public PrimeDTO(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PrimeDTO primeDTO = (PrimeDTO) obj;
        return value == primeDTO.getValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
