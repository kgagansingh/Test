package question1;

import java.io.Serializable;

enum MySingleton {
	SINGLETON;
	//User Specific;
}

public class Singleton implements Cloneable, Serializable {
	private static final long serialVersionUID = -6834926027969920657L;
	private volatile static Singleton singleton = null; // Lazy Initialization

	private Singleton() {
		if (singleton != null) {
			throw new IllegalStateException("Dont Call me Using Reflection"); 
			// We threw IllegalStateException here to avoid calling of Singleton 
			//using reflection
		}
	}

	public static Singleton getSingleton() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				// Double Locking is Applied to make it Thread Safe
				if (singleton == null) {
					singleton = new Singleton(); 
					// We instantiated Singleton here to avoid Eager Initialization
				}
			}
		}
		return singleton;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return singleton;
		// Throws CloneNotSupportedException so that clone cant be made.
	}

	private Object readResolve() {
		return singleton; 
		// We implemented readResolve method and returned same Singleton here,
		//so that any other copy cant be made using deserialization
	}

	public static void main(String[] args) {
		// Enum singleton design pattern, Enum is a singleton by Default
		//but there is Flexibility Issue with enum hence we avoid using enum as Singleton
		MySingleton singletonEnum = MySingleton.SINGLETON; 
		System.out.println(singletonEnum.hashCode());

		MySingleton singletonEnum2 = MySingleton.SINGLETON;
		System.out.println(singletonEnum2.hashCode());
	}

}
