package projeto2;

import java.text.Collator;
import java.util.Locale;

public class BuscaOrdem {

	public static String[][] ordenar(String[][] dic, int ord) {
		Collator collator = Collator.getInstance(new Locale("pt", "BR"));
		collator.setStrength(Collator.PRIMARY);														
		ord--;
		int ord2 = 0;
		ord2 = ord == 1 ? 0 : 1;

		int in, min;
		String temp1, temp2 = null;
		for (int out = 0; out < dic.length; out++) {
			min = out;
			for (in = out + 1; in < dic.length; in++)
				if (collator.compare(dic[in][ord],dic[min][ord]) < 0)
					min = in;
			temp1 = dic[out][ord];
			temp2 = dic[out][ord2];
			dic[out][ord] = dic[min][ord];
			dic[out][ord2] = dic[min][ord2];
			dic[min][ord] = temp1;
			dic[min][ord2] = temp2;
		}
		return dic;
	}

	public static String search(String[][] dic, int ord, String i) { 
																		
		 Collator collator = Collator.getInstance(new Locale("pt", "BR"));
		 collator.setStrength(Collator.PRIMARY);
		ord--;
		int ord2 = 0;
		ord2 = ord == 1 ? 0 : 1;
	
		int ini = 0;
		int fim = dic.length - 1;

		while (ini <= fim) {
			int meio = (ini + fim) / 2;
			if (collator.compare(i, dic[meio][ord]) > 0) {
				fim = meio - 1;
	
			} else if (collator.compare(i, dic[meio][ord]) < 0) {
				ini = meio + 1;
			} 
			else
				return dic[meio][ord] + " ---> " + dic[meio][ord2];
		}
		return null; 
	}
}
