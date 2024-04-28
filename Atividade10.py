def verificar_primo(numero):
    # Validar se o número é maior que 1
    if numero <= 1:
        return False

    # Verificar se o número é primo
    for i in range(2, int(numero**0.5) + 1):
        if numero % i == 0:
            return False

    return True

# Solicitar o número ao usuário
numero = int(input("Digite um número para verificar se é primo: "))

# Verificar e exibir o resultado
if verificar_primo(numero):
    print(f"{numero} é um número primo.")
else:
    print(f"{numero} não é um número primo.")
