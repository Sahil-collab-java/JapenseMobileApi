package com.japanese.appliaction.utils;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class Utils {
	
	public int fourDigitRandom() {
		Random random = new Random();
		int randomId = random.nextInt(9000) + 1000;
		return randomId;
	}
	
}
