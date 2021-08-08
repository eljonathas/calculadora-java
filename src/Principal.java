import java.util.Scanner;

public class Principal {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    boolean execution = true;
    
    // O while é utilizado para manter a caluladora aberta até que a variável 'execution' receba o valor false, que sera definido quando o usuário optar pela opção 0 no menu inicial de opções da calculadora.
    while (execution) {
      System.out.print("\nCALCULADORA\n\n     [MENU INICIAL]\n0 - Sair do programa\n1 - Calculadora básica\n2 - Calculadora de raízes \n\nDigite a opção desejada: ");
      int option = sc.nextInt();
      
      /**
       * A partir da função switch, determina-se três possibilidades de funcionamento do programa, alem de uma última posssibilidade
       * para quando um valor de entrada inválido é passado pelo usuário.
       */
      switch (option) {
        // Nesta primeira possibilidade o usuário fecha o programa
        case 0:
        execution = false;
        break;
        // Nesta segunda possibilidade inicia-se a calculadora básica
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
        int operation = sc.nextInt();
        
        Calculadora calc = new Calculadora(num1, num2);
        
        double result = 0;
        
        /**
         *Neste switch, dentro da calculadora básica, 5 opções são possiveis para usuário. Dependendo da valor entrado,
         * uma função da classe calculadora é chamada para realizar uma operação: soma, subtracao, multiplicação, divisão
         * ou resto da divisão. Alem de um último caso, em que uma opção inválida é passada.
         */
        switch (operation) {
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

        /** Nesta terceira possibilidade inicia-se a calculadora de raizes, na qual o usuário deve passar os três
         * coeficientes da equação do segundo grau para a obtenção das raizes.
         */
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


