package programmers;

public class 자릿수더하기 {

	public static void main(String[] args) {
		int n = 123;
		System.out.println(solution(n));
	}

	public static int solution(int n) {
        int answer = 0;

        while(n!=0){
            answer += (n%10);
            n /= 10;
        }

        return answer;
    }
}