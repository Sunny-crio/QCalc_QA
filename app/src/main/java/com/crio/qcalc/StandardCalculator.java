package com.crio.qcalc;

public class StandardCalculator {

         double num1;
         double num2;
       private double result;
    
public double getResult() {

    return result;

}



public void setResult(double value) {

    if (value == 0)

        return;

       

    this.result = value;
    

}

// public void printResult(){

//     System.out.println("Standard Calculator Result:"+ value);

// }
public double add(double num1, double num2)
    {
        double val1= num1+num2;
        
        setResult(val1);
        return (num1+num2);
        
    }

public double subtract(double num1, double num2)
{

    double val2= num1- num2;
    setResult(val2);
    return (num1-num2);
}


public double multiply(double num1, double num2)
{
    double val3= num1*num2;
    setResult(val3);
    return (num1*num2);
}

// public void clearResult() {

//     result = 0;

// }

public double divide(double num1, double num2)
{
    if (num2==0){
        return 0;
    }
    double val4= num1/num2;
        setResult(val4);
        return num1/num2;
       

    }


    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }






}