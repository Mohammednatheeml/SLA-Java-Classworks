package protectedExample;

public class ProtectedClass {
	
	//protected specifier irundha adha same class la use pannikalam access pannikalam change pannikalam.
	protected String things = null;
	
	//indha method ah different package la ulla class la use pannanum na anga indha method ah override panni than use pannanum
	//for example => indha protectedMethod ah naa subprotectedpackage la ulla SubProtectedClass la extend
	protected void protectedMethod() {
		System.out.println("this is protected method");
		String things ="shirt";
		System.out.println("this is" +" "+things);
	}
}


// Public ah irundha same class , different class , same package , different package edhula vena use pannalam access pannalam direct ah vera package la ulla main la object create pannikalam
// private ah irundha andha class ah thavara vera endha claa layum use panna mudiyathu . then private ah class la use panna mudiyathu only methods and variable la mattum than use pannamudiyum 
// protected ah irundha andha andha class la main method la object create panni use pannalam 
             //vera package layum use pannalam but direct ah andha main method la class create panna mudiyathu 
			//indha class ah vera package la ula subclass la extend pannitu then andha class ku object create pannitu adha call pannikalam 
			//indha method ah different package la ulla class la use pannanum na anga indha method ah override panni than use pannanum
			//for example => mela ulla protectedMethod ah naa subprotectedpackage la ulla SubProtectedClass la extend panni anga indha method ah override panni then adhuku object create panni than call panniruken 
			