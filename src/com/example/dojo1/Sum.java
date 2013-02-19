package com.example.dojo1;

public class Sum {

	Convert convert;
	
	public Convert getConvert() {
		return convert;
	}

	public void setConvert(Convert convert) {
		this.convert = convert;
	}

	public Sum() {
		convert = new Convert();
	}
	
    public int binarySum(String a, String b) {
        return convert.binaryToDecimal(a) + convert.binaryToDecimal(b);
    }

}
