import java.util.Scanner;

public class Calculadora {
  private float a, b, c;
  private float num1, num2;
  
  public Calculadora(float a, float b, float c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
  
  public Calculadora(float num1, float num2){
    this.num1 = num1;
    this.num2 = num2;
  }
  
  public float soma(){
    return num1 + num2;
  }
  
  public float divisao(){
    return num1 / num2;
  }
  
  public float multiplicacao(){
    return num1 * num2;
  }
  
  public float subtracao(){
    return num1 - num2;
  }
  
  public float modulo(){
    return num1 % num2;
  }
  
  public double[] calculaRaizes(){
    float delta = (b * b) - 4 * a * c;

    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
    double x2 = (-b - Math.sqrt(delta)) / (2 * a);

    if(delta < 0){
      System.out.println("Não há raízes reais");

      return null;
    }else 
    if (delta == 0){
      System.out.println("Há uma raiz real: " + x1);

      return null;
    }
    
    return new double[]{x1, x2};
  }
  
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    boolean execution = true;
    
    while (execution) {
      System.out.println("Digite a opção desejada:\n0 - Sair do programa\n1 - Calculadora básica\n2 - Calculadora de raízes");
      int option = sc.nextInt();
      
      switch (option) {
        case 0:
          execution = false;
          break;

        case 1:
          System.out.print("Digite o primeiro valor: ");
          float num1 = sc.nextFloat();

          System.out.print("Digite o segundo valor: ");
          float num2 = sc.nextFloat();

          System.out.println("Digite a operação desejada: ");
          System.out.println("1 - Soma");
          System.out.println("2 - Subtração");
          System.out.println("3 - Multiplicação");
          System.out.println("4 - Divisão");
          System.out.println("5 - Modulo");

          int option2 = sc.nextInt();

          Calculadora calc = new Calculadora(num1, num2);

          float result = 0;

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
              System.out.println("Opção inválida!");
              break;
          }

          System.out.println("Resultado: "+ result +"\n");
          break;
          
        case 2:
          System.out.print("Digite o valor de a: ");
          float a = sc.nextFloat();
          System.out.print("Digite o valor de b: ");
          float b = sc.nextFloat();
          System.out.print("Digite o valor de c: ");
          float c = sc.nextFloat();

          Calculadora calculadora = new Calculadora(a, b, c);
          double[] raizes = calculadora.calculaRaizes();

          if (raizes != null) {
            System.out.println("Raízes da equação: " + raizes[0] + " e " + raizes[1] + "\n");
          }
          break;
        default:
          System.out.println("Opção inválida!");
          break;
      }
    }
  }
}
