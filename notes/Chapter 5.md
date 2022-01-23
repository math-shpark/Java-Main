# Chapter 5. 클래스

## 5.1 객체 지향 프로그래밍

### 5.1.1 객체란?

- 객체 지향 프로그래밍(OOP; Object Oriented Programming)
    - 객체들을 먼저 만들고 이것들을 하나씩 조립해서 완성된 프로그램을 만드는 기법
- 객체(Object)
    - 물리적으로 존재하거나 추상적으로 생각할 수 있는 것 중에서 자신의 속성을 가지고 있고 다른 것과 식별 가능한 것
    - 속성과 동작으로 구성
    예 : 사람의 경우 이름, 나이 등이 속성, 걷다, 웃다 등의 행동이 동작
    - 자바에서는 속성을 필드, 동작을 메소드라고 부름
    - 객체 모델링(Object Modeling) : 현실 세계의 객체를 소프트웨어 객체로 설계하는 것

### 5.1.2 객체의 상호작용

- 객체의 상호작용
    - 현실 세계에서 일어나는 모든 현상은 객체와 객체 간의 상호작용으로 이루어짐
    - 객체들은 독립적으로 존재하고 다른 객체와 서로 상호작용하면서 동작함
    - 메소드를 호출하는 방법 : 객체에 `.` 연산자를 붙이고 메소드 이름을 기술
      
        ```java
        리턴값 = 객체.메소드(매개값1, ...);
        
        int result = Calculator.add(10, 20); // 예시
        ```
        
    - 매개값 : 메소드를 실행하기 위해 필요한 데이터
    - 객체의 상호작용은 객체 간의 메소드 호출을 의미하며 매개값과 리턴값을 통해서 데이터를 주고 받음

### 5.1.3 객체 간의 관계

- 객체 간의 관계
    1. 집합 관계
        - 하나는 부품이고 하나는 완성품인 관계
        - 예 : 자동차와 엔진의 관계
    2. 사용 관계
        - 객체 간의 상호작용
        - 객체는 다른 객체의 메소드를 호출하여 원하는 결과를 얻어냄
        - 예 : 사람과 자동차의 관계(사람이 자동차를 사용한다.)
    3. 상속 관계
        - 상위(부모) 객체를 기반으로 하위(자식) 객체를 생성하는 관계
        - 일반적으로 상위 객체는 종류, 하위 객체는 구체적인 사물
        - 예 : 기계와 자동차의 관계

### 5.1.4 객체 지향 프로그래밍의 특징

- 캡슐화(Encapsulation)
    - 객체의 필드, 메소드를 하나로 묶고 실제 구현 내용을 감추는 것
    - 외부 객체는 객체의 내부 구조를 알지 못하고 객체가 노출해서 제공하는 필드와 메소드만 사용 가능
    - 캡슐화 이유 : 외부의 잘못된 사용으로 인해 객체가 손상되지 않도록 하기 위해
    - 자바는 캡슐화된 멤버를 노출시킬지 여부를 결정하기 위해 접근 제한자(Access Modifier)를 사용
- 상속(Inheritance)
    - 상위 객체는 자기가 가지고 있는 필드와 메소드를 하위 객체에게 물려주어 하위 객체가 사용할 수 있도록 해줌
    - 상위 객체를 재사용해서 하위 객체를 쉽고 빨리 설계할 수 있도록 도와줌
    - 이미 잘 개발된 객체를 재사용해서 새로운 객체를 만들기 때문에 반복된 코드의 중복을 줄여줌
    - 상위 객체의 수정으로 모든 하위 객체들의 수정 효과를 가져오므로 유지 보수 시간을 최소화시켜주기도 함
- 다형성(Polymorphism)
    - 같은 타입이지만 실행 결과가 다양한 객체를 이용할 수 있는 성질
    - 하나의 타입에 여러 객체를 대입함으로써 다양한 기능을 이용할 수 있도록 해줌
    - 자바는 다형성을 위해 부모 클래스 또는 인터페이스의 타입 변환을 허용함
    - 부모 타입에는 모든 자식 객체가 대입될 수 있음
    - 인터페이스 타입에는 모든 구현 객체가 대입될 수 있음
    - 다형성의 효과로 객체는 부품화가 가능
    예 : 자동차를 설계할 때 타이어 인터페이스 타입을 적용하면 타이어 종류에 상관없이 타이어면 자동차 제작에 적용할 수 있음

## 5.2 객체와 클래스

### 5.2.1 객체와 클래스

- 객체
    - 객체는 하늘에서 갑자기 떨어지는 것이 아니라 설계도를 바탕으로 만들어지는 것
    - 메모리에서 사용하고 싶은 객체가 있다면 우선 설계도로 해당 객체를 만드는 작업이 필요함
- 클래스
    - 자바에서 객체를 만드는데 필요한 설계도 역할
    - 객체를 생성하기 위한 필드와 메소드가 정의되어 있음
    - 클래스로부터 만들어진 객체를 해당 클래스의 인스턴스(instance)라고 함
    - 인스턴스화 : 클래스로부터 객체를 만드는 과정
    - 하나의 클래스로부터 여러 개의 인스턴스를 만들 수 있음
- 객체 지향 프로그래밍 개발 순서
    1. 클래스 설계
    2. 설계된 클래스를 가지고 사용할 객체 생성
    3. 생성된 객체 이용

## 5.3 클래스 선언

### 5.3.1 클래스 선언

- 클래스 명 작성 규칙
    1. 하나 이상의 문자로 이루어져야 함
    2. 첫 번째 글자는 숫자가 오면 안됨
    3. `$`, `_` 외의 특수 문자는 사용할 수 없음
    4. 예약어 사용 불가
    5. 영어 대소문자 구분
    관례상 camel case를 적용하고, 첫 글자는 대문자
- 클래스 선언
    - 클래스 이름을 정했다면 해당 이름으로 소스파일(.java)를 생성
    - 클래스 명 뒤에는 `{}`를 붙여주는데 중괄호의 시작과 끝이 클래스의 시작과 끝
    - 일반적으로 소스 파일당 하나의 클래스 선언하지만 두 개 이상의 클래스 선언도 가능
    - 두 개 이상의 클래스가 선언된 소스 파일을 컴파일하면 바이트 코드 파일(.class)은 클래스를 선언한 개수만큼 생김
      
        ⇒ 소스 파일은 클래스 선언을 담고 있는 저장 단위일 뿐 클래스 자체가 아님
        
    - 파일 이름과 동일한 이름의 클래스에만 `public` 제한자를 사용할 수 있음

## 5.4 객체 생성과 클래스 변수

### 5.4.1 객체 생성과 클래스 변수

- `new` 연산자
    - 클래스를 선언한 다음 컴파일 했다면 객체를 생성할 설계도가 만들어진 것
    - 클래스로부터 객체를 생성하는 방법은 `new` 연산자를 사용하는 것
      
        ```java
        new 클래스명();
        ```
        
    - `new`는 클래스로부터 객체를 생성시키는 연산자
    - `new`연산자로 생성된 객체는 메모리 heap 영역에 생성됨
    - `new`연산자는 힙 영역에 객체를 생성한 후 객체의 주소를 리턴하도록 되어 있음
    - `new`연산자가 리턴한 주소를 참조 타입인 클래스 변수에 저장해두면 변수를 통해 객체를 사용할 수 있음
      
        ```java
        클래스명 변수명; // 클래스 변수 선언
        변수명 = new 클래스명(); // 객체 생성
        
        클래스명 변수명 = new 클래스명(); // 클래스 변수 선언과 객체 생성 동시에 작성 가능
        ```
        
    - `new`연산자를 사용한 만큼 객체가 메모리에 생성됨
      
        ⇒ 같은 클래스로 객체를 생성해도 `new` 연산자를 여러 번 사용하면 그만큼 객체가 생성되어 저장됨
    
- 객체 생성 예제
  
    ```java
    package sec04;
    
    public class StudentTest {
    
    	public static void main(String[] args) {
    
    		Student s1 = new Student();
    		System.out.println("s1 변수가 Student 객체를 참조합니다.");
    		System.out.println("s1 객체의 주소값 : " + s1);
    
    		System.out.println();
    
    		Student s2 = new Student();
    		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
    		System.out.println("s2 객체의 주소값 : " + s2);
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        s1 변수가 Student 객체를 참조합니다.
        s1 객체의 주소값 : sec04.Student@1c4af82c
        
        s2 변수가 또 다른 Student 객체를 참조합니다.
        s2 객체의 주소값 : sec04.Student@379619aa
        ```
    
- 클래스 용도
    1. 라이브러리(API; Application Program Interface) 용
        - 다른 클래스에서 이용할 목적으로 설계됨
        - 프로그램 전체에서 사용되는 클래스가 100개라면 99개가 라이브러리고 1개가 실행 클래스
    2. 실행용
        - 실행 클래스는 실행 진입점인 `main()` 메소드를 제공하는 역할 수행
    - 대부분의 객체 지향 프로그램은 라이브러리와 실행 클래스가 분리되어 있음

## 5.5 클래스의 구성 멤버

### 5.5.1 필드

- 클래스 구성 멤버
    - 클레스에는 객체가 가져야 할 구성 멤버가 선언됨
    - 구성 멤버 : 필드(Field), 생성자(Constructor), 메소드(Method)
      
        ```java
        public class 클래스명 {
        	
        	// 필드
        	int 필드명;
        
        	// 생성자
        	클래스명(){
        		...
        	}
        
        	// 메소드
        	void 메소드명(){
        		...
        	}
        
        }
        ```
    
- 필드
    - 객체의 고유 데이터, 부품 객체, 상태 정보를 저장하는 곳
    - 선언 형태는 변수와 유사하지만 필드를 변수라고 부르지 않음
    - 변수는 생성자와 메소드 내에서만 사용되고 생성자와 메소드가 실행 종료되면 자동 소멸됨
    - 필드는 생성자와 메소드 전체에서 사용되며 객체가 소멸되지 않는 한 객체와 함께 존재

### 5.5.2 생성자

- 생성자
    - `new`연산자로 호출되는 특별한 중괄호 블록
    - 역할 : 객체 생성 시 초기화 담당
    - 필드를 초기화하거나 메소드를 호출해서 사용할 준비를 함
    - 생성자는 메소드와 유사하게 생겼지만 클래스 이름으로 되어 있고 리턴 타입이 없음

### 5.5.3 메소드

- 메소드
    - 객체의 동작에 해당하는 중괄호 블록
    - 메소드를 호출하게 되면 중괄호 블록에 있는 모든 코드들이 일괄적으로 실행됨
    - 필드를 읽고 수정하는 역할도 하지만 다른 객체를 생성해서 다양한 기능을 수행하기도 함
    - 메소드는 객체 간의 데이터 전달의 수단으로 사용됨

## 5.6 필드

### 5.6.1 필드 선언

- 필드
    - 객체의 고유 데이터, 객체가 가져야 할 부품, 객체의 현재 상태 데이터를 저장하는 곳
- 필드 선언
    - 필드 선언은 어디서든 존재 가능하지만 생성자와 메소드 중괄호 블록 내부에는 선언될 수 없음
    생성자와 메소드 중괄호 블록 내부에서 선언되는 것은 모두 로컬 변수
    - 필드의 데이터 타입은 기본형과 참조형 모두 가능
    - 필드의 초기값은 필드 선언 시 주어질 수도 있고 생략할 수도 있음
    - 초기값이 지정되지 않은 필드들은 객체 생성 시 자동으로 데이터 타입별 기본 초기값으로 결정됨
      
      
        | 데이터 타입 | 초기값 |
        | --- | --- |
        | byte | 0 |
        | char | \u0000 |
        | short | 0 |
        | int | 0 |
        | long | 0L |
        | float | 0.0F |
        | double | 0.0 |
        | boolean | false |
        | 배열 | null |
        | 클래스(String포함) | null |
        | 인터페이스 | null |

### 5.6.2 필드 사용

- 필드 사용
    - 필드를 사용한다는 것 : 필드값을 읽고 변경하는 작업
    - 클래스 내부에서 사용할 경우 : 단순히 필드 이름으로 읽고 변경하면 됨
    - 클래스 외부에서 사용할 경우 : 객체를 생성한 후 사용해야 함
- 필드 사용 예제
    1. 필드 선언
       
        ```java
        package sec06;
        
        public class Field {
        
        	// 필드
        	String company = "현대자동차";
        	String model = "그랜저";
        	String color = "검정";
        	int maxSpeed = 350;
        	int speed;
        
        }
        ```
        
    2. 외부 클래스에서 필드값 읽기 및 변경
       
        ```java
        package sec06;
        
        public class FieldTest1 {
        
        	public static void main(String[] args) {
        
        		// 객체 생성
        		Field myCar = new Field();
        
        		// 필드 값 읽기
        		System.out.println("제작회사: " + myCar.company);
        		System.out.println("모델명: " + myCar.model);
        		System.out.println("색깔: " + myCar.color);
        		System.out.println("최고속도: " + myCar.maxSpeed);
        		System.out.println("현재속도: " + myCar.speed); // 값이 설정되어 있지 않아 기본값 0으로 설정됨
        
        		// 필드 값 변경
        		myCar.speed = 60;
        
        		// 수정 결과 출력
        		System.out.println("수정된 속도: " + myCar.speed);
        
        	}
        
        }
        ```
        
        - 결과
          
            ```
            제작회사: 현대자동차
            모델명: 그랜저
            색깔: 검정
            최고속도: 350
            현재속도: 0
            수정된 속도: 60
            ```
            

## 5.7 생성자

### 5.7.1 기본 생성자

- 생성자
    - `new` 연산자와 같이 사용되어 클래스로부터 객체를 생성할 때 호출되어 객체의 초기화를 담당
    - 객체 초기화 : 필드를 초기화하거나 메소드를 호출해서 객체를 사용할 준비를 하는 것
    - 생성자를 실행시키지 않고는 클래스로부터 객체를 만들 수 없음
    - `new` 연산자에 의해 생성자가 성공적으로 실행되면 힙 영역에 객체가 생성되고 객체의 주소가 리턴됨
    - 생성자가 성공적으로 실행되지 않고 예외가 발생했다면 객체는 생성되지 않음
- 기본 생성자
    - 모든 클래스는 생성자가 반드시 존재하며 하나 이상 가질 수 있음
    - 클래스 내부에 생성자 선언을 생략했다면 컴파일러는 기본 생성자를 바이트 코드에 자동으로 추가시킴
    - 클래스가 `public class`로 선언되면 기본 생성자도 `public`이 붙지만 클래스가 `public` 없이 선언되면 기본 생성자에도 붙지 않음
    - 클래스에 명시적으로 선언한 생성자가 하나라도 있으면 컴파일러는 기본 생성자를 추가하지 않음
    - 명시적으로 생성자를 선언하는 이유 : 객체를 다양하게 초기화하기 위해

### 5.7.2 생성자 선언

- 생성자 선언
    - 구문
      
        ```java
        클래스명(매개변수 선언, ...){
        	초기화코드;
        }
        ```
        
    - 생성자는 메소드와 유사하나 리턴 타입이 없고 클래스 이름을 생성자 명으로 사용해야 함
    - 매개변수 선언은 생략할 수도 있고 여러 개를 선언해도 좋음
    - 매개변수는 `new` 연산자로 생성자를 호출할 때 외부의 값을 생성자 블록 내부로 전달하는 역할 수행
- 생성자 선언 예제
  
    ```java
    package sec07;
    
    public class Car {
    
    	// 생성자
    	Car(String color, int cc) {
    
    	}
    
    }
    ```
    
    ```java
    package sec07;
    
    public class CarTest {
    
    	public static void main(String[] args) {
    
    		Car myCar = new Car("검정", 3000);
    		// Car myCar = new Car(); (x)
    
    	}
    
    }
    ```
    

### 5.7.3 필드 초기화

- 필드 초기화
    - 초기화 방법
        1. 필드를 선언할 때 초기값을 주는 방법
        2. 생성자에서 초기값을 주는 방법
    - 매개변수 이름은 가독성을 위해 필드 이름과 비슷하거나 동일한 이름을 사용하는 것을 권장
    - 관례적으로 필드와 동일한 이름을 갖는 매개 변수 사용
    - `this` 를 사용하여 필드와 매개변수를 구분
- 필드 초기화 예제
    1. 예제 1 - 생성자에서 초기화
       
        ```java
        package sec07;
        
        public class Korean {
        
        	// 필드
        	String nation = "대한민국"; // 생성자에서 필드 초기화
        	String name;
        	String ssn;
        
        	public Korean(String name, String ssn) {
        		this.name = name;
        		this.ssn = ssn;
        	}
        
        }
        ```
        
    2. 예제 2 - 객체 생성 후 초기화
       
        ```java
        package sec07;
        
        public class KoreanTest {
        
        	public static void main(String[] args) {
        
        		Korean k1 = new Korean("박자바", "011225-1234567");
        		System.out.println("k1.name : " + k1.name);
        		System.out.println("k1.ssn : " + k1.ssn);
        
        		Korean k2 = new Korean("김자바", "930525-0654321");
        		System.out.println("k2.name : " + k2.name);
        		System.out.println("k2.ssn : " + k2.ssn);
        
        	}
        
        }
        ```
        

### 5.7.4 생성자 오버로딩(Overloading)

- 생성자 오버로딩
    - 다양한 데이터를 이용해서 객체를 초기화하려면 생성자도 다양화될 필요가 있음
    - 자바는 다양한 방법으로 객체를 생성할 수 있도록 생성자 오버로딩을 제공함
    - 생성자 오버로딩 : 매개변수를 달리하는 생성자를 여러 개 선언하는 것
    - 생성자 오버로딩 시 매개변수의 타입, 개수, 순서 중 하나라도 다르게 선언해야 함
    - 변수명만 바꾸는 것은 오버로딩이 아님
- 생성자 오버로딩 예제
  
    ```java
    package sec07;
    
    public class Constructor {
    
    	// 필드
    	String company = "현대자동차";
    	String model;
    	String color;
    	int maxSpeed;
    
    	// 생성자
    	Constructor() {
    	}
    
    	Constructor(String model) {
    		this.model = model;
    	}
    
    	Constructor(String model, String color) {
    		this.model = model;
    		this.color = color;
    	}
    
    	Constructor(String model, String color, int maxSpeed) {
    		this.model = model;
    		this.color = color;
    		this.maxSpeed = maxSpeed;
    	}
    
    }
    ```
    
    ```java
    package sec07;
    
    public class ConstructorTest {
    
    	public static void main(String[] args) {
    
    		Constructor car1 = new Constructor();
    		System.out.println("car1.company : " + car1.company);
    		System.out.println();
    
    		Constructor car2 = new Constructor("자가용");
    		System.out.println("car2.company : " + car2.company);
    		System.out.println("car2.model : " + car2.model);
    		System.out.println();
    
    		Constructor car3 = new Constructor("자가용", "빨강");
    		System.out.println("car3.company : " + car3.company);
    		System.out.println("car3.model : " + car3.model);
    		System.out.println("car3.color : " + car3.color);
    		System.out.println();
    
    		Constructor car4 = new Constructor("택시", "검정", 200);
    		System.out.println("car4.company : " + car4.company);
    		System.out.println("car4.model : " + car4.model);
    		System.out.println("car4.color : " + car4.color);
    		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        car1.company : 현대자동차
        
        car2.company : 현대자동차
        car2.model : 자가용
        
        car3.company : 현대자동차
        car3.model : 자가용
        car3.color : 빨강
        
        car4.company : 현대자동차
        car4.model : 택시
        car4.color : 검정
        car4.maxSpeed : 200
        ```
        

### 5.7.5 다른 생성자 호출(this())

- this()
    - 생성자 오버로딩이 많아질 경우 생성자 간의 중복된 코드가 발생할 수 있음
    - 필드 초기화 내용은 한 생성자에만 집중적으로 작성하고 나머지 생성자는 초기화 내용을 가지고 있는 생성자를 호출하는 방법으로 개선 가능
    - 생성자에서 다른 생성자를 호출할 때 `this()` 코드 사용
- this() 예제
  
    ```java
    package sec07;
    
    public class ThisConstructor {
    
    	// 필드
    	String company = "현대자동차";
    	String model;
    	String color;
    	int maxSpeed;
    
    	// 생성자
    	ThisConstructor() {
    	}
    
    	ThisConstructor(String model) {
    		this(model, null, 0);
    	}
    
    	ThisConstructor(String model, String color) {
    		this(model, color, 0);
    	}
    
    	// 초기화 집중 생성자
    	ThisConstructor(String model, String color, int maxSpeed) {
    		this.model = model;
    		this.color = color;
    		this.maxSpeed = maxSpeed;
    	}
    
    }
    ```
    
    ```java
    package sec07;
    
    public class ThisConstructorTest {
    
    	public static void main(String[] args) {
    
    		ThisConstructor car1 = new ThisConstructor();
    		System.out.println("car1.company : " + car1.company);
    		System.out.println();
    
    		ThisConstructor car2 = new ThisConstructor("자가용");
    		System.out.println("car2.company : " + car2.company);
    		System.out.println("car2.model : " + car2.model);
    		System.out.println("car2.color : " + car2.color);
    		System.out.println();
    
    		ThisConstructor car3 = new ThisConstructor("자가용", "빨강");
    		System.out.println("car3.company : " + car3.company);
    		System.out.println("car3.model : " + car3.model);
    		System.out.println("car3.color : " + car3.color);
    		System.out.println();
    
    		ThisConstructor car4 = new ThisConstructor("택시", "검정", 200);
    		System.out.println("car4.company : " + car4.company);
    		System.out.println("car4.model : " + car4.model);
    		System.out.println("car4.color : " + car4.color);
    		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        car1.company : 현대자동차
        
        car2.company : 현대자동차
        car2.model : 자가용
        car2.color : null
        
        car3.company : 현대자동차
        car3.model : 자가용
        car3.color : 빨강
        
        car4.company : 현대자동차
        car4.model : 택시
        car4.color : 검정
        car4.maxSpeed : 200
        ```
        

## 5.8 메소드

### 5.8.1 메소드 선언

- 메소드 선언
    - 선언부와 실행 블록으로 구성
    - 메소드 선언부를 메소드 시그니처라고도 함
    - 구문
      
        ```java
        리턴타입 메소드명(매개변수1, ...){
        	실행문;
        }
        ```
    
- 리턴 타입
    - 메소드가 실행한 후 리턴하는 값의 타입
    - 메소드는 리턴 값이 있을 수도 있고 없을 수도 있음
    - 실행 결과를 넘겨줄 경우에는 리턴값이 있어야 함
    - 리턴 값이 있는 메소드를 사용할 경우 리턴 값을 저장할 변수를 생성해줘야 함
    - 리턴 값이 없는 메소드를 사용할 경우 별도의 변수를 설정할 필요 없음
- 메소드명
    - 자바 식별자 규칙 적용
    - 관례적으로 메소드명은 소문자로 작성
    - camel case 적용
    - 메소드명은 이 메소드가 어떤 기능을 수행하는지 쉽게 알 수 있도록 기능 이름으로 지어주는 것이 좋음
    - 메소드명의 길이는 프로그램 실행과 무관함
- 매개 변수 선언
    - 매개 변수는 메소드가 실행될 때 필요한 데이터를 외부로부터 받기 위해 사용
    - 매개 변수가 필요한 메소드도 있고 필요없는 메소드도 있음
- 메소드 선언 예제
  
    ```java
    package sec08;
    
    public class Calculator {
    
    	// 전원 키는 메소드
    	void powerOn() {
    		System.out.println("전원을 켭니다.");
    	}
    
    	// 더하는 메소드
    	int plus(int x, int y) {
    		int result = x + y;
    		return result;
    	}
    
    	// 나누는 메소드
    	double divide(int x, int y) {
    		double result = (double) x / (double) y;
    		return result;
    	}
    
    	// 전원을 끄는 메소드
    	void powerOff() {
    		System.out.println("전원을 끕니다");
    	}
    
    }
    ```
    
- 메소드 호출 예제
  
    ```java
    package sec08;
    
    public class CalculatorTest {
    
    	public static void main(String[] args) {
    
    		Calculator myCalc = new Calculator();
    		
    		myCalc.powerOn();
    
    		int result1 = myCalc.plus(5, 6);
    		System.out.println("result1: " + result1);
    
    		byte x = 10;
    		byte y = 4;
    		double result2 = myCalc.divide(x, y);
    		System.out.println("result2: " + result2);
    
    		myCalc.powerOff();
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        전원을 켭니다.
        result1: 11
        result2: 2.5
        전원을 끕니다
        ```
    
- 매개 변수의 수를 모를 경우
    - 매개 변수의 개수는 이미 정해져 있는 것이 일반적
    - 경우에 따라 메소드를 선언할 때 변수의 개수가 알 수 없는 경우가 있음
      
        ⇒ 매개 변수의 타입을 배열 타입으로 선언하여 해결 가능
        
    - 매개 변수를 배열 타입으로 선언하면 메소들를 호출하기 전에 배열을 생성해야 하는 불편함이 있음
      
        ⇒ 배열을 생성하지 않고 리스트만 넘겨주는 방법도 있음
        
    - 메소드의 매개 변수를 `...`를 사용해서 선언하게 되면 메소드 호출 시 넘겨준 값의 수에 따라 자동으로 배열이 생성되고 매개값으로 사용됨
- 매개 변수의 수를 모를 경우 예제
  
    ```java
    package sec08;
    
    public class Computer {
    
    	int sum1(int[] values) {
    		int sum = 0;
    		for (int i = 0; i < values.length; i++) {
    			sum += values[i];
    		}
    		return sum;
    	}
    
    	int sum2(int... values) {
    		int sum = 0;
    		for (int i = 0; i < values.length; i++) {
    			sum += values[i];
    		}
    		return sum;
    	}
    
    }
    ```
    
    ```java
    package sec08;
    
    public class ComputerTest {
    
    	public static void main(String[] args) {
    
    		Computer myCom = new Computer();
    
    		int[] values1 = { 1, 2, 3 };
    		int result1 = myCom.sum1(values1);
    		System.out.println("result1: " + result1);
    
    		int result2 = myCom.sum1(new int[] { 1, 2, 3, 4, 5 });
    		System.out.println("result2: " + result2);
    
    		int result3 = myCom.sum2(1, 2, 3);
    		System.out.println("result3: " + result3);
    
    		int result4 = myCom.sum2(new int[] { 1, 2, 3, 4, 5 });
    		System.out.println("result4: " + result4);
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        result1: 6
        result2: 15
        result3: 6
        result4: 15
        ```
        

### 5.8.2 리턴(return)문

- 리턴값이 있는 메소드
    - 리턴 타입이 있는 메소드는 반드시 리턴 문을 사용해서 리턴값을 지정해야 함
    - return문이 실행되면 메소드는 즉시 종료됨
    - return문 이후에 실행문이 오면 `Unreachable code`라는 컴파일 오류 발생
- 리턴값이 없는 메소드(void)
    - `void`로 선언된 메소드는 리턴값이 없음
    - 리턴값없이 return문을 사용하면 메소드를 강제로 종료시킴
- return 문 예제
  
    ```java
    package sec08;
    
    public class Car {
    
    	// 필드
    	int gas;
    
    	// 메소드
    	void setGas(int gas) {
    		this.gas = gas;
    	}
    
    	boolean isLeftGas() {
    		if (gas == 0) {
    			System.out.println("gas가 없습니다.");
    			return false;
    		}
    		System.out.println("gas가 있습니다.");
    		return true;
    	}
    
    	void run() {
    		while (true) {
    			if (gas > 0) {
    				System.out.println("달립니다.(gas잔량:" + gas + ")");
    				gas -= 1;
    			} else {
    				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
    				return;
    			}
    		}
    	}
    
    }
    ```
    
    ```java
    package sec08;
    
    public class CarTest {
    
    	public static void main(String[] args) {
    
    		Car myCar = new Car();
    
    		myCar.setGas(5); // Car의 setGas() 메소드 호출
    
    		boolean gasState = myCar.isLeftGas(); // Car의 isLeftGas() 메소드 호출
    		
    		if (gasState) {
    			System.out.println("출발합니다.");
    			myCar.run(); // Car의 run() 메소드 호출
    		}
    
    		if (myCar.isLeftGas()) { // Car의 isLeftGas() 메소드 호출
    			System.out.println("gas를 주입할 필요가 없습니다.");
    		} else {
    			System.out.println("gas를 주입하세요.");
    		}
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        gas가 있습니다.
        출발합니다.
        달립니다.(gas잔량:5)
        달립니다.(gas잔량:4)
        달립니다.(gas잔량:3)
        달립니다.(gas잔량:2)
        달립니다.(gas잔량:1)
        멈춥니다.(gas잔량:0)
        gas가 없습니다.
        gas를 주입하세요.
        ```
        

### 5.8.3 메소드 호출

- 메소드 호출
    - 클래스 내부의 다른 메소드를 호출할 경우 : 단순히 이름으로 호출 가능
    - 클래스 외부의 다른 메소드를 호출할 경우 : 해당 메소드가 포함된 클래스를 객체 생성한 후 호출 가능
- 객체 내부에서 호출 예제
  
    ```java
    package sec08;
    
    public class Calculator2 {
    
    	// 메소드
    	int plus(int x, int y) {
    		int result = x + y;
    		return result;
    	}
    
    	double avg(int x, int y) {
    		double sum = plus(x, y); // plus 메소드 호출
    		double result = sum / 2;
    		return result;
    	}
    
    	void execute() {
    		double result = avg(7, 10); // avg 메소드 호출
    		println("실행결과: " + result);
    	}
    
    	void println(String message) {
    		System.out.println(message);
    	}
    
    }
    ```
    
    ```java
    package sec08;
    
    public class Calculator2Test {
    
    	public static void main(String[] args) {
    
    		Calculator2 myCalc = new Calculator2();
    		myCalc.execute();
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        실행결과: 8.5
        ```
    
- 객체 외부에서 호출 예제
  
    ```java
    package sec08;
    
    public class Car2 {
    
    	// 필드
    	int speed;
    
    	// 메소드
    	int getSpeed() {
    		return speed;
    	}
    
    	void keyTurnOn() {
    		System.out.println("키를 돌립니다.");
    	}
    
    	void run() {
    		for (int i = 10; i <= 50; i += 10) {
    			speed = i;
    			System.out.println("달립니다.(시속:" + speed + "km/h)");
    		}
    	}
    
    }
    ```
    
    ```java
    package sec08;
    
    public class Car2Test {
    
    	public static void main(String[] args) {
    
    		Car2 myCar = new Car2(); // 객체 생성
    
    		// 메소드 실행
    		myCar.keyTurnOn();
    		myCar.run();
    
    		// 리턴값 저장
    		int speed = myCar.getSpeed();
    
    		// 결과 출력
    		System.out.println("현재 속도: " + speed + "km/h");
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        키를 돌립니다.
        달립니다.(시속:10km/h)
        달립니다.(시속:20km/h)
        달립니다.(시속:30km/h)
        달립니다.(시속:40km/h)
        달립니다.(시속:50km/h)
        현재 속도: 50km/h
        ```
        

### 5.8.5 메소드 오버로딩

- 메소드 오버로딩
    - 클래스 내에 같은 이름의 메소드를 여러 개 선언하는 것
    - 매개 변수의 타입, 개수, 순서 중 하나 이상 달라야 함
    - 메소드 오버로딩이 필요한 이유 : 매개값을 다양하게 받아 처리할 수 있도록 하기 위해
    - 오버로딩된 메소드를 호출할 경우 JVM은 매개값의 타입을 보고 메소드를 선택
    - 리턴 타입만 다르고 매개 변수가 동일한 것은 오버로딩이 아님
    (리턴 타입은 자바 가상 기계가 메소드를 선택할 때 아무런 도움을 주지 못하기 때문)
- 메소드 오버로딩 예제
  
    ```java
    package sec08;
    
    public class Computer2 {
    
    	// 정사각형의 넓이
    	double areaRectangle(double width) {
    		return width * width;
    	}
    
    	// 직사각형의 넓이
    	double areaRectangle(double width, double height) {
    		return width * height;
    	}
    
    }
    ```
    
    ```java
    package sec08;
    
    public class Computer2Test {
    
    	public static void main(String[] args) {
    
    		Computer2 myCalcu = new Computer2();
    
    		// 정사각형의 넓이 구하기
    		double result1 = myCalcu.areaRectangle(10);
    
    		// 직사각형의 넓이 구하기
    		double result2 = myCalcu.areaRectangle(10, 20);
    
    		// 결과 출력
    		System.out.println("정사각형 넓이=" + result1);
    		System.out.println("직사각형 넓이=" + result2);
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        정사각형 넓이=100.0
        직사각형 넓이=200.0
        ```
        

## 5.9 인스턴스 멤버와 this

### 5.9.1 인스턴스 멤버와 this

- 인스턴스 멤버
    - 객체를 생성한 후 사용할 수 있는 필드와 메소드
        - 필드 → 인스턴스 필드
        - 메소드 → 인스턴스 메소드
    - 인스턴스 필드와 메소드는 객체에 소속된 멤버이기 때문에 객체 생성 없이는 사용 불가
    - 인스턴스 필드는 객체마다 따로 힙 영역에 저장됨
    - 인스턴스 메소드는 객체마다 존재하지 않고 메소드 영역에 저장되고 공유됨
- 인스턴스 멤버와 this 예제
  
    ```java
    package sec09;
    
    public class Car {
    
    	// 필드
    	String model;
    	int speed;
    
    	// 생성자
    	Car(String model) {
    		this.model = model; // 필드 호출
    	}
    
    	// 메소드
    	void setSpeed(int speed) {
    		this.speed = speed; // 필드 호출
    	}
    
    	void run() {
    		for (int i = 10; i <= 50; i += 10) {
    			this.setSpeed(i); // 메소드 호출
    			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
    		}
    	}
    
    }
    ```
    
    ```java
    package sec09;
    
    public class CarTest {
    
    	public static void main(String[] args) {
    
    		Car myCar = new Car("포르쉐");
    		Car yourCar = new Car("벤츠");
    
    		myCar.run();
    		yourCar.run();
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        포르쉐가 달립니다.(시속:10km/h)
        포르쉐가 달립니다.(시속:20km/h)
        포르쉐가 달립니다.(시속:30km/h)
        포르쉐가 달립니다.(시속:40km/h)
        포르쉐가 달립니다.(시속:50km/h)
        벤츠가 달립니다.(시속:10km/h)
        벤츠가 달립니다.(시속:20km/h)
        벤츠가 달립니다.(시속:30km/h)
        벤츠가 달립니다.(시속:40km/h)
        벤츠가 달립니다.(시속:50km/h)
        ```
        

## 5.10 정적 멤버와 static

### 5.10.1 정적 멤버 선언

- 정적(static)
    - 고정된이라는 의미
- 정적 멤버
    - 클래스에 고정된 멤버
    - 객체를 생성하지 않고 사용할 수 있는 필드와 메소드
        - 필드 → 정적 필드
        - 메소드 → 정적 메소드
    - 정적 멤버는 객체에 소속된 멤버가 아니라 클래스에 소속된 멤버이기 때문에 클래스 멤버라고도 함
    - 정적 멤버는 클래스에 고정된 멤버이기 때문에 클래스 로더가 클래스(바이트 코드)를 로딩해서 메소드 메모리 영역에 적재할 때 클래스별로 관리됨
      
        ⇒ 클래스 로딩이 끝나면 바로 사용 가능
    
- 정적 멤버 선언
    - 필드와 메소드 선언 시 `static` 키워드를 추가적으로 붙이면 됨
    - 객체마다 가지고 있을 필요성이 있는 데이터라면 인스턴스 필드로 선언하는 것이 좋음
    - 객체마다 가지고 있을 필요가 없는 공용적 데이터라면 정적 필드로 선언하는 것이 좋음
    - 인스턴스 필드를 이용해서 실행해야 하는 메소드라면 인스턴스 메소드로 선언하는 것이 좋음
    - 인스턴스 필드를 사용하지 않는 메소드라면 정적 메소드로 선언하는 것이 좋음

### 5.10.2 정적 멤버 사용

- 정적 멤버 사용
    - 클래스가 메모리로 로딩되면 정적 멤버를 바로 사용할 수 있음
    - 클래스명과 `.` 연산자로 접근
      
        ```java
        클래스명.필드;
        클래스명.메소드(매개값1, ...);
        ```
        
    - 정적 멤버는 원칙적으로는 클래스 이름으로 접근해야 하지만 객체 참조 변수로도 접근이 가능함
    하지만, 정적 요소는 클래스 이름으로 접근하는 것이 좋음
    (이클립스에서는 정적 멤버를 객체 참조 변수로 접근하면 경고 표시가 나타남)
- 정적 멤버 사용 예시
  
    ```java
    package sec10;
    
    public class Calculator {
    
    	// 정적 필드
    	static double pi = 3.14159;
    
    	// 정적 메소드(더하기)
    	static int plus(int x, int y) {
    		return x + y;
    	}
    
    	// 정적 메소드(빼기)
    	static int minus(int x, int y) {
    		return x - y;
    	}
    
    }
    ```
    
    ```java
    package sec10;
    
    public class CalculatorTest {
    
    	public static void main(String[] args) {
    
    		double result1 = 10 * 10 * Calculator.pi;
    		int result2 = Calculator.plus(10, 5);
    		int result3 = Calculator.minus(10, 5);
    
    		System.out.println("result1 : " + result1);
    		System.out.println("result2 : " + result2);
    		System.out.println("result3 : " + result3);
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        result1 : 314.159
        result2 : 15
        result3 : 5
        ```
        

### 5.10.3 정적 초기화 블록

- 정적 초기화 블록
    - 정적 필드는 선언과 동시에 초기값을 주는 것이 보통
    - 인스턴스 필드는 생성자에서 초기화하지만 정적 필드는 객체 생성 없이도 사용해야 하기 때문에 생성자에서 초기화 작업을 할 수 없음
    (생성자는 객체 생성 시에만 실행되기 때문)
    - 자바는 정적 필드의 초기화 작업을 위해 정적 블록을 제공함
      
        ```java
        static {
        	...
        }
        ```
        
    - 정적 블록은 클래스가 메모리로 로딩될 때 자동적으로 실행됨
    - 정적 블록은 클래스 내부에 여러 개가 선언되어도 상관없음
    - 클래스가 메모리로 로딩될 때 선언된 순서대로 실행됨
- 정적 초기화 블록 예제
  
    ```java
    package sec10;
    
    public class Television {
    
    	static String company = "Samsung";
    	static String model = "LCD";
    	static String info;
    
    	// 정적 초기화 블록
    	static {
    		info = company + "-" + model;
    	}
    
    }
    ```
    
    ```java
    package sec10;
    
    public class TelevisionTest {
    
    	public static void main(String[] args) {
    
    		System.out.println(Television.info);
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        Samsung-LCD
        ```
        

### 5.10.4 정적 메소드와 블록 선언 시 주의사항

- 주의사항
    - 정적 멤버 내부에는 인스턴스 필드나 인스턴스 메소드를 사용할 수 없음
    - 객체 자신의 참조인 `this` 키워드도 사용 불가
    - 예시
      
        ```java
        public class ClassName{
        	
        	// 인스턴스 멤버
        	int field1;
        	void method1(){
        		...
        	}
        
        	// 정적 멤버
        	static int field2;
        	static void method2(){
        		...
        	}
        
        	// 정적 블록
        	static {
        		field1 = 10; // 컴파일 에러
        		method1(); // 컴파일 에러
        		field2 = 10; // 가능
        		method2(); // 가능
        	}
        
        }
        ```
        
    - 정적 메소드와 블록에서 인스턴스 멤버를 사용하려면 객체를 먼저 생성하고 참조 변수로 접근해야 함
- 주의사항 예제
  
    ```java
    package sec10;
    
    public class Car {
    	int speed;
    
    	void run() {
    		System.out.println(speed + "으로 달립니다.");
    	}
    
    	public static void main(String[] args) {
    		
    		Car myCar = new Car();
    		myCar.speed = 60;
    		myCar.run();
    		
    	}
    }
    ```
    
    - 결과
      
        ```
        60으로 달립니다.
        ```
        

### 5.10.5 싱글톤(Singleton)

- 싱글톤
    - 가끔 전체 프로그램에서 단 하나의 객체만 만들도록 보장해야 하는 경우가 있음
    - 싱글톤 : 단 하나만 생성된 객체
    - 싱글톤을 만들려면 클래스 외부에서 `new` 연산자로 생성자를 호출할 수 없도록 막아야 함
    (생성자를 호출한 만큼 객체가 생성되기 때문)
    - 생성자를 외부에서 호출할 수 없도록 생성자 앞에 `private` 접근 제한자를 붙여주면 됨
    - 클래스 내부에서는 `new` 연산자로 생성자 호출이 가능함
      
        ⇒ 외부에서 호출할 수 있도록 하는 정적 메소드를 제외하고 모두 `private` 제한자로 접근을 제한시키고 정적 필드에서 참조하고 있는 자신의 객체를 리턴
        
    - 구문
      
        ```java
        public class ClassName{
        
        	// 정적 필드
        	private static ClassName singleton = new ClassName();
        
        	// 생성자
        	private ClassName(){
        
        	}
        
        	// 정적 메소드
        	static ClassName getInstance(){
        		return singleton;
        	}
        
        }
        ```
    
- 싱글톤 예제
  
    ```java
    package sec10;
    
    public class Singleton {
    
    	private static Singleton singleton = new Singleton();
    
    	private Singleton() {
    	}
    
    	static Singleton getInstance() {
    		return singleton;
    	}
    
    }
    ```
    
    ```java
    package sec10;
    
    public class SingletonTest {
    
    	public static void main(String[] args) {
    		
    		/*
    		 * Singleton obj1 = new Singleton(); //컴파일 에러
    		 */
    
    		Singleton obj1 = Singleton.getInstance();
    		Singleton obj2 = Singleton.getInstance();
    
    		if (obj1 == obj2) {
    			System.out.println("같은 Singleton 객체 입니다.");
    		} else {
    			System.out.println("다른 Singleton 객체 입니다.");
    		}
    	}
    
    }
    ```
    
    - 결과
      
        ```
        같은 Singleton 객체 입니다.
        ```
        

## 5.11 final 필드와 상수

### 5.11.1 final 필드

- final 필드
    - 최종적이라는 뜻
    - 초기값이 정해지면 이것이 최종적인 값이 되어서 프로그램 실행 도중에 수정 불가
    - 선언 구문
      
        ```java
        final 데이터타입 필드명[= 초기값];
        ```
        
    - 초기값을 주는 방법
        1. 필드 선언 시 주는 방법
        2. 생성자에서 주는 방법
    - 생성자는 final 필드의 최종 초기화를 마쳐야 하고 초기화되지 않은 final 필드를 남겨두면 컴파일 에러 발생
- final 필드 예제
  
    ```java
    package sec11;
    
    public class Person {
    
    	// final 필드
    	final String nation = "Korea";
    	final String ssn;
    
    	// 인스턴스 필드
    	String name;
    
    	// 생성자
    	public Person(String ssn, String name) {
    		this.ssn = ssn;
    		this.name = name;
    	}
    
    }
    ```
    
    ```java
    package sec11;
    
    public class PersonTest {
    
    	public static void main(String[] args) {
    
    		Person p1 = new Person("123456-1234567", "계백");
    
    		System.out.println(p1.nation);
    		System.out.println(p1.ssn);
    		System.out.println(p1.name);
    
    //		p1.nation = "usa"; (x)
    //		p1.ssn = "654321-7654321"; (x)
    		p1.name = "을지문덕";
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        Korea
        123456-1234567
        계백
        ```
        

### 5.11.2 상수(static final)

- 상수
    - 불변의 값
    - 객체마다 저장할 필요가 없는 공용성을 띄는 필드로 `static`이면서 `final`이어야 함
    - `static final` 필드는 객체마다 저장되지 않고 클래스에만 포함됨
    - 구문
      
        ```java
        static final 데이터타입 상수명 [=초기값];
        ```
    
- 상수 예제
  
    ```java
    package sec11;
    
    public class Earth {
    
    	// 상수
    	static final double EARTH_RADIUS = 6400;
    	static final double EARTH_SURFACE_AREA;
    
    	// 정적 블록
    	static {
    		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    	}
    
    }
    ```
    
    ```java
    package sec11;
    
    public class EarthTest {
    
    	public static void main(String[] args) {
    
    		System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + " km");
    		System.out.println("지구의 표면적: " + Earth.EARTH_SURFACE_AREA + "  km^2");
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        지구의 반지름: 6400.0 km
        지구의 표면적: 5.147185403641517E8  km^2
        ```
        

## 5.12 패키지

### 5.12.1 패키지 선언

- 패키지
    - 프로그램을 개발하다 보면 수백 개의 클래스를 작성해야 함
    - 클래스를 체계적으로 관리하지 않으면 클래스 간의 관계가 뒤엉켜서 복잡하고 난해한 프로그램이 되어 유지 보수가 어려워짐
    - 자바에서는 클래스를 체계적으로 관리하기 위해 패키지(package) 사용
    - 폴더를 만들어 파일을 관리하듯이 패키지를 만들어 클래스를 저장 관리
    - 패키지의 물리적인 형태는 파일 시스템의 폴더
    - 패키지는 단순히 파일 시스템의 폴더 기능만 하는 것이 아니라 클래스의 일부분
    - 패키지는 클래스를 유일하게 만들어주는 식별자 역할 수행
    - 클래스 이름이 동일해도 패키지가 다르면 다른 클래스로 인식
    - `.` 연산자로 상하위 관계 구분
    - 패키지가 중요한 이유 : 클래스만 따로 복사해서 다른 곳으로 이동하면 클래스는 사용할 수 없음
- 패키지 선언
    - 패키지는 클래스를 컴파일하는 과정에서 자동적으로 생성되는 폴더
    - 컴파일러는 클래스에 포함되어 있는 패키지 선언을 보고 파일 시스템의 폴더로 자동 생성시킴
    - 구문
      
        ```java
        package 패키지명;
        
        public class ClassName{
        	...
        }
        ```
        
    - 패키지 작명 규칙
        1. 숫자로 시작하면 안됨
        2. `$`, `_`를 제외한 특수문자 불가
        3. java로 시작하는 패키지는 자바 표준 API에서만 사용하므로 사용하면 안됨
        4. 모두 소문자로 작성하는 것이 관례
    - 패키지 이름은 회사들 간에 중복되지 않도록 흔히 회사의 도메인 이름으로 작성
    (도메인은 등록 기관에서 유일한 이름으로 되도록 검증되었기 때문)
    - 도메인 이름으로 패키지 이름을 만들 경우 도메인 이름 역순으로 패키지 이름을 지음
    (포괄적인 이름이 상위 패키지가 되도록 하기 위해)
    - 예시 : `com.samsung`
    - 패키지명 마지막에는 프로젝트 이름을 붙여주는 것이 관례

### 5.12.2 패키지 선언이 포함된 클래스 컴파일

- 컴파일
    - 패키지 선언이 포함된 클래스를 명령 프롬프트에서 컴파일할 경우 단순히 javacClassName.java로 컴파일해서는 패키지 폴더가 생성되지 않음
    - 패키지 폴더가 자동으로 생성되려면 javac 명령어 다음에 `-d` 옵션을 추가하고 패키지가 생성될 경로를 지정해야 함
    - 예시
      
        ```
        javac -d C:\Temp\bin
        ```
        
    - 패키지에 소속된 클래스를 명령 프롬프트에서 실행하려면 바이트 코드 파일(.class)이 있는 폴더가 아니라 패키지가 시작하는 폴더에서 java 명령어를 사용해야 함

### 5.12.3 이클립스에서 패키지 생성과 클래스 생성

- 이클립스
    - 이클립스에서는 패키지만 따로 생성할 수도 있고, 클래스를 생성할 때 동시에 생성시킬 수도 있음
    - 패키지를 먼저 생성하고 해당 패키지에서 클래스를 생성하는 방법을 많이 사용
    - [File] - [New] - [Package]를 선택한 후 패키지 정보를 입력하여 생성할 수 있음

### 5.12.4 import 문

- import 문
    - 다른 패키지에 속하는 클래스를 사용하는 방법
        1. 패키지와 클래스를 모두 기술
        2. `import` 문 사용
    - `import`문이 사용되는 위치 : 패키지 선언과 클래스 선언 사이
    - 패키지에 포함된 다수의 클래스를 사용하는 경우 클래스 이름을 생략하고 `*`를 사용해서 `import`문을 한 번 작성해도 됨
    - `import`문의 개수에는 제한이 없고 필요한 만큼 얼마든지 추가할 수 있음
    - 주의할 점 : `import`문으로 지정된 패키지의 하위 패키지는 import 대상이 아님
      
        ⇒ 하위 패키지도 사용하려면 추가로 `import`문을 작성해야 함
        
    - 서로 다른 패키지에 동일한 클래스 이름이 존재하고 해당 클래스들을 `import` 해야 하는 경우 패키지 이름 전체를 기술해야 함
    - import 자동 추가 단축기(이클립스) : Ctrl + Shift + O

## 5.13 접근 제한자

### 5.13.1 클래스의 접근 제한

- 접근 제한자
    - `main()` 메소드를 가지고 있지 않는 대부분의 클래스는 외부 클래스에서 이용할 목적으로 설계된 라이브러리 클래스
    - 라이브러리 클래스를 설계할 때 외부 클래스에서 접근할 수 있는 멤버와 접근할 수 없는 멤버로 구분해서 설계해야 함
    - 자바는 접근 가능 여부 기능을 구현하기 위해 접근 제한자(Access Modifier)를 제공함
    - 종류 : `public`, `protected`, `default`, `private`
      
      
        | 접근 제한 | 적용 대상 | 접근 가능 클래스 |
        | --- | --- | --- |
        | public | 클래스, 필드, 생성자, 메소드 | 모든 클래스 |
        | protected | 필드, 생성자, 메소드 | 같은 패키지에 있는 클래스, 상속 관계인 다른 패키지의 클래스 |
        | default | 클래스, 필드, 생성자, 메소드 | 같은 패키지의 클래스 |
        | private | 필드, 생성자, 메소드 | 같은 클래스 |
- 클래스에 적용 가능한 접근 제한
    - `public`
    - `default`
- `default` 접근 제한
    - 클래스 선언 시 `public`을 생략하면 `default` 접근 제한을 가짐
    - 같은 패키지에서는 아무 제한 없이 사용 가능
    - 다른 패키지에서는 접근 불가
- `public` 접근 제한
    - 클래스 선언 시 `public` 제한자를 붙였다면 `public` 접근 제한을 가짐
    - 같은 패키지, 다른 패키지 모두 아무 제한 없이 접근 가능
    - 인터넷으로 배포되는 라이브러리 클래스들도 모두 `public` 접근 제한을 가지고 있음

### 5.13.2 생성자의 접근 제한

- 생성자 접근 제한 예제
  
    ```java
    package sec13;
    
    public class A {
    
    	// 필드
    	A a1 = new A(true);
    	A a2 = new A(1);
    	A a3 = new A("문자열");
    
    	// 생성자
    	public A(boolean b) {
    	} // public
    
    	A(int b) {
    	} // default
    
    	private A(String s) {
    	} // private
    }
    ```
    
    ```java
    package sec13;
    
    public class B {
    
    	// 필드
    	A a1 = new A(true);
    	A a2 = new A(1);
    //	A a3 = new A("문자열"); private 접근자라 컴파일 에러 발생
    
    }
    ```
    

### 5.13.3 필드와 메소드의 접근 제한

- 필드와 메소드의 접근 제한
    - 클래스 내부에서만 사용할지, 패키지 내에서만 사용할지, 다른 패키지에서도 사용할지 결정해야 함
- 필드와 메소드의 접근 제한 예제
  
    ```java
    package sec13;
    
    public class A2 {
    
    	// 필드
    	public int field1; // public
    	int field2; // default
    	private int field3; // private
    
    	// 생성자
    	public A2() {
    		field1 = 1;
    		field2 = 1;
    		field3 = 1;
    
    		method1();
    		method2();
    		method3();
    	}
    
    	// 메소드
    	public void method1() {
    	} // public
    
    	void method2() {
    	} // default
    
    	private void method3() {
    	} // private
    
    }
    ```
    
    ```java
    package sec13;
    
    public class B2 {
    
    	public B2() {
    		A2 a = new A2();
    		a.field1 = 1;   
    		a.field2 = 1;   
    		//a.field3 = 1; 접근 불가
    		
    		a.method1();  
    		a.method2();  
    		//a.method3();  접근 불가
    	}
    
    }
    ```
    

## 5.14 Getter와 Setter 메소드

### 5.14.1 Getter와 Setter 메소드

- Getter, Setter
    - 객체의 무결성을 위해 객체 지향 프로그래밍에서 객체의 데이터는 객체 외부에서 직접적으로 접근하는 것을 막음
        - 객체의 무결성 : 결점이 없는 성질
        
        ⇒ 객체 지향 프로그래밍에서는 메소드를 통해 데이터를 변경하는 방법을 선호함
        
    - 데이터는 외부에서 접근할 수 없도록 막고 메소드는 공개해서 외부에서 메소드를 통해 접근하도록 유도 ⇒ Setter 메소드
    - 외부에서 객체의 데이터를 읽을 때도 메소드를 사용하는 것이 좋음 ⇒ Getter 메소드
    - 클래스를 선언할 때 필드를 `private`로 선언해서 외부로부터 보호하고 필드에 대한 Setter와 Getter 메소드를 작성해서 필드값을 안전하게 변경 및 사용하는 것이 좋음
    - 필드 타입이 `boolean` 일 경우 Getter는 is로 시작하는 것이 관례
    - 읽기 전용으로 만들고 싶으면 Getter 메소드만 선언하거나 Setter 메소드를 `private`로 제한하도록 하는 것이 좋음
    - 이클립스는 [Sources] - [Generate Getters and Setters]에서 자동으로 메소드를 생성하는 기능을 지원함
- Getter, Setter 예제
  
    ```java
    package sec14;
    
    public class Car {
    
    	// 필드
    	private int speed;
    	private boolean stop;
    
    	// 메소드
    	// getter
    	public int getSpeed() {
    		return speed;
    	}
    
    	// setter
    	public void setSpeed(int speed) {
    		if (speed < 0) {
    			this.speed = 0; // 설정한 속도가 음수면 0을 반환
    			return;
    		} else {
    			this.speed = speed;
    		}
    	}
    
    	// getter
    	public boolean isStop() {
    		return stop;
    	}
    
    	// setter
    	public void setStop(boolean stop) {
    		this.stop = stop;
    		this.speed = 0;
    	}
    
    }
    ```
    
    ```java
    package sec14;
    
    public class CarTest {
    
    	public static void main(String[] args) {
    
    		Car myCar = new Car();
    
    		// 잘못된 속도 변경
    		myCar.setSpeed(-50);
    
    		System.out.println("현재 속도: " + myCar.getSpeed());
    
    		// 올바른 속도 변경
    		myCar.setSpeed(60);
    
    		// 멈춤
    		if (!myCar.isStop()) {
    			myCar.setStop(true);
    		}
    
    		System.out.println("현재 속도: " + myCar.getSpeed());
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        현재 속도: 0
        현재 속도: 0
        ```
        

## 5.15 어노테이션

### 5.15.1 어노테이션 타입 정의와 적용

- 어노테이션(Annotation)
    - 어노테이션은 메타데이터(metadata)라고 볼 수 있음
        - 메타데이터 : 애플리케이션이 처리해야 할 데이터가 아니라 컴파일 과정과 실행 과정에서 코드를 어떻게 컴파일하고 처리할 것인지를 알려주는 정보
    - 구문
      
        ```java
        @AnnotationName
        ```
        
    - 용도
        1. 컴파일러에게 코드 문법 에러를 체크하도록 정보 제공
        2. 소프트웨어 개발 툴이 빌드나 배치 시 코드를 자동으로 생성할 수 있도록 정보 제공
        3. 실행 시 특정 기능을 실행하도록 정보 제공
    - 컴파일러에게 코드 문법 에러를 체크하도록 정보를 제공하는 대표적인 예 : `@Override`
    - `@Override`는 메소드 선언 시 사용하는데 메소드가 오버라이드된 것임을 컴파일러에게 알려주어 검사하도록 해줌
      
        ⇒ 정확히 오버라이드가 되지 않았다면 컴파일러는 에러를 발생시킴
        
    - 어노테이션은 빌드 시 자동으로 XML 설정 파일을 생성하거나 배포를 위해 JAR 압축 파일을 생성하는데에도 사용
    - 실행 시 클래스의 역할을 정의하기도 함
- 어노테이션 타입 정의
    - 구문
      
        ```java
        public @interface AnnotationName{
        
        }
        ```
        
    - 코드에서는 `@AnotationName` 형태로 사용
    - 어노테이션은 엘리먼트(element)를 가질 수 있음
    - 엘리먼트는 타입과 이름으로 구성되며 디폴트 값을 가질 수 있음
      
        ```java
        public @interface AnnotationName{
        	타입 elementName() [default 값];
        }
        ```
        
    - 엘리먼트의 타입은 기본형, `String`, 열거, Class, 배열 타입을 사용할 수 있음

---