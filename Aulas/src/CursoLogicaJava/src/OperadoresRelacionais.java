
public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		boolean tresMaiorqueDois = 3 > 2;
		System.out.println(" 3 > 2? " +tresMaiorqueDois);
		
		boolean tresMenorqueDois = 3 < 2;
		System.out.println(" 3 < 2? " +tresMenorqueDois);

		boolean tresMaiorqueTres = 3 > 3;
		System.out.println(" 3 > 3? " +tresMaiorqueTres);
		
		boolean tresMaiorOuIgualATres = 3 >= 3;
		System.out.println(" 3 >= 3? " +tresMaiorOuIgualATres);
		
		boolean tresMenorOuIgualATres = 3 <= 3;
		System.out.println(" 3 <= 3? " +tresMenorOuIgualATres);
		
		boolean doisIgualaDois = 2 == 2; 
		System.out.println(" 2 = 2? " +doisIgualaDois);
		
		boolean doisDiferenteSete = 2 != 7; 
		System.out.println(" 2 != 7? " +doisDiferenteSete);
		
		int quatro = 4;
		boolean quatroMaiorQuatro = quatro > quatro;
		System.out.println(" quatro > quatro " + quatroMaiorQuatro);
		
		boolean quatroMaiorIgualQuatro = quatro >= quatro;
		System.out.println(" quatro >= quatro " + quatroMaiorIgualQuatro);
		
		Integer cinco = 5;
		boolean cincoIgualCinco = cinco.equals(cinco);
		System.out.println(" cinco.equals(cinco)? " + cincoIgualCinco);
		
		Integer seis = 6;
		boolean cincoIgualSeis = cinco.equals(seis);
		System.out.println(" cinco.equals(seis)? " + cincoIgualSeis);
		
		
		
	}

}
