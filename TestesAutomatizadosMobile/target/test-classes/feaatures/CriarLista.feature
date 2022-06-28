#language:pt
#encoding: UTF-8

Funcionalidade: To Do

Contexto:
Dado  que eu vou escolher a conta
	
	@Cenario1
	Cenario: Criar uma lista
	Quando aciono o botao nova lista
	E informo o titulo "Teste"
	E clico no botao criar lista
	E clico no botao voltar
	Entao a lista e criada com o titulo "Teste"
	
	@Cenario2
	Cenario: Alterar uma lista
	Quando eu acionar a lista
	E clicar no botao mais opcoes
	E clicar no botao renomear lista
	E informo o novo titulo "Teste foi editado"
	E clico no botao salvar
	E clico no botao voltar
	Entao o aplicativo cadastra a nota com o titulo "Teste foi editado"
	
	@Cenario3
	Cenario: Adicionar item a lista
	Quando eu eu clicar na lista
	E clicar no botao mais
	E informar o titulo da tarefa "tarefa teste"
	E clicar no botao de adicionar
	Entao a tarefa foi adicionada"tarefa teste"
	
	@Cenario4
	Cenario: Remover a tarefa
	Quando eu eu clicar na lista
	E clicar na tarefa
	E clicar em excluir
	E clicae em remover definitivamente
	Entao a tarefa sera removida
	
	@Cenario5
	Cenario: Remover a lista
	Quando eu eu clicar na lista
	E clicar no botao mais opcoes
	E clicar na opcao de excluir lista
	E clicae em remover definitivamente
	Entao a lista e removida
	
	
	
	
	



	
	


