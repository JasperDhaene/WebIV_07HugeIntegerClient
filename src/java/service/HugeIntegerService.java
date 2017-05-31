/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author jasper
 */
public class HugeIntegerService {

    public String calculateHugeIntegers(String first, String second, String operation) {
        switch (operation) {
            case "+":
                return add(first, second);
            case "-":
                return subtract(first, second);
        }
        return "";
    }
    
    //HOW TO DO:
    //Selecteer een operation onder Web Service References en sleep ze in deze klasse.
    //Kan ook via "insert code" > "call web service operation..."
    
    private static String add(java.lang.String first, java.lang.String second) {
        service.HugeInteger_Service service = new service.HugeInteger_Service();
        service.HugeInteger port = service.getHugeIntegerPort();
        return port.add(first, second);
    }

    private static boolean bigger(java.lang.String first, java.lang.String second) {
        service.HugeInteger_Service service = new service.HugeInteger_Service();
        service.HugeInteger port = service.getHugeIntegerPort();
        return port.bigger(first, second);
    }

    private static boolean equals(java.lang.String first, java.lang.String second) {
        service.HugeInteger_Service service = new service.HugeInteger_Service();
        service.HugeInteger port = service.getHugeIntegerPort();
        return port.equals(first, second);
    }

    private static boolean smaller(java.lang.String first, java.lang.String second) {
        service.HugeInteger_Service service = new service.HugeInteger_Service();
        service.HugeInteger port = service.getHugeIntegerPort();
        return port.smaller(first, second);
    }

    private static String subtract(java.lang.String first, java.lang.String second) {
        service.HugeInteger_Service service = new service.HugeInteger_Service();
        service.HugeInteger port = service.getHugeIntegerPort();
        return port.subtract(first, second);
    }
    
}
