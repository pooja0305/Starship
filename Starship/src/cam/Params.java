package cam;
public interface Params {
	//using interface for all these CONTROL parameters to stay in a plac ewhen game begins
	//if any changes required cna be done in 1 class
	//rather visit all classes and chanfge them individually;
	int BOARD_WIDTH = 358;
	int BOARD_HEIGHT = 350;
	int BORDER_RIGHT = 30;
	int BORDER_LEFT = 5;
	
	int GROUND = 290;
	int BOMB_HEIGHT = 5;
	
	int ALIEN_HEIGHT = 12;
	int ALIEN_WIDTH = 12;
	int ALIEN_INIT_X = 150;
	int ALIEN_INIT_Y = 5;
	
	int GO_DOWN = 15;
	int NUMBER_OF_ALIENS_TO_DISPLAY = 24;
	int CHANCE = 5;
	int DELAY = 17;
	int PLAYER_WIDTH = 15;
	int PLAYER_HEIGHT = 10;
}
