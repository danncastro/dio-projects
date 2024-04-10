menu = """

[d] Depositar
[s] Sacar
[e] Extrato
[nc] Nova conta
[lc] Listar contas
[nu] Novo usuário
[q] Sair

=> """

def depositar(saldo, valor, extrato, /):
    if valor > 0:
        saldo += valor
        extrato += f"Depósito: R$ {valor:.2f}\n"
        print(f"\n=== Depósito no valor de R${valor:.2f} efetuado com sucesso! ===")
    else:
        print("Operação invalida!")

    return saldo, extrato

def sacar(*, saldo, valor, extrato, limite, qt_saques, lt_saques):
        excedeu_saldo = valor > saldo
        excedeu_limite = valor > limite
        excedeu_saques = qt_saques >= lt_saques

        if excedeu_saldo:
            print("Operação invalida! Saldo suficiente.")
        elif excedeu_limite:
            print("Operação invalida! O valor de saque excede o limite.")
        elif excedeu_saques:
            print("Operação invalida! Número máximo de saques excedido.")
        elif valor > 0:
            saldo -= valor
            extrato += f"Saque: R$ {valor:.2f}\n"
            qt_saques += 1
            print(f"\n== Saque no valor de R${valor:.2f} efetuado com sucesso! ===")
        else:
            print("Operação invalida!")

        return saldo, extrato

def exibir_extratro(saldo, /, *, extrato):
    print("\n================ EXTRATO ================")
    print("Sem movimentações." if not extrato else extrato)
    print(f"\nSaldo: R$ {saldo:.2f}")
    print("==========================================")

def filtrar_usuarios(cpf, usuarios):
    usuarios_filtrados = [usuario for usuario in usuarios if usuario["cpf"] == cpf]
    return usuarios_filtrados[0] if usuarios_filtrados else None

def criar_usuario(usuarios):
    cpf = input("Informe o CPF 'Somente números': ")
    usuario = filtrar_usuarios(cpf, usuarios)

    if usuario:
        print("\n CPF já cadastrado para esse usuário!")

    nome = input("Nome completo: ")
    dt_nascimento = input("Data de nascimento 'dd-mm-aaaa': ")
    endereco = input("Endereço 'Logradouro, Número, - Bairro - Cidade/Estado': ")
    usuarios.append({
        "nome": nome, 
        "data_nascimento": dt_nascimento, 
        "cpf": cpf,
        "endereço": endereco
        })
    print("\n=== Usuário cadastrado! ===")

def criar_conta(agencia, numero_conta, usuarios):
    cpf = input("Informar CPF do usuário: ")
    usuario = filtrar_usuarios(cpf, usuarios)

    if usuario:
        print(f"\n=== Conta criada! ===")
        return {
            "agencia": agencia,
            "numero_conta": numero_conta,
            "usuario": usuario
        }
    print("\n=== CPF do usuário não encontrado! ===")

def listar_contas(contas):
    for conta in contas:
        resultado = f"""\
            Agência: {conta['agencia']}
            C/C: {conta['numero_conta']}
            Titular: {conta['usuario']['nome']}
        """
        print('=' * 100)
        print(resultado)

def main():
    LIMITE_SAQUE = 3
    AGENCIA = "0001"

    saldo = 0
    limite = 500
    extrato = ""
    qt_saques = 0
    usuarios = []
    contas = []

    while True:
        opcao = input(menu)

        if opcao == "d":
            valor = float(input("Quanto deseja depositar: "))
            saldo, extrato = depositar(saldo, valor, extrato)

        elif opcao == "s":
            valor = float(input("Quanto deseja sacar: "))
            saldo, extrato = sacar(
                saldo=saldo, 
                valor=valor, 
                extrato=extrato, 
                limite=limite, 
                qt_saques=qt_saques, 
                lt_saques=LIMITE_SAQUE,
            )

        elif opcao == "e":
            exibir_extratro(saldo, extrato=extrato)

        elif opcao == "nu":
            criar_usuario(usuarios)

        elif opcao == "nc":
            numero_conta = len(contas) +1
            conta = criar_conta(AGENCIA, numero_conta, usuarios)

            if conta:
                contas.append(conta)

        elif opcao == "lc":
            listar_contas(contas)

        elif opcao == "q":
            break

        else:
            print("Operação inválida.")

main()
