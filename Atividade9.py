def calcular_fatorial(numero):
    # Validar o número (não pode ser negativo)
    if numero < 0:
        print("Erro: O número não pode ser negativo!")
        return None  # Retorna None se for negativo

    # Cálculo do fatorial
    fatorial = 1
    for i in range(1, numero + 1):
        fatorial *= i

    # Retornar o fatorial
    return fatorial

# Solicitar o número ao usuário
numero = int(input("Digite um número para calcular o fatorial: "))

# Calcular e exibir o fatorial
resultado = calcular_fatorial(numero)
if resultado is not None:  # Verifica se o resultado não é None (erro)
    print(f"Fatorial de {numero}: {resultado}")
