# Cálculo do Salário Líquido dos Funcionários

## Descrição

Este programa calcula o salário líquido dos funcionários de uma empresa. O salário líquido é composto por descontos e adicionais, seguindo regras específicas. O usuário deverá digitar o salário bruto e o número de horas trabalhadas no mês de cada funcionário, e receberá como resultado o salário líquido. O usuário poderá calcular o salário para N funcionários, e para finalizar o programa deverá digitar 0 no salário bruto. Ao finalizar, o programa exibirá o total geral dos salários líquidos.

## Regras

### Descontos

- Salário bruto < 800,00 – não realizar nenhum desconto.
- 800,00 <= Salário bruto <= 1600,00 – descontar 8% de Imposto de Renda e 5% de encargos.
- Salário bruto > 1600,00 – descontar 15% de Imposto de Renda e 7% de encargos.

### Adicionais

Caso o funcionário tenha trabalhado mais de 160 horas no mês, divida o seu salário bruto por 160 (representa horas trabalhadas) e calcule 50% de adicional nas horas que excederam a 160.

## Entrada

O usuário deverá digitar:
- O salário bruto.
- O número de horas trabalhadas no mês.

## Saída

O programa calculará e exibirá:
- O salário líquido de cada funcionário.
- O total geral dos salários líquidos ao finalizar o programa.

## Exemplo de Uso

O usuário deve seguir a sequência abaixo para utilizar o programa:

1. Digitar o salário bruto do funcionário.
2. Digitar o número de horas trabalhadas no mês.
3. O programa calculará e exibirá o salário líquido.
4. O usuário poderá repetir os passos 1-3 para outros funcionários.
5. Para finalizar, digite 0 no salário bruto.
6. O programa exibirá o total geral dos salários líquidos.

## Exemplos de Entrada e Saída

### Exemplo 1

| Entrada              | Saída                    |
|----------------------|--------------------------|
| Salário bruto: 750.00 | Salário líquido: 750.00  |
| Horas trabalhadas: 160|                          |

### Exemplo 2

| Entrada              | Saída                    |
|----------------------|--------------------------|
| Salário bruto: 1500.00 | Salário líquido: 1290.00 |
| Horas trabalhadas: 170 |                          |

### Exemplo 3

| Entrada              | Saída                    |
|----------------------|--------------------------|
| Salário bruto: 2000.00 | Salário líquido: 1726.25 |
| Horas trabalhadas: 180 |                          |

### Exemplo 4

| Entrada              | Saída                    |
|----------------------|--------------------------|
| Salário bruto: 0     | Total geral dos salários líquidos: 3766.25 |

## Cálculos

### Desconto para Salário Bruto entre 800,00 e 1600,00:
- Imposto de Renda: 8%
- Encargos: 5%
- Total de Descontos: 13%

### Desconto para Salário Bruto acima de 1600,00:
- Imposto de Renda: 15%
- Encargos: 7%
- Total de Descontos: 22%

### Adicionais
- Se horas trabalhadas > 160, calcular 50% adicional nas horas excedentes.

