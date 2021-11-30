package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bolt mBolt= new Bolt("Husky");
        mBolt.setName("Root");
        mBolt.setAge(1);
        System.out.println(mBolt.toString());
        mBolt.Move();
        mBolt.Sound();
        AngryBird mBird= new AngryBird("Macaw");
        mBird.setName("Rio");
        mBird.setAge(2);
        System.out.println(mBird.toString());
        mBird.Move();
        Nemo mFish= new Nemo("ClownFish");
        mFish.setName("Nemo");
        mFish.setAge(1);
        System.out.println(mFish.toString());
        mFish.Move();
        McQueen mCar= new McQueen("Toyota");
        mCar.setName("Queen");
        mCar.setType("Mini");
        System.out.println(mCar.toString());
        mCar.Move();
        Siddeley mPlane= new Siddeley("AirBus");
        mPlane.setName("A340");
        mPlane.setType("AirCraft");
        System.out.println(mPlane.toString());
        mPlane.Move();
    }
}
