package com.sola.ProjetoTarget.service;

import org.springframework.stereotype.Service;

@Service
public class FibonacciService {

    public Integer sequenciaFibonacci(Integer numero){
        int a = 0;
        int b = 1;
        int c = 0;
        while (numero >= c){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    public Integer pertenceFibonacci(Integer numero){
        int a = 0;
        int b = 1;
        int c = 0;
        while (numero > c){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
