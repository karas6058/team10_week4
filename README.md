#TEAM10 WEEk4
===========================================
##MEMBER
-------------------------------------------
Bark WonHo	(kairas83)

Hong SangGi	(sanggihong)

Yoon HyunGyu	(yoonhg)

Choi HyunWoo	(chw1787)

-------------------------------------------------




================================================================================================
*전화 요금 조회 프로그램*

전화 요금을 계산해주는 프로그램입니다. 
프로그램의 구성은 메인   App class, account의 정보를 file로 읽어오는 AppView class, 고지서를 출력하기 위해 고객의 정보를 갖고있는  Account class와 정보를 통해 계산을 하는 Calculator class, 이 class들을 갖고 고지서를 출력하는 PhoneBill class가 있습니다. 플랜의 타입을 나타내는 Plan class은 Gold,Silver class를 상속하고 있습니다.  

class App에서 프로그램을 실행시키며, account객체를 생성하고  class AppView에서 account의 정보를 미리 작성된 input_defalut.txt에서 읽어와서 한줄씩 account 객체를 생성하여 링크드 리스트로 연결합니다.
input_defalut.txt의 형식은 플랜 사용시간 회선수 순서로 한라인으로 작성되어 있으며 한라인의 정보를 읽어와서 account의 list에 추가를 시킵니다. 
파일을 읽어오는 작업이 끝나면 App에서 생성된 phonebill객체에 한 account의 정보를 iterator를 통해 전달하고, 요금을 계산하여 고지서를 출력하는 작업을 합니다. 리스트가 끝날때까지 반복하며 각 account에 대한 고지서를 console에 출력하고 종료합니다. 
class PhoneBill은 Account와 Calculator 를 이용하여 계산된 요금을 출력을 해주는  class입니다.
class Account는 App에서 전달해준 account정보 플랜타입,사용시간,회선수를 저장하고 있습니다. 이 account정보를 Calculator에 전달하여 요금을 계산합니다.
class Calculator는 계산에 필요한 요금의 정보를 갖는 Plan class를 갖고 있으며, 이 Plan과 Account를 이용하여 총 요금과 계산식을 만들어 주어 리턴합니다. Plan은 배열로 생성하여 여러 type의 객체를 생성할 수 있도록 합니다.
class Plan은 요금의 공통적인 정보들을 갖고 있는 부모 class이며 상속을 통하여 Gold,Silver 등 여러 type의 요금제를 정의 할수 있습니다.
이 프로그램은 Plan을 상속받은 Gold,Silver type의 class가 있으며, 각 type에 따른 요금의 정보들을 저장할 수 있습니다. 다른type이 필요하다면 새로 상속을 받아서 여러 type을 정의 할수 있습니다. 
위의 계산과정을 통해 Calculator는 계산된 총요금과 계산식을 갖고 있으며 PhoneBill에서 출력메소드 getBill을 통해 고지서 형식으로 콘솔창에 출력을 합니다.
 
===============================================================================================
 
  

