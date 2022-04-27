package com.thoughtworks.robot;

public class Robot extends main{
    int x;
    int y;
    char direction;

    public Robot(int x, int y, char direction) {
        this.x=x;
        this.y=y;
        this.direction=direction;
    }

    public void moveToFinalPosition(String path) {
        char[] path_ = path.toCharArray();
        for (int i = 0; i < path.length(); i++) {
            if (path_[i] == 'L') {
                leftRotate();
            } else if (path_[i] == 'R') {
                rightRotate();
            } else {
                moveOneStep();
            }
        }
    }


    public void leftRotate() {
        if (direction == 'N') {
            direction = 'W';
        } else if (direction == 'E') {
            direction = 'N';
        } else if (direction == 'S') {
            direction = 'E';
        } else {
            direction = 'S';
        }
    }

    public void rightRotate() {
        if (direction == 'N') {
            direction = 'E';
        } else if (direction == 'E') {
            direction = 'S';
        } else if (direction == 'S') {
            direction = 'W';
        } else {
            direction = 'N';
        }
    }

    public void moveOneStep(){
        if(direction=='N'){
            y++;
        }
        else if(direction=='E'){
            x++;
        }
        else if(direction=='S'){
            y--;
        }
        else{
            x--;
        }
    }

    public void displayCurrentPosition(){
        System.out.println(x+" "+y+" "+direction);
    }
}
