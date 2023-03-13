package com.sola.ProjetoTarget.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConversorService {

        private static final String[] unidades = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
        private static final String[] dezenas = {"", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
        private static final String[] centenas = {"", "cem", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};

        public String conversorExtenso(Integer numero){
                if (numero < 20) {
                        return unidades[numero];
                }
                if (numero < 100) {
                        return dezenas[numero/10] + (numero % 10 != 0 ? " e " + unidades[numero % 10] : "");
                }
                if (numero < 1000) {
                        return centenas[numero/100] + (numero % 100 != 0 ? " e " + conversorExtenso(numero % 100) : "");
                }
                throw new IllegalArgumentException("Valor fora da faixa: " + numero);
        }
}


