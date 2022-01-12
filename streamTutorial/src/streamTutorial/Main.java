package streamTutorial;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Ankara");
		arrayList.add("Samsun");
		arrayList.add("Eskiþehir");
		arrayList.add("Adana");
		
		
		/*
		Stream<String> stream = arrayList.stream(); //string tutan stream oluþtur
		
		//filter
		Stream<String> resultStream = stream.filter(new Predicate<String>() {	//sonucu yeni stream e attýk
			@Override
			public boolean test(String t) {
				return t.startsWith("A");	//string A ile baþlýyorsa filtreden döndürülür.
			}
		});
		
		Stream<String> upperedStream = resultStream.map(new Function<String,String>(){

			@Override
			public String apply(String t) {
				return t.toUpperCase();
			}
			
		});
		
		Stream<String> sortedStream = upperedStream.sorted(new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		});
		
		sortedStream.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		});
		
		*/
		/////////////BÝRDÝÐER YOL ÝLE///////////////////
		arrayList.stream()
		.filter((s) -> s.startsWith("A"))
		.map((s) -> s.toUpperCase())
		.sorted((s1,s2) -> s1.compareTo(s2))
		.forEach(System.out::println);
	}
}
