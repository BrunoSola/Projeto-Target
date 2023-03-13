# ProjetoTarget

## Exercício 4 
- Conclui-se que, sempre os 2 automóveis estarão equidistante da cidade Ribeirão Preto, porque estão em sentidos opostos e no momento em que se cruzarem, a distância para qualquer 1 dos pontos serão iguais. Podemos ver como exemplo, se quiséssemos saber quem esta mais perto de Franca, a resposta seria que estão equidistantes, visto que, falta 39km para o carro chegar ate Franca, e o caminhão andou 39km, portanto para voltar, são 39km.<br>

Calculos abaixo:

### Dados ###
Vm carro = 110km/h<br>
vm caminhão = 80km/h<br>
distância = 100km<br>
pedágio = 2<br>
caminhão perde 5 minutos em cada pedágio<br>


### Observação:
*Para o cálculo, Ribeirão Preto ponto inicial.

- 1º Calcular o tempo em que o caminhão gasta para percorrer a distância informada:<br>
t =  d / vm caminho<br>
t = 100 / 80<br>
t = 1,25hrs<br>

- 2º Calcular tempo gasto no pedágio e novo tempo de percurso<br>
  - Tempo gasto no pedágio<br>
  tGasto = pedágio * tempogasto / 60<br>
  tGasto = 2 pedagios * 5 minutos/cada / 60<br>
  tGasto = 0,17hrs<br>
  
  - Novo tempo de percurso<br>
  t + tGasto<br>
  1,25 + 0,17<br>
  Novo tempo percurso = 1,42hrs<br>

- 3º Calcular nova velocidade média do caminhão<br>
Vm Nova = distância / novo tempo percurso<br>
Vm Nova = 100 / 1,42<br>
Vm Nova = 70,4km/h<br>

- 4º Calcular o ponto de encontro<br>
Para calcular o ponto de encontro, utilizei a equação horaria. <br>
   - Tempo = distancia / velocidade relativa<br>
    t = 100 / (110 + 70,4) <br>
    t = 100 / 180,4 <br>
    t = 0,55<br>

   - Distância percorrida do carro<br>
   distância = 110 * 0,55 = 61,97Km<br>

   - Distância percorrida do caminhão<br>
   distância = 70,4 * 0,55 = 39,03Km<br>

- 5º Considerando que o carro saiu de Ribeirão Preto 0km sentido Franca 100km <br>
  - O carro está na posição 0 e andou 61Km, então o mesmo está a uma distância = 61Km de Ribeirão Preto. <br>
  
- 6º Caminhão por sua vez saiu de Franca 100km sentido Ribeirão Preto 0Km<br>
  - O caminhão está na posição 100Km e andou 39Km, então o mesmo está a uma distância = 61Km de Ribeirão Preto.<br>


