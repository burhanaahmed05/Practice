//3c

//Not working Properly

public class CharacterInsertionAfterSpace {

	public static void main(String[] args) {
		int Count = 0;
		StringBuffer buff = new StringBuffer("this is nice");
		for(int i = buff.length()-5; i<0; i--) {
			if(buff.charAt(i)==' '){
				buff.insert(i, Count);
		
		}
			
			Count++;
		}
		buff.insert(buff.length()-5, Count);
		System.out.println(buff);
	}
}
