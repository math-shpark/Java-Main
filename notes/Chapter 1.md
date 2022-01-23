# Chapter 1. 데이터 타입

## 1.1 변수

### 1.1.1 변수란?

- 변수의 개념
    - 값을 저장할 수 있는 메모리의 공간
        - 단위 : bit
    - 하나의 값만 저장 가능
    - 한 가지의 타입 값만 저장 가능
    - 프로그래머가 메모리상의 데이터에 접근하기 위한 방법
    - 컴퓨터 내부의 데이터와 1:1 대응
      
        ⇒ 실제 데이터를 의미하는 변수를 통해 메모리상의 데이터에 접근 가능함
        
    - 한 가지 유형의 데이터만을 저장할 수 있고, 각 변수가 저장할 수 있는 데이터 유형이 정해져 있음
    - 기본형(Primitive Type)과 참조형(Reference Type) 두 가지 변수가 존재함
    - 데이터를 저장할 메모리의 위치를 나타내는 이름
    - 메모리 상에 데이터를 보관할 수 있는 공간 확보
    - 적절한 메모리 공간을 확보하기 위해서 변수의 타입 등장
    - `=`를 통해서 CPU에게 연산작업 의뢰

### 1.1.2 변수의 선언

- 변수 선언
    - 자바 가상 머신(JVM)에게 데이터를 저장하기 위한 메모리 할당을 요청하는 것
    - 데이터가 필요로 하는 크기의 메모리 할당을 위해 데이터 타입을 명시해야 함
    - 변수 이름은 메모리 주소에 붙여진 이름
    - 프로그램은 변수 이름을 통해서 메모리 주소에 접근, 저장, 조회
    - 변수가 어떤 값을 저장하고 있는지 쉽게 알 수 있도록 명명하는 것이 좋음
    - 변수 이름의 길이는 프로그램 실행과 무관하여 길어도 상관없음
    - 변수명으로 한글도 사용 가능하지만 가급적이면 포함하지 않는 것이 좋음
    - 구문
      
        ```java
        데이터 타입 변수명;
        ```
        
    - 사용 예
      
        ```java
        boolean asYn;
        ```
    
- 명명 규칙
    1. 첫 번째 글자는 문자, `$`, `_` 만 가능하고 숫자 불가
    2. 영어 대소문자 구분
    3. 첫 글자는 영어 소문자로 시작하고 camel case 적용
        - camel case : 여러 단어가 합쳐지는 경우 이어지는 단어의 첫 글자는 대문자
            - 예시 : mathScore
    4. 문자 수의 제한 없음
    5. 예약어 사용 불가
        - 예약어 : 자바 문법을 위해 미리 지정되어 있는 단어
    6. 공백 안됨
- 예약어
  
  
    | 분류 | 예약어 |
    | --- | --- |
    | 기본 데이터 타입 | boolean, byte, char, short, int, long, float, double |
    | 접근 지정자 | private, protected, public |
    | 클래스 관련 | class, abstract, interface, extends, implements, enum |
    | 객체 관련 | new, instanceof, this, super, null |
    | 메소드 관련 | void, return |
    | 제어문 관련 | if, else, switch, case, default, for, do, while, break, continue |
    | 논리값 | true, false |
    | 예외 처리 관련 | try, catch, finally, throw, throws |
    | 기타 | transient, volatile, package, import, sychronized, native, final, static, strictfp, assert |
    - 시스템에서 일정 특성을 가진 언어로 등록된 것
    - 데이터 타입이나 프로그램 정의를 위해 사용
    - 모든 예약어는 소문자로 이루어짐
    - `const`와 `goto`는 현재 사용되고 있지 않으며 식별자로도 사용할 수 없음
    - `sizeof` 예약어는 자바에서 더 이상 사용되지 않음

### 1.1.3 변수의 사용

- 변수값 저장
    - 변수에 값을 저장할 때 대입 연산자 `=` 사용
    - 초기값 : 변수를 선언하고 처음으로 저장하는 값
    - 초기화 : 변수에 초기값을 주는 행위
    - 리터럴 : 소스 코드 내에서 직접 입력된 값
    - 사용 예
      
        ```java
        int var;       // 변수 선언
        var = 25;      // 변수 초기화
        
        int age = 25;  // 변수 선언과 초기화를 한 줄로 표현 가능
        ```
        
    - 기본형의 경우 할당된 메모리에 직접 값이 들어감
    - 메모리 할당 예시
      
        ```java
        int age;     // 4byte가 메모리에 할당됨
        age = 25;    // 25가 할당된 메모리에 저장됨
        ```
        
    - 변수 선언 및 값 할당 예시
      
        ```java
        package sec02;
        
        public class AssignTest {
        
        	public static void main(String[] args) {
        		// TODO Auto-generated method stub
        		
        		int x, y;
        		float z = 3.414f;
        		double w = 3.1415;
        		boolean truth = true;
        		char c;
        		String str;
        		String str1 = "bye";
        		c = 'A';
        		str = "Hi out there!";
        		x = 6;
        		y = 1000;
        
        	}
        
        }
        ```
    
- 리터럴
    1. 정수 리터럴
        - 소수점이 없는 정수 리터럴은 10진수로 간주
        - 0으로 시작되는 리터럴은 8진수로 간주
        - `0x` 또는 `0X`로 시작하고 0~9 숫자나 A~F로 구성된 리터럴은 16진수로 간주
    2. 실수 리터럴
        - 소수점이 있는 리터럴은 10진수로 간주
        - E 또는 e가 있는 리터럴은 10진수 밑과 지수로 간주
          
            ```
            5E7 // 5 * 10^7
            0.12E-5 // 0.12 * 10^(-5)
            ```
        
    3. 문자 리터럴
        - 작은 따옴표 `'` 로 묶은 텍스트는 하나의 문자 리터럴로 간주
        - 이스케이프 문자 : `\`
        - 이스케이프 문자
          
          
            | 이스케이프 문자 | 용도 | 유니코드 |
            | --- | --- | --- |
            | \t | 수평 탭 | 0x0009 |
            | \n | 줄 바꿈 | 0x000a |
            | \r | 리턴 | 0x000d |
            | \" | “ | 0x0022 |
            | \' | ' | 0x0027 |
            | \\ | \ | 0x005c |
            | \u16진수 | 16진수 유니코드 | 0x000 ~ 0xfff |
    4. 문자열 리터럴
        - 큰 따옴표 `"`로 묶은 텍스트는 문자열 리터럴로 간주
        - 큰 따옴표 안에 텍스트가 없어도 문자열로 간주
        - 문자열 내부에서 이스케이프 문자 사용 가능
    5. 논리 리터럴
        - `true`, `false`
- 변수값 읽기
    - 변수는 초기화가 되어야 읽을 수 있음
- 자동 초기화
    - 변수에 값을 할당하지 않은 경우 자동으로 초기화됨
    - Default 초기화 : 변수의 값이 자동으로 초기화되는 것
    - 각 데이터 유형별로 할당되는 기본값(Default Value)가 존재
    - 지역변수는 자동으로 초기화되지 않음
        - 지역변수 : 메서드 안에서 선언된 변수
    - 기본값
      
      
        | 데이터 타입 | 초기 값 |
        | --- | --- |
        | byte | 0 |
        | short | 0 |
        | int | 0 |
        | long | 0L |
        | float | 0.0F |
        | double | 0.0D |
        | char | '\u0000’ (NULL) |
        | boolean | false |
        | 참조형 | null |
- 변수 예제
    1. 예제 1
       
        ```java
        package sec02;
        
        public class VariableTest1 {
        
        	public static void main(String[] args) {
        		int value = 10;
        		
        		int result = value + 10;
        		
        		System.out.println(result);
        	}
        
        }
        ```
        
        - 결과
          
            ```
            20
            ```
        
    2. 예제 2
       
        ```java
        package sec02;
        
        public class VariableTest2 {
        
        	public static void main(String[] args) {
        
        		// 개인정보
        		String name = "홍길동";
        		int age = 26;
        		int height = 170;
        		int weight = 65;
        
        		// 개인정보 출력
        		System.out.printf("고객님 이름은 %s이고, 나이는 %d입니다.", name, age);
        		System.out.println("");
        		System.out.printf("고객님 신체정보는 키 %dcm이고 체중은 %dkg입니다.", height, weight);
        
        	}
        
        }
        ```
        
        - 결과
          
            ```
            고객님 이름은 홍길동이고, 나이는 26입니다.
            고객님 신체정보는 키 170cm이고 체중은 65kg입니다.
            ```
            

### 1.1.4 변수의 사용 범위

- 변수의 사용 범위
    - 블록 `{}` 내에서 선언되고 사용됨
    - 변수는 선언된 블록 내에서만 사용 가능
    1. 전역(Global) 변수
        - 클래스 선언부 밑에 선언된 변수
        - 여러 메서드에서 공통으로 사용 가능
    2. 지역(Local) 변수
        - 메서드 선언부 밑에 선언된 변수
        - 메서드 매개변수로 선언된 변수
        - 해당 변수가 선언된 메서드 내에서만 사용 가능
- 변수 범위 예제
    1. 예제 1
       
        ```java
        package sec02;
        
        public class VariableScopeTest1 {
        
        	public static void main(String[] args) {
        		int v1 = 15;
        		
        		if(v1 > 10) {
        			int v2 = v1 - 10;
        		}
        		
        		int v3 = v1 + v2 + 5; // v2 변수는 if 내에서만 사용 가능하기 때문에 에러 발생
        	}
        
        }
        ```
        
        - 결과
          
            ```
            Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
            	v2 cannot be resolved to a variable
            
            	at sec02.VariableScopeTest1.main(VariableScopeTest1.java:12)
            ```
        
    2. 예제 2
       
        ```java
        package sec02;
        
        public class VariableScopeTest2 {
        
        	int sum; // 전역 변수
        
        	public void addScore(int javaScore) { // 지역 변수
        		int score = javaScore; // 지역 변수
        		sum = sum + score;
        	}
        
        	public int getSum() {
        		return sum;
        	}
        
        }
        ```
        
    3. 예제 3
       
        ```java
        package sec02;
        
        public class VariableScopeTest3 {
        
        	boolean win;
        
        	public void setWin(int s) {
        		int score = s;
        		if (score > 10) {
        			win = true;
        		}
        	}
        
        	public void printWinner() {
        		if (win == true) {
        			System.out.println("이기다.");
        		} else {
        			System.out.println("지다.");
        		}
        	}
        
        }
        ```
        

## 1.2 데이터 타입

### 1.2.1 기본 타입

- 데이터 타입
    - 프로그램 언어에서는 사용할 데이터를 변수에 저장하고 관리
    - 정의된 변수를 통해 데이터의 의미를 정확하게 해석하여 사용
    - 변수를 사용하려면 앞에 데이터 타입을 설정해야 함
    - 데이터 타입은 데이터의 성격을 규정
    - 기본형과 참조형으로 분류
    - 예시
      
        ```java
        int age;   // 기본형인 int 형의 age 변수 선언(age 변수를 정수 형태의 값만 저장할 수 있도록 선언)
        age = 25;  // age 변수에 값 할당(25라는 정수형 초기 값을 할당)
        ```
    
- 기본 데이터 타입
    - 종류
      
      
        | 타입 | 세부타입 | 데이터형 | 크기 | 기본값 |
        | --- | --- | --- | --- | --- |
        | 논리형 |  | boolean | 1byte | false |
        | 문자형 |  | char | 2byte | null(\u0000) |
        | 숫자형 | 정수형 | byte | 1byte | (byte)0 |
        |  |  | short | 2byte | (short)0 |
        |  |  | int | 4byte | 0 |
        |  |  | long | 8byte | 0L |
        |  | 실수형 | float | 4byte | 0.0f |
        |  |  | double | 8byte | 0.0d |
- bit, byte
    - bit : 메모리에서 0과 1을 저장하는 최소 기억 단위
    - byte : 8bit
    - 정수 타입(byte, short, int, long)일 경우 $-2^{n-1} \sim 2^{n-1}-1$의 값을 저장할 수 있는데 여기서 $n$이 메모리 사용 크기

### 1.2.2 정수 타입

- 정수 타입
    - 종류
      
      
        | 데이터 타입 | 크기 | 표현 범위 |
        | --- | --- | --- |
        | byte | 1byte | -2^7 ~ 2^7-1
        (-128 ~ 127) |
        | short | 2byte | -2^(15) ~ 2^(15)-1
        (-32768 ~ 32767) |
        | int | 4byte | -2^(31) ~ 2^(31)-1
        (-2147483648 ~ 2147483647) |
        | long | 8byte | -2^(63) ~ 2^(63)-1
        (-9223372036854775808 ~ 9223372036854775807) |
    - 부호형(Signed)임
        - 부호형 : bit가 0이면 양수, 1이면 음수
    - 네 가지 기본형은 가질 수 있는 범위에 제한이 있음
    - 실행 중 범위를 초과하면 최소값부터 다시 반복 저장
      
        ⇒ 엉터리 값(쓰레기값)이 변수에 저장됨
        
    - 정수형 중 형을 명시하지 않은 경우 `int`형을 기본으로 정의
    - 10진수(Decimal), 8진수(Octal), 16진수(Hexadecimal)로 표현
    - 사용 예
      
        ```java
        23      // 10진수
        023     // 8진수(0으로 시작)
        0xBAAC  // 16진수(0x로 시작)
        
        23L, 023L, 0xBAACL  // long 형(문자 L이나 l을 사용)
        ```
    
- byte
    - 색상 정보 및 파일 또는 이미지 등의 이진 데이터를 처리할 때 주로 사용
    - 범위를 초과하는 값을 저장할 경우 에러(Type mismatch: cannot convert from int to byte) 발생
    - 최상위 비트는 값의 부호 결정
    - 최상위 비트가 0이면 양수, 1이면 음수
    - 음수 표현 : 양수의 2진수를 전체 반전(1의 보수)한 후 1을 더함
    - 2진수 계산 예시
        - 00001001 ⇒ 9
        - 10001001 ⇒ -119
    - 부호 표현
        - 정수 : 1의 보수
        - 문자 : 아스키(ASCII) 코드
        - 실수 : 부동소수점 표현
- byte 예제
    1. 예제 1
       
        ```java
        package sec03;
        
        public class ByteTest {
        
        	public static void main(String[] args) {
        		byte var1 = -128;
        		byte var2 = -30;
        		byte var3 = 0;
        		byte var4 = 30;
        		byte var5 = 127;
        //		byte var6 = 128; // 컴파일 에러
        		
        		System.out.println(var1);
        		System.out.println(var2);
        		System.out.println(var3);
        		System.out.println(var4);
        		System.out.println(var5);
        	}
        
        }
        ```
        
        - 결과
          
            ```
            -128
            -30
            0
            30
            127
            ```
        
    2. 예제 2 - 쓰레기값
       
        ```java
        package sec03;
        
        public class GarbageValueExample {
        
        	public static void main(String[] args) {
        		byte var1 = 125;
        		int var2 = 125;
        
        		for (int i = 0; i < 5; i++) {
        			var1++;
        			var2++;
        
        			System.out.println("var1 : " + var1 + " var2 : " + var2);
        		}
        	}
        
        }
        ```
        
        - 결과
          
            ```
            var1 : 126 var2 : 126
            var1 : 127 var2 : 127
            var1 : -128 var2 : 128
            var1 : -127 var2 : 129
            var1 : -126 var2 : 130
            ```
    
- char
    - 자바는 모든 문자를 유니코드로 처리
        - 유니코드 : 세계 각국의 문자들을 코드값으로 매핑한 국제 표준
        - 자바는 하나의 유니코드를 저장하기 위해 char 타입 제공
    - 유니코드는 음수가 없기 때문에 `char` 타입의 변수에는 음수 값을 저장할 수 없음
    - 작은 따옴표 `'`로 감싼 문자 뿐만 아니라 문자의 유니코드로 값을 저장할 수 있음
      
        ```java
        char c = 65; // A의 유니코드를 10진수로 표현한 것
        char d = '\u0041'; // A의 유니코드를 16진수로 표현한 것(16진수는 \u를 붙여줘야 함)
        ```
        
    - 문자의 유니코드 확인 방법
      
        ```java
        char c = 'A';
        int uniCode = c;
        ```
        
    - 초기화를 위해 작은 따옴표를 연달아 붙인 것은 컴파일 에러 발생(String은 가능)
      
        ⇒ 공백 하나를 포함해서 초기화해야 함
    
- char 예제
  
    ```java
    package sec03;
    
    public class CharTest {
    
    	public static void main(String[] args) {
    		char c1 = 'A'; // 문자를 직접 저장
    		char c2 = 65; // 10진수로 저장
    		char c3 = '\u0041'; // 16진수로 저장
    		
    		char d1 = '가';
    		char d2 = 44032;
    		char d3 = '\uac00';
    		
    		int uniCode = c1; // 유니코드 계산
    		
    		System.out.println(c1);
    		System.out.println(c2);
    		System.out.println(c3);
    		
    		System.out.println(d1);
    		System.out.println(d2);
    		System.out.println(d3);
    		
    		System.out.println(uniCode);
    	}
    
    }
    ```
    
    - 결과
      
        ```
        A
        A
        A
        가
        가
        가
        65
        ```
    
- short
    - C 언어와의 호환을 위해 사용
    - 자바에서 잘 사용되지 않는 타입
- int
    - 정수 연산을 하기 위한 기본 타입
    - byte 타입 또는 short 타입 변수를 `+` 연산하면 int 타입으로 변환된 후 연산되고 결과도 int 타입이 됨
- int 예제
  
    ```java
    package sec03;
    
    public class IntTest {
    
    	public static void main(String[] args) {
    		
    		int var1 = 10; // 10진수
    		int var2 = 012; // 8진수
    		int var3 = 0xA; // 16진수
    		
    		System.out.println(var1);
    		System.out.println(var2);
    		System.out.println(var3);
    	}
    
    }
    ```
    
    - 결과
      
        ```
        10
        10
        10
        ```
    
- long
    - 수치가 큰 데이터를 다루는 프로그램(은행, 우주 등)에서 필수적으로 사용
    - 초기화할 때 정수값 뒤에 소문자 `l`이나 대문자 `L`을 붙일 수 있음
      
        (8byte 정수 데이터임을 컴파일러에게 알려주기 위한 목적)
    
- long 예제
  
    ```java
    package sec03;
    
    public class LongTest {
    
    	public static void main(String[] args) {
    
    		long var1 = 10;
    		long var2 = 20L;
    //		long var3 = 100000000000000000; // 컴파일 에러(L을 붙이지 않았기 때문)
    		long var4 = 100000000000000000L;
    
    		System.out.println(var1);
    		System.out.println(var2);
    		System.out.println(var4);
    	}
    
    }
    ```
    
    - 결과
      
        ```
        10
        20
        100000000000000000
        ```
        

### 1.2.3 실수 타입

- 실수 타입
    - 종류
      
      
        | 데이터 타입 | 크기 | 표현 범위 |
        | --- | --- | --- |
        | float | 4byte | 1.4E-45 ~ 3.4028235E38 |
        | double | 8byte | 4.9E-324 ~ 1.7976931348623157E308 |
    - 정수형과 크기는 같지만 다른 저장 방식 때문에 정수 타입보다 훨씬 더 큰 범위의 값을 저장할 수 있음
    - 실수형 중 형을 명시하지 않으면 `double`이 기본형으로 정의됨
      
        ⇒ 실수 리터럴을 `float` 타입에 저장하려면 뒤에 소문자 `f`나 대문자 `F`를 붙여야 함
        
    - 실수형 포맷은 표준인 IEEE 754를 채택하여 자바를 플랫폼 독립적인 언어로 만듦
    - 실수형 리터럴은 소수점과 지수로 표현됨
    - 사용 예
      
        ```java
        E, e     // 지수 표현
        F, f     // float 표현
        D, d     // double 표현
        
        3.14     // 간단한 실수 값
        6.02E23  // 큰 실수 값
        1.718F   // float 형의 실수 값
        ```
        
    - 부동 소수점 방식
        - 부호, 가수, 지수로 표현하는 방식
        - 가수($m$)의 범위 : $0\le m <1$
    - 높은 정밀도를 요구하는 계산은 `double` 사용
- 실수 타입 예제
  
    ```java
    package sec03;
    
    public class FloatDoubleTest {
    
    	public static void main(String[] args) {
    
    		// 실수값 저장
    		double var1 = 3.14;
    		// float var2 = 3.14; //컴파일 에러(Type mismatch)
    		float var3 = 3.14F;
    
    		// 정밀도 테스트
    		double var4 = 0.1234567890123456789;
    		float var5 = 0.1234567890123456789F;
    
    		System.out.println("var1: " + var1);
    		System.out.println("var2: " + var3);
    		System.out.println("var4: " + var4);
    		System.out.println("var5: " + var5);
    
    		// e 사용하기
    		int var6 = 3000000;
    		double var7 = 3e6;
    		float var8 = 3e6F;
    		double var9 = 2e-3;
    		
    		System.out.println("var6: " + var6);
    		System.out.println("var7: " + var7);
    		System.out.println("var8: " + var8);
    		System.out.println("var9: " + var9);
    	}
    
    }
    ```
    
    - 결과
      
        ```
        var1: 3.14
        var2: 3.14
        var4: 0.12345678901234568
        var5: 0.12345679
        var6: 3000000
        var7: 3000000.0
        var8: 3000000.0
        var9: 0.002
        ```
        

### 1.2.4 논리 타입

- 논리 타입
    - `boolean`
    - 크기 : 1byte
    - 표현 범위 : `true` 또는 `false`
    - `boolean` 형은 `true`와 `false`라는 두 리터럴(literal) 값이 있음
    - `int` 형과 `boolean` 형은 서로 형변환이 불가능함
    - 사용 예
      
        ```java
        boolean useYn;     // useYn 변수를 boolean 타입으로 선언
        useYn = false;     // 유효
        useYn = False;     // 자바는 대소문자를 구분하기 때문에 유효하지 않음
        useYn = "true";    // boolean 형에 문자열을 할당할 수 없으므로 유효하지 않음
        ```
    
- 논리 타입 예제
  
    ```java
    package sec03;
    
    public class BooleanTest {
    
    	public static void main(String[] args) {
    		boolean stop = true;
    		if (stop) {
    			System.out.println("중지합니다.");
    		} else {
    			System.out.println("시작합니다.");
    		}
    	}
    
    }
    ```
    
    - 결과
      
        ```
        중지합니다.
        ```
        

## 1.3 타입 변환

### 1.3.1 자동 타입 변환

- 데이터 타입의 변환(형변환)
    - 데이터 타입의 변환은 변수의 타입을 다른 타입으로 변경하고자 할 때 형변환 연산자를 사용하여 변환
    - 형변환 연산자 : 형변환 시 변환하려는 데이터 타입을 괄호로 묶어서 표현하는데 이 괄호를 형변환 연산자라고 함
    - 종류 : 자동(묵시적) 타입 변환, 강제(명시적) 타입 변환
- 자동 타입 변환(Promotion)
    - 작은 데이터 타입에서 큰 데이터 타입으로 형변환
    - 데이터 손실의 우려가 없어 자동 캐스팅
    - 형변환 연산자를 사용하지 않아도 자동으로 형변환
        - 예 : 4byte의 `int` 형을 8byte의 `double` 형으로 자동 변환 가능
    - 크기별 정리
      
        ```
        byte < short < int < long < float < double
        ```
        
        - `long`보다 `float`이 더 큰 타입인 이유 : 표현할 수 있는 값의 범위가 더 크기 때문
    - `char` 타입이 `int` 타입으로 자동 변환되면 유니코드 값이 `int` 타입에 저장됨
    - `char` 타입은 음수를 저장할 수 없어서 `byte`타입에서 `char` 타입으로 자동 변환이 안됨
    - 사용 예
      
        ```java
        int age = 25;
        double avgAge = age; // double avgAge = (double)age;와 같은 의미로 형변환 연산자(double)이 생략
        ```
        
    - 규칙
        - `byte` → `short` → `int` → `long` → `float` → `double` 순으로 형변환
        - `char` → `int` → `long` → `float` → `double` 순으로 형변환
- 자동 타입 변환 예제
    1. 예제 1
       
        ```java
        package sec04;
        
        public class PromotionTest1 {
        
        	public static void main(String[] args) {
        
        		// 1. byte에서 int로 자동 형변환
        		byte byteValue = 10;
        		int intValue = byteValue;
        		
        		System.out.println(intValue);
        
        		// 2. char에서 int로 자동 형변환
        		char charValue = '가';
        		intValue = charValue;
        		
        		System.out.println("가의 유니코드=" + intValue);
        
        		// 3. int에서 long으로 자동 형변환
        		intValue = 500;
        		long longValue = intValue;
        
        		System.out.println(longValue);
        
        		// 4. long에서 double로 자동 형변환
        		intValue = 200;
        		double doubleValue = intValue;
        		System.out.println(doubleValue);
        
        	}
        
        }
        ```
        
        - 결과
          
            ```
            10
            가의 유니코드=44032
            500
            200.0
            ```
        
    2. 예제 2
       
        ```java
        package sec04;
        
        public class PromotionTest2 {
        
        	public static void main(String[] args) {
        
        		byte b1 = 127;
        		char c1 = '가';
        		int i1;
        		double d1;
        
        		System.out.println("자동 형변환의 결과");
        		i1 = b1; // 127이라는 값이 1byte에서 4byte로 표현됨
        
        		System.out.println("i1 = b1의 형변환 " + i1);
        		i1 = c1; // '가'를 유니코드로 표현한 십진수 값(44032)가 i1에 저장됨
        
        		System.out.println("i1 = c1의 형변환 " + i1);
        		d1 = i1; // i1에 저장된 44032가 44032.0으로 8byte 실수로 전환되어 저장됨
        
        		System.out.println("d1 = i1의 형변환 " + d1);
        
        	}
        
        }
        ```
        
        - 결과
          
            ```
            자동 형변환의 결과
            i1 = b1의 형변환 127
            i1 = c1의 형변환 44032
            d1 = i1의 형변환 44032.0
            ```
            

### 1.3.2 강제 타입 변환

- 강제 타입 변환(Demotion)
    - 큰 데이터 타입에서 작은 데이터 타입으로 형변환
    - 강제적으로 큰 데이터 타입을 작은 데이터 타입으로 쪼개어서 저장하는 것
      
        ⇒ 데이터 손실이 이루어질 수 있음
        
        - 예시 : 4byte의 `int`형을 1byte의 `byte` 타입으로 전환하면 4byte를 1byte씩 자른 후 마지막 1byte만 취함
    - `int` 타입 변수에 저장된 값이 유니코드 범위라면 `char` 타입으로 명시적 형변환 가능
    - 실수 타입에서 정수 타입으로 변환 시 소수점 이하 부분은 버려지고 정수 부분만 저장
    - 사용 예
      
        ```java
        double avgAge = 24.56;
        int age = (int) avgAge;
        ```
    
- 강제 타입 변환 예제
    1. 예제 1
       
        ```java
        package sec04;
        
        public class DemotionTest1 {
        
        	public static void main(String[] args) {
        
        		int intValue = 44032;
        		char charValue = (char) intValue;
        		System.out.println(charValue);
        
        		long longValue = 500;
        		intValue = (int) longValue;
        		System.out.println(intValue);
        
        		double doubleValue = 3.14;
        		intValue = (int) doubleValue;
        		System.out.println(intValue);
        
        	}
        
        }
        ```
        
        - 결과
          
            ```
            가
            500
            3
            ```
        
    2. 예제 2
       
        ```java
        package sec04;
        
        public class DemotionTest2 {
        
        	public static void main(String[] args) {
        
        		byte b1;
        		char c1;
        		int i1 = 128;
        		int i2 = 97;
        		double d1 = 3.14;
        
        		System.out.println("명시적 형변환의 결과");
        
        		b1 = (byte) i1;
        		System.out.println("b1 = (byte) i1의 형변환 " + b1);
        
        		c1 = (char) i2;
        		System.out.println("c1 = (char) i2의 형변환 " + c1);
        
        		i1 = (int) d1;
        		System.out.println("i1 = (double) d1의 형변환 " + i1);
        
        	}
        
        }
        ```
        
        - 결과
          
            ```
            명시적 형변환의 결과
            b1 = (byte) i1의 형변환 -128
            c1 = (char) i2의 형변환 a
            i1 = (double) d1의 형변환 3
            ```
        
    3. 예제 3 - 자료 손실 없는 형변환 판별
       
        ```java
        package sec04;
        
        public class DemotionTest3 {
        
        	public static void main(String[] args) {
        
        		int i = 128;
        
        		if ((i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)) {
        			System.out.println("byte 타입으로 변환할 수 없습니다.");
        			System.out.println("값을 다시 확인해 주세요");
        		} else {
        			byte b = (byte) i;
        			System.out.println(b);
        		}
        	}
        
        }
        ```
        
        - 결과
          
            ```
            byte 타입으로 변환할 수 없습니다.
            값을 다시 확인해 주세요
            ```
            
        - 타입별 최대, 최소 상수
          
          
            | 기본 타입 | 최댓값 상수 | 최소값 상수 |
            | --- | --- | --- |
            | byte | Byte.MAX_VALUE | Byte.MIN_VALUE |
            | short | Short.MAX_VALUE | Short.MIN_VALUE |
            | int | Integer.MAX_VALUE | Integer.MIN_VALUE |
            | long | Long.MAX_VALUE | Long.MIN_VALUE |
            | float | Float.MAX_VALUE | Float.MIN_VALUE |
            | double | Double.MAX_VALUE | Double.MIN_VALUE |
    4. 예제 4
       
        ```java
        package sec04;
        
        public class DemotionTest4 {
        
        	public static void main(String[] args) {
        		
        		int num1 = 123456780;
        		int num2 = 123456780;
        
        		float num3 = num2;
        		num2 = (int) num3;
        
        		int result = num1 - num2;
        		System.out.println(result);
        	}
        
        }
        ```
        
        - 결과
          
            ```
            -4
            ```
            
            - 123456780은 `float`의 가수 비트인 23비트로 표현할 수 없어 정밀도 손실이 발생
    5. 예제 5
       
        ```java
        package sec04;
        
        public class DemotionTest5 {
        
        	public static void main(String[] args) {
        		
        		int num1 = 123456780;
        		int num2 = 123456780;
        		
        		double num3 = num2;
        		num2 = (int) num3;
        		
        		int result = num1 - num2;
        		System.out.println(result);
        		
        	}
        
        }
        ```
        
        - 결과
          
            ```
            0
            ```
            

### 1.3.3 연산식에서의 자동 타입 변환

- 연산식에서의 자동 타입 변환
    - 연산은 기본적으로 같은 타입의 변수 간에만 수행
      
        ⇒ 서로 다른 타입의 변수가 있을 경우 크기가 큰 타입으로 자동 변환된 후 연산 수행
    
- 연산식에서 자동 타입 변환 예제
  
    ```java
    package sec04;
    
    public class OperationPromotionTest {
    
    	public static void main(String[] args) {
    
    		byte byteValue1 = 10;
    		byte byteValue2 = 20;
    		// byte byteValue3 = byteValue1 + byteValue2; //컴파일 에러
    
    		int intValue1 = byteValue1 + byteValue2;
    
    		System.out.println(intValue1);
    
    		char charValue1 = 'A';
    		char charValue2 = 1;
    		// char charValue3 = charValue1 + charValue2; //컴파일 에러
    
    		int intValue2 = charValue1 + charValue2;
    
    		System.out.println("유니코드=" + intValue2);
    		System.out.println("출력문자=" + (char) intValue2);
    
    		int intValue3 = 10;
    		int intValue4 = intValue3 / 4;
    
    		System.out.println(intValue4);
    
    		int intValue5 = 10;
    		// int intValue6 = 10 / 4.0; //컴파일 에러
    
    		double doubleValue = intValue5 / 4.0;
    
    		System.out.println(doubleValue);
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        30
        유니코드=66
        출력문자=B
        2
        2.5
        ```
        

---