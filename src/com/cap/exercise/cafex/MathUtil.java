package com.cap.exercise.cafex;

import java.math.BigDecimal;

public class MathUtil {

	public static double round(double unrounded, int precision) {
		BigDecimal bigDec = new BigDecimal(unrounded);
		BigDecimal rounded = bigDec.setScale(precision, BigDecimal.ROUND_HALF_UP);
		return rounded.doubleValue();
	}

}
