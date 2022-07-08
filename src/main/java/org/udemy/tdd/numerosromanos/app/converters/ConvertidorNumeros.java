package org.udemy.tdd.numerosromanos.app.converters;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ConvertidorNumeros implements IConvertidorNumeros {
    private Map<Integer,String> referenciaConversion = new HashMap<>();

    public ConvertidorNumeros(){
        this.referenciaConversion.put(1,"I");
        this.referenciaConversion.put(5,"V");
        this.referenciaConversion.put(10,"X");
        this.referenciaConversion.put(50,"L");
        this.referenciaConversion.put(100,"C");
        this.referenciaConversion.put(500,"D");
        this.referenciaConversion.put(1000,"M");
    }

    @Override
    public String convertirANumeroRomano(int numeroNatural) {
        String romanNumber = "";
        if(numeroNatural > 0 && numeroNatural < 4000){
            char[] digits = String.valueOf(numeroNatural).toCharArray();
            int weight=0;
            for (int i= digits.length-1;i>=0;i--){
                romanNumber = assignLetter(Integer.parseInt(String.valueOf(digits[i])),weight) + romanNumber;
                weight++;
            }
        }
        return romanNumber;
    }

    private String assignLetter(int digit, int weight){
        String result = "";
        int multiplier = getMultiplier(weight); //1
        int digitValue = digit;
        int pivot = multiplier*5;
        String pivotLetter = this.referenciaConversion.get(pivot);
        String multiplierLetter = this.referenciaConversion.get(multiplier); //"I"
        if(digitValue == 1){
            result = multiplierLetter;
        }else if(digitValue == 5){
            result = pivotLetter;
        }else if(digitValue%5 == 4 && digitValue < 5){
            result = multiplierLetter + pivotLetter;
        }else if(digitValue%5 == 4 && digitValue > 5){
            result = multiplierLetter + getCompoundLetter(digitValue,multiplier);
        }else{
            result = getIncrementalLetters(multiplierLetter,digitValue,pivotLetter);
        }
        return result;
    }

    private String getCompoundLetter(int digit, int multiplier){
        String nextLetter = this.referenciaConversion.get(multiplier*10);
        return nextLetter;
    }

    private String getIncrementalLetters(String letter, int times, String pivotLetter){
        String result = "";
        if(times > 5){
            result = pivotLetter;
            times -= 5;
        }
        for(int i=0; i< times;i++){
            result+=letter;
        }
        return result;
    }

    private int getMultiplier(int weight){
        int i=0;
        int result=1;
        while (i<weight){
            result = result*10;
            i++;
        }

        return result;
    }
}
