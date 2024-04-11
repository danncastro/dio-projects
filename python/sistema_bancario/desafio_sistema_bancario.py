menu = """
[1] Depositar
[2] Sacar
[3] Extrato
[4] Sair
"""

saques_diarios = 0
saldo = 0
extrato = ""
LIMITE_MAXIMO_POR_SAQUES = 500

while True:
    print(menu)
    menu_opcao = float(input("\n "))

    if menu_opcao == 1:
        deposito = float(input("Quanto deseja depositar: R$"))

        if deposito >= 0:
            saldo += deposito
            print(f"\nDeposito no valor de: R${deposito:.2f}")
            extrato += f"\nDeposito: R${deposito:.2f}"
        else:
            print("Operação falhou!")

    elif menu_opcao == 2:
        saque = float(input("Quanto deseja sacar: R$"))
        if saque > saldo:
            print(f"\nSaldo insuficiente! Saldo em conta: R${saldo:.2f}")
        elif saques_diarios >= 3:
            print(f"Limite diario de saques atingido! Limites diários: {saques_diarios}")
        elif saque > LIMITE_MAXIMO_POR_SAQUES:
            print(f"Valor máximo atingido: R${LIMITE_MAXIMO_POR_SAQUES}")
        else: 
            saldo -=  saque
            saques_diarios +=1
            print(f"Saque no valor de R${saque:.2f} realizado com Sucesso!")
            extrato += f"\nSaque: R${saque:.2f}"

    elif menu_opcao == 3:
        print("==========Extrato==========")
        print(extrato)
        print(f"\nSaldo em conta: R${saldo:.2f}")

    elif menu_opcao == 4:
        print(f"Obrigado por ser nosso cliente")
        break

    else:
        print("Operação falhou!")