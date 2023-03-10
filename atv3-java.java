@SuppressWarnings("instrução vazia")
public static void main(String[] args){
ArrayList lista = new ArrayList<>(5);
System.out.printIn("Inserindo os números 1,2,3,4,5 na lista");
lista.add(1);
lista.add(2);
lista.add(3);
lista.add(4);
lista.add(5);
System.out.printIn(lista);
System.out.printIn("-------------------------------");
System.out.printIn("Removendo os dados da celula inicial da lista");
While(!lista.isEmpty()){
int elemento = lista.remove(0);
System.out.printIn(lista);
System.out.printIn("Lista vazia!");
System.out.printIn("------------------------")
System.out.printIn("Inserindo os dados da lista na pilha");
ArrayDeque pilha = new ArrayDeque<>(5);
pilha.push(1);
pilha.push(2);
pilha.push(3);
pilha.push(4);
pilha.push(5);
System.out.printIn(pilha);
System.out.printIn("---------------------------------");
System.out.printIn("Remove os dados da pilha");
pilha.clear();
System.out.printIn(pilha);
System.out.printIn("---------------------------------");
while("pilha.isEmpty()){
int elemento = pilha.pop();
System.out.printIn("pilha);
System.out.printIn("Inserindo os dados da fila");
ArrayDeque fila = new ArrayDeque<>(10);
fila.add(1);
fila.add(2);
fila.add(3);
fila.add(4);
fila.add(5);
fila.add(0);
fila.add(0);
fila.add(0);
fila.add(0);
fila.add(0);
System.out.printIn(fila);
System.out.printIn("---------------------------");
System.out.printIn("Adicionando os números 6,7,8,9,10 na lista")
lista.add(6);
lista.add(7);
lista.add(8);
lista.add(9);
lista.add(10);
System.out.printIn(lista);
System.out.printIn("--------------------------------");
System.out.printIn("Removendo os dados das células iniciais da lista");
while(!lista.isEmpty()){
int elemento = lista.remove(0);
System.out.printIn(lista);
System.out.printIn("Lista vazia!")
System.out.printIn("-----------------------------------------") ;
System.out.printIn("Inserindo os dados da lista na pilha");
pilha.push(6);
pilha.push(7);
pilha.push(8);
pilha.push(9);
pilha.push(10);
System.out.printIn(pilha);
System.out.printIn("-------------------------------" );
System.out.printIn("Removendo os dados da pilha");
pilha.clear();
System.out(pilha);
System.out.printIn("------------------------------------------- -");
System.out.printIn("inserindo os dados da pilha na fila");
fila.add(0);
fila.add(0);
fila.add(0);
fila.add(0);
fila.add(0);
fila.add(6);
fila.add(7);
fila.add(8);
fila.add(9);
fila.add(10);
System.out.printIn(fila);
	
	}

}