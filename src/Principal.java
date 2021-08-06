import java.util.Scanner;

public class Principal {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    boolean execution = true;
    
    // o while e utilizado para mantar a caluladora aberta ate que a variavel execution receba o valor false, que sera definido quando o usuario optar pela opcao 0 no menu inicial de opcoes da calculadora. 
    while (execution) {
      System.out.print("\nCALCULADORA\n\n     [MENU INICIAL]\n0 - Sair do programa\n1 - Calculadora básica\n2 - Calculadora de raízes \n\nDigite a opção desejada: ");
      int option = sc.nextInt();
      
      /* A partir da funcao switch determina-se tres possibilidades de funcionamento do programa, alem de uma ultima posssibilidade 
      para quando um valor de entrada invalido e passado pelo usuario. */
      switch (option) {
        // Nesta primeira possibilidade o usuario fecha o programa
        case 0:
        execution = false;
        break;
        // Nesta segunda possibilidade inicia-se a calculadora basica
        case 1:
        System.out.print("\nDigite o primeiro valor: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        double num2 = sc.nextDouble();
        
        
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Modulo");
        System.out.print("\nDigite a operação desejada: ");
        int option2 = sc.nextInt();
        
        Calculadora calc = new Calculadora(num1, num2);
        
        double result = 0;
        
        /* Nesta funcao switch, dentro da calculadora basica, 5 opcoes sao possiveis para usuario. Dependendo da entrada do usuario, uma funcao da classe calculadora e chamada para realizar uma opercao: soma, subtracao, multiplicacao, divisao ou resto da divisao. Alem de uma ultimo caso, em que uma opcao invalida e passada. */ 
        switch (option2) {
          case 1:
          result = calc.soma();
          break;
          case 2:
          result = calc.subtracao();
          break;
          case 3:
          result = calc.multiplicacao();
          break;
          case 4:
          result = calc.divisao();
          break;
          case 5:
          result = calc.modulo();
          break;
          default:
          System.out.println("Opção inválida!\n");
          break;
        }
        
        System.out.println("Resultado: "+ result +"\n");
        break;
        
        /* Nesta terceira possibilidade inicia-se a calculadora de raizes, na qual o usuario deve passar os tres coeficientes da equacao
        do segundo grau para a obtencao das raizes. */
        case 2:
        System.out.print("\nDigite o valor de a: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = sc.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c = sc.nextDouble();
        
        Calculadora calculadora = new Calculadora(a, b, c);
        double[] raizes = calculadora.calculaRaizes();
        
        if (raizes != null) {
          System.out.println("Raízes da equação: " + raizes[0] + " e " + raizes[1] + "\n");
        }
        break;
        default:
        System.out.println("Opção inválida!\n");
        break;
      }
    }

    sc.close();
  }
}


