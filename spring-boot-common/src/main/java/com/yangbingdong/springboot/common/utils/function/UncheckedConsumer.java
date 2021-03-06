package com.yangbingdong.springboot.common.utils.function;

/**
 * @author ybd
 * @date 17-11-28.
 */
@FunctionalInterface
public interface UncheckedConsumer<T> {
	void accept(T t) throws Exception;
}
