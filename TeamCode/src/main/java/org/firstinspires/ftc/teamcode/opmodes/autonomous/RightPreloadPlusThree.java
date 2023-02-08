package org.firstinspires.ftc.teamcode.opmodes.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous
public class RightPreloadPlusThree extends GenericAuto {
	@Override
	public void settings(){
		this.mode = Mode.RIGHT;
		this.depositAttempts = new int[]{4, 4, 4};
	}
}