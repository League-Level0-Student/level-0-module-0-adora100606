package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	
	Robot Adora=new Robot("mini");
	Adora.setSpeed( 100);
	Adora.penDown();
	Adora.move(25);	
	
	Adora.turn(180);

	
	Adora.turn(60);
	Adora.move(20);
	


}


}
