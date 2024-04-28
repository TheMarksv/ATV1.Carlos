def contar_pares():
    # Variável para contar números pares
    contador_pares = 0

    # Solicitar 10 números do usuário
    for i in range(1, 11):
        numero = int(input(f"Digite o {i}º número: "))

        # Verificar se o número é par e atualizar o contador
        if numero % 2 == 0:
            contador_pares += 1

    # Exibir a quantidade de números pares
    print(f"Foram digitados {contador_pares} números pares.")

# Chamar a função
contar_pares()
