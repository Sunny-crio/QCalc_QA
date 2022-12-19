package com.crio.qcalc;

public class StandardCalculator {

         int num1;
         int num2;
       private int result;
    
public int getResult() {

    return result;

}



public void setResult(int value) {

    if (value == 0)

        return;

       

    this.result = value;
    

}

// public void printResult(){

//     System.out.println("Standard Calculator Result:"+ value);

// }
public int add(int num1, int num2)
    {
        int val1= num1+num2;
        setResult(val1);
        return (num1+num2);
        
    }

public int subtract(int num1, int num2)
{

    int val2= num1- num2;
    setResult(val2);
    return (num1-num2);
}


public int multiply(int num1, int num2)
{
    int val3= num1*num2;
    setResult(val3);
    return (num1*num2);
}

// public void clearResult() {

//     result = 0;

// }

public int divide(int num1, int num2)
{
    if (num2==0){
        return 0;
    }
        int val4= num1/num2;
        setResult(val4);
        return num1/num2;
       

    }


    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }






}
