
import java.util.Scanner;

public class cardapio01 {

  //Os produtos que vendemos, quantidade, valores e nota fiscal
  //objetos
  
  public static void main(String[] args) {
    double doces, salgados, bebidas, rDoces, rSalgados, rBebidas, tipoBebidas, rCervejas, rSucos, rRefrigerantes;
    double QuantDoces, QuantSalgados, QuantCervejas, QuantSucos, QuantRefrigerantes;
    double produto1 = 0, produto2 = 0, produto3 = 0, produto4 = 0, produto5 = 0;
    double donuts = 4.5, torta = 6.00, casquinha = 5.00;
    double coxinha = 3.5, pastel = 5.0, risoles = 4.5;
    double coca = 6.5, guarana = 5.0, pepsi = 6.5;
    double skol = 4.5, brahma = 5.0, amstel = 4.0;
    double SLaranja = 4.5, SUva = 4.5, SCaju = 5.0; 
    double nProdutos;
    int resposta;
      
    String notaFiscal = "NOTA FISCAL:\n";
    double TotalCompra = 0;

      //Onde comeca o atendimento, com as boas vindas
      
    Scanner leia = new Scanner(System.in);
    System.out.println("-----------------------------------------------");
    System.out.println("BEM VINDO AO THE COFFEE CLUB!!");
    System.out.println("-----------------------------------------------");
    
    //Onde comeca as perguntas ao usuario
    
    System.out.println("QUANTOS PRODUTOS VOCÊ DESEJA COMPRAR? ");
    nProdutos = leia.nextInt();

    for (int i = 0; i < nProdutos; i++) {

    System.out.println("-----------------------------------------------");
    System.out.println("ESCOLHA O QUE DESEJAS:");
    System.out.println("[1] DOCES \n[2] SALGADOS \n[3] BEBIDAS \n[4] SAIR \nRESPOSTA: ");
    resposta = leia.nextInt(); 

    switch (resposta) {
      case 1: 
        System.out.println("-----------------------------------------------");
        System.out.println("CATALOGO DE DOCES: \n[1] DONUTS: R$4,50; \n[2] FATIA DE TORTA: R$6,00; \n[3] CASQUISNHA: R$5,00; \n[4] COMPRA CANCEALDA \nRESPOSTA: ");
        rDoces = leia.nextInt();

        if (rDoces == 1) {
          System.out.println("QUAL A QUANTIDADE DESTE PRODUTO QUE VOCÊ DESEJA: ");
          QuantDoces = leia.nextInt();
          System.out.println("O PREÇO DO SEU PEDIDO  É: R$"+(donuts*QuantDoces)+"\n");
          produto1 = (donuts*QuantDoces);
          TotalCompra += produto1;
          notaFiscal += "DONUTS(" + QuantDoces + ".UN): R$" + produto1 + "\n";
          break;
          
        } if (rDoces == 2) {
          System.out.println("QUAL A QUANTIDADE DESTE PRODUTO QUE VOCÊ DESEJA: ");
          QuantDoces = leia.nextInt();
          System.out.println("O PREÇO DO SEU PEDIDO  É: R$"+(torta*QuantDoces)+"\n");
          produto1 = (torta*QuantDoces);
          TotalCompra += produto1;
          notaFiscal += "FATIA DE TORTA(" + QuantDoces + ".UN): R$" + produto1 + "\n";  
          break;
          
        } if (rDoces == 3) {
          System.out.println("QUAL A QUANTIDADE DESTE PRODUTO QUE VOCÊ DESEJA: ");
          QuantDoces = leia.nextInt();
          System.out.println("O PREÇO DO SEU PEDIDO  É: R$"+(casquinha*QuantDoces)+"\n");
          produto1 = (casquinha*QuantDoces);
          TotalCompra += produto1;
          notaFiscal += "CASQUINHA(" + QuantDoces + ".UN): R$" + produto1 + "\n";  
          break;
          
          //Cliente pode cancelar a compra
          
        } else {
          System.out.println("COMPRA CANCELADA");
          
        }
        

        System.out.println("-----------------------------------------------");
      break;

      case 2:
        System.out.println("-----------------------------------------------");
        System.out.println("CATALOGO DE SALGADOS: \n[1] COXINHA: R$3,50; \n[2] PASTEL: R$5,00; \n[3] RISOLES: R$4,50; \n[4] CANCELAR COMPRA \nRESPOSTA:");
        rSalgados = leia.nextInt();

        if (rSalgados == 1) {
          System.out.println("QUAL A QUANTIDADE DESTE PRODUTO QUE VOCÊ DESEJA: ");
          QuantSalgados = leia.nextInt();
          System.out.println("O PREÇO DO SEU PEDIDO  É: R$"+(coxinha*QuantSalgados)+"\n");
          produto2 = (coxinha*QuantSalgados);
          TotalCompra += produto2;
          notaFiscal += "COXINHA(" + QuantSalgados + ".UN): R$" + produto2 + "\n";  
          break;
         
        } if (rSalgados == 2) {
          System.out.println("QUAL A QUANTIDADE DESTE PRODUTO QUE VOCÊ DESEJA: ");
          QuantSalgados = leia.nextInt();
          System.out.println("O PREÇO DO SEU PEDIDO  É: R$"+(pastel*QuantSalgados)+"\n");
          produto2 = (pastel*QuantSalgados);
          TotalCompra += produto2;
          notaFiscal += "PASTEL(" + QuantSalgados + ".UN): R$" + produto2 + "\n";         
          break;
          
        } if (rSalgados == 3) {
          System.out.println("QUAL A QUANTIDADE DESTE PRODUTO QUE VOCÊ DESEJA: ");
          QuantSalgados = leia.nextInt();
          System.out.println("O PREÇO DO SEU PEDIDO  É: R$"+(risoles*QuantSalgados)+"\n");
          produto2 = (risoles*QuantSalgados);
          TotalCompra += produto2;
          notaFiscal += "RISOLES(" + QuantSalgados + ".UN): R$" + produto2 + "\n";          
          break;
          
        } else {
          System.out.println("COMPRA CANCELADA");
          break;
        }

      case 3: 
        System.out.println("-----------------------------------------------");
        System.out.println("QUAL TIPO DE BEBIDA VOCÊ DESEJA: \n[1] REFRIGERANTE \n[2] CERVEJA \n[3] SUCO \n[4] CANCELAR COMPRA \nRESPOSTA:");
        tipoBebidas = leia.nextInt();

          if (tipoBebidas == 1) {
            System.out.println("-----------------------------------------------");
            System.out.println("CATALOGO DE REFRIGERANTES: \n[1] COCA COLA: R$6,50; \n[2] PEPSI: R$6,50; \n[3] GUARANÁ: R$5,00; \n[4] COMPRA CANCELADA \nRESPOSTA:");
            rRefrigerantes = leia.nextInt();

            if (rRefrigerantes == 1) {
              System.out.println("QUAL A QUANTIDADE DESTE PRODUTO QUE VOCÊ DESEJA: ");
              QuantRefrigerantes = leia.nextInt();
              System.out.println("O PREÇO DO SEU PEDIDO  É: R$"+(coca*QuantRefrigerantes)+"\n");
              produto3 = (coca*QuantRefrigerantes);
              TotalCompra += produto3;
              notaFiscal += "COCA COLA(" + QuantRefrigerantes + ".UN): R$" + produto3 + "\n";              
              break;
              
            } if (rRefrigerantes == 2) {
              System.out.println("QUAL A QUANTIDADE DESTE PRODUTO QUE VOCÊ DESEJA: ");
              QuantRefrigerantes = leia.nextInt();
              System.out.println("O PREÇO DO SEU PEDIDO  É: R$"+(pepsi*QuantRefrigerantes)+"\n");
              produto3 = (pepsi*QuantRefrigerantes);
              TotalCompra += produto3;
              notaFiscal += "PEPSI(" + QuantRefrigerantes + ".UN): R$" + produto3 + "\n";              
              break;

            } if (rRefrigerantes == 3) {
              System.out.println("QUAL A QUANTIDADE DESTE PRODUTO QUE VOCÊ DESEJA: ");
              QuantRefrigerantes = leia.nextInt();
              System.out.println("O PREÇO DO SEU PEDIDO  É: R$"+(guarana*QuantRefrigerantes)+"\n");
              produto3 = (guarana*QuantRefrigerantes);
              TotalCompra += produto3;
              notaFiscal += "GUARANA(" + QuantRefrigerantes + ".UN): R$" + produto3 + "\n";              
              break;
              
            } else {
              System.out.println("COMPRA CANCELADA");
              break;
            }

      }   if (tipoBebidas == 2) {
            System.out.println("-----------------------------------------------");
            System.out.println("CATALOGO DE CERVEJAS: \n[1] SKOL: R$4,50; \n[2] BRAHMA: R$5,00; \n[3] AMSTEL: R$4,00; \n[4] CANCELAR COMPRA \nRESPOSTA:");
            rCervejas = leia.nextInt(); 

            if (rCervejas == 1) {
              System.out.println("QUAL A QUANTIDADE DESTE PRODUTO QUE VOCÊ DESEJA: ");
              QuantCervejas = leia.nextInt();
              System.out.println("O PREÇO DO SEU PEDIDO  É: R$"+(skol*QuantCervejas)+"\n");
              produto4 = (skol*QuantCervejas);
              TotalCompra += produto4;
              notaFiscal += "SKOL(" + QuantCervejas + ".UN): R$" + produto4 + "\n";              
              break;
              
            } if (rCervejas == 2) {
              System.out.println("QUAL A QUANTIDADE DESTE PRODUTO QUE VOCÊ DESEJA: ");
              QuantCervejas = leia.nextInt();
              System.out.println("O PREÇO DO SEU PEDIDO  É: R$"+(brahma*QuantCervejas)+"\n");
              produto4 = (brahma*QuantCervejas);
              TotalCompra += produto4;
              notaFiscal += "BRAHMA(" + QuantCervejas + ".UN): R$" + produto4 + "\n";
              break;
              
            } if (rCervejas == 3) {
              System.out.println("QUAL A QUANTIDADE DESTE PRODUTO QUE VOCÊ DESEJA: ");
              QuantCervejas = leia.nextInt();
              System.out.println("O PREÇO DO SEU PEDIDO  É: R$"+(amstel*QuantCervejas)+"\n");
              produto4 = (amstel*QuantCervejas);
              TotalCompra += produto4;
              notaFiscal += "AMSTEL(" + QuantCervejas + ".UN): R$" + produto4 + "\n";
              break;
              
            } else {
              System.out.println("COMPRA CANCELADA");
              break;
            }

      }   if (tipoBebidas == 3) {
            System.out.println("-----------------------------------------------");
            System.out.println("CATALOGO DE SUCOS: \n[1] SUCO DE LARANJA: R$4,50; \n[2] SUCO DE UVA: R$4,50; \n[3] SUCO DE CAJU: R$5,00; \n[4] CANCELAR COMPRA \nRESPOSTA:");
            rSucos = leia.nextInt(); 

            if (rSucos == 1) {
              System.out.println("QUAL A QUANTIDADE DESTE PRODUTO QUE VOCÊ DESEJA: ");
              QuantSucos = leia.nextInt();
              System.out.println("O PREÇO DO SEU PEDIDO  É: R$"+(SLaranja*QuantSucos)+"\n");
              produto5 = (SLaranja*QuantSucos);
              TotalCompra += produto5;
              notaFiscal += "SUCO DE LARANJA(" + QuantSucos + ".UN): R$" + produto5 + "\n";
              break;
              
            } if (rSucos == 2) {
              System.out.println("QUAL A QUANTIDADE DESTE PRODUTO QUE VOCÊ DESEJA: ");
              QuantSucos = leia.nextInt();
              System.out.println("O PREÇO DO SEU PEDIDO  É: R$"+(SUva*QuantSucos)+"\n");
              produto5 = (SUva*QuantSucos);
              TotalCompra += produto5;
              notaFiscal += "SUCO DE UVA(" + QuantSucos + ".UN): R$" + produto5 + "\n";
              break;
              
            } if (rSucos == 3) {
              System.out.println("QUAL A QUANTIDADE DESTE PRODUTO QUE VOCÊ DESEJA: ");
              QuantSucos = leia.nextInt();
              System.out.println("O PREÇO DO SEU PEDIDO  É: R$"+(SCaju*QuantSucos)+"\n");
              produto5 = (SCaju*QuantSucos);
              TotalCompra += produto5;
              notaFiscal += "SUCO DE CAJU(" + QuantSucos + ".UN): R$" + produto5 + "\n";
              break;
             
            } else {
              System.out.println("COMPRA CANCELADA");
              break;
            }

        }
      
        //onde sera gerado a nota fiscal
      
      default: 
        System.out.println("COMPRA CANCELADA.");
        break;
        }
     }
     
    System.out.println("COMPRA CONCLUIDA!");
    System.out.print(notaFiscal);
    System.out.print("PREÇO TOTAL: R$" + TotalCompra + " REAIS");
  }
}


  //Os codigos consistem na mesma coisa entao nao e nessesario descrever um por um.
  