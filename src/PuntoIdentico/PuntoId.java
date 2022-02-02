package PuntoIdentico;

public class PuntoId {
    private Double x;
    private Double y;

    public PuntoId(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public String toString() {
        String s;
        s = "(" + getX() + "," + getY() + ")";
        return s;
    }

    public boolean equals(Object obj) {
        boolean ret = false;
        if (this == obj) {
            ret = true;
        } else {
            if (obj != null && obj instanceof PuntoId) {
                PuntoId pto = (PuntoId) obj;
                ret = this.getX().equals(pto.getX()) &&
                        this.getY().equals(pto.getY());
            }
        }
        return ret;
    }

    public int hashCode() {
        return getX().hashCode() * 31 + getY().hashCode();
    }
}

