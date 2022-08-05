# Study_DesignPatterns
 객체지향 디자인패턴과 예시 코드를 수록하는 리포지토리
<h3>장점</h3>
<ul>
<li><a href="#Singleton">싱글턴 패턴</a></li>
<li><a href="#Strategy">스트레티지 패턴</a></li>
</ul>
 

<h2 id="Singleton">싱글턴 패턴 (Singleton)</h2>
애플리케이션이 시작될 때, 어떤 클래스가 최초 한 번만 메모리를 할당(static)하고 해당 메모리에 인스턴스를 만들어 사용하는 패턴<br>
한 프로그램을 관리하는 매니저같은 역할을 할 수 있다
<h3>장점</h3>
<ul>
<li>데이터의 공유가 쉽다</li> 
<li>메모리를 적게 차지한다</li>
</ul>
<h3>단점</h3>
<ul>
<li>멀티 스레드 환경에서 싱글턴객체가 두개 생성될 수도 있다</li>
<li>다른 클래스들과의 결합도가 높아져서 유지보수나 테스트가 힘들다</li>
</ul>

<h2 id="Strategy">스트레티지 패턴 (Strategy)</h2>
어떤 동작을 하는 로직을 정의하고, 이것들을 하나로 묶어(캡슐화) 관리하는 패턴<br>
인터페이스를 잘 활용하는 패턴인 듯하다.
<h3>장점</h3>
<ul>
<li>새로운 로직을 추가하거나 변경할 때, 한번에 효율적으로 변경이 가능하다</li>
</ul>
<h3>단점</h3>
<ul>
<li>없음 : 작은 프로젝트의 경우 안하는 것이 코드가 간결하다</li>
</ul>
