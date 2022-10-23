package ㅁㄴㅇㄹㄴㅁㅇㄹ;

//문제 : 아래와 같이 출력해주세요.
//문제 : 단을 * 1000까지 출력해주세요.
//조건 : 곱하는 순서를 거꾸로 해주세요.

class Main {
	public static void main(String[] args) {
		int dan = 8;

		int i = 1;

		while(i<=1000) {
			
			System.out.printf("%d단*%d=%d\n",dan,i,dan*i);
			i++;
		}
	}
}