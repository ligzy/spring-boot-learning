package com.yangbingdong.springbootcommon.utils;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author ybd
 * @date 18-2-10
 * @contact yangbingdong@1994.gmail
 */
public class StringUtilTest {

	@Test
	public void lowercaseInitial() {
		String s = "S";
		String s1 = StringUtil.lowercaseInitial(s);
		assertThat(s1).startsWith(s.toLowerCase());
	}

	@Test
	public void uppercaseInitial() {
		String l = "s";
		String l1 = StringUtil.uppercaseInitial(l);
		assertThat(l1).startsWith(l.toUpperCase());
	}
}