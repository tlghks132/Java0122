package Java0122;

import java.io.Serializable;

public class Unit implements Serializable{

	private static final long serialVersionUID = 1L;
	private int num;
	private String name;
	private int attack;
	private int defence;
	private int level;
	
	//매개변수가 없는 생성자 - 기본 데이터가 제공되지 않을떄 사용
	public Unit() {
		super();
	}
	
	//모든 속성을 매개변수로 받아서 생성해주는 생성자 - 기본데이터가 제공 될 때 사용 (테스트 할 때 좋음)
	public Unit(int num, String name, int attack, int defence, int level) {
		super();
		this.num = num;
		this.name = name;
		this.attack = attack;
		this.defence = defence;
		this.level = level;
	}

	//접근자 메소드
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		//레벨이 변경될 때 attack 값이 자동으로 다시 계산됨
		this.level = level;
		attack = attack + level * 10;
	}

	//모든 속성의 값을 하나의 문자열로 만들어서 리턴해주는 메소드
	//출력하는 메소드에 인스턴스 이름을 대입하면 이 메소드가 호출된다.
	//모든 객체 지향언어는 이 방식을 이용햐서 출력한다.
	//메소드 이름이 다를 뿐이다.
	@Override
	public String toString() {
		return "Unit [num=" + num + ", name=" + name + ", attack=" + attack + ", defence=" + defence + ", level="
				+ level + "]";
	}
}
