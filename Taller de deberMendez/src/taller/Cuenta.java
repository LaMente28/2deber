package taller;

import java.util.Date;

public class Cuenta {
   
    private int id;
    private double saldo;
    private double interes_anual;
    private Date fecha;

   
    public Cuenta() {
        this.id = 0;
        this.saldo = 0;
        this.interes_anual = 0;
    }

    public Cuenta(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres_anual(double interes_anual) {
        return interes_anual /100;
    }

    public void setInteres_anual(double interes_anual) {
        this.interes_anual = interes_anual;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public double getInteres_mensual (){
        return saldo*0.045;
    }
    
    public double retiro(double retiro){
        return saldo = saldo - retiro;
    }
    
    public double deposito(double deposito){
        return saldo = saldo + deposito;
    }
    
    public static void main (String[]args){
        Cuenta ct = new Cuenta(1122,20.000);
        System.out.println("EL INTERES ANUAL ES:"+ct.getInteres_anual(4.5));
        System.out.println("EL RETIRO ES: "+ct.retiro(2.500));
        System.out.println("EL DEPOSITO ES: "+ct.deposito(3.000));
        System.out.println("EL INTERES MENSUAL ES: "+ct.getInteres_mensual());
        System.out.println("LA FECHA DE CREACION ES: "+ct.fecha);
        
    }
}
