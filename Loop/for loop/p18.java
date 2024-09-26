class p18{
	public static void main(String args[]){
		char ch = 'A';
		int a = 1;
		for(int i=1; i<=4; i++){
			if(i%2==1){
				System.out.println(a);
				a++;			

			}else{
				System.out.println(ch);
				ch++;
			}
		}
	}
}