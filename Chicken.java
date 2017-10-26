public class Chicken {
		private String data;
		private String color;
		private int age;
		
		public void layAnEgg(){
			System.out.println ("The chicken "+data+" laid an egg\n");
		}
		public void poop(){
			System.out.println ("The chicken "+data+" did pooped\n");
		}
		public void drink(){
			System.out.println ("The chicken "+data+" drank water\n");
		}
		public void print(){
			System.out.println ("The name of the chicken is:"+data+",color:"+color+",age:"+age+"\n ");
		}
		public void initializeData(String color,int age){
			this.color = color;
			this.age = age;
		}
		public void addName(String data){
			this.data = data;
		}
}