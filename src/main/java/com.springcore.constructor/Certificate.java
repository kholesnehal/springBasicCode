package com.springcore.constructor;

public class Certificate {
		 String name;

		public Certificate(String name) {
			super();
			this.name = name;
		}

		@Override
		public String toString() {
			return "Certificate [name=" + name + "]";
		}
		
}
