package homework4;

/**
 * Created by ns on 2/5/2016.
 */
// immutable class
//immutable class
final class ComplexNumber {

	// is not Java style to use "_" in property declaration. Our access
	// modifiers can resolve this problem.
	private int _realValue;
	private int _imgValue;

	public ComplexNumber(int realValue, int imgValue) {
		this._realValue = realValue;
		this._imgValue = imgValue;
	}

	// public final int getRealValue() {
	// return _realValue;
	// }
	//
	// public final int getImgValue() {
	// return _imgValue;
	// }

	// public final ComplexNumber addToCurrentComplex(ComplexNumber z){
	// return new ComplexNumber(_realValue + z._realValue, _imgValue +
	// z._imgValue);
	// }
	//
	// public final ComplexNumber multiplyToCurrentComplex(ComplexNumber z){
	// return new ComplexNumber( _realValue * z._realValue - _imgValue +
	// z._imgValue
	// , _realValue * z._imgValue + _imgValue + z._realValue);
	// }

	public MutableCompanionComplex makeMutable() {
		return new MutableCompanionComplex(_realValue, _imgValue);
	}

	public static ComplexNumber calc(ComplexNumber z) {
		// (2+3*i)*(4+5*i)*(6+7*i)
		MutableCompanionComplex m = z.makeMutable();
		m.method_multiply(2, 3);
		m.method_multiply(4, 5);
		m.method_multiply(6, 7);

		return m.makeImutableData();
	}

	public static void main(String[] args) {
		ComplexNumber z = new ComplexNumber(1, 0);
		ComplexNumber resp = calc(z);

		System.out.println(resp._realValue + " + i * " + resp._imgValue);
	}
}

//[ZP] is not a mutable companion for a right example see String and StringBuffer
class MutableCompanionComplex {
	private int a;
	private int b;

	public MutableCompanionComplex(int x, int y) {
		this.a = x;
		this.b = y;
	}

	public void method_add(int x, int y) {
		this.a += x;
		this.b += y;
	}

	public void method_multiply(int x, int y) {
		int new_a;
		int new_b;

		new_a = this.a * x - this.b * y;
		new_b = this.a * y + x * this.b;

		this.a = new_a;
		this.b = new_b;
	}

	public ComplexNumber makeImutableData() {
		// magic happens here
		return new ComplexNumber(a, b);
	}

}
