package lokko12.croploadcore;

public class Operators {
	
	public static boolean XOR (boolean a, boolean b) {
	    return (a ^ b);
	}
	public static boolean XNOR (boolean a, boolean b) {
	    return !(a ^ b);
	}
	public static boolean OR (boolean a, boolean b) {
	    return (a || b);
	} 
	public static boolean AND (boolean a, boolean b) {
	    return (a && b);
	}
	public static boolean NOR (boolean a, boolean b) {
	    return !(a || b);
	}
	public static boolean NAND (boolean a, boolean b) {
	    return !(a && b);
	}
	public static boolean NOT (boolean a) {
	    return !a;
	}
	public static boolean Cab(boolean a, boolean b) {
		/**
		 * All true execpt
		 * a=T b=F = false
		 */
		return	(NOR(NOR(NOR(a,a), b),NOR(NOR(a,a), b)));
	}
	public static boolean Cba(boolean a, boolean b) {
		/**
		 * All true execpt
		 * a=F b=T = false
		 */
		return	(NOR(NOR(NOR(b,b), a),NOR(NOR(b,b), a)));
		
	}
	public static boolean Epq(boolean a, boolean b) {
		/**
		 * true if a == b
		 */
		return	(NOR(NOR(NOR(a,b), a),NOR(NOR(a,b), a)));
	}
	public static boolean T(boolean a, boolean b) {
		return true;
	}
	public static boolean F(boolean a, boolean b) {
		return false;
	}
	public static float csig(float input, float modifier, boolean rising) {
		/**
		 * Calculates a percentage in a coustom way
		 */
		if (rising == false)
	    return (float) ((float) 1 + Math.tanh((-1.0)*input/modifier));
		else
		return (float) ((float) 1 + Math.tanh(input/modifier));
	}
}
