package com.qps.test;

import com.qps.design_model.FactoryModel.Brick;
import com.qps.design_model.FactoryModel.Weapon;
import com.qps.design_model.FactoryModel.WeaponFactory;

public class FightTest {
	public static void main(String[] args) {
		fight(new Brick());
		fight(WeaponFactory.getBatch(4));
	}
	
	public static void fight(Weapon w){
		w.FireInTheHole();
	}
}
