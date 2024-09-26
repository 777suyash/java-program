class p20{
	public static void main(String args[]){
		char ch = 'A';
		char ch1 = 'a';
		for(int i = 1; i<=4; i++){
			if(i%2==1){
				System.out.print(ch+" ");
			}
			else{
				System.out.print(ch1+" ");
			}
			ch++;
			ch1++;
		}
	}
}