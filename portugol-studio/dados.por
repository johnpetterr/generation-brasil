programa {

	funcao inicio(){
		cadeia email, nomeC, nomeP, nomeM, estado, pais
		inteiro idade, telefone

		escreva("---------- Informe os seus dados ----------\n")

		escreva("Informe o seu nome completo: ")
		leia(nomeC)
		escreva("\n")

		escreva("Informe o nome dos seus pais\n")
		escreva("Pai: ")
		leia(nomeP)
		escreva("Mãe: ")
		leia(nomeM)
		escreva("\n")

		limpa()

		escreva("---------- Informe mais dados ----------\n")
		escreva("Informe o seu email: ")
		leia (email)
		escreva("\n")
		
		escreva("---- Informe onde você nasceu ----- \n")
		escreva("País: ")
		leia(pais)
		escreva("Estado: ")
		leia(estado)

		limpa()

		escreva("----- Todos os seus dados estão listados abaixo! ----- \n \n")
		escreva("Nome completo: "+ nomeC + "\n")
		escreva("Nome da sua mãe: "+ nomeM +"\n")
		escreva("Nome do seu pai: "+ nomeP +"\n")
		escreva("Email: " + email +"\n")
		escreva("Local: "+ pais +", "+ estado)
		escreva("\n")
	}

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 941; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */