package com.nagaraju.data.shape.shapers;

import com.google.gson.JsonObject;
import com.nagaraju.data.shape.core.Data;

public class RootShaper extends BaseShaper implements Shaper {

	@Override
	public void shape(Data data) {
		super.shape(data);
	}

	@Override
	public void init(JsonObject shapeTemplate) {
		// Nothing to init
	}
}