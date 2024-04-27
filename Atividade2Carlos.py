def encontrar_maior():
    # Variável para armazenar o maior número
    maior_numero = float("-inf")

    # Solicitar 5 números do usuário
    for i in range(1, 6):
        numero = float(input(f"Digite o {i}º número: "))

        # Atualizar o maior número se necessário
        if numero > maior_numero:
            maior_numero = numero

    # Exibir o maior número encontrado
    print(f"O maior número digitado é: {maior_numero}")

# Chamar a função
encontrar_maior()
