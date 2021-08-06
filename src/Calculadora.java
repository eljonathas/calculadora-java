
/**
 * Classe que contém os métodos de aplicação da calculadora.
 * @author Henrique Silva
 * @author Jonathas Andrade
 * @author Caio André
 */
public class Calculadora {
  private float a, b, c;
  private float num1, num2;
  
  /**
   * Primeiro construtor da classe Calculadora que recebe os parâmetros para o cálculo das raízes reais.
   * @param a primeiro valor do tipo float
   * @param b segundo valor do tipo float
   * @param c terceiro valor do tipo float
   */
  public Calculadora(float a, float b, float c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  /**
   * Segundo construtor da classe Calculadora que recebe os parâmetros para o cálculo das operações escolhidas pelo usuário.
   * @param num1 recebe o primeiro valor da operação
   * @param num2 recebe o segundo valor da operação
   */
  
  public Calculadora(float num1, float num2){
    this.num1 = num1;
    this.num2 = num2;
  }

  /**
   * Realiza a soma dos valores armazenados nos atributos da classe Calculadora.
   * @return o resultado da operação de soma
   */
  public float soma(){
    return num1 + num2;
  }

  /**
   * Realiza a divisão dos valores armazenados nos atributos da classe Calculadora.
   * @return o resultado da operação de divisão
   */
  public float divisao(){
    return num1 / num2;
  }
  
  /**
   * Realiza a multiplicação dos valores armazenados nos atributos da classe Calculadora.
   * @return o resultado da operação de multiplicação
   */
  public float multiplicacao(){
    return num1 * num2;
  }
  
  /**
   * Realiza a subtração dos valores armazenados nos atributos da classe Calculadora.
   * @return o resultado da operação de subtração
   */
  public float subtracao(){
    return num1 - num2;
  }

  /**
   * Realiza o resto da divisão entre os valores armazenados nos atributos da classe Calculadora.
   * @return o resultado da operação de resto da divisão
   */
  public float modulo(){
    return num1 % num2;
  }

  /**
   * Realiza o cálculo das raízes reais entre os valores armazenados nos atributos da classe Calculadora.
   * @return as duas raízes reais resultantes da operação
   */
  public double[] calculaRaizes(){
    float delta = (b * b) - 4 * a * c;

    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
    double x2 = (-b - Math.sqrt(delta)) / (2 * a);

    // Analisa o delta da equacao. Caso seja menor do que 0, nao havera raizes reais. 
    if(delta < 0){
      System.out.println("Não há raízes reais");

      return null;
    }else 
    // Analisa o delta da equacao. Caso seja igual a 0, havera apenas uma raiz real. 
    if (delta == 0){
      System.out.println("\nHá uma raiz real: " + x1);

      return null;
    }
    
    // a funcao retorna o array com as duas raizes da equaçao.
    return new double[]{x1, x2};
  }
}
