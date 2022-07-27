class Eventimpl implements Event{
	@Override
	public void perform() {
		System.out.println("class level impl");
	}	
}
public class Eventdemo {
	class Inner implements Event{
		@Override
		public void perform() {
				System.out.println("Inner");
		}
		}
		static class StaticInner implements Event{
			@Override
			public void perform() {
				System.out.println("Static Inner");
			}	
		}
		public void nestedEvent() {
			class nestedEventImpl implements Event{
				@Override
				public void perform() {
					System.out.println("Nested");
				}
			};
			new nestedEventImpl().perform();
			}
		public void Onemoreevent(){
			new Event() {

				@Override
				public void perform() {
					System.out.println("onemore");
				}
			}.perform();	
			
		}
		public void lastevent() {
			Event e= ()-> System.out.println("lambda");
			e.perform();
		}
	
	public static void main(String[] args) {
		Eventimpl ei=new Eventimpl();
		ei.perform();
		
		Eventdemo ed=new Eventdemo();
		Inner e2= ed.new Inner();
		e2.perform();
		
		Eventdemo.StaticInner e3=new Eventdemo.StaticInner();
		e3.perform();
		
		ed.nestedEvent();
		ed.Onemoreevent();
		ed.lastevent();
		
	}

}
