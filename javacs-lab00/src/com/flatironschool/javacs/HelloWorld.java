package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        return Double.parseDouble(System.getProperty("java.specification.version"));
        
        // I won't work!
    }

    public static void main(String[] args) {
		if(getVersion() >= 1.7){
			System.out.println("Suitable version.");
		}
		else{
			System.out.println("unsuitable version.");
		}
	// you can test the output of getVersion() here
    }
}
