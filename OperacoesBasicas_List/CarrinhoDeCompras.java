package OperacoesBasicas_List;

import java.util.List;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class CarrinhoDeCompras {
	
  private List<Carrinho> carrinhoList;
  private int itens;
  
  
  public CarrinhoDeCompras() {
	  this.carrinhoList = new ArrayList<>();
	  this.itens = 0;
  }
  
  
private int getItens() {
	return itens;
}

public void adicionarItem(String nome,Double preco,int quantidade) {
	  carrinhoList.add(new Carrinho(nome,preco,quantidade));
	 
	  itens++;
  }
  
 

  public void removerItem(String nome,Double preco, int quantidade) {
	  
	  itens--;
	  
	  for (Carrinho item: carrinhoList) {
         
          if (item.getNome().equals(nome)) {
              carrinhoList.remove(item);
              System.out.println("Item " + nome + " removido do carrinho.");
              return;
          }
      }
      System.out.println("Item " + nome + " não encontrado no carrinho.");
  }

  
  public double calcularValorTotal() {
	  double  total = 0.0;
	  for(Carrinho item: carrinhoList) {
		  total+= item.getPreco() * item.getQuantidade();
	  }
	  return total;
  }
  
  public void exibirItens(String nome,Double preco , int quantidade) {
	  
	  for(Carrinho item: carrinhoList) {
		 
	  System.out.println(item);
  }
  }
  
  public static void main(String[] args) {
	  CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
	  DecimalFormat df = new DecimalFormat("0.00");
	  
	  System.out.println("Itens Adicionados Ao Carrinho " );
	
	carrinhoDeCompras.adicionarItem("feijão" ,8.99 , 3);
	carrinhoDeCompras.adicionarItem("Açúcar" ,4.98 , 5);
	carrinhoDeCompras.adicionarItem("Arroz"  ,4.96 , 9);
	carrinhoDeCompras.adicionarItem("Farinha"  ,3.54 , 6);
	carrinhoDeCompras.adicionarItem("Macarrão"  ,3.98 , 8);
	
	System.out.println("Total de Itens no Carrinho = " + carrinhoDeCompras.getItens()+"\n");

	carrinhoDeCompras.exibirItens(null, null, 0);
	
	System.out.println(" ");
	
	carrinhoDeCompras.removerItem("Arroz" ,4.96 , 9);
	carrinhoDeCompras.removerItem("feijão", 8.99, 3);
//	carrinhoDeCompras.removerItem("Açúcar", 8.99, 3);
	
	System.out.println(" ");
	
    //carrinhoDeCompras.removerItem(null, null, 0);
	//carrinhoDeCompras.exibirItens(null, null, 0);
	
	carrinhoDeCompras.exibirItens(null, null, 0);
	
	
	System.out.println("\n Total de Itens no Carrinho "  + carrinhoDeCompras.getItens());

	
		
	System.out.println("\n Valor Total da Compra " + df.format (carrinhoDeCompras.calcularValorTotal()));
	
}
 
  

}
