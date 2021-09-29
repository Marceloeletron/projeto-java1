package principio.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Conta bancaria Jo");
		
		System.out.println(bancaria);
		
		bancaria.diminui100Reais();
		bancaria.diminui100Reais();
		bancaria.diminui100Reais();
		
		System.out.println(bancaria);
		
		bancaria.sacarDinheiro(300);
		
		System.out.println(bancaria);
		
		bancaria.depositaDinheiro(500);
		
		System.out.println(bancaria);
		
		bancaria.soma100Reais();
		
		System.out.println(bancaria);

	}

}
