package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assume.assumeTrue;
import static utils.Utils.driver;

import javax.swing.event.MenuListener;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CriarNotaPage;


public class CriarListaSteps {
	
	CriarNotaPage criarNota = new CriarNotaPage(driver) ;
	
	
	//Criar lista
	
	@Dado("que eu vou escolher a conta")
	public void queEuVouEscolherAConta() throws InterruptedException {
		Thread.sleep(5000);
	  criarNota.acionarBotaoEscolherConta();
	}

	@Quando("aciono o botao nova lista")
	public void acionoOBotaoNovaLista() {
	    criarNota.acionarBotaoNovaLista();
	}

	@Quando("informo o titulo {string}")
	public void informoOTitulo(String titulo) {
	   criarNota.informarCampoTitulo(titulo);
	}

	@Quando("clico no botao criar lista")
	public void clicoNoBotaoCriarLista() throws InterruptedException {
		Thread.sleep(5000);
	    criarNota.acionarBotaoCriarLista();
	}

	@Quando("clico no botao voltar")
	public void clicoNoBotaoVoltar() throws InterruptedException {
		Thread.sleep(5000);
	   criarNota.acionarBotaoVoltar();
	}

	@Entao("a lista e criada com o titulo {string}")
	public void aListaECriadaComOTitulo(String titulo) {
		assertEquals(titulo, driver.findElement(By.xpath("//android.widget.TextView[@text='Teste']")).getText());
		
	}
	
	//Editar lista
	@Quando("eu acionar a lista")
	public void euAcionarALista() {
		criarNota.acionarBotaoEditarLista();
	}

	@Quando("clicar no botao mais opcoes")
	public void clicarNoBotaoMaisOpcoes() {
		criarNota.acionarBotaoMaisopcoes();
	}

	@Quando("clicar no botao renomear lista")
	public void clicarNoBotaoRenomearLista() {
		criarNota.acionarBotaoRenomear();
	}

	@Quando("informo o novo titulo {string}")
	public void informoONovoTitulo(String titulo) {
		criarNota.informarCampoEditarLista(titulo);
	}

	@Quando("clico no botao salvar")
	public void clicoNoBotaoSalvar() {
		criarNota.acionarBotaoSalvar();
	}

	@Entao("o aplicativo cadastra a nota com o titulo {string}")
	public void oAplicativoCadastraANotaComOTitulo(String titulo) {
		assertEquals(titulo, driver.findElement(By.xpath("//android.widget.TextView[@text='Teste foi editado']")).getText());
	}
	
	//Adicionar item a lista
	
	@Quando("eu eu clicar na lista")
	public void euEuClicarNaLista() {
		criarNota.acionarBotaoClicarLista();
	}
	
	@Quando("clicar no botao mais")
	public void clicarNoBotaoMais() {
		criarNota.acionarBotaoAddTarefa();
	}

	@Quando("informar o titulo da tarefa {string}")
	public void informarOTituloDaTarefa(String tarefa) {
		criarNota.informarCampoAddTarefa(tarefa);
	}

	@Quando("clicar no botao de adicionar")
	public void clicarNoBotaoDeAdicionar() {
		criarNota.acionarBotaoCriarTarefa();
	}


	@Entao("a tarefa foi adicionada{string}")
	public void aTarefaFoiAdicionada(String tarefa) {
		assertEquals(tarefa, driver.findElement(By.xpath("//android.widget.TextView[@text='tarefa teste']")).getText());
	}
	
	
	//Remover Tarefa
	
	
	@Quando("clicar na tarefa")
	public void clicarNaTarefa() {
		criarNota.acionarBotaoSelecionarTarefa();
	}

	@Quando("clicar em excluir")
	public void clicarEmExcluir() {
		criarNota.acionarBotaoExcluirTarefa();
	}

	@Quando("clicae em remover definitivamente")
	public void clicaeEmRemoverDefinitivamente() {
		criarNota.acionarBotaoConfirmarExclusao();
	}

	@Entao("a tarefa sera removida")
	public void aTarefaSeraRemovida() {
		try {
			driver.findElement(By.xpath("//android.widget.TextView[@text='tarefa teste']")).getText();
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			e.equals(true);
		}
	}

	//Remover lista
	
	@Quando("clicar na opcao de excluir lista")
	public void clicarNaOpcaoDeExcluirLista() {
	   criarNota.acionarBotaoExcluirLista();
	}

	@Entao("a lista e removida")
	public void aListaERemovida() {
		try {
			driver.findElement(By.xpath("//android.widget.TextView[@text='Lista']")).getText();
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			e.equals(true);
		}
	}
		 
		
	


}
