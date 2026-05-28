package com.example.demo.endpoint.rest.Service;

public class ArithmeticService {
    public int add(int a, int b) {

        if (a < 0 || b < 0) {
            throw new IllegalArgumentException(
                    "Erreur : a et b ne doivent pas être négatifs."
            );
        }

        return a + b;
    }
    public int subtract(int a, int b) {

        if (a < 0 || b < 0) {
            throw new IllegalArgumentException(
                    "Erreur de soustraction : les nombres négatifs ne sont pas autorisés."
            );
        }

        return a - b;
    }
    public int multiply(int a, int b) {


        if (a < 0 || b < 0) {
            throw new IllegalArgumentException(
                    "Erreur de multiplication : les valeurs négatives sont interdites."
            );
        }

        return a * b;
    }
    public int divide(int a, int b) {

        if (a < b) {
            throw new IllegalArgumentException(
                    "Erreur : le dividende (a) doit être supérieur ou égal au diviseur (b)."
            );
        }

        if (b == 0) {
            throw new IllegalArgumentException(
                    "Erreur : division par zéro impossible."
            );
        }

        return a / b;
    }
}