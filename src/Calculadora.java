

public class Calculadora {
  private float a, b, c;
  private float num1, num2;

  /* Construiu-se dois contrututores para a classe Calculadora, em que um recebe tres floats como parametro para 
  a calculadora de raízes, sendo os coeficientes da equacao, e o outro recebe apenas dois floats para a calculadora basica*/
  
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
