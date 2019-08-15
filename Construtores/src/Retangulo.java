
public class Retangulo {

		private double largura;
		private double altura;
		
		public Retangulo() {
			this(4,3); //chamando o outro construtor para que ele use o outro construtor.			
			//largura = 4;
			//altura = 3;
		}
		
		public Retangulo(double largura, double altura) {
			this.largura = largura;
			this.altura = altura;
		}
		
		public double calcularArea() {
			return largura*altura;
		}
}
