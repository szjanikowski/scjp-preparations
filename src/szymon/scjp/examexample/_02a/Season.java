package szymon.scjp.examexample._02a;

public enum Season {
		SUMMER("Summer"), FALL("Fall"), WINTER("Winter"), SPRING("Spring");
		
		private Season(String newName) {
			name = newName;
		}
		
		private String name;
		public String toString() {
			return name;
		}
	}
