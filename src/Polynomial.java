

	public double[] sumOfPolynomial ( double[] coeffOfb) {
		double[] coeffOfa = this.coeffOfa;
		int maxLength = Math.max(coeffOfa.length, coeffOfb.length);
		double[] summedPoly = new double [maxLength];
		for (int i = 0; i<= maxLength; i++ ){
			summedPoly [i] = coeffOfa[i] + coeffOfb[i];
		}
		return summedPoly;
	}
	
