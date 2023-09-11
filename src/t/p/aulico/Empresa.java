package t.p.aulico;

import java.util.ArrayList;
import java.util.Objects;

public class Empresa {

    private String razonSocial;
    private int cuil;
    private ArrayList<Empleado> empleados;

    public Empresa(String razonSocial, int cuil, ArrayList<Empleado> empleados) {
        this.razonSocial = razonSocial;
        this.cuil = cuil;
        this.empleados = empleados;
    }

    public Empresa() {
        this.empleados = new ArrayList<Empleado>();
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void agregarEmpleado(Empleado e) {
        this.empleados.add(e);
    }

    public void mostrarEmpleado() {
        for (Empleado e : empleados) {

        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.razonSocial);
        hash = 89 * hash + this.cuil;
        hash = 89 * hash + Objects.hashCode(this.empleados);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        if (this.cuil != other.cuil) {
            return false;
        }
        if (!Objects.equals(this.razonSocial, other.razonSocial)) {
            return false;
        }
        if (!Objects.equals(this.empleados, other.empleados)) {
            return false;
        }
        return true;
    }
}
