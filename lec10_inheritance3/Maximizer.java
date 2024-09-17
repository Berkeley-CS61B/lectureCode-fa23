package lec10_inheritance3;

public class Maximizer {
	public static Object max(Object[] items) {
		int maxDex = 0;
		for (int i = 0; i < items.length; i += 1) {
			if (items[i] > items[maxDex]) {
				maxDex = i;
			}
		}
		return items[maxDex];
	}

	public static void main(String[] args) {
		Dog d1 = new Dog("Elyse", 3);
		Dog d2 = new Dog("Sture", 9);
		Dog d3 = new Dog("Benjamin", 15);
		Dog[] dogs = new Dog[]{d1, d2, d3};

		Dog d = (Dog) Maximizer.max(dogs);
		System.out.println(d.name);
	}
} 