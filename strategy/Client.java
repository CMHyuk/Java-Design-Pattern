package strategy;

import strategy.attack.MissileStrategy;
import strategy.attack.PunchStrategy;
import strategy.move.FlyingStrategy;
import strategy.move.WalkingStrategy;
import strategy.robot.Atom;
import strategy.robot.Robot;
import strategy.robot.TaekwonV;

public class Client {

    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("TaekwonV");
        Robot atom = new Atom("Atom");

        taekwonV.setMovingStrategy(new WalkingStrategy());
        taekwonV.setAttackStrategy(new MissileStrategy());

        atom.setMovingStrategy(new FlyingStrategy());
        atom.setAttackStrategy(new PunchStrategy());

        System.out.println("My name is " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println();

        System.out.println("My name is " + atom.getName());
        atom.getName();
        atom.attack();
    }

}
