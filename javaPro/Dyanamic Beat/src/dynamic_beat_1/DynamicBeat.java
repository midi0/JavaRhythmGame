package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame{

	//생성자 선언
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false); // 사용자가 임의로 사이즈 조절 불가
		setLocationRelativeTo(null); // 실행시 화면 중앙 정렬
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 게임 종료시 프로세스도 같이 종료
		setVisible(true);
	}
}
