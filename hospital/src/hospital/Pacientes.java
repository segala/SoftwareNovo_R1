package hospital;

public class Pacientes {

	String nome;
	int idade;
	int freqCardiacaMax;
	double freqCardiacaAlvoMin;
	double freqCardiacaAlvoMax;	
	
	public int freqCardiacaMax() {
		return 220-idade;
	}

	public double[] freqMinMax() {
		double[] f = new double[2];
		int freqCardiacaMax = freqCardiacaMax();
		
		f[0] = 0.5 * freqCardiacaMax;
		f[1] = 0.85 * freqCardiacaMax;
		
		return f;
	}
	
}
