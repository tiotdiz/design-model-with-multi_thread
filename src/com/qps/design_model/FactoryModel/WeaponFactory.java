package com.qps.design_model.FactoryModel;

public class WeaponFactory {
	public static Weapon getBatch(int ver){
		Weapon w = null;
		switch(ver){
		case 1 :
			w = new Brick();
			break;
		case 2 :
			w = new Chair();
			break;
		case 3 :
			w = new AK47();
			break;
		case 4 :
			w = new RPG();
			break;
		default :
			break;
		}
		return w;
	}
}
