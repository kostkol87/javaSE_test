package ru.test;

/**
 * Created by Константин on 21.07.2014.
 */
public class Phil extends PhilsThread {
    Phil(Fork right, Fork left, int place){
        this.left=left;
        this.right=right;
        this.place=place;
    }

    Fork left = new Fork();
    Fork right = new Fork();
    @Override
    public void run() {
        if(Manager.isAllowed(left,right,place)) {
            getLeftFork();
            getRightFork();
            eat();
            try {
                currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            putLeftFork();
            putRightFork();
        }else {
            think();
        }

    }
}
