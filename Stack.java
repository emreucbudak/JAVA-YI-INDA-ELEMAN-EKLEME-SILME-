package stack;

public class Stack {
	int dizi [];
	int kapasite;
	int indis;
	public Stack (int x) {
		this.kapasite = x;
		dizi = new int[kapasite];
		indis = -1;
	}
	void push(int a){
		int b = 0;
		while (b<1) {
			if (indis == kapasite-1) {
				System.out.println("Liste Dolu!");
				break;
			}
			else {
				indis++;
				dizi [indis] = a;
				System.out.println("Eleman Eklendi!");
				b++;
			}
		}
	}
	int pop () {
		if(indis == -1) {
			System.out.println("Dizin Boş!");
		}
		return dizi[--indis];
	}
	void yazdir() {
		int a = 0;
		while (a<indis+1) {
			System.out.println("Dizin ----->" +dizi[a]);
			a++;
		}
		if (indis == -1) {
			System.out.println("Dizin Boş!");
		}
	}
}
