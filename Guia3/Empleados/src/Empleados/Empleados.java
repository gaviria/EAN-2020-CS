package Empleados;

public class Empleados {

        private String name;
        private String department;
        private String position;
        private double salary;

        public Empleados(String name, String department, String position, double salary) {
            this.name = name;
            this.department = department;
            this.position = position;
            this.salary = salary;
        }

        @Override
        public String toString() {
            System.out.println("--------------------------------------------------");
            System.out.println("Nombre: " + name);
            System.out.println("Departamento: " + department);
            System.out.println("Posición: " + position);
            System.out.println("Salario: " + salary);
            System.out.println("--------------------------------------------------");
            return super.toString();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
}
