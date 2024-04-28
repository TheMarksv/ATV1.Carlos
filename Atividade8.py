def gerar_tabuada():
    numero = int(input("Digite um número para gerar a tabuada: "))

    # Exibir a tabuada de 0 a 100
    for i in range(101):
        print(f"{numero} x {i} = {numero * i}")

# Chamar a função
gerar_tabuada()
