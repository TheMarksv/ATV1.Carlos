def analisar_dados_atualizado():
    # Variáveis para contagem e soma
    contador_maior_90_kg = 0
    soma_idades = 0

    # Solicitar dados de 7 pessoas
    for i in range(1, 8):
        idade = int(input(f"Digite a idade da {i}ª pessoa: "))
        peso = float(input(f"Digite o peso da {i}ª pessoa: "))

        # Pessoas com mais de 90 kg
        if peso > 90:
            contador_maior_90_kg += 1

        # Soma das idades
        soma_idades += idade

    # Exibir resultados
    print(f"Pessoas com mais de 90 kg: {contador_maior_90_kg}")
    print(f"Média das idades: {soma_idades / 7}")

# Chamar a função
analisar_dados_atualizado()
