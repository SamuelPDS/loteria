
        ArrayList<Integer> arrNumerosSorteados = new ArrayList();
Random dinamico = new Random ();
Scanner sc = new Scanner (System.in);
int num = 0;
int numsorteados = 0;
//A Mega Sena sorteia 6 numeros.

while (numsorteados<6){
 num = dinamico.nextInt(60);
    if (arrNumerosSorteados.indexOf(num) == -1)
{
arrNumerosSorteados.add(num);
numsorteados++;
}
}


//solicitar a quantidade que quer jogar
System.out.println("Quantos números você deseja jogar?");
int qtdNumeros = sc.nextInt();

//ArrayList armazena os números do usuário.
ArrayList <Integer>  arrNumUsu = new ArrayList ();
int cont = 0;
int numUsuario;
int opcaoSurpresa = 0;
        System.out.println("Digite 0 para surpresinha ou 1 para numeros digitados");
        opcaoSurpresa = sc.nextInt();
        
//caso queira digitação.
if (opcaoSurpresa ==1){    


while (cont<qtdNumeros){
System.out.println("Digite o numero: ");
numUsuario = sc.nextInt();
arrNumUsu.add(numUsuario);
cont++;    
}
}
else {  
     while (numsorteados < 6) {

//gera um numero randômico de 0 a 60.
num = dinamico.nextInt(60);

//se não encontrou o numero, adiciona
if (arrNumUsu.indexOf(num)==-1){
arrNumUsu.add(num);
numsorteados++;    
}
     }
}

//verifica o total de números acertados pelo usuario.
int totalNum = 0;    
for (Integer numeroJogadorUsu: arrNumerosSorteados){     
if (arrNumUsu.indexOf(numeroJogadorUsu)>0){
totalNum++;       
}
}

//imprime os numeros sorteados
System.out.println("Numeros sorteados");
for (Integer numeros:arrNumerosSorteados)
System.out.println(numeros); 

//imprime os numeros do usuario
System.out.println("Numero do Jogador");
for (Integer numeros:arrNumUsu)
System.out.println(numeros);    

//imprime total de acertos
    System.out.println("Total de numeros acertados: "+totalNum);

