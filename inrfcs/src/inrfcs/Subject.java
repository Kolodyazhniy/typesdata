package inrfcs;

public class Subject {
	
		public String name;
		private int age;

		public Subject() {
			// constructor
			name = "NoName";
			age = 0;
		}

		public Subject(String n) {
			// constructor2
			name = n;
		}

		 public void setAge(int a) {
		// method
		 age=a;

		}

		public int getAge() {
			// method
			return age;
		}

		void show() {
			System.out.println("Имя: " + name + ", Возраст: " + age);
		}
	}



