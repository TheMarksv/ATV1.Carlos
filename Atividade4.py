def contar_pessoas_acima_90kg():
    # Variáveis para contagem
    contador_acima_90kg = 0

    # Solicitar dados de 7 pessoas
    for i in range(1, 8):
        idade = int(input(f"Digite a idade da {i}ª pessoa: "))
        peso = float(input(f"Digite o peso da {i}ª pessoa: "))

        # Verificar se o peso é superior a 90 kg e atualizar a contagem
        if peso > 90:
            contador_acima_90kg += 1

    # Exibir a quantidade de pessoas com mais de 90 kg
    print(f"Número de pessoas com mais de 90 kg: {contador_acima_90kg}")

# Chamar a função
contar_pessoas_acima_90kg()
