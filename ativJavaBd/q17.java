import java.util.Scanner;

public class q17{

  public static void main (String [] args){
    
  
        Scanner ler= new Scanner (System.in);
        
        double valorPedido=0.0;
        int codProduto=1;
        int quantidade=0;
        int codEncerrar=1;
       
        double preco1=1.20;
        double preco2=1.30;
        double preco3=1.50;
        double preco4=1.20;
        double preco5=1.30;
        double preco6=1.00;
        
      
        
        String [] produtos = new String [7];
        produtos[0]= "Cachorro-quente (codigo 100)";
        produtos[1]= "Bauru simples (codigo 101)";
        produtos[2]= "Bauro com ovo (codigo 102)";
        produtos[3]= "Hambúrguer (codigo 103)";
        produtos[4]= "Cheeseburguer (codigo 104)";
        produtos[5]= "Refrigerante (codigo 105)\n";
        produtos[6]= "OBS:Digite 0 caso queira encerrar o pedido.\n";
        
       for(int i=0;i<produtos.length;i++){
           
           System.out.println(produtos[i]);
           
       }
       
       
       do {
        
            System.out.println("Digite o codigo do produto:");
            codProduto=ler.nextInt();
            System.out.println("Agora digite a quantidade do produto:");
            quantidade= ler.nextInt();
            
            switch(codProduto){
                case 100:
                    preco1=1.20;
                    valorPedido=+ preco1*quantidade;
                    break;
                
                case 101:
                    preco2=1.30;
                    valorPedido+=preco2*quantidade;
                    break;
               
                case 102:
                    preco3=1.50;
                    valorPedido+=preco3*quantidade;
                    break;
                
                case 103:
                    preco4=1.20;
                    valorPedido+=preco4*quantidade;
                    break;
                
                case 104:
                    preco5=1.30;
                    valorPedido+=preco5*quantidade;
                    break;
                
                case 105:
                    preco6=1.00;
                    valorPedido+=preco6*quantidade;
                    break;
                
                case 0:
                    codEncerrar=0;
                    codProduto=codEncerrar;
                
                
                
            }
        
           
       } while(codProduto!=0);
        
        System.out.println("Valor total do pedido: " + valorPedido);        
     } 
  
}
