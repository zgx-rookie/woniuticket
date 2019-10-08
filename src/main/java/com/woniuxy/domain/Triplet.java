package com.woniuxy.domain;

import lombok.Data;

@Data
public class Triplet<A,B,C> {
	private A a;
	private B b;
	private C c;

}
