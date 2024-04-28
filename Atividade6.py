def somar_numeros():
    # Variáveis para somas
    soma_pares = 0
    soma_impares = 0
    soma_divisiveis_3 = 0

    # Solicitar e somar 10 números
    for i in range(1, 11):
        numero = int(input(f"Digite o {i}º número: "))

        # Verificar paridade e somar
        if numero % 2 == 0:
            soma_pares += numero
        else:
            soma_impares += numero

        # Verificar divisibilidade por 3 e somar
        if numero % 3 == 0:
            soma_divisiveis_3 += numero

    # Exibir resultados
    print(f"Soma dos pares: {soma_pares}")
    print(f"Soma dos ímpares: {soma_impares}")
    print(f"Soma dos divisíveis por 3: {soma_divisiveis_3}")

# Chamar a função
somar_numeros()
