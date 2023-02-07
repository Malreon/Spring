package myServices;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneServices {
	
	private String[] data = {"Beware of the wolf in sheep's clothing",
							 "Diligencce is the mother of good luck",
							 "THe journey is the reward"};
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
