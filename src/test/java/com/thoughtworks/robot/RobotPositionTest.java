package com.thoughtworks.robot;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class RobotPositionTest {

    @Test

    public void shouldRotateLeft(){
        Robot robot=new Robot(3,3,'E');
        char expectedDirection='N';

        robot.leftRotate();

        assertThat(expectedDirection,is(equalTo(robot.direction)));
    }

    @Test
    public void shouldRotateRight(){
        Robot robot=new Robot(3,3,'E');
        char expectedDirection='S';

        robot.rightRotate();

        assertThat(expectedDirection,is(equalTo(robot.direction)));
    }

    @Test
    public void shouldMoveOneStepForward(){
        Robot robot=new Robot(3,3,'E');
        int expectedXPosition=4;

        robot.moveOneStep();

        assertThat(expectedXPosition,is(equalTo(robot.x)));
    }

    @Test
    public void shouldMoveToFinalPositionWhenPathIsGiven(){
        Robot robot=new Robot(3,3,'E');
        String path="MMRMMRMRRM";
        int expectedXPosition=5;
        int expectedYPosition=1;
        char expectedDirection='E';


        robot.moveToFinalPosition(path);

        assertThat(expectedXPosition,is(equalTo(robot.x)));
        assertThat(expectedYPosition,is(equalTo(robot.y)));
        assertThat(expectedDirection,is(equalTo(robot.direction)));

    }

}
