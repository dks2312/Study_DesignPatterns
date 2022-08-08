package Adapter;

abstract class Command {
	protected Robot robot;
	
	public void setRobot(Robot robot) {
		this.robot = robot;
	}
	
	public abstract void execute();
}

class MoveForwardCommand extends Command{
	int space;
	public MoveForwardCommand(int space) {
		this.space = space;
	}
	public void execute() {
		robot.moveForward(space);
	}
}

class TurnCommand extends Command{
	Robot.Direction direction;
	public TurnCommand(Robot.Direction direction) { 
		this.direction = direction;
	}
	public void execute() {
		robot.turn(direction);
	}
}

class PickupCommand extends Command{
	public void execute() {
		robot.pickup();
	}
}

class CommandOrderAdapter extends Command{
	private Order order;
	
	public CommandOrderAdapter(Order order) {
		this.order = order;
	}
	
	public void execute() {
		order.run(robot);
	}
}
