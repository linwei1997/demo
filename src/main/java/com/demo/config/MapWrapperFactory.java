package com.demo.config;

import java.util.Map;

import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.wrapper.ObjectWrapper;
import org.apache.ibatis.reflection.wrapper.ObjectWrapperFactory;

public class MapWrapperFactory implements ObjectWrapperFactory {

	@Override
	public boolean hasWrapperFor(Object object) {
		return object != null && object instanceof Map;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ObjectWrapper getWrapperFor(MetaObject metaObject, Object object) {
		return new CamelMapWrapper(metaObject, (Map<String, Object>) object);
	}

}
