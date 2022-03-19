package src.main;

public class AtributosImposto {
    private double aliquota;
    private double deducao;

    public AtributosImposto(double salario){
        if (salario >= 0.00 && salario <= 1903.98) {
            this.aliquota = 1;
            this.deducao = 0;
        }
        if (salario >= 1903.99 && salario <= 2826.65) {
            this.aliquota = 0.075;
            this.deducao = 142.80;
          }
        if (salario >= 2826.66 && salario <= 3751.05) {
            this.aliquota = 0.15;
            this.deducao = 354.80;
        }
        if (salario >= 3751.06 && salario <= 4664.68) {
            this.aliquota = 0.225;
            this.deducao = 636.13;
        }
        if (salario > 4664.68) {
            this.aliquota = 0.275;
            this.deducao = 869.36;
        }
    }

    public double getAliquota(){
        return this.aliquota;
    }

    public double getDeducao() {
        return this.deducao;
    }
}
