import java.util.Scanner;
	public class Pilha{
		public static void main(String[] args){
			int vet[] = new int[10];
			int i = 9;
			int o = 0;
			int y;
			int k = 0;
			boolean flag = false;
			Scanner x = new Scanner(System.in);
			while(true){
				System.out.println("\r\nDigite:\r\n-> 1 para adicionar um valor a pilha\r\n-> 2 para excluir um valor da pilha\r\n-> 3 para mostrar a pilha\r\n-> 4 para sair");
				y = x.nextInt();
				switch(y){
					case 1:
						if(i < 0){
							System.out.println("A pilha esta cheia desempilhe se deseja adicionar mais valores");
							i++;
							k--;
						}else{
							System.out.println("Valores iquais a zero serao substituido por 1");
							System.out.print("Digite Um valor para a pilha: ");
							vet[i] = x.nextInt();
							if(vet[i]==0){
								vet[i] = 1 ;	
							}
						}
						i--;
						k++;
						break;
					case 2:
						if(k>1){
							i++;
							vet[i]=0;
						}else{
							System.out.print("Nem um valor para desempilhar");
						}
						break;
					case 3:
						System.out.println("Ha na pilha:");
						System.out.println("___");
						for(o=0;o<10;o++){
							if(vet[o]==0){
								continue;
							}else{
								System.out.println(vet[o]);
							}
						}
						System.out.println("___");
						break;
					case 4:
						flag = true;
						break;
				}
				if(flag == true){
					break;
				}
			}
		}
	}
