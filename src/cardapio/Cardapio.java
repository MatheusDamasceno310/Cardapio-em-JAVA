/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardapio;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Cardapio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cardapio = new Scanner(System.in);
        
        float preco[] = new float[10];
        String item[] = new String[10];
        int menu, a = 0, b, cont = 0, c = 0, resposta = 0, d = 0;
        float preco1 = 0, preco2 = 0, preco3 = 0, total = 0, troco, pago, positivo;
        String pedido1 = null, pedido2 = null, pedido3 = null, nome, telefone, num_da_casa, bairro, rua;
        
        do {
            System.out.println("");
            System.out.println("Menu: ");
            System.out.println(" _________________________________________ ");
            System.out.println("|                                         |");
            System.out.println("| 1. Inclusão de itens no cardápio        |");
            System.out.println("| 2. Registro de pedido                   |");
            System.out.println("| 3. Resumo de pedido                     |");
            System.out.println("| 4. Sair                                 |");
            System.out.println("|_________________________________________|");
            System.out.println("");
            menu = cardapio.nextInt();
            if (menu == 4) {
                
            } else {
                if (menu != 1) {
                    
                } else {
                    System.out.println("Quais os itens do cardápio do dia ?");
                    System.out.println("");
                    for (c = 0; c < 10; c++) { 
                        a++;
                        cont++;
                        System.out.print("Nome do item "+a+": ");
                        item[c] = cardapio.next();
                        System.out.println("");
                        System.out.print("Preço do item "+a+": ");
                        preco[c] = cardapio.nextFloat();
                        System.out.println("");
                    }  
                }
                if (menu != 2) {
                    
                } else {
                    if (cont == 0) {
                        System.out.println(" _________________________________ ");
                        System.out.println("|                                 |");
                        System.out.println("| Ainda não tem itens no cardápio |");
                        System.out.println("|_________________________________|");
                        System.out.println("");
                    } else {
                        do {
                            a = 0;
                            for (c = 0; c < 10; c++) {
                                a++;
                                System.out.println(" ");
                                System.out.println(a+"."+item[c]+" ------------- R$"+preco[c]);
                            }
                            System.out.println(" ");
                            System.out.println("_____________________________________________________________________");
                            System.out.print("Digite o número para o primeiro pedido do cliente no cardápio: ");
                            c = 0;
                            d = 0;
                            d = cardapio.nextInt();
                            System.out.println(" ");
                            if (c >= 11) {
                                System.out.println(" ___________________________ ");
                                System.out.println("|                           |");
                                System.out.println("|  Digite um número válido  |");
                                System.out.println("|___________________________|");
                                System.out.println("");
                            }   
                        } while (d >= 11);
                        if (d > 0) {
                            c = d;
                            c = c - 1;
                            preco1 = preco[c];
                            System.out.println("O primeiro pedido tem o valor de R$ "+preco1);
                            pedido1 = item[c];
                        } else {
                            preco1 = 0;
                        }
                        do {
                            a = 0;
                            for (c = 0; c < 10; c++) {
                                a++;
                                System.out.println(" ");
                                System.out.println(a+"."+item[c]+" ------------- R$"+preco[c]);
                            }
                            System.out.println(" ");
                            System.out.println("_____________________________________________________________________");
                            System.out.print("Digite o número para o segundo pedido do cliente no cardápio: ");
                            c = 0;
                            d = 0;
                            d = cardapio.nextInt();
                            System.out.println(" ");
                            if (c >= 11) {
                                System.out.println(" ___________________________ ");
                                System.out.println("|                           |");
                                System.out.println("|  Digite um número válido  |");
                                System.out.println("|___________________________|");
                                System.out.println("");
                            }   
                        } while (d >= 11);
                        if (d > 0) {
                            c = d;
                            c = c - 1;
                            preco2 = preco[c];
                            System.out.println("O segundo pedido tem o valor de R$ "+preco2);
                            pedido2 = item[c];
                        } else {
                            preco2 = 0;
                        }
                        do {
                            a = 0;
                            for (c = 0; c < 10; c++) {
                                a++;
                                System.out.println(" ");
                                System.out.println(a+"."+item[c]+" ------------- R$"+preco[c]);
                            }
                            System.out.println(" ");
                            System.out.println("_____________________________________________________________________");
                            System.out.print("Digite o número para o terceiro pedido do cliente no cardápio: ");
                            c = 0;
                            d = 0;
                            d = cardapio.nextInt();
                            System.out.println(" ");
                            if (c >= 11) {
                                System.out.println(" ___________________________ ");
                                System.out.println("|                           |");
                                System.out.println("|  Digite um número válido  |");
                                System.out.println("|___________________________|");
                                System.out.println("");
                            }   
                        } while (d >= 11);
                        if (d > 0) {
                            c = d;
                            c = c - 1;
                            preco3 = preco[c];
                            System.out.println("O primeiro pedido tem o valor de R$ "+preco3);
                            pedido3 = item[c];
                        } else {
                            preco3 = 0;
                        }

                        total = preco1 + preco2 + preco3;
                    }
                }
                if (menu != 3) {
                    
                } else {
                    if (total == 0) {
                        System.out.println(" _______________________________________________ ");
                        System.out.println("|                                               |");
                        System.out.println("| Não há itens registrados. Registre seu pedido |");
                        System.out.println("|_______________________________________________|");
                    } else {
                        if ((preco2 == 0) && (preco3 == 0)) {
                        System.out.println("_______________________________________________________________");
                        System.out.println("Itens pedidos: ");
                        System.out.println(" ");
                        System.out.println(pedido1+" ------------- R$"+preco1);
                        System.out.println(" ");
                        System.out.println("_______________________________________________________________");
                    } else if ((preco1 == 0) && (preco3 == 0)) {
                        System.out.println("_______________________________________________________________");
                        System.out.println("Itens pedidos: ");
                        System.out.println(" ");
                        System.out.println(pedido2+" ------------- R$"+preco2);
                        System.out.println(" ");
                        System.out.println("_______________________________________________________________");
                    } else if ((preco1 == 0) && (preco2 == 0)) {
                        System.out.println("_______________________________________________________________");
                        System.out.println("Itens pedidos: ");
                        System.out.println(" ");
                        System.out.println(pedido3+" ------------- R$"+preco3);
                        System.out.println(" ");
                        System.out.println("_______________________________________________________________");
                    } else if (((preco2 > 0) && preco3 > 0) && preco1 == 0) {
                        System.out.println("_______________________________________________________________");
                        System.out.println("Itens pedidos: ");
                        System.out.println(" ");
                        System.out.println(pedido2+" ------------- R$"+preco2);
                        System.out.println(pedido3+" ------------- R$"+preco3);
                        System.out.println(" ");
                        System.out.println("_______________________________________________________________");
                    } else if (((preco1 > 0) && preco3 > 0) && preco2 == 0) {
                        System.out.println("_______________________________________________________________");
                        System.out.println("Itens pedidos: ");
                        System.out.println(" ");
                        System.out.println(pedido1+" ------------- R$"+preco1);
                        System.out.println(pedido3+" ------------- R$"+preco3);
                        System.out.println(" ");
                        System.out.println("_______________________________________________________________");
                    } else if (((preco1 > 0) && preco2 > 0) && preco3 == 0) {
                        System.out.println("_______________________________________________________________");
                        System.out.println("Itens pedidos: ");
                        System.out.println(" ");
                        System.out.println(pedido1+" ------------- R$"+preco1);
                        System.out.println(pedido2+" ------------- R$"+preco2);
                        System.out.println(" ");
                        System.out.println("_______________________________________________________________");
                    } else {
                        System.out.println("_______________________________________________________________");
                        System.out.println("Itens pedidos: ");
                        System.out.println(" ");
                        System.out.println(pedido1+" ------------- R$"+preco1);
                        System.out.println(pedido2+" ------------- R$"+preco2);
                        System.out.println(pedido3+" ------------- R$"+preco3);
                        System.out.println(" ");
                        System.out.println("_______________________________________________________________");
                    }
                    if (total >= 40) {
                        do {
                            System.out.println(" ");
                            System.out.println("Cliente ganhou um cupom desconto de R$ 10,00 na próxima compra");
                            System.out.println(" ");
                            System.out.printf("O preço total a ser pago: R$ \n"+total);
                            System.out.print("Digite a forma de pagamento: ");
                            System.out.println("");
                            System.out.println(" _______________________ ");
                            System.out.println("|                       |");
                            System.out.println("| 1. Dinheiro           |");
                            System.out.println("| 2. Cartão de Crédito  |");
                            System.out.println("|_______________________|");
                            resposta = cardapio.nextInt();
                            System.out.println(" ");
                            if (resposta == 1) {
                                System.out.print("Digite quanto foi pago: ");
                                pago = cardapio.nextFloat();
                                troco = total - pago;
                                System.out.println(" ");
                                if (pago == total) {
                                    System.out.println(" ________________ ");
                                    System.out.println("|                |");
                                    System.out.println("|  Não há troco  |");
                                    System.out.println("|________________|");
                                    System.out.println("");
                                } else if (total > pago) {
                                    if (troco < 0) {
                                        positivo = troco * -1;
                                        System.out.println("Ainda falta R$ "+positivo+" no pagamento da compra");
                                    } else {
                                        System.out.println("Ainda falta R$ "+troco+" no pagamento da compra");
                                    }
                                } else {
                                    System.out.println("O troco do cliente é de R$ "+troco);
                                }
                            } else if (resposta == 2) {
                                System.out.println("O preço total a ser pago: R$ "+total);
                            } else {
                                System.out.println(" _______________________________ ");
                                System.out.println("|                               |");
                                System.out.println("|  Digite a forma de pagamento  |");
                                System.out.println("|_______________________________|");
                                System.out.println("");
                            }
                    } while (resposta != 1 && resposta != 2);
                    } else {
                        do {
                            System.out.println(" ");
                            System.out.printf("O preço total a ser pago: R$ \n"+total);
                            System.out.print("Digite a forma de pagamento: ");
                            System.out.println("");
                            System.out.println(" _______________________ ");
                            System.out.println("|                       |");
                            System.out.println("| 1. Dinheiro           |");
                            System.out.println("| 2. Cartão de Crédito  |");
                            System.out.println("|_______________________|");
                            resposta = cardapio.nextInt();
                            System.out.println(" ");
                            if (resposta == 1) {
                                System.out.print("Digite quanto foi pago: ");
                                pago = cardapio.nextFloat();
                                troco = total - pago;
                                System.out.println(" ");
                                if (pago == total) {
                                    System.out.println(" ________________ ");
                                    System.out.println("|                |");
                                    System.out.println("|  Não há troco  |");
                                    System.out.println("|________________|");
                                    System.out.println("");
                                } else if (total > pago) {
                                    if (troco < 0) {
                                        positivo = troco * -1;
                                        System.out.println("Ainda falta R$ "+positivo+" no pagamento da compra");
                                    } else {
                                        System.out.println("Ainda falta R$ "+troco+" no pagamento da compra");
                                    }
                                } else {
                                    System.out.println("O troco do cliente é de R$ "+troco);
                                }
                            } else if (resposta == 2) {
                                System.out.println("O preço total a ser pago: R$ "+total);
                            } else {
                                System.out.println(" _______________________________ ");
                                System.out.println("|                               |");
                                System.out.println("|  Digite a forma de pagamento  |");
                                System.out.println("|_______________________________|");
                                System.out.println("");
                            }
                    } while (resposta != 1 && resposta != 2);
                    }
                    if ((preco2 == 0) && (preco3 == 0)) {
                        System.out.println("_______________________________________________________________");
                        System.out.println("Itens pedidos: ");
                        System.out.println(" ");
                        System.out.println(pedido1+" ------------- R$"+preco1);
                        System.out.println(" ");
                        System.out.println("_______________________________________________________________");
                    } else if ((preco1 == 0) && (preco3 == 0)) {
                        System.out.println("_______________________________________________________________");
                        System.out.println("Itens pedidos: ");
                        System.out.println(" ");
                        System.out.println(pedido2+" ------------- R$"+preco2);
                        System.out.println(" ");
                        System.out.println("_______________________________________________________________");
                    } else if ((preco1 == 0) && (preco2 == 0)) {
                        System.out.println("_______________________________________________________________");
                        System.out.println("Itens pedidos: ");
                        System.out.println(" ");
                        System.out.println(pedido3+" ------------- R$"+preco3);
                        System.out.println(" ");
                        System.out.println("_______________________________________________________________");
                    } else if (((preco2 > 0) && preco3 > 0) && preco1 == 0) {
                        System.out.println("_______________________________________________________________");
                        System.out.println("Itens pedidos: ");
                        System.out.println(" ");
                        System.out.println(pedido2+" ------------- R$"+preco2);
                        System.out.println(pedido3+" ------------- R$"+preco3);
                        System.out.println(" ");
                        System.out.println("_______________________________________________________________");
                    } else if (((preco1 > 0) && preco3 > 0) && preco2 == 0) {
                        System.out.println("_______________________________________________________________");
                        System.out.println("Itens pedidos: ");
                        System.out.println(" ");
                        System.out.println(pedido1+" ------------- R$"+preco1);
                        System.out.println(pedido3+" ------------- R$"+preco3);
                        System.out.println(" ");
                        System.out.println("_______________________________________________________________");
                    } else if (((preco1 > 0) && preco2 > 0) && preco3 == 0) {
                        System.out.println("_______________________________________________________________");
                        System.out.println("Itens pedidos: ");
                        System.out.println(" ");
                        System.out.println(pedido1+" ------------- R$"+preco1);
                        System.out.println(pedido2+" ------------- R$"+preco2);
                        System.out.println(" ");
                        System.out.println("_______________________________________________________________");
                    } else {
                        System.out.println("_______________________________________________________________");
                        System.out.println("Itens pedidos: ");
                        System.out.println(" ");
                        System.out.println(pedido1+" ------------- R$"+preco1);
                        System.out.println(pedido2+" ------------- R$"+preco2);
                        System.out.println(pedido3+" ------------- R$"+preco3);
                        System.out.println(" ");
                        System.out.println("_______________________________________________________________");
                    }
                    System.out.println(" ");
                    System.out.println("Cadastro");
                    System.out.println(" ");
                    System.out.print("Digite o nome completo: ");
                    nome = cardapio.next();
                    System.out.println(" ");
                    System.out.print("Digite número de telefone: ");
                    telefone = cardapio.next();
                    System.out.println(" ");
                    System.out.print("Digite o bairro: ");
                    bairro = cardapio.next();
                    System.out.println(" ");
                    System.out.print("Digite a rua: ");
                    rua = cardapio.next();
                    System.out.println(" ");
                    System.out.print("Digite número da casa: ");
                    num_da_casa = cardapio.next();
                    System.out.println(" ");
                    System.out.println("Confira a seguir as informações do cadastro: ");
                    System.out.println(" ");
                    System.out.println("_______________________________________________________________");
                    System.out.println("");
                    System.out.println("  Nome: "+nome);
                    System.out.println("  Telefone: "+telefone);
                    System.out.println("  Bairro: "+bairro);
                    System.out.println("  Rua: "+rua+"  N°: "+num_da_casa);
                    System.out.println("_______________________________________________________________");
                    System.out.println(" ");
                    }
                } 
            }
        } while (menu != 4);      
     }
    
}
