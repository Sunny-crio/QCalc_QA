package com.crio.qcalc;

public class ScientificCalculator extends StandardCalculator{
   

    public static void getVersion(){
        System.out.println("Scientific Calculator 1.0");
    }


    private double a;

    public double sin(double a){
        result = Math.sin(a);
        return result;
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double cos(double a){
        result = Math.cos(a);
        return result;
    }
    public double square(double a){
       return result = multiply(a,a);
    }
    
public double tan(double a){
    result = Math.sin(a)/Math.cos(a);
   // System.out.println(result);
   return result;
}


public double log(double a){
return result = Math.log(a);
    

}


public double sqrt(double a){
  return  result = Math.sqrt(a);

}


public double cbrt(double a){
    return result = Math.cbrt(a);

}
@Override

public void printResult(){

    System.out.println("Scientific Calculator Result:"+ result );

}

}
