package com.sola.ProjetoTarget.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class DesafiosService {
    private final ConversorService conversorService;
    private final FibonacciService fibonacciService;

    public Integer exercicio1() {
        int indice = 13;
        int soma = 0;
        int k = 0;
        while (k < indice){
            k++;
            soma += k;
        }
        return soma;
    }

    public String fibonacci(Integer numero){
        int c = fibonacciService.pertenceFibonacci(numero);
        return numero == c
                ? "O número " + numero + " pertence a sequência de Fibonacci"
                : "O número " + numero + " não pertence a sequência de Fibonacci";
    }
    public Integer valoresImpares(Integer numero){
        return numero + 2;
    }

    public Integer multiplosDeDois(Integer numero){
        return numero * 2;
    }

    public Integer quadradoPerfeito(Integer numero){
        int c = 0;
        int proximo = 0;
        while(numero >= proximo){
            c++;
            proximo = c * c;
        }
        return proximo;
    }
    public Integer sequenciaQuadradoPares(Integer numero){
        int c = 0;
        int proximo = 0;
        while(numero >= proximo){
            c+= 2;
            proximo = c * c;
        }
        return proximo;
    }

    public Integer sequenciaFibonacci(Integer numero){
        int c = fibonacciService.sequenciaFibonacci(numero);
        return c;
    }

    public Integer sequenciaNumeroIniadosComD(Integer numero){
        boolean verifica = false;

        while (!verifica) {
            numero++;
            String numeroExtenso = String.valueOf(conversorService.conversorExtenso(numero).charAt(0));
            if (numeroExtenso.equals("d")){
                return numero;
            }
        }
        return numero;
    }

    public String equacaoHoraria(){
        double distancia = 100.0, velocidadeCarro = 110.0, velocidadeCaminhao = 80.0, tempoPedagio = 5.0;
        int pedagios = 2;
        //Calculos do caminhao
        double tempoSemPedagio = distancia / velocidadeCaminhao;
        double tempoComPedagio = tempoSemPedagio + (pedagios*tempoPedagio/60);
        //Calculando nova velocidade media do caminhao
        double velocidadeMediaCaminhao = distancia / tempoComPedagio;
        //Calculo de encontro
        double tempoEncontro = distancia / (velocidadeCarro + velocidadeMediaCaminhao);
        double distanciaCarro = Math.round(velocidadeCarro * tempoEncontro);
        double distanciaCaminhao = Math.round(distancia - (velocidadeMediaCaminhao * tempoEncontro));

        if ((distanciaCarro - distanciaCaminhao) == 0){
            return "Os 2 automoveis estão equidistante de Ribeirão Preto.";
        }
        if ((distanciaCarro - distanciaCaminhao) > 0){
            return "O caminhão está mais proximo de Ribeirão Preto. Explicação no ReadMe";
        }
        return "O carro está mais proximo de Ribeirão Preto. Explicação no ReadMe";

    }

    public String inverterString(String palavra) {
        String stringIvertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            stringIvertida += palavra.charAt(i);
        }
        return stringIvertida;
    }
}
