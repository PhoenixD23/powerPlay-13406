package org.firstinspires.ftc.teamcode.opmodes.autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous
public class LeftPreloadPlusThree extends GenericAuto {
	@Override
	public void settings(){
		this.mode = Mode.LEFT;
		this.depositAttempts = new int[]{4, 4, 4};
	}
}
