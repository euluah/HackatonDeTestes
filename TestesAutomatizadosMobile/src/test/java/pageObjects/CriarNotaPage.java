package pageObjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CriarNotaPage {
	
	public CriarNotaPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//Criar Lista
	
	@AndroidFindBy(id="com.microsoft.todos:id/sso_account_email")
	private MobileElement botaoEscolherConta;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='Nova lista']")
	private MobileElement botaoNovaLista;
	
	@AndroidFindBy(id="com.microsoft.todos:id/edit_text")
	private MobileElement campoTitulo;
	
	@AndroidFindBy(id ="android:id/button1")
	private MobileElement botaoCriarLista;
	
	@AndroidFindBy(accessibility ="Voltar")
	private MobileElement botaoVoltar;
	
	
	//Editar Lista
	

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Teste editado']")
	private MobileElement editarLista;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Lista']")
	private MobileElement clicarLista;
	
	@AndroidFindBy(accessibility = "Mais opções")
	private MobileElement botaoMaisOpcoes;
	
	@AndroidFindBy(xpath  = "//android.widget.LinearLayout[@content-desc='Renomear lista1 em 12']")
	private MobileElement botaoRenomearLista;
	
	@AndroidFindBy(id="com.microsoft.todos:id/edit_text")
	private MobileElement campoEditarTitulo;
	
	@AndroidFindBy(id="android:id/button1")
	private MobileElement botaoSalvar;
	
	//Adicionar item a lista
	
	
	
	@AndroidFindBy(accessibility = "Adicionar uma tarefa")
	private MobileElement botaoAddTarefa;
	
	@AndroidFindBy(id="com.microsoft.todos:id/create_task_edit_text")
	private MobileElement campoAddTarefa;
	
	@AndroidFindBy(id="com.microsoft.todos:id/create_task_image_button")
	private MobileElement botaoCriarTarefa;
	
	
	
	//Remover tarefa
	
	
	
	@AndroidFindBy(xpath  = "//android.widget.TextView[@text='tarefa teste']")
	private MobileElement botaoSelecionarTarefa;
	
	@AndroidFindBy(accessibility = "Excluir tarefa")
	private MobileElement botaoExcluirTarefa;
	
	@AndroidFindBy(xpath  = "//android.widget.Button[@text='EXCLUIR']")
	private MobileElement botaoConfirmarExclusao;
	
	
	//Remover lista
	
	@AndroidFindBy(xpath  = "//android.widget.TextView[@text='Excluir lista']")
	private MobileElement botaoExcluirLista;
	
	
	
	
	
	//Criar lista
	
	public void acionarBotaoEscolherConta() {
		botaoEscolherConta.click();
	}
	
	public void acionarBotaoNovaLista() {
		botaoNovaLista.click();
	}
	
	public void informarCampoTitulo(String titulo) {
		campoTitulo.sendKeys(titulo);;
	}
	
	public void acionarBotaoCriarLista() {
		botaoCriarLista.click();
	}
	
	public void acionarBotaoVoltar() {
		botaoVoltar.click();
	}
	
	
	
	
	//Editar Lista
	

	public void acionarBotaoEditarLista() {
		editarLista.click();
	}
	
	public void acionarBotaoClicarLista() {
		clicarLista.click();
	}
	
	public void acionarBotaoMaisopcoes() {
		botaoMaisOpcoes.click();
	}
	
	public void acionarBotaoRenomear() {
		botaoRenomearLista.click();
	}
	
	public void informarCampoEditarLista(String titulo) {
		campoEditarTitulo.sendKeys(titulo);;
	}
	
	public void acionarBotaoSalvar() {
		botaoSalvar.click();
	}
	
	
	
	//Add item a lista
	
	public void acionarBotaoAddTarefa() {
		botaoAddTarefa.click();
	}
	
	public void informarCampoAddTarefa(String tarefa) {
		campoAddTarefa.sendKeys(tarefa);
	}
	
	public void acionarBotaoCriarTarefa() {
		botaoCriarTarefa.click();
	}
	
	
	//Remover Tarefa
	
	public void acionarBotaoSelecionarTarefa() {
		botaoSelecionarTarefa.click();
	}
	
	public void acionarBotaoExcluirTarefa() {
		botaoExcluirTarefa.click();
	}
	
	public void acionarBotaoConfirmarExclusao() {
		botaoConfirmarExclusao.click();
	}
	
	public void acionarBotaoExcluirLista() {
		botaoExcluirLista.click();
	}
}
