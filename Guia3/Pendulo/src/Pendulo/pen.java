package Pendulo;

    public class pen {

        private double longitud;
        public double aceleracionGravitacional;

        public pen(double longitud, double aceleracionGravitacional) {
            this.aceleracionGravitacional = aceleracionGravitacional;
            this.longitud = longitud;
        }

    public void setLongitud(double l) {
        this.longitud = l;
    }
    public void setAceleracionGravitacional(double a) {
        this.aceleracionGravitacional = a;
    }
    public double getLongitud() {
        return this.longitud;
    }
    public double getAceleracionGravitacional() {
        return this.aceleracionGravitacional;
    }

    public void calcularUno() {
        double resultado = 0;

        if(this.aceleracionGravitacional/this.longitud >= 0) {
            if(this.longitud != 0 ) {
                resultado = (2 * Math.PI) * (Math.sqrt(this.aceleracionGravitacional/this.longitud));
                System.out.println(resultado);
            }else {
                System.out.println("Hubo una division por cero lo cual genero un error");
            }
        }else {
            System.out.println("No se puede realizar la operacion");
        }

    }

}
