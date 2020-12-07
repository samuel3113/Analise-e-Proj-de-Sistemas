
import java.util.ArrayList;

public class Produtos extends Produto {

	public Produtos(String nome, Integer codigo) {
		super(nome, codigo);
	}

	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	private int i;

	public Produto(int n) {
    	for(i=0; i<n; i++) {
    		ArrayList<Produto> produtos = new ArrayList<Produto>(n);
    	}
    }
	
	public void inserirProduto(Produto p) {
		ArrayList<Produto> produtos = new ArrayList<Produto>();
	}
	
	
	public void comprarProduto(Produto p) {
	}
	
	public void venderProduto(Produto p) {
	}
	
	public void consultarPrecoProduto(Produto p) {
	}
	
	public void listar(Produto p) {
	}
	
	public static void main(String[] args)
	{
		//String s;
		//Produtos p = new Produtos();

	  /*p.CriarProduto("escova", 1);
		p.CriarProduto("relogio", 2);
		p.CriarProduto("celular", 3);
		p.CriarProduto("roupa", 4);*/

	}

	
}
