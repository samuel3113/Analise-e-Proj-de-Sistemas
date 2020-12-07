class Produto{
	
    private Integer id; // codigo do produto
    private String descricao; // nome do produto 
    private double valor; // valor de compra
    private double custo; // custo do produto
    private double margem; //margem de lucro desejada
    private Integer qtd; //quantidade em estoque

    public Produto(String nome, Integer codigo) {
    	descricao = nome;
    	id = codigo;
    }
    public Produto(String nome2, Integer codigo2, double val, double custo_p, double margem_l) {
    	descricao = nome2;
    	id = codigo2;
    	valor = val;
    	custo = custo_p;
    	margem = margem_l;
    }
    public Produto(String nome3, Integer codigo3, double val2, double custo_p2, double margem_l2, Integer quantidade) {
    	descricao = nome3;
    	id = codigo3;
    	valor = val2;
    	custo = custo_p2;
    	margem = margem_l2;
    	qtd = quantidade;
    }
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public double getMargem() {
		return margem;
	}
	public void setMargem(double margem) {
		this.margem = margem;
	}
	
	
	public void compra(Integer quant) {
		qtd = qtd + quant;
	}
	
	public void venda(Integer quant) {
		qtd = qtd - quant;
	}
	
	public double calculaPrecoVenda() {
		return valor + custo + margem + (valor+custo);
	}

}