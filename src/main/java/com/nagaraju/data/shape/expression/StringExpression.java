package com.nagaraju.data.shape.expression;

import com.google.gson.JsonPrimitive;
import com.nagaraju.data.shape.core.Data;

public class StringExpression implements Expression {
	private String value;

	public StringExpression(String value) {
		this.value = value;
	}

	@Override
	public JsonPrimitive eval(Data data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isBoolean() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addArg(Expression arg, int index) {
		// TODO Auto-generated method stub

	}
}