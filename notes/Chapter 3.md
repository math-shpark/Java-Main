# Chapter 3. 조건문과 반복문

## 3.1 조건문

### 3.1.1 if문

- if문
    - 조건식의 결과에 따라 블록 실행 여부가 결정됨
    - 실행문이 1개의 라인이라면 중괄호 생략 가능
    - 가독성을 위해 라인이 1개여도 중괄호 사용 지향
- if문 예제
  
    ```java
    package sec01;
    
    public class IfTest1 {
    
    	public static void main(String[] args) {
    
    		int score = 93;
    
    		if (score >= 90) {
    			System.out.println("점수가 90보다 큽니다.");
    			System.out.println("등급은 A 입니다.");
    		}
    
    		if (score < 90)
    			System.out.println("점수가 90보다 작습니다.");
    		
    		System.out.println("등급은 B 입니다.");
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        점수가 90보다 큽니다.
        등급은 A 입니다.
        등급은 B 입니다.
        ```
        

### 3.1.2 if-else문

- if-else 문
    - 조건식이 `true`면 if 구문 실행
    - 조건식이 `false`면 else 구문 실행
- if-else 문 예제
  
    ```java
    package sec01;
    
    public class IfTest2 {
    
    	public static void main(String[] args) {
    
    		int score = 85;
    
    		if (score >= 90) {
    			System.out.println("점수가 90보다 큽니다.");
    			System.out.println("등급은 A 입니다.");
    		} else {
    			System.out.println("점수가 90보다 작습니다.");
    			System.out.println("등급은 B 입니다.");
    		}
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        점수가 90보다 작습니다.
        등급은 B 입니다.
        ```
        

### 3.1.3 if-else if-else문

- if-else if-else문
    - 조건을 여러 개 설정하는 조건문
    - 조건을 추가할 경우 `else if` 구문 추가
- if-else if 문 예제
    1. 예제 1
       
        ```java
        package sec01;
        
        public class IfTest3 {
        
        	public static void main(String[] args) {
        
        		int score = 75;
        
        		if (score >= 90) {
        			System.out.println("점수가 100~90 입니다.");
        			System.out.println("등급은 A 입니다.");
        		} else if (score >= 80) {
        			System.out.println("점수가 80~89 입니다.");
        			System.out.println("등급은 B 입니다.");
        		} else if (score >= 70) {
        			System.out.println("점수가 70~79 입니다.");
        			System.out.println("등급은 C 입니다.");
        		} else {
        			System.out.println("점수가 70 미만 입니다.");
        			System.out.println("등급은 D 입니다.");
        		}
        
        	}
        
        }
        ```
        
        - 결과
          
            ```
            점수가 70~79 입니다.
            등급은 C 입니다.
            ```
        
    2. 예제 2 - 주사위 던지기
       
        ```java
        package sec01;
        
        public class IfTest4 {
        
        	public static void main(String[] args) {
        
        		int num = (int) (Math.random() * 6) + 1;
        
        		if (num == 1) {
        			System.out.println("1번이 나왔습니다.");
        		} else if (num == 2) {
        			System.out.println("2번이 나왔습니다.");
        		} else if (num == 3) {
        			System.out.println("3번이 나왔습니다.");
        		} else if (num == 4) {
        			System.out.println("4번이 나왔습니다.");
        		} else if (num == 5) {
        			System.out.println("5번이 나왔습니다.");
        		} else {
        			System.out.println("6번이 나왔습니다.");
        		}
        
        	}
        
        }
        ```
        
        - 결과
          
            ```
            2번이 나왔습니다. // 결과는 랜덤임
            ```
            

### 3.1.4 중첩 if문

- 중첩 if문
    - if문 블록 내부에 또 다른 if문 블록 사용 가능
    - if문 블록 내부에 제어문, 반복문 사용 가능
- 중첩 if문 예제
  
    ```java
    package sec01;
    
    public class IfTest5 {
    
    	public static void main(String[] args) {
    
    		int score = (int) (Math.random() * 20) + 81;
    		
    		System.out.println("점수: " + score);
    
    		String grade;
    
    		if (score >= 90) {
    			if (score >= 95) {
    				grade = "A+";
    			} else {
    				grade = "A";
    			}
    		} else {
    			if (score >= 85) {
    				grade = "B+";
    			} else {
    				grade = "B";
    			}
    		}
    
    		System.out.println("학점: " + grade);
    
    	}
    }
    ```
    
    - 결과
      
        ```
        점수: 93
        학점: A
        ```
        

### 3.1.5 switch문

- switch문
    - 입력한 변수가 어떤 값을 갖느냐에 따라 실행문이 선택됨
    - 조건이 많은 경우 효율적이고 간결하게 사용 가능
    - 모든 조건에 맞는 변수가 아닌 경우 `default` 문 실행
    - `break` 가 없어도 구현에 문제는 없으나 상관없는 case도 확인해야 함
- switch문 예제
    1. 예제 1 - 주사위 번호 뽑기
       
        ```java
        package sec01;
        
        public class SwitchTest1 {
        
        	public static void main(String[] args) {
        
        		int num = (int) (Math.random() * 6) + 1; // 주사위 번호 랜덤으로 하나 출력
        
        		switch (num) {
        		case 1:
        			System.out.println("1번이 나왔습니다.");
        			break;
        		case 2:
        			System.out.println("2번이 나왔습니다.");
        			break;
        		case 3:
        			System.out.println("3번이 나왔습니다.");
        			break;
        		case 4:
        			System.out.println("4번이 나왔습니다.");
        			break;
        		case 5:
        			System.out.println("5번이 나왔습니다.");
        			break;
        		default:
        			System.out.println("6번이 나왔습니다.");
        			break;
        		}
        
        	}
        
        }
        ```
        
        - 결과
          
            ```
            5번이 나왔습니다.
            ```
        
    2. 예제 2 - break 없는 switch
       
        ```java
        package sec01;
        
        public class SwitchTest2 {
        
        	public static void main(String[] args) {
        
        		int time = (int) (Math.random() * 4) + 8; // 현재시간 랜덤으로 받기
        		
        		System.out.println("[현재시간: " + time + " 시]");
        
        		switch (time) {
        		case 8:
        			System.out.println("출근합니다.");
        		case 9:
        			System.out.println("회의를 합니다.");
        		case 10:
        			System.out.println("업무를 봅니다.");
        		default:
        			System.out.println("외근을 나갑니다.");
        		}
        
        	}
        
        }
        ```
        
        - 결과
          
            ```
            [현재시간: 11 시]
            외근을 나갑니다.
            ```
        
    3. 예제 3 - `char` 타입
       
        ```java
        package sec01;
        
        public class SwitchTest3 {
        
        	public static void main(String[] args) {
        
        		char grade = 'B';
        
        		switch (grade) {
        		case 'A':
        		case 'a':
        			System.out.println("우수 회원입니다.");
        			break;
        		case 'B':
        		case 'b':
        			System.out.println("일반 회원입니다.");
        			break;
        		default:
        			System.out.println("손님입니다.");
        		}
        
        	}
        
        }
        ```
        
        - 결과
          
            ```
            일반 회원입니다.
            ```
        
    4. 예제 4 - `String` 타입
       
        ```java
        package sec01;
        
        public class SwitchTest4 {
        
        	public static void main(String[] args) {
        
        		String position = "과장";
        
        		switch (position) {
        		case "부장":
        			System.out.println("700만원");
        			break;
        		case "과장":
        			System.out.println("500만원");
        			break;
        		default:
        			System.out.println("300만원");
        		}
        
        	}
        
        }
        ```
        
        - 결과
          
            ```
            500만원
            ```
            

## 3.2 반복문

### 3.2.1 for문

- for문 구현 과정
    1. 초기화식 실행
    2. 조건식 평가
    3. 조건식 결과가 `true`면 실행문 실행, `false`면 반복문 종료
    4. 증감식 실행
    5. 조건식 평가 → 실행문 실행 → 증감식 실행 반복
    (조건식이 `false` 될 때까지)
- for문 예제
    1. 예제 1 - 1부터 100까지 합 출력
       
        ```java
        package sec02;
        
        public class ForTest1 {
        
        	public static void main(String[] args) {
        
        		int sum = 0; // 합을 저장할 변수
        
        		// 수를 차례대로 더하는 반복문
        		for (int i = 1; i <= 100; i++) {
        			sum += i;
        		}
        
        		// 결과 출력
        		System.out.println("1~100 합 : " + sum);
        
        	}
        
        }
        ```
        
    2. 예제 2 - 1부터 100까지 합 출력(2)
       
        ```java
        package sec02;
        
        public class ForTest2 {
        
        	public static void main(String[] args) {
        
        		// 합을 저장할 변수 지정
        		int sum = 0;
        
        		// 반복문 초기화식
        		int i = 0;
        
        		// 합을 구하는 반복문
        		for (i = 1; i <= 100; i++) {
        			sum += i;
        		}
        
        		// 결과 출력
        		System.out.println("1~" + (i - 1) + " 합 : " + sum);
        
        	}
        
        }
        ```
        
        - 예제 1, 예제 2  결과
          
            ```
            1~100 합 : 5050
            ```
        
    3. 예제 3 - `float` 타입 카운터 변수
       
        ```java
        package sec02;
        
        public class ForTest3 {
        
        	public static void main(String[] args) {
        
        		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
        			System.out.println(x);
        		}
        
        	}
        
        }
        ```
        
        - 결과
          
            ```
            0.1
            0.2
            0.3
            0.4
            0.5
            0.6
            0.70000005
            0.8000001
            0.9000001
            ```
            
            - `float` 타입은 0.1을 정확하게 표현할 수 없어 9번만 실행됨
    4. 예제 4 - 구구단
       
        ```java
        package sec02;
        
        public class ForTest4 {
        
        	public static void main(String[] args) {
        
        		// m이 단, n이 곱하는 수인 구구단 실행 반복문
        		for (int m = 2; m <= 9; m++) {
        			System.out.println("*** " + m + "단 ***");
        			for (int n = 1; n <= 9; n++) {
        				System.out.println(m + " x " + n + " = " + (m * n)); // 결과 출력
        			}
        		}
        
        	}
        
        }
        ```
        
        - 결과
          
            ```
            *** 2단 ***
            2 x 1 = 2
            2 x 2 = 4
            2 x 3 = 6
            2 x 4 = 8
            2 x 5 = 10
            2 x 6 = 12
            2 x 7 = 14
            2 x 8 = 16
            2 x 9 = 18
            *** 3단 ***
            3 x 1 = 3
            3 x 2 = 6
            3 x 3 = 9
            3 x 4 = 12
            3 x 5 = 15
            3 x 6 = 18
            3 x 7 = 21
            3 x 8 = 24
            3 x 9 = 27
            *** 4단 ***
            4 x 1 = 4
            4 x 2 = 8
            4 x 3 = 12
            4 x 4 = 16
            4 x 5 = 20
            4 x 6 = 24
            4 x 7 = 28
            4 x 8 = 32
            4 x 9 = 36
            *** 5단 ***
            5 x 1 = 5
            5 x 2 = 10
            5 x 3 = 15
            5 x 4 = 20
            5 x 5 = 25
            5 x 6 = 30
            5 x 7 = 35
            5 x 8 = 40
            5 x 9 = 45
            *** 6단 ***
            6 x 1 = 6
            6 x 2 = 12
            6 x 3 = 18
            6 x 4 = 24
            6 x 5 = 30
            6 x 6 = 36
            6 x 7 = 42
            6 x 8 = 48
            6 x 9 = 54
            *** 7단 ***
            7 x 1 = 7
            7 x 2 = 14
            7 x 3 = 21
            7 x 4 = 28
            7 x 5 = 35
            7 x 6 = 42
            7 x 7 = 49
            7 x 8 = 56
            7 x 9 = 63
            *** 8단 ***
            8 x 1 = 8
            8 x 2 = 16
            8 x 3 = 24
            8 x 4 = 32
            8 x 5 = 40
            8 x 6 = 48
            8 x 7 = 56
            8 x 8 = 64
            8 x 9 = 72
            *** 9단 ***
            9 x 1 = 9
            9 x 2 = 18
            9 x 3 = 27
            9 x 4 = 36
            9 x 5 = 45
            9 x 6 = 54
            9 x 7 = 63
            9 x 8 = 72
            9 x 9 = 81
            ```
            

### 3.2.2 while문

- while문
    - 조건이 `false`일 때까지 횟수 제한없이 반복
    - 실행 순서
        1. 조건식 평가
        2. 조건식이 `true`면 실행문 실행
- while문 예제
    1. 예제 1
       
        ```java
        package sec02;
        
        public class WhileTest1 {
        
        	public static void main(String[] args) {
        
        		int i = 1;
        
        		while (i <= 10) {
        			System.out.println(i);
        			i++;
        		}
        
        	}
        
        }
        ```
        
        - 결과
          
            ```
            1
            2
            3
            4
            5
            6
            7
            8
            9
            10
            ```
        
    2. 예제 2
       
        ```java
        package sec02;
        
        public class WhileTest2 {
        
        	public static void main(String[] args) {
        
        		// 합을 저장할 변수
        		int sum = 0;
        
        		// 더할 숫자
        		int i = 1;
        
        		// 100까지 더하는 반복문
        		while (i <= 100) {
        			sum += i;
        			i++;
        		}
        
        		// 결과 출력
        		System.out.println("1~" + (i - 1) + " 합 : " + sum);
        
        	}
        
        }
        ```
        
        - 결과
          
            ```
            1~100 합 : 5050
            ```
        
    3. 예제 3
       
        ```java
        package sec02;
        
        public class WhileTest3 {
        
        	public static void main(String[] args) throws Exception {
        
        		boolean run = true; // 프로그램 구동 여부
        		int speed = 0; // 속도 저장 변수
        		int keyCode = 0; // 키보드 입력값 저장 변수
        
        		while (run) {
        			if (keyCode != 13 && keyCode != 10) {
        				System.out.println("-----------------------------");
        				System.out.println("1.증속 | 2.감속 | 3.중지");
        				System.out.println("-----------------------------");
        				System.out.print("선택: ");
        			}
        
        			keyCode = System.in.read();
        
        			if (keyCode == 49) { // 1
        				speed++;
        				System.out.println("현재 속도=" + speed);
        			} else if (keyCode == 50) { // 2
        				speed--;
        				System.out.println("현재 속도=" + speed);
        			} else if (keyCode == 51) { // 3
        				run = false;
        			}
        		}
        
        		System.out.println("프로그램 종료");
        
        	}
        }
        ```
        
        - 결과
          
            ```
            -----------------------------
            1.증속 | 2.감속 | 3.중지
            -----------------------------
            선택: 1
            현재 속도=1
            -----------------------------
            1.증속 | 2.감속 | 3.중지
            -----------------------------
            선택: 2
            현재 속도=0
            -----------------------------
            1.증속 | 2.감속 | 3.중지
            -----------------------------
            선택: 3
            프로그램 종료
            ```
            

### 3.2.3 do-while문

- do-while문
    - 우선 실행 후 조건식에 따라 추가로 반복할지 결정
    - 실행 순서
        1. 실행문 실행
        2. 조건식 평가
        3. 조건식 결과가 `true`면 실행문 실행, `false`면 반복문 종료
- do-while문 예제
  
    ```java
    package sec02;
    
    import java.util.Scanner;
    
    public class DoWhileTest {
    
    	public static void main(String[] args) {
    
    		System.out.println("메시지를 입력하세요");
    		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
    
    		Scanner scanner = new Scanner(System.in);
    		String inputString; // 입력한 내용을 저장할 변수
    
    		do {
    			System.out.print("> "); // 입력할 칸 표시
    
    			inputString = scanner.nextLine(); // 입력한 값 가져오기
    
    			System.out.println(inputString); // 입력한 값 출력
    		} while (!inputString.equals("q")); // 입력한 값이 q이면 반복문 종료
    
    		System.out.println(); // 1줄 간격
    		System.out.println("프로그램 종료"); // 프로그램 종료 메시지 출력
    
    		scanner.close();
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        메시지를 입력하세요
        프로그램을 종료하려면 q를 입력하세요.
        > 1
        1
        > 2
        2
        > q
        q
        
        프로그램 종료
        ```
        

### 3.2.4 break문

- break문
    - 반복문을 실행 중지할 때 사용
    - switch문 종료할 때 사용
    - 반복문이 중첩되어 있는 경우 가장 가까운 반복문만 종료
    - 중첩 반복문에서 바깥쪽 반복문까지 종료하려면 라벨을 붙여야 함
- break문 예제
    1. 예제 1
       
        ```java
        package sec02;
        
        public class BreakTest1 {
        
        	public static void main(String[] args) {
        
        		while (true) {
        			int num = (int) (Math.random() * 6) + 1; // 랜덤 숫자 가져오기
        
        			System.out.println(num); // 랜덤 숫자 출력
        
        			// 랜덤 숫자가 6이면 반복문 종료
        			if (num == 6) {
        				break;
        			}
        		}
        
        		System.out.println("프로그램 종료");
        
        	}
        
        }
        ```
        
        - 결과
          
            ```
            5
            4
            6
            프로그램 종료 // 프로그램 종료 과정은 랜덤임(6이 언제 나올지 모름)
            ```
        
    2. 예제 2 - 라벨 사용
       
        ```java
        package sec02;
        
        public class BreakTest2 {
        
        	public static void main(String[] args) {
        
        		// 바깥쪽 반복문에 Outter 라는 라벨 붙임
        		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
        			for (char lower = 'a'; lower <= 'z'; lower++) {
        				
        				System.out.println(upper + "-" + lower);
        				
        				if (lower == 'g') {
        					break Outter; // 종료할 반복문 라벨명을 붙임
        				}
        				
        			}
        		}
        		System.out.println("프로그램 실행 종료");
        
        	}
        }
        ```
        
        - 결과
          
            ```
            A-a
            A-b
            A-c
            A-d
            A-e
            A-f
            A-g
            프로그램 실행 종료
            ```
            

### 3.2.5 continue문

- continue문
    - 조건식으로 이동하게 하는 구문
    - 특정 조건을 만족하는 경우 `continue`문 이후 문장을 실행하지 않고 다음 반복으로 넘어감
- continue문 예제
  
    ```java
    package sec02;
    
    public class ContinueTest {
    
    	public static void main(String[] args) {
    
    		for (int i = 1; i <= 10; i++) {
    			if (i % 2 != 0) {
    				continue; // 홀수면 출력하지 않고 조건식으로 돌아감
    			}
    			System.out.println(i);
    
    		}
    	}
    
    }
    ```
    
    - 결과
      
        ```
        2
        4
        6
        8
        10
        ```
        

---