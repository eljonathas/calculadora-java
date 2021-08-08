
/**
 * Classe que contém os métodos de aplicação da calculadora.
 * @author Henrique Silva
 * @author Jonathas Andrade
 * @author Caio André
 */
public class Calculadora {
  private double a, b, c;
  private double num1, num2;
  
  /**
   * Primeiro construtor da classe Calculadora que recebe os parâmetros para o cálculo das raízes reais.
   * @param a primeiro valor do tipo double
   * @param b segundo valor do tipo double
   * @param c terceiro valor do tipo double
   */
  public Calculadora(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  /**
   * Segundo construtor da classe Calculadora que recebe os parâmetros para o cálculo das operações escolhidas pelo usuário.
   * @param num1 recebe o primeiro valor da operação
   * @param num2 recebe o segundo valor da operação
   */
  
  public Calculadora(double num1, double num2){
    this.num1 = num1;
    this.num2 = num2;
  }

  /**
   * Realiza a soma dos valores armazenados nos atributos da classe Calculadora.
   * @return o resultado da operação de soma
   */
  public double soma(){
    return num1 + num2;
  }

  /**
   * Realiza a divisão dos valores armazenados nos atributos da classe Calculadora.
   * @return o resultado da operação de divisão
   */
  public double divisao(){
    return num1 / num2;
  }
  
  /**
   * Realiza a multiplicação dos valores armazenados nos atributos da classe Calculadora.
   * @return o resultado da operação de multiplicação
   */
  public double multiplicacao(){
    return num1 * num2;
  }
  
  /**
   * Realiza a subtração dos valores armazenados nos atributos da classe Calculadora.
   * @return o resultado da operação de subtração
   */
  public double subtracao(){
    return num1 - num2;
  }

  /**
   * Realiza o resto da divisão entre os valores armazenados nos atributos da classe Calculadora.
   * @return o resultado da operação de resto da divisão
   */
  public double modulo(){
    return num1 % num2;
  }

  /**
   * Realiza o cálculo das raízes reais entre os valores armazenados nos atributos da classe Calculadora.
   * @return as duas raízes reais resultantes da operação
   */
  public double[] calculaRaizes(){
    double delta = (b * b) - 4 * a * c;

    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
    double x2 = (-b - Math.sqrt(delta)) / (2 * a);

    // Analisa o delta da equação. Caso seja menor do que 0, não haverá raizes reais.
    if(delta < 0){
      System.out.println("Não há raízes reais");

      return null;
    }else 
    // Analisa o delta da equação. Caso seja igual a 0, haverá apenas uma raiz real.
    if (delta == 0){
      System.out.println("\nHá uma raiz real: " + x1);

      return null;
    }
    
    // A funcao retorna o array com as duas raizes da equaçao.
    return new double[]{x1, x2};
  }
}
