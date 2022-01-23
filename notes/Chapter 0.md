# 0. 시작

## 0.1 프로그래밍 언어

### 0.1.1 프로그래밍 언어

- 정보와 데이터
    - 데이터 : 자료를 수집한 것 그 자체
    - 정보 : 데이터를 의미있게 가공한 것
- 운영체제(OS; Operating System)
    - 시스템 하드웨어를 관리할 뿐만 아니라 응용 소프트웨어를 실행하기 위하여 하드웨어 추상화 플랫폼과 공통 시스템 서비스를 제공하는 시스템 소프트웨어
    - 운영체제가 제공하는 추상화 플랫폼에 해당하지 않는 기기(하드웨어)를 사용할 때 driver를 설치해서 사용
- 프로그램
    - 컴퓨터에서 실행될 때 특정 작업(Task)을 수행하는 일련의 명령어들의 모음(집합)
- 프로그래밍 언어
    - 컴퓨터가 이해할 수 있는 언어 : 기계어
    - 기계어는 0과 1로 이루어진 이진 코드로 사람이 이해하기엔 어려움
    - 사람이 사용하는 자연어와 컴퓨터가 사용하는 기계어 간 다리 역할을 하는 프로그래밍 언어가 필요
    - 프로그래밍 언어 구분
        1. 고급 언어
            - 컴퓨터와 대화할 수 있으면서 사람이 쉽게 이해할 수 있는 언어
            - 작성된 소스는 컴퓨터가 바로 이해할 수 없기 때문에 컴파일(compile) 과정을 통해서 컴퓨터가 이해할 수 있는 0과 1로 이루어진 기계어로 변환한 후 사용하게 됨
            - 일반적인 프로그래밍 언어(C, C++, Java)가 고급 언어
        2. 저급 언어
            - 기계어에 가까운 언어
            - 대표적인 예 : 어셈블리어
            - 사람이 쉽게 이해할 수 없기 때문에 배우기 까다로움
    - 소스(source) : 프로그래밍 언어로 작성된 내용
    - 소스는 컴파일러라는 소프트웨어에 의해 기계어로 변환된 후 컴퓨터에서 실행
    - 프로그램 : 컴퓨터에서 특정 목적을 수행하기 위해 프로그래밍 언어로 작성된 소스로 기계어로 번역한 것

## 0.2 자바

### 0.2.1 자바 소개

- 자바 특징
    1. 이식성이 높은 언어
        - 이식성 : 서로 다른 실행 환경을 가진 시스템 간에 프로그램을 옮겨 실행할 수 있는 것
        - 자바 언어로 개발된 프로그램은 소스 파일을 다시 수정하지 않아도 JRE(Java Runtime Environment)가 설치되어 있는 모든 운영체제에서 실행 가능
    2. 객체 지향 언어
        - 객체 지향 프로그래밍 : 부품에 해당하는 객체들을 먼저 만들고 하나씩 조립 및 연결해서 전체 프로그램을 완성하는 기법
        - 객체 지향 언어 : 객체 지향 프로그래밍에서 사용되는 언어
        - 자바는 100% 객체 지향 언어
        - 자바는 객체를 만들기 위해 설계도인 클래스를 작성해야 하고, 객체와 객체를 연결하여 목적에 맞는 프로그램을 만들어냄
        - 자바는 캡슐화, 상속, 다형성 기능을 완벽하게 지원함
    3. 함수적 스타일 코딩 지원
        - 함수적 프로그래밍은 대용량 데이터의 병렬 처리, 이벤트 지향 프로그래밍을 위해 적합
        - 자바 8부터 람다식 지원
        - 람다식을 사용하면 컬렉션의 요소를 필터링, 매핑, 집계 처리하는데 쉬워지고 코드가 매우 간결해짐
    4. 메모리를 자동으로 관리
        - 자바는 개발자가 직접 메모리에 접근할 수 없도록 설계
        - 메모리는 자바가 직접 관리
        - 객체 생성 시 자동적으로 메모리 영역을 찾아서 할당하고 사용이 완료되면 쓰레기 수집기(Garbage Collector)를 실행시켜 자동적으로 사용되지 않는 객체를 제거시켜줌
    5. 다양한 애플리케이션을 개발할 수 있음
        - 다양한 운영체제에서 실행되는 프로그램 개발 가능
        - 자바는 다양한 운영체제에서 사용할 수 있는 개발 도구와 API를 묶어 에디션 형태로 정의하고 있음
        - Java SE : 자바 프로그램이 공통적으로 사용하는 자바 가상 기계(JVM)를 비롯해서 자바 프로그램 개발에 필수적인 도구와 라이브러리 API 정의
        - 클라이언트와 서버 프로그램에 상관없이 자바 프로그램을 개발하고 실행하기 위해 반드시 JDK(Java Development Kit)를 설치해야 함
    6. 멀티 스레드(Multi-Thread)를 쉽게 구현 가능
        - 하나의 프로그램이 동시에 여러 가지 작업을 처리해야 할 경우와 대용량 작업을 빨리 처리하기 위해 서브 작업으로 분리해서 병렬 처리하려면 멀티 스레드 프로그래밍이 필요함
        - 자바는 운영체제와 상관없이 멀티 스레드를 쉽게 구현할 수 있음
    7. 동적 로딩(Dynamic Loading) 지원
        - 애플리케이션이 실행될 때 모든 객체가 생성되지 않고 객체가 필요한 시점에 클래스를 동적으로 로딩해서 객체를 생성
    8. 오픈소스 라이브러리가 풍부
        - 검증된 오픈소스 라이브러리를 사용하면 개발 기간을 단축하면서 안전성이 높은 애플리케이션을 쉽게 개발할 수 있음

### 0.2.2 JVM

- JVM
    - 자바 프로그램은 완전한 기계어가 아닌 중간 단계의 바이트 코드
      
        ⇒ 바이트 코드를 해석하고 실행하는 가상의 운영체제가 필요함
        
    - 컴파일 : 자바 문법을 기반으로 작업 지침서를 만든 것을 바이트코드로 번역하는 과정
    - JVM(Java Virtual Machine) : 바이트 코드를 해석하고 실행하는 가상의 운영체제
    - 운영체제별로 프로그램을 실행하고 관리하는 방법이 다르기 때문에 운영체제별로 자바 프로그램을 개발하는 것보다는 운영체제와 자바 프로그램을 중계하는 JVM을 두어 자바 프로그램이 여러 운영체제에서 동일한 실행 결과를 산출하도록 설계한 것
      
        ⇒ 개발자는 운영체제와 상관없이 자바 프로그램을 개발할 수 있음
        
    - 바이트 코드는 모든 JVM에서 동일한 실행 결과를 보장
    - JVM은 운영체제에 종속적
    - JVM은 JDK 또는 JRE를 설치하면 자동으로 설치됨
    - 프로그램 구동 과정
      
        소스 파일(.java) ⇒ 컴파일러(javac.exe) ⇒ 바이트 코드 파일(.class) ⇒ JVM ⇒ 기계어
        

### 0.2.3 메인 메소드

- 메인 메소드
    - 실행 명령인 java를 실행 시 가장 먼저 호출되는 부분
    - `main()` 메소드가 없으면 절대로 실행될 수 없음
    - Application의 시작 = 특정 클래스의 `main()` 실행
    - 형태
      
        ```java
        public static void main(String[] args){}
        ```
        

### 0.2.4 출력문

- 출력문
    - `print` : 줄바꿈 없이 출력
    - `println` : 줄바꿈 있는 출력
    - `\n` : 줄바꿈
    - `printf` : 서식화된 출력
- 출력문 예시
  
    ```java
    package sec01;
    
    public class PrintTest {
    	public static void main(String[] args) {
    
    		System.out.print("Hello World");
    		System.out.print("Hello World \n");
    
    		System.out.println("\\");
    		System.out.println("'");
    
    		// 주석입니다
    
    		/*
    		 * 여러 줄 주석입니다.
    		 */
    
    		System.out.printf("%d \n", 10); // 정수(10)를 10진수로 출력
    		System.out.printf("%o \n", 10); // 정수(10)를 8진수로 출력
    		System.out.printf("%x \n", 10); // 정수(10)를 16진수로 출력
    
    		System.out.printf("%4d \n", 10); // 4칸 확보 후 오른쪽부터 차지
    		System.out.printf("%-4d \n", 10); // 4칸 확보 후 왼쪽부터 차지
    		System.out.printf("%04d \n", 10); // 4칸 확보 후 오른쪽부터 차지 (빈공간은 0)
    
    		System.out.printf("%f \n", 10.1); // 실수
    		System.out.printf("%.2f \n", 10.1); // 실수(소수점 둘째자리까지)
    
    		System.out.printf("%s \n", "홍길동"); // 문자열
    		System.out.printf("%s의 나이는 %d 입니다.", "홍길동", 26);
    
    	}
    
    }
    ```
    
    - 결과
      
        ```
        Hello WorldHello World 
        \
        '
        10 
        12 
        a 
          10 
        10   
        0010 
        10.100000 
        10.10 
        홍길동 
        홍길동의 나이는 26 입니다.
        ```
    
- 주석
    - 작업 지침에서 열외
    - 한줄 주석 : `/`
    - 여러 줄 주석 : `/* */`
    - 주석 단축키 : `ctrl+shift+c`, `ctrl+/`
- 코드 정렬
    - 단축키 : `ctrl + shift + f`

## 0.3 개발 환경 구축

### 0.3.1 개발 환경 구축

- Java 설치
    1. [azul.com](http://azul.com) 접속
    2. download now 클릭
    3. 하단에 자바 버전 선택(Java 8(LTS))
    4. Zulu 8.33.0.1 버전 다운 및 설치
    5. [내PC] - [우클릭] - [속성] - [고급 시스템 설정] - [고급] - [환경변수 설정] 클릭
    6. 시스템 변수(하단)에 JAVA_HOME 속성 추가
    7. 시스템 변수 중 path를 선택한 후 편집을 눌러 `%JAVA_HOME%\bin\` 를 맨위에 추가하고, zulu가 포함된 경로 삭제
- Eclipse 설치
    1. [https://www.eclipse.org/downloads/](https://www.eclipse.org/downloads/) 접속
    2. 하단에 download package 클릭
    3. 우측 MORE DOWNLOADS에서 Older Versions 클릭
    4. 2018-09 클릭
    5. R package 클릭
    6. Eclipse IDE for Java EE Developers 다운로드
- Encoding 설정
  
    방법 1 : [Window] - [Preferences] - [enco] 검색한 후 UTF-8로 전부 변환(workspace, CSS, HTML, JSP)
    
    방법 2 : Eclipse 설치 폴더 내 eclipse.ini 파일을 열어(메모장으로) 하단에 `-Dfile.encoding=UTF-8` 추가한 후 저장
    
    - 방법 1의 경우 workspace 열 때마다 설정해줘야 함
- Visual Studio Code 설치
    1. [https://code.visualstudio.com/](https://code.visualstudio.com/) 접속
    2. 화면 중앙 download 버튼 클릭하여 설치 프로그램 다운
    3. 설치 과정에서 모두 기본 값으로 하되 추가 작업 선택에 기타는 모두 선택
- Git 설치
    1. [https://git-scm.com/downloads](https://git-scm.com/downloads) 이동
    2. [Downloads] - [Windows] - [Standalone Installer] 내 해당 버전 다운로드 및 설치
- Git
  
    ### **1. CLI(Command Line Interface) 기초**
    
    ***Git Bash***
    
    :  Windows 환경에서 UNIX 계열 운영체제의 터미널 명령어를 사용할 수 있게 해준다.
    
    [제목 없음](https://www.notion.so/02cf514bf02a4794832560a13d736c62)
    
    ### **2. Git**
    
    분산 버전 관리 프로그램
    
    - 초기 설정
      
        ```
        $ git config --global user.name "이름"
        $ git config --global user.email "메일 주소"
        
        # 확인
        $ git config --global -l
        ```
        
    - 기본명령어
      
        ```
        # 현재 작업 중인 디렉토리를 Git으로 관리한다는 명령어
        # 이미 깃으로 관리하는 폴더라면 내부에서 다시 git init 하지 않기 1번만 수행할것!!!
        $ git init
        
        #Working Directory와 Staging Area에 있는 파일의 현재 상태를 알려주는 명령어
        #수시로 체크 할것
        $ git status
        
        #Working Directory에 있는 파일을 Staging Area로 올리는 명령어
        # 특정 파일
        $ git add a.txt
        # 특정 폴더
        $ git add my_folder/
        # 현재 디렉토리에 속한 파일/폴더 전부
        $ git add .
        
        #Staging Area에 올라온 파일의 변경 사항을 하나의 버전(커밋)으로 저장하는 명령어
        #커밋 메세지 는 현재 변경 사항들을 잘 나타낼 수 있도록 의미 있게 작성하는 것을 권장
        $ git commit -m "first commit"
        
        #커밋의 내역( ID, 작성자, 시간, 메세지 등 )을 조회할 수 있는 명령어
        $ git log
        ```
        
    - 원격저장소(github, gitlab 등) 사용하기
        1. github 계정 생성 및 원격저장소 생성
        2. 로컬 저장소와 원격 저장소 연결
           
            ```
            $ git remote add origin https://lab.ssafy.com/s07/a08/test.git
            #[풀이]
            #git 명령어를 작성할건데, remote(원격 저장소)에 add(추가) 한다.
            #origin이라는 이름으로 https://lab.ssafy.com/s07/a08/test.git라는 주소의 원격 저장소를 저장
            
            # add를 이용해 추가했던 원격 저장소의 이름과 주소가 출력됩니다.
            $ git remote -v
            
            # 원격 저장소 연결 삭제, 연결을 끊는 것이지, 원격 저장소 자체를 삭제하는 게 아닙니다.
            $ git remote remove origin
            
            #로컬 저장소의 커밋을 원격 저장소에 업로드하는 명령어
            $ git push origin master
            #[풀이]
            #git 명령어를 사용할건데, origin이라는 이름의 원격 저장소의 master 브랜치에 push 한다.
            ```
            
    
    ### **3. gitignore**
    
    특정파일이나 폴더를 git이 관리하지 않도록 선언
    
    `.git` repository와 같은 경로에 `.gitignore` 파일을 생성해줍니다.
    
    - 민감한 개인 정보가 담긴 파일 (전화번호, 계좌번호, 각종 비밀번호, API KEY 등)
    - OS(운영체제)에서 활용되는 파일
    - IDE(통합 개발 환경) 혹은 Text editor(vscode) 등에서 활용되는 파일
    
    등을 선언해 줍니다.
    
    `https://gitignore.io/` 사이트를 이용해서 사용하는 환경에 대해서 추가해 줍니다.
    
    ### **4. Git clone & pull**
    
    ```
    # https://lab.ssafy.com/s07/a08/test.git 원격저장소를 로컬로 복사 한다.
    # git clone을 통해 생성된 로컬 저장소는
    # git init 과 git remote add 가 이미 수행되어 있습니다.
    $ git clone https://lab.ssafy.com/s07/a08/test.git
    
    # origin 이라는 이름으로 연결됨.
    ```
    
    `git pull <저장소 이름> <브랜치 이름>`
    
    ```
    #[풀이]
    # git 명령어를 사용할건데, origin이라는 원격 저장소의 master 브랜치의 내용을 가져온다(pull).
    
    $ git pull origin master
    ```
    
- Git 버전 관리 과정
    1. working directory에서 파일 수정
    2. staging area에 `add`
    3. `status`로 현재 상태 확인
    4. git directory에 `commit`
    5. `log`로 기록 확인 가능
- Git 초기 설정
    1. `git config --global user.name "이름"`
    2. `git config --global user.email "메일주소"`
    3. `git config --global -l` 로 확인
    4. `git init`로 git 관리 시작

---